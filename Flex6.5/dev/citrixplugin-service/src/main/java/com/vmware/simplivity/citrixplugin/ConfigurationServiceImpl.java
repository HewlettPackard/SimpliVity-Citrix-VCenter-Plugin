package com.vmware.simplivity.citrixplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class ConfigurationServiceImpl implements ConfigurationService 
{

	private LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = ConfigurationServiceImpl.class;
	private String msg = null;
	
	public ConfigurationServiceImpl(){}
	
	
	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}


	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}


	@Override
	public String configure(ConfigureInputData configureInputData) 
	{
		
		msg = "Entering configuration ..."+configureInputData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		if(configureInputData == null) 
		{
			msg = "Empty data";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		ProxyData proxyData = fileUtil.getProxyData();
		
		if(proxyData != null)
		{
			msg = "Setting Proxy Data:"+proxyData;
			System.out.println(msg);
			logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
			configureInputData.setProxyData(proxyData);
		}
		
		OVCData ovcData = fileUtil.getOVCData();
		
		if(ovcData != null)
		{
			msg = "Setting OVC Data:"+ovcData;
			System.out.println(msg);
			logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
			configureInputData.setOvcData(ovcData);
		}
		
		if(!prepareInputFile(configureInputData))
		{
			msg = "Error in creating input file";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		String srcPath = fileUtil.getConfigScrPath();
		String tempSrcPath = fileUtil.getTempLocation()+"tempConfigure.ps1";
		if(!fileUtil.copyFileUsingFileChannels(srcPath, tempSrcPath))
		{
			msg = "Error in accessing the configure file from jar";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		PowershellExecutionUtil powershellUtil = new PowershellExecutionUtil();
		RETURNSTATE result = powershellUtil.callPowerShellScript(configureInputData, tempSrcPath);
		
		switch(result)
		{
			case SUCCESS:
			{
				List<DeconfigureTableEntry> deconfigTableEntries = constructDeconfigureTableEntries(configureInputData);
				writeDeconfigureEntryToFile(deconfigTableEntries);
				fileUtil.deleteFile(tempSrcPath);
				msg = "Configuration done. Check the log file for more information.";
				System.out.println(msg);
				logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
				break;
			}
			case FAILURE:
			case PARTIALSUCCESS:
			{
				msg = "Error occured while configuring. Please check the logs"+logUtil.getLogFilePath()+" for more information.";
			}
			default:
		}
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		return msg;
	}

	/** Method: prepareInputFile
	 * 
	 *  Description: Prepared input (*.psd1) files for configuration.
	 *  
	 * @param configureInputData
	 * @return boolean
	 */
	private boolean prepareInputFile(ConfigureInputData configureInputData) 
	{
		msg = "Entered prepareInputFile method."+configureInputData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		List<String> filenameList = new ArrayList<String>();
        for ( int ix = 0; ix < configureInputData.getVmData().size(); ix++ )
        {
        	
            String sFileLine = "@{\r\nvm = \r\n\t@{\r\n";
            sFileLine += "\tname = " + "\'" + configureInputData.getVmData().get(ix).getVmName()  + "\'\r\n" +
                        "\ttemplate = " + "\'" + configureInputData.getTemplate() +"\'\r\n" +
                        "\thost = " + "\'" + configureInputData.getVmData().get(ix).getVmHost() +"\'\r\n" +
                        "\tusername =  " + "\'" + configureInputData.getVmData().get(ix).getVmUsername() +"\'\r\n" +
                        "\tpassword = " + "\'" + configureInputData.getVmData().get(ix).getVmPassword() +"\'\r\n" +
                        "\tisstatic = " + "\'" + configureInputData.getVmData().get(ix).isStatic()  + "\'\r\n";
            
            if(configureInputData.getVmData().get(ix).isStatic())
            {
        	   sFileLine += "\tip = " + "\'" + configureInputData.getVmData().get(ix).getIpAddr()  + "\'\r\n" +
                       "\tprefixlength = " + "\'" + getSubnetPrefix(configureInputData.getVmData().get(ix).getSubnet()) +"\'\r\n" +
                       "\tgateway =  " + "\'" + configureInputData.getVmData().get(ix).getGateway() +"\'\r\n"+
                       "\tdnsserver =  " + "\'" + configureInputData.getVmData().get(ix).getDnsServerAddress() +"\'\r\n";;
            }
            sFileLine += " \t}\r\n";
          
            sFileLine += "ad = \r\n\t@{\r\n";
            sFileLine += "\tdomain = " + "\'" + configureInputData.getDomainData().getDomainName() +"\'\r\n" +
                        "\tusername = " + "\'" + configureInputData.getDomainData().getDomainUserName() +"\'\r\n" +
                        "\tpassword = " + "\'" + configureInputData.getDomainData().getDomainPassword() +"\'\r\n \t}\r\n";
            
            sFileLine += "ovc = \r\n\t@{\r\n";
            sFileLine += "\tovcip = " + "\'" + configureInputData.getOvcData().getOVCIP() +"\'\r\n" +
                        "\tovcusername = " + "\'" + configureInputData.getOvcData().ovcUsername +"\'\r\n" +
                        "\tovcpassword = " + "\'" + configureInputData.getOvcData().getOVCPassword() +"\'\r\n \t}\r\n";
            
            if(configureInputData.getProxyData() != null)
            {
            	sFileLine += "proxy = \r\n\t@{\r\n";
                sFileLine += "\tproxyip = " + "\'" + configureInputData.getProxyData().getProxyIP() +"\'\r\n" +
               			"\tproxyport = " + "\'" + configureInputData.getProxyData().getProxyPort() +"\'\r\n" +
                           "\tproxyusername = " + "\'" + configureInputData.getProxyData().getProxyUserName() +"\'\r\n" +
                           "\tproxypassword = " + "\'" + configureInputData.getProxyData().getProxyPassword() +"\'\r\n \t}\r\n";
            }
          
            sFileLine += "citrix = \r\n\t@{\r\n";
            sFileLine += "\tclientId = " + "\'" + configureInputData.getCitrixData().getClientId() +"\'\r\n" +
                        "\tclientKey = " + "\'" + configureInputData.getCitrixData().getCitrixKey() +"\'\r\n" +
                        "\tcustomerName = " + "\'" + configureInputData.getCitrixData().getCustomerName() +"\'\r\n" +
                        "\tresourceLocation = " + "\'" + configureInputData.getCitrixData().getResourceLocation() +
                        "\'\r\n \t}\r\n}\r";
            String inputFilename = fileUtil.writeToFile(configureInputData.getVmData().get(ix).getVmName()+".psd1", sFileLine, "ConfigPlugin");
            System.out.println("inputFilename: "+inputFilename);
            if(inputFilename == null)
            {
            	System.out.println("Error while creating input file for the VM: "+configureInputData.getVmData());
            	msg = "Error while creating input file for the VM: "+configureInputData.getVmData();
            	logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
            	return false;
            }
            filenameList.add(inputFilename);
        } // Loop
        configureInputData.setInputFileList(filenameList);
        return true;
	}

	private int getSubnetPrefix(String subnet)
	{
		msg = "Entered getSubnetPrefix method: "+subnet;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		StringTokenizer st = new StringTokenizer(subnet, ".");
		int octs[] = new int[4];
		int i = 0, prefixLength = 0;
		try
		{
			while(st.hasMoreElements())
			{
				octs[i] = Integer.valueOf(st.nextToken());
				i++;
			}
		}
		catch(NumberFormatException noe)
		{
			msg = "Error in converting IP octtes "+noe; 
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
		}
		
		for(int j = 0; j< octs.length; j++)
		{
			String binary = Integer.toBinaryString(octs[j]);
			for(int k=0; k<binary.length();k++)
			{
				if(binary.charAt(k) == '1')
				{
					prefixLength++;
				}
			}
		}
		return prefixLength;
	}
	/** Method: constructDeconfigureTableEntries
	 * 
	 *  Description: Creates the DeconfigureEntries that needs to be saved.
	 *  
	 * @param configureInputData
	 * @return List<DeconfigureTableEntry>
	 */
	private List<DeconfigureTableEntry> constructDeconfigureTableEntries(ConfigureInputData configureInputData) 
	{
		msg = "Entering constructDeconfigureTableEntries method...";
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		if(configureInputData == null || configureInputData.isEmpty())
		{
			msg = "Empty data [ConfigureInputData="+configureInputData+"]";
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			System.out.println(msg);
			return null;
		}
		
		
		List<DeconfigureTableEntry> list = new ArrayList<DeconfigureTableEntry>();
		for(int i = 0; i < configureInputData.getVmData().size(); i++)
		{
			DeconfigureTableEntry entry = new DeconfigureTableEntry();
			entry.setVmName(configureInputData.getVmData().get(i).getVmName());
			entry.setVmUserName(configureInputData.getVmData().get(i).getVmUsername());
			entry.setVmHost(configureInputData.getVmData().get(i).getVmHost());
			entry.setVmCluster(configureInputData.getVmData().get(i).getVmCluster());
			entry.setDomainName(configureInputData.getDomainData().getDomainName());
			entry.setDomainUserName(configureInputData.getDomainData().getDomainUserName());
			list.add(entry);
		}
		msg = "Deconfigure entry List created: "+list;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		return list;
	}
	
	/** Method: writeDeconfigureEntryToFile
	 * 
	 *  Description: writes the DeconfigureEntries to a flat file.
	 *  
	 * @param List<DeconfigureTableEntry>
	 */
	private void writeDeconfigureEntryToFile(List<DeconfigureTableEntry> list)
	{
		msg = "Entering writeDeconfigureEntryToFile method...";
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		if(list == null || list.isEmpty())
		{
			msg = "DeconfigureEntryList is empty "+list;
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return;
		}
			
		
		String CSV_SEPERATOR =",";
		String NEW_LINE ="\n";
		String fileName = fileUtil.getDeconfigureEntryFilePath();
		int identifier = getUniqueIdentifier() + 1;
		FileWriter fw  = null;
		
		if(identifier != -1)
		{
			try
			{
				File fileObj = new File(fileName);
				fw = new FileWriter(fileObj, true);
				for(DeconfigureTableEntry entry: list)
				{
					fw.write(entry.getVmName()+CSV_SEPERATOR+entry.getVmUserName()+CSV_SEPERATOR+
							entry.getVmHost()+CSV_SEPERATOR+entry.getVmCluster()+CSV_SEPERATOR+
							entry.getDomainName()+CSV_SEPERATOR+entry.getDomainUserName()+
							CSV_SEPERATOR+identifier+NEW_LINE);
					identifier++;
				}
			}
			catch(IOException ioe)
			{
				msg = "Error while witing to deconfigure entry file";
				System.out.println(msg);
				logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			}
			catch(Exception e)
			{
				msg = "Error while witing to deconfigure entry file";
				System.out.println(msg);
				logUtil.log(LEVEL.ERROR, msg+" "+e.getStackTrace(), clazz, logUtil.getLineNumber());
			}
			finally
			{
				try
				{
					fw.close();
				}
				catch(Exception e)
				{
					msg = "Error while closing the deconfigure entry file while writing entries to the file";
					System.out.println(msg);
					e.printStackTrace();
					logUtil.log(LEVEL.ERROR, msg+" "+e.getStackTrace(), clazz, logUtil.getLineNumber());
				}
			}
			
		}
		else
		{
			msg = "Error occured while writing to deconfigure entries";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
		}
			
	}
	
	/** Method: getUniqueIdentifier
	 * 
	 *  Description: Get the last index of the deconfigure entries in teh deconfigureEntry File.
	 *  
	 * @return identifier
	 */
	private int getUniqueIdentifier()
	{
		String currentLine = null, lastLine = null;
		int identifier = -1;
		boolean flag = false;
		BufferedReader br = null;
		File f = null;
		try
		{
			f = new File(fileUtil.getDeconfigureEntryFilePath());
			if(f.exists())
			{
				br = new BufferedReader(new FileReader(fileUtil.getDeconfigureEntryFilePath()));
				try
				{
					while ((currentLine = br.readLine()) != null)
		            {
		                   lastLine = currentLine;
		                   flag = true;
		            }
					
					if(!flag)
					{
						msg = "Writing decnfigure entries for the first time";
						System.out.println(msg);
						logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
						return 1;
					}
					if(lastLine != null)
	                {
	                       String temp = lastLine.substring(lastLine.lastIndexOf(",")+1);
	                       identifier = Integer.parseInt(temp);
	                }
				} 
				catch(NumberFormatException nfe)
				{
					msg = "Invalid entries found while reading the Deconfigure entries.";
					System.out.println(msg);
					logUtil.log(LEVEL.ERROR, msg+" "+nfe.getStackTrace(), clazz, logUtil.getLineNumber());
				}
				catch (IOException e) 
				{
	                e.printStackTrace();
				}
			}
			else
			{
				msg = "Writing decnfigure entries for the first time";
				System.out.println(msg);
				logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
				return 0;
			}
			
		}
		catch(FileNotFoundException fne)
		{
			fne.printStackTrace();
			msg = "Deconfigure Entry file not found!";
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			
		}
		catch(Exception e)
		{
			msg = "Error while reading from Deconfigure File entry"+e.getLocalizedMessage();
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(Exception e)
			{
				msg = "error in closing the Deconfigure entry file"+e.toString();
				e.printStackTrace();
				System.out.println(msg);
				logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			}
		}
		return identifier;
	}

}
