package com.vmware.simplivity.citrixplugin.util;

import java.net.URL;
import java.util.Calendar;

import com.vmware.vim25.Description;
import com.vmware.vim25.Extension;
import com.vmware.vim25.ExtensionClientInfo;
import com.vmware.vim25.ExtensionEventTypeInfo;
import com.vmware.vim25.ExtensionResourceInfo;
import com.vmware.vim25.ExtensionServerInfo;
import com.vmware.vim25.ExtensionTaskTypeInfo;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.mo.ExtensionManager;
import com.vmware.vim25.mo.ServiceInstance;

public class UpdateExtension {
	
	//final static String EXTENSION_KEY = "com.vmware.htmlsample";
	final static String EXTENSION_KEY = "com.vmware.simplivity.citrixplugin.dummy";
	final static String SERVER_THUMPP_PRINT = "54:e3:1e:d9:51:28:2d:d8:26:98:37:f2:d1:bf:73:97:cf:9c:18:bd";
	final static String COMPANY = "Hewlett Packard Enterprise";
	//static String packageURL = "https://albanyvc.demo.local/com.vmware.samples.htmlsample-2.4.0.zip";
	static String packageURL = "https://albanyvc.demo.local/com.vmware.simplivity.citrixplugin.dummy-1.1.0.zip";
	static String VERSION = "1.1.0";
	static boolean flag = false;
	
	public static void main(String[] a) throws Exception
	{
		// VCENTER CREDENTIALS
		String url = "https://albanyvc.demo.local/sdk";
	    String un = "anusha.y@demo.local";
	    String pwd = "Anu$h@17";
	 
	    ServiceInstance si = new ServiceInstance(new URL(url), un, pwd, true);
	    System.out.println("ServiceInstance:"+si);
	    ExtensionManager em = si.getExtensionManager();
	    System.out.println("Extension Manager:"+em);
	    Extension extension = em.findExtension(EXTENSION_KEY);
	    System.out.println("Extension:"+extension);
	    
	    if(extension ==null)
	    {
	    	System.out.println( "Extension doesn't exists. So creating an extension");
	    	extension = new Extension();
	    	flag = true;
	    }
	    
	    //System.out.println("BEFORE UPDATION:"+extension.getTaskList().length);
	    
	    Description desc = new Description();
        desc.setLabel("HTML Sample Plugin");
        desc.setSummary("HTML Sample Plugin");
        
	    //System.out.println(extension);
	    ExtensionClientInfo[] clientInfo = createClientInfo();
	    ExtensionServerInfo[] serverInfo = createServerInfo();
	    ExtensionTaskTypeInfo[] taskList = createTasklist();
        ExtensionEventTypeInfo[] eventList= createEventList();
        ExtensionResourceInfo[] resourceList = createResourceList();
        
        
        extension.setDescription(desc);
        extension.setKey(EXTENSION_KEY);
        extension.setVersion(VERSION);
        extension.setLastHeartbeatTime(Calendar.getInstance());
        extension.setShownInSolutionManager(true);
        extension.setCompany(COMPANY);
        extension.setServer(serverInfo);
        extension.setClient(clientInfo);
        extension.setTaskList(taskList);
        extension.setEventList(eventList);
        extension.setResourceList(resourceList);
        
        if(flag)
        {
        //	em.registerExtension(extension);
        }
        else 
        {
        	//em.updateExtension(extension);
        	em.unregisterExtension(EXTENSION_KEY);
        }
        
        System.out.println("POST UPDATION:"+em.findExtension(EXTENSION_KEY).getTaskList().length);
	}

	private static ExtensionClientInfo[] createClientInfo() {
		Description desc = new Description();
        desc.setLabel("HTML Sample plugin");
        desc.setSummary("HTML Sample Plugin");
		ExtensionClientInfo extClientInfo = new ExtensionClientInfo();
	    extClientInfo.setVersion(VERSION);
	    extClientInfo.setDescription(desc);
	    extClientInfo.setCompany(COMPANY);
	    extClientInfo.setType("vsphere-client-serenity");
	    extClientInfo.setUrl(packageURL);
	    ExtensionClientInfo[] clientInfo = new ExtensionClientInfo[]{extClientInfo};
		return clientInfo;
	}

	private static ExtensionServerInfo[] createServerInfo() {
		ExtensionServerInfo extServerInfo = new ExtensionServerInfo();
	    extServerInfo.setServerThumbprint(SERVER_THUMPP_PRINT);
	    Description desc = new Description();
        desc.setLabel("HTML Sample Plugin");
        desc.setSummary("HTML Sample Plugin");
        extServerInfo.setDescription(desc);
        extServerInfo.setAdminEmail(new String[]{"anusha.y@hpe.com"});
	    extServerInfo.setCompany(COMPANY);
	    extServerInfo.setUrl(packageURL);
	    extServerInfo.setType("HTTPS");
	    ExtensionServerInfo[] serverInfo = new ExtensionServerInfo[]{extServerInfo};
		return serverInfo;
	}

	private static ExtensionResourceInfo[] createResourceList()
	{
	    KeyValue kv1 = new KeyValue();
	    kv1.setKey("HtmlSampleTask1.category");
	    kv1.setValue("info");
	 
	    KeyValue kv2 = new KeyValue();
	    kv2.setKey("HtmlSampleTask1.label");
	    kv2.setValue("Domain change of VM");
	 
	    KeyValue kv3 = new KeyValue();
	    kv3.setKey("HtmlSampleTask.fullFormat");
	    kv3.setValue("Changing the domain of virtual machine on host {hostname}");
		ExtensionResourceInfo eri1 = new ExtensionResourceInfo();
        eri1.setLocale("en");
        eri1.setModule("task");
        eri1.setData(new KeyValue[] {kv1, kv2, kv3});
           
        return new ExtensionResourceInfo[] { eri1};
	}
	
	private static ExtensionTaskTypeInfo[] createTasklist() {
		ExtensionTaskTypeInfo etti1 = new ExtensionTaskTypeInfo();
        etti1.setTaskID("HtmlSampleTask");
        return new ExtensionTaskTypeInfo[] { etti1};
	}
	
	private static ExtensionEventTypeInfo[] createEventList() {
		ExtensionEventTypeInfo eeti1 = new ExtensionEventTypeInfo();
        eeti1.setEventID("HtmlSampleEvent");
        return new ExtensionEventTypeInfo[] { eeti1};
	}
}
