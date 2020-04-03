package com.vmware.simplivity.citrixplugin.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

import com.vmware.simplivity.citrixplugin.model.BaseInputData;
import com.vmware.simplivity.citrixplugin.model.RemoteWindowsVMData;
import com.vmware.simplivity.citrixplugin.model.ScriptInfo;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.TaskManager;


public class RemotePowershellExecutionUtil 
{
	static Logger logger = Logger.getLogger(RemotePowershellExecutionUtil.class);
	private String msg = null;
	static int flag1 = 0;
	static int flag2= 0;
	ServiceInstance si;
	HostSystem host;
	RemoteWindowsVMData rwvd;

	
	public RemotePowershellExecutionUtil() {}
	
	/**
	 * 	Method: callPowerShellScript
	 * 
	 * Description: call the powershell script
	 * 
	 * @param baseInputData
	 * @param scriptPath
	 * @return RETURNSTATE
	 */
	public String callPowerShellScript(BaseInputData baseInputData, List<ScriptInfo> scriptList, String hostname)
	{
		logger.debug("Entered callPowerShellScript method: "+baseInputData+" "+hostname+" "+scriptList);
		if(baseInputData == null || baseInputData.isEmpty())
		{
			msg = "Empty data received";
			logger.error(msg);
			return msg;
		}
		
		if(scriptList == null || scriptList.size() < 1)
		{
			msg = "No source script files found!";
			logger.error(msg);
			return msg;
		}
		rwvd = baseInputData.getOvcData().getRemoteWindowsVMData();
		if(rwvd == null)
		{
			msg = "No remote windows details provided.";
			logger.debug(msg);
			return msg;
		}
		try
		{
			int numberOfThreads = baseInputData.getInputFileList().size();
			logger.debug("Number of Threads::"+numberOfThreads);
			PowershellExecutor[] arrayOfThreads = new PowershellExecutor[numberOfThreads];
			
			/*InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println("inetAddress:"+inetAddress);*/
			//String url = null;
			//System.out.println("URL:"+url);
			//Remove this post testing
			//url = "albanyvc.demo.local";
			String url = "https://"+hostname+"/sdk";
			//System.out.println("POST Modification URL:"+url);
			
			si = new ServiceInstance(new URL(url), baseInputData.getOvcData().getOVCUserName(), baseInputData.getOvcData().getOVCPassword());
			logger.debug("Serevr Instance: "+si);
			ManagedEntity[] mes = new InventoryNavigator(si.getRootFolder()).searchManagedEntities("HostSystem");
			logger.debug("Mes:: "+mes);
			host = (HostSystem)mes[0];
			logger.debug("Host:"+host);
			for(int index=0; index < numberOfThreads; index++)
			{
				arrayOfThreads[index] = new PowershellExecutor(baseInputData, index, scriptList, si, host, rwvd);
				arrayOfThreads[index].start();
			}
			
			for(int index=0; index < numberOfThreads; index++)
			{
				logger.debug("Came into join loop"+index);
				arrayOfThreads[index].join();
				logger.debug("Join over"+index);
			}
		}
		catch(Exception e)
		{
			msg = "Error occured in execution. Please check the logs";
			logger.error(msg, e);
			e.printStackTrace();
			return msg;
		}

		if( baseInputData.getVmData().size() == 1)
		{
			if(flag1 == -1)
			{
				flag1 = 0;
				msg = "Exceptions occured during operation for the VM "+baseInputData.getVmData().get(0).getVmName()+". Please check the logs for more information.";
				logger.debug(msg);
				return msg;
			}
		}
		else if(baseInputData.getVmData().size() == 2)
		{
			if(flag1 == -1 && flag2 == -1)
			{
				flag1 = 0; flag2 = 0;
				msg = "Exceptions occured while executing the thread(s). Please check the logs";
				logger.debug(msg);
				return "Exceptions occured during operation on both the VMs. Please check the logs for more information.";
			}
			if(flag1 == -1 && flag2 == 0)
			{
				flag1 = 0;
				msg = "Error occured while performing operation on VM "+baseInputData.getVmData().get(0).getVmName()+". Please check logs for more info.";
				logger.error(msg);
				return msg;
			}
			if(flag1 == 0 && flag2 == -1)
			{
				flag2 = 0;
				msg = "Error occured while performing operation on VM "+baseInputData.getVmData().get(1).getVmName()+". Please check logs for more info.";
				logger.error(msg);
				return msg;
			}
		}
				
		return "success";
	}
		
	/**
	 * Thread class to run the scripts
	 *
	 */
	static class PowershellExecutor extends Thread
	{
		BaseInputData baseInputData;
		int index = -1;
		List<ScriptInfo> scriptList = null;
		String msg = null;
		ServiceInstance si;
		HostSystem host;
		Task task;
		String logFile = "C:/ProgramData/VMware/vCenterServer/logs/vsphere-client/logs/CitrixPluginLog.log";
		boolean failure = false;
		RemoteWindowsVMData rwvd;
		Connection conn;
		Session sess;
		
		public PowershellExecutor() {}
		
		PowershellExecutor(BaseInputData inputData, int index, List<ScriptInfo> scriptList, ServiceInstance si, HostSystem host, RemoteWindowsVMData rwvd)
		{
			this.baseInputData = inputData;
			this.index = index;
			this.scriptList = scriptList;
			this.si = si;
			this.host = host;
			this.rwvd = rwvd;
		}

		@Override
		public void run() 
		{
			String inputFileName = null;
			logger.debug("Entered run method..");
			synchronized (this) 
			{
				logger.debug("Entered synchronized block ...");
				
				try
				{
					for(int i=0; i<scriptList.size(); i++)
					{

						logger.debug("Enetered for loop :"+scriptList.get(i));
						msg = baseInputData.getVmData().get(index).getVmName()+" ==> Thread started...\n";
						
						RemotePowershellExecutionUtil.logger.debug( msg);
						
						inputFileName = baseInputData.getInputFileList().get(index);
					
						logFile = "/var/log/vmware/vsphere-ui/logs/CitrixH5PluginPowershellLog.log";
						String sCommand = "powershell "+scriptList.get(i).scriptName+" -inputFile " + inputFileName+ " -logFile "+logFile;
						
						msg = "Command to execute: "+sCommand;
						RemotePowershellExecutionUtil.logger.debug(msg);
						conn = new Connection(rwvd.getWinIP());
						conn.connect();
						boolean isAuthenticated = conn.authenticateWithPassword(rwvd.getWinUsername(),rwvd.getWinPassword());
						if (isAuthenticated == false) {
							logger.error("Authentication failed for the remote system. Please submit the valid windows details");
							return;
						}
						logger.debug(isAuthenticated);
						sess = conn.openSession();
						
						TaskManager tm = si.getTaskManager();
						/*System.out.println("TASK MANAGER:"+tm);
						System.out.println("Host::"+host);
						System.out.println("TASKID: "+scriptList.get(i).taskID);*/
						TaskInfo ti = tm.createTask(host, scriptList.get(i).taskID, "Administrator", true);
						//System.out.println("TASKINFO: "+ti);
						task = new Task(si.getServerConnection(), ti.getTask());
						//System.out.println("TASK:"+task);						
						RemotePowershellExecutionUtil.logger.debug( msg);
						sess.execCommand(sCommand); 
		                task.setTaskState(TaskInfoState.running, null, null);
		                task.updateProgress(10+(i*4));
		                
		                InputStream stdout = new StreamGobbler(sess.getStdout());
		    			BufferedReader br = new BufferedReader(new InputStreamReader(stdout));
		    			while (true) {
		    				String line = br.readLine();
		    				if (line == null)
		    					break;
		    				RemotePowershellExecutionUtil.logger.debug(line);
		    			}
		    			InputStream stderr = new StreamGobbler(sess.getStderr());
		    			BufferedReader err = new BufferedReader(new InputStreamReader(stderr));

		    			String line = null;
		    			while ((line = err.readLine()) != null) {
		    				if(index == 0)
		                	{
		                		RemotePowershellExecutionUtil.flag1 = -1;
		                	}
		                	else if (index == 1)
		                	{
		                		RemotePowershellExecutionUtil.flag2 = -1;
		                	}
		                	failure = true;
		    				RemotePowershellExecutionUtil.logger.error("ERRPR:"+line);
		    			}
		    			// System.out.println("Exit code" + sess.getExitStatus());
		    			br.close();
		    			err.close();
		              
		                msg = "Finished Execution of Thread"+index+" Flag:"+RemotePowershellExecutionUtil.flag1;
		               RemotePowershellExecutionUtil.logger.debug(msg);
		                if(failure)
		                {
		                	RemotePowershellExecutionUtil.logger.error("Error occured while executing the script"+scriptList.get(i).scriptName);
		                	RemotePowershellExecutionUtil.logger.error("TASK STATUS::"+task.getTaskInfo().toString());
		                	//task.setTaskState(TaskInfoState., null, null);
		                	task.cancelTask();
		                	RemotePowershellExecutionUtil.logger.error("Error occured during execution of "+scriptList.get(i).scriptName);
		                	return;
		                }
		                else
		                {
		                	task.setTaskState(TaskInfoState.success, null, null);
		                	RemotePowershellExecutionUtil.logger.debug(scriptList.get(i).scriptName+" executed successfully");
		                }
		                RemotePowershellExecutionUtil.logger.debug( msg);
					
		                if(conn != null)
		    			{
		    				conn.close();
		    			}
		    			if(sess != null)
		    			{
		    				sess.close();
		    			}
					}
				}
				catch(Exception e) 
				{
					if(index == 0)
                	{
                		RemotePowershellExecutionUtil.flag1 = -1;
                	}
                	else if (index == 1)
                	{
                		RemotePowershellExecutionUtil.flag2 = -1;
                	}
					msg = baseInputData.getVmData().get(index).getVmName()+" ==> Thread Terminated with an exception..."+e;
					logger.debug(msg);
					e.printStackTrace();
					RemotePowershellExecutionUtil.logger.error( msg, e);
					try {
						//task.setTaskState(TaskInfoState.error, null, null);
						task.cancelTask();
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						
					}
				}
				
			}//synchronized
		}//run
	}//class

}