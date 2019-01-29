package com.vmware.simplivity.citrixplugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BasicCfgFileUtil 
{
	private Class clazz = BasicCfgFileUtil.class;
	
	private LogUtil logUtil;
    
    private String msg = null;
       
    private ProxyData proxyData; 

    private OVCData ovcData;
    
    // File content Holder, appends as KEY=VALUE pair
    private Map <String, String> cfgEntryMap 
                                = new HashMap<String, String>();
    
    private Map<String,List<String>> clusterMap = new HashMap<String, List<String>>();
    
    public String clusterName= null;
    
    private BasicCfgFileUtil() 
    {
    	//System.out.println("Got into BasicCfgFileUtil constructor");
    }

    public void setLogUtil(LogUtil logUtil) 
    {
    	//System.out.println("Setting loguntil in BasicCfgFileUtil");
		this.logUtil = logUtil;
	}

	public boolean readConfigFileContent() throws java.io.IOException 
	{
		// prepare for the configuration file path and filename
		String sFileName = getCfgPath();
		java.io.BufferedReader bReader = null;

		try 
		{
			File file = new File(sFileName);
			// open streams for reading the content from the file
			bReader = new java.io.BufferedReader(new java.io.FileReader(file));
			String sLine;
			while (null != (sLine = bReader.readLine())) 
			{
				if (true == sLine.isEmpty())
					continue;
				String sTmp0 = sLine.trim();
				if ((sTmp0.charAt(0)) == '#')
					continue;

				int ix = sTmp0.indexOf("=");
				if (ix > 0) {
					// lets populate the values into map datastructures
					// we need to remove trailing spaces before we add it
					String sKey = sTmp0.substring(0, ix);
					String sValue = sTmp0.substring(++ix, sTmp0.length());
					cfgEntryMap.put(sKey.trim(), sValue.trim());
				}
			}
		}
		catch(FileNotFoundException foe)
		{
			logUtil.log(LEVEL.ERROR, "Configuration File not found!", BasicCfgFileUtil.class, logUtil.getLineNumber());
			return false;
		}
		catch (Exception ex) {
			System.out.println("Exception: " + ex.toString());
		} finally {
			bReader.close();
		}

		return true;
	}
	
	public ProxyData getProxyData() 
	{
		return proxyData;
	}

	public void setProxyData(ProxyData proxyData) 
	{
		this.proxyData = proxyData;
	}

	public void setOVCData(OVCData ovcData) 
	{
		this.ovcData = ovcData;
	}

	public OVCData getOVCData() 
	{
		return ovcData;
	}
	
	public String getConfigScrPath() 
	{ 
       return getCitrixPluginDataFolder("configure.ps1");
    }
	
	public String getDeConfigScrPath() 
	{ 
		return getCitrixPluginDataFolder("deconfigure.ps1");
    }
	
	public String writeToFile( String sFileName, String sContent, String sSourceInfo )
	{
		System.out.println("Entered into writeToFile method: "+sFileName+" "+sSourceInfo);
		String fileInput = getTempLocation()+ File.separator + 
		                                sFileName;
		
		logUtil.log(LEVEL.DEBUG, sSourceInfo + ": PrepareInputFile: "  + fileInput, BasicCfgFileUtil.class, logUtil.getLineNumber());
		try {
			File file = new File(fileInput);
			java.io.FileOutputStream outFile = new java.io.FileOutputStream(file);
			
			java.io.DataOutputStream outStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(outFile));
			outStream.writeBytes(sContent);
			outStream.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Exception occured while writing to file ");
			ioe.printStackTrace();
			logUtil.log(LEVEL.ERROR, "Exception occured while writing to file "+sFileName+" "+ioe, BasicCfgFileUtil.class, logUtil.getLineNumber());
			return null;
		}
		
		return fileInput;
	}
	
	public boolean isCfgFileExists(String fileName)
	{
		msg = "Entering isCfgFileExists method: "+fileName;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		try
		{
			File file = new File(fileName);
			if(file.isFile())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			msg = "Exception while checking for Cfg File: "+e.getLocalizedMessage();
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return false;
		}
		return false;
	}
   public String getCitrixPluginDataFolder(String file) 
   {
	   String dataFolder = null;
	     /* String processName = System.getProperty("user.name");
	      if (SystemUtils.IS_OS_WINDOWS) {
	         // on Windows VMWARE_DATA_DIR = C:\ProgramData\VMware\vCenterServer\data
	         dataFolder = System.getenv("VMWARE_DATA_DIR") + "\\" + processName + "\\citrixplugin";
	      } else if (SystemUtils.IS_OS_MAC) {
	         // For MacOS developers, no need to define VMWARE_DATA_DIR locally
	         dataFolder = "/var/lib/" + processName + "/citrixplugin";
	      } else {
	         // on Linux VMWARE_DATA_DIR = /storage
	         dataFolder = System.getenv("VMWARE_DATA_DIR") + "/" + processName + "/citrixplugin";
	      }*/
	   
	   	  dataFolder = this.getClass().getResource("/"+file).getPath();
	      return dataFolder;
   }
   
	public String getDeconfigureEntryFilePath()
	{
		//return getTempLocation()+"deconfigureEntry.csv";
		return getTempLocation()+"deconfigureEntry.csv";
	}
	
	public Map<String,List<String>> getClusterMap() 
	{
		return clusterMap;
	}

	public void setClusterMap(Map<String,List<String>> clusterMap) 
	{
		System.out.println("Setting cluster Map"+clusterMap);
		this.clusterMap = clusterMap;
	}
	
	public String getClusterInputPath()
	{
		return getTempLocation()+"clusterInput.psd1";
	}
	
	public String getClusterOutputPath()
	{
		return getTempLocation()+"clusteroutput.csv";
	}
	
	public String getClusterScriptPath()
	{
		return getCitrixPluginDataFolder("clusterScript.ps1");
	}
	
	public String getPsexecPath()
	{
		return getCitrixPluginDataFolder("PsExec.exe");
	}
	
	public String getTempLocation()
	{
		return "C:\\Users\\Public\\";
	}
	public String getCfgPath()
	{
		return getTempLocation()+"citrixPlugincfg.cfg";
	}
	boolean  copyFileUsingFileChannels(String source, String dest)
	{
		System.out.println("Enetered copyFileUsingFileChannels method: "+dest+" "+source);
		FileChannel inputChannel = null;
		FileChannel outputChannel = null;
		File srcFile = null;
		File destFile = null;
		try {
			srcFile = new File(source);
			destFile = new File(dest);
			inputChannel = new FileInputStream(srcFile).getChannel();
			outputChannel = new FileOutputStream(destFile).getChannel();
			System.out.println("OutputChannel: "+outputChannel);
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} 
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return false;
		}
		finally {
			try {
				inputChannel.close();
				outputChannel.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
				
			}
		}
		return true;
	}
	
	void deleteFile(String fileName)
	{
		String msg = "Entered deleteFile method "+fileName;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		try {
			msg = "Enetered try block in delete file";
			System.out.println(msg);
			logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
            java.io.File file = new java.io.File(fileName);
            if ( file.isFile() )
            {
            	msg = "Before deleteing File "+fileName;
            	System.out.println(msg);
            	logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
            	file.delete();
            	msg = "Deleted file"+fileName;
            	System.out.println(msg);
            	logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
            }
		 }
		 catch(Exception e)
		 {
			 msg = "Error in deleteing tempScrScript path"+fileName;
			 logUtil.log(LEVEL.WARN, msg, BasicCfgFileUtil.class, logUtil.getLineNumber());
			 System.out.println(msg);
			 e.printStackTrace();
		 }
		msg = "Exiting deleteFile method "+fileName;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
	}
}
