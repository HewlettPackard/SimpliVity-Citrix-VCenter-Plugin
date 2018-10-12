package com.vmware.simplivity.citrixplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClusterServiceImpl implements ClusterService 
{

	private LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = ClusterServiceImpl.class;
	
	private String msg = null;
	String tempScriptPath = null;
	Map<String, List<String>> clusterMap = null;
	
	public ClusterServiceImpl(){}
	
	
	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}


	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	@Override
	public Map<String, List<String>> getClusterInfo() 
	{
		msg = "Enetering getClusterInfo method ..";
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		buildClusterMap();
		fileUtil.deleteFile(tempScriptPath);
		fileUtil.deleteFile(fileUtil.getClusterInputPath());
		fileUtil.deleteFile(fileUtil.getClusterOutputPath());
		clusterMap = fileUtil.getClusterMap();
		msg = "ClusterMap from file util: "+clusterMap;
		return clusterMap;
	}
	
	@Override
	public List<String> getHosts(String aClustername)
	{
		msg = "Entered getHosts method : "+aClustername;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		List<String> hosts = null;
		
		clusterMap = fileUtil.getClusterMap();
		
		if(clusterMap != null && !clusterMap.isEmpty())
		{
			System.out.println(" Entered if "+clusterMap);
			hosts = new ArrayList<String>();
			for(Map.Entry<String, List<String>> entry: clusterMap.entrySet())
			{
				if( aClustername.equals(entry.getKey()))
				{
					System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
					hosts = entry.getValue();
					break;
				}
			}
		}
		
		msg = " Hosts found: "+hosts;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		return hosts;
	}
	
	/** Method: executeClusterInfoScript
	 * 
	 *  Description: Execute the ClusterInfo script and store the result in a csv file.
	 */
	private void executeClusterInfoScript()
	{
		String inputFile = fileUtil.getClusterInputPath();
    	String outputFile = fileUtil.getClusterOutputPath();
    	String clusterScript = fileUtil.getClusterScriptPath();
    	tempScriptPath = fileUtil.getTempLocation() + "tempClusterscript.ps1";
    	
    	fileUtil.copyFileUsingFileChannels(clusterScript, tempScriptPath);
    	String vcenterName = "localhost";
    	
    	try
    	{
    		/* Creating input file foe cluster Script*/
    		File inputFileObj = new File(inputFile);
    		inputFileObj.setWritable(true);
    		FileWriter fw = new FileWriter(inputFile);
            String sFileLine = "@{\r\ncluster = \r\n\t@{\r\n";
            sFileLine += "\tvcenterName = " + "\'" + vcenterName  + "\'\r\n" +
                    "\tclusterOutput = " + "\'" + outputFile +"\'\r\n \t}\r\n}\r" ;
            System.out.println(sFileLine);
            fw.write(sFileLine);
            fw.close();
            
            // Command to execute the powercli script to get cluster info
            String sCommand = "powershell.exe \"" +  tempScriptPath + "\"" +
                    " -inputfile " + "\"" + "\'" + inputFile + 
                    "\'" + "\""  + " -logfile " + "\"" + "\'" +
                    logUtil.getLogFilePath() + "\'" + "\""; 
            System.out.println(sCommand);
            logUtil.log(LEVEL.DEBUG, "cluster Script command"+sCommand, clazz, logUtil.getLineNumber());
            Process powerShellProcess = Runtime.getRuntime().exec(sCommand);
			// Getting the results
            powerShellProcess.getOutputStream().close(); 
            
            String line = "";
            java.io.BufferedReader stdout = new java.io.BufferedReader( 
                        new java.io.InputStreamReader(powerShellProcess.getInputStream()) );

            while ((line = stdout.readLine()) != null) 
            {
            	System.out.println(line);
                logUtil.log(LEVEL.DEBUG, line, clazz, logUtil.getLineNumber());
            }
            stdout.close();

            java.io.BufferedReader stderr = new java.io.BufferedReader( 
                        new java.io.InputStreamReader( powerShellProcess.getErrorStream()) );

            while ((line = stderr.readLine()) != null) 
            {
            	System.out.println(line);
            	logUtil.log(LEVEL.ERROR, line, clazz, logUtil.getLineNumber());
            }

            stderr.close();
    	}
    	catch(IOException ioe)
    	{
    		msg = "Error occured while writing to file";
    		System.out.println(msg);
    		logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
    	}
    	catch(Exception e)
    	{
    		msg = "Error occured while getting the cluster info";
    		System.out.println(msg);
    		logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
    	}
	}
	
	/** Method: buildClusterMap
	 * 
	 *  Description: Prepare a cluster Map instance by reading the entries read from csv file.
	 */
	//private void copyFileUsingFileChannels()
	private void buildClusterMap()
	{
		msg = "Entered into buildClusterMap method";
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		executeClusterInfoScript();
		String line = "";
	   	String csvSplit = ",";
	   	int count = 0;
	   	String csvFile = fileUtil.getClusterOutputPath();
	   	Map<String,List<String>> map = fileUtil.getClusterMap();
	   	 
	   	try
	   	{
	   	 BufferedReader br = new BufferedReader(new FileReader(csvFile));
	   	 
	   	 // Cleaning the map 
	   	  map = null;
	   	  map = new HashMap<String,List<String>>();
	   	 while((line = br.readLine()) != null)
	   	 {
	   		 count++;
	   		 //Ignoring the first two lines of file which have headers and comments
	   		 if(count <3) continue;
	   		 String []data = line.split(csvSplit);
	   		 String key = data[1].replaceAll("\"", "");
	   		 String value = data[0].replaceAll("\"", "");
	   		 
   			 if(map.containsKey(key))
   			 {
   				List<String> list = map.get(key);
      			if(!list.contains(value))
      			{
      				list.add(value);
      			}
      			map.put(key, list);
   			 }
   			 else
   			 {
   				List<String> list = new ArrayList<String>();
      			list.add(value);
      			map.put(key, list);
   			 }
	   	 }
	   	 msg = "ClusterMap: "+map;
	   	 System.out.println(msg);
	   	logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
	   	 fileUtil.setClusterMap(map);
	   	 br.close();
	   	}
	   	catch(FileNotFoundException fnfe) 
	   	{
	   		msg = "ClusterInfo csv file not found";
	   		System.out.println(msg);
	   		fnfe.printStackTrace();
	   		logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
	   	}
	   	catch(IOException ioe) 
	   	{
	   		msg = "Error occured while reading the csv file containing csv file";
	   		System.out.println(msg);
	   		ioe.printStackTrace();
	   		logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
	   	}
	}
}
