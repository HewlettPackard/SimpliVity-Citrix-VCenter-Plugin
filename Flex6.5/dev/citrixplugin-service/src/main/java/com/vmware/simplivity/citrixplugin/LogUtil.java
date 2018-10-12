package com.vmware.simplivity.citrixplugin;

import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class LogUtil 
{

	private String logFileName = null;
	
	public LogUtil()
	{
		initLogger();
	}
	
	/**
	 * Method: initLogger
	 * 
	 * Description: Assigns the logfile path
	 */
	private void initLogger() 
	{
		logFileName = getLogFilePathFromCfg();
	}
	
	/**
	 * Method: getLogFilePathFromCfg
	 * 
	 * Description: Gets the log path from configuration file path
	 * 
	 * @return log file path
	 */
	private String getLogFilePathFromCfg() 
    { 
    	return "C:\\ProgramData\\VMware\\vCenterServer\\logs\\vsphere-client\\logs\\CitrixPluginLog.log"; 
    	//For local server
    			//"serviceability/logs/CitrixPluginLog.log"
    	//return System.getProperty("user.dir") + File.separator + returnVal;
    }
	
	/**
	 * Method: getLogFilePath
	 * 
	 * Description: Gets the log path 
	 * 
	 * @return log file path
	 */
	public String getLogFilePath()
	{
		return logFileName;
	}
	
	/**
	 * Method: log
	 * 
	 * Description: Writes the logs to the file.
	 * 
	 */
	public void log(LEVEL level, String msg, Class clazz, int lineNumber)
	{
		FileWriter fw = null;
		try
		{
			File file = new File(logFileName);
			double size = file.length()/1024;
			if(size > 1500)
			{
				String ch = logFileName.substring(logFileName.length()-5, logFileName.length()-4);
				if(Character.isDigit(ch.charAt(0)))
				{
					int temp = Integer.parseInt(ch);
					temp++;
					logFileName = logFileName.substring(0, logFileName.length()-5)+temp+logFileName.substring(logFileName.length()-4);
				}
				else
				{
					logFileName = logFileName.substring(0, logFileName.length()-5)+"1"+logFileName.substring(logFileName.length()-4);
				}
			}
			fw = new FileWriter(logFileName,true);
			String temp = getCurrentTime()+level.toString()+" "+clazz.getSimpleName()+":"+lineNumber+" "+msg+"\n";
			synchronized (fw) {
				fw.write(temp);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in writing  to file ");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println("Error  closing logFile");
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Method: getCurrentTime
	 * 
	 * Description: Gets the current time 
	 * 
	 * @return current time
	 */
	private String getCurrentTime()
	{
		int day, month, year;
	      int second, minute, hour;
	      GregorianCalendar date = new GregorianCalendar();
	 
	      day = date.get(Calendar.DAY_OF_MONTH);
	      month = date.get(Calendar.MONTH);
	      year = date.get(Calendar.YEAR);
	 
	      second = date.get(Calendar.SECOND);
	      minute = date.get(Calendar.MINUTE);
	      hour = date.get(Calendar.HOUR);
	      month = month +1;
	      String str =((day<10)?("0"+day):day)+"-"+((month<10)?("0"+month):month)+"-"+year+" "+((hour<10)?("0"+hour):hour)+":"+
	    		  ((minute<10)?("0"+minute):minute)+":"+((second<10)?("0"+second):second)+" ";
	      
	      return str;
	}
	
	/**
	 * Method: getLineNumber
	 * 
	 * Description: Gets the line number 
	 * 
	 * @return line number
	 */
	public int getLineNumber() 
	{
	    return ___8drrd3148796d_Xaf();
	}
	private int ___8drrd3148796d_Xaf()
	{
	    boolean thisOne = false;
	    int thisOneCountDown = 1;
	    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
	    for(StackTraceElement element : elements) {
	        String methodName = element.getMethodName();
	        int lineNum = element.getLineNumber();
	        if(thisOne && (thisOneCountDown == 0)) {
	            return lineNum;
	        } else if(thisOne) {
	            thisOneCountDown--;
	        }
	        if(methodName.equals("___8drrd3148796d_Xaf")) {
	            thisOne = true;
	        }
	    }
	    return -1;
	}
}
