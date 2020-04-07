/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Component, EventEmitter} from '@angular/core';
import {OnInit, Input} from "@angular/core";
import {ConfigureService} from "../../services/configure.service";
import {ClusterService} from "../../services/cluster.service";
import {OVCService} from "../../services/ovc.service";
import {ReadCfgFileService} from "../../services/readcfgfile.service";
import {VMData} from "../../model/vmdata.model";
import {CitrixData} from "../../model/citrixdata.model";
import {DomainData} from "../../model/domaindata.model";
import {ConfigureInput} from "../../model/configureinput.model";
import {Message} from "../../model/message.model";
import {ClusterAndHostInfo} from "../../model/clusterandhostinfo.model";
import {ValidationUtil} from "../../services/validation";
import {NgForm} from '@angular/forms';
import {NgModule} from '@angular/core';

@Component(
    {
        templateUrl: './configure.component.html'
    }
)

export class ConfigureComponent implements OnInit{
	
	showSuccessMessage: boolean = false;
	showFailureMessage: boolean = false;
	showInfoMessage: boolean = false;
	public ovcmsg: string =null;
	public errormsg: string =null;
	public infomsg: string =null;
	public selectedIsStatic1: string = "";
	public selectedIsStatic2: string = "";
	public index: number = 0;
	public clusters: string[];
	public hosts: string[];
	public isStatic1: boolean = false;
	public isStatic2: boolean = false;
	public isInputCorrect: boolean = false;
	private vm1EntryCheck: boolean = false;
	vmindex:number = 0;

	domaindata: DomainData;
	citrixdata: CitrixData;
	vmdata: VMData;
	vmdata1:VMData;
	vmdata2:VMData;
	configureInput: ConfigureInput;
	vmdatalist: VMData[]= new Array();
	platformset: boolean = false;
	
	constructor( private configureService: ConfigureService, private readcfgfileService: ReadCfgFileService, 
				private clusterService: ClusterService, private ovcService: OVCService) {
		this.domaindata = new DomainData();
		this.citrixdata = new CitrixData();
		this.vmdata = new VMData();
		this.vmdata1 = new VMData();
		this.vmdata2 = new VMData();
		this.configureInput = new ConfigureInput();
		this.ovcService.isOVCDataSet().then((result: Message)=> {
			console.log(result);
			if(result != null)
			{
				this.errormsg = result.error;
				this.showFailureMessage = true;
				alert(result.error);
			}
		});
		this.readcfgfileService.readcfgfile()
	 	.then((result: ConfigureInput) => {
            if (result) {
               if(result.template)
               {
               	this.configureInput.template = result.template;
               }
               if(result.citrixData)
               {
               	this.citrixdata = result.citrixData;
               	this.configureInput.citrixData = result.citrixData;
               }
               if(result.domainData)
               {
               	this.domaindata = result.domainData;
               	this.configureInput.domainData = result.domainData;
               }
            } else {
               alert("No data from the Cfg file is read");
            }
            if(this.showFailureMessage != true)
            {
            	this.showInfoMessage = true;
            	this.infomsg = "Please wait until the Cluster and host details are loaded!"
            }
         });
         this.ovcService.isNonSimplivityPlatform()
	 	.then((result: Message) => {
            if (result) {
             	if (result.message == "set")
             	{
             		this.platformset = true;
             	}  
            }
         });
         this.clusterService.getClusterInfo().then((result: ClusterAndHostInfo)=>{
         	if(result)
         	{
         		if(result.clusters)
         		{
         			this.clusters = result.clusters;
         			console.log(this.clusters);
         		}
         	}
         	else
         	{
         		alert("Failed to fetch Cluster details. Please check the OVC/ILO details submitted. For more information please check the logs");
         	}
         	this.showInfoMessage = false;
         	});
    }
        ngOnInit(): void {
       
    }
    isSelected1(name: string): boolean   
  	{  
        if (!this.selectedIsStatic1) {   
            return false;  
  		}  
        return (this.selectedIsStatic1 === name);   
    }
    isSelected2(name: string): boolean   
  	{  
        if (!this.selectedIsStatic2) {   
            return false;  
  		}  
        return (this.selectedIsStatic2 === name);   
    }  
   
   	setradio1(e: string): void   
    {  
        this.selectedIsStatic1 = e;  
        if( e === "StaticIP")
        {
        	//this.vmdata1.isStatic = true;
        	this.isStatic1 = true; 
        }
        if( e === "DHCP")
        {
        	//this.vmdata1.isStatic = false;
        	this.isStatic1 = false; 
        }
    }
    setradio2(e: string): void   
    {  
        this.selectedIsStatic2 = e;  
        if( e === "StaticIP")
        {
        	//this.vmdata2.isStatic = true;
        	this.isStatic2 = true; 
        }
        if( e === "DHCP")
        {
        	//this.vmdata2.isStatic = false;
        	this.isStatic2 = false; 
        }
    }  
   	
    setCluster(newValue: string): void {
		 this.clusterService.getHostInfo(newValue).then((result: ClusterAndHostInfo)=>{
         	this.hosts = result.hosts;
         	console.log(this.hosts);
         	});
   	}
   	
   	getHosts(): void {
   		this.clusterService.getHostInfo(this.vmdata.vmCluster).then((result: ClusterAndHostInfo)=>{
         	this.hosts = result.hosts;
         	console.log(this.hosts);
         	});
   	}
  
  	onCancel(result?: any): void {
      
   	}
   clear() {}
     /**
     * Triggered when user clicks on "Update" button.
     */
     
     onSubmit(): void {
     	this.configureInput.citrixData = this.citrixdata;
     	this.configureInput.domainData = this.domaindata;
     	
     	
     	//vm2EntryCheck: boolean = false;      	
     	let regExp = new RegExp('^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$');
     	
     	if( this.vmdata1.vmName != undefined && this.vmdata1.vmUsername != undefined && this.vmdata1.vmPassword != undefined)
     	{
     		if(this.isStatic1 == true && this.vmdata1.ipAddr != undefined && this.vmdata1.subnet != undefined && 
     				this.vmdata1.gateway != undefined && this.vmdata1.dnsServerAddress != undefined)
     		{
     			this.vmdata1.isStatic = true;
     			if( regExp.test(this.vmdata1.ipAddr) && regExp.test(this.vmdata1.subnet) && regExp.test(this.vmdata1.gateway) && regExp.test(this.vmdata1.dnsServerAddress))
     			{
     				this.isInputCorrect = true;
     			}
     			else
     			{
     				this.isInputCorrect = false;
     			}
     			this.vmdata1.vmCluster = this.vmdata.vmCluster;
     			this.vmdatalist[0] = this.vmdata1;
     			this.configureInput.vmData = this.vmdatalist
     		}
     		else
     		{
     			this.isInputCorrect = true;
     			this.vmdata1.isStatic = false;
     			this.vmdata1.vmCluster = this.vmdata.vmCluster;
     			this.vmdatalist[0] = this.vmdata1;
     			this.configureInput.vmData = this.vmdatalist
     			
     		}
     		this.vm1EntryCheck = true;
     	}
     	if( this.vmdata2.vmName != undefined && this.vmdata2.vmUsername != undefined && this.vmdata2.vmPassword != undefined)
     	{
			this.isInputCorrect = false;
     		if(this.vm1EntryCheck)
     		{
     			this.vmindex = 1;
     		}
     		if(this.isStatic2 == true && this.vmdata2.ipAddr != undefined && this.vmdata2.subnet != undefined && 
     				this.vmdata2.gateway != undefined && this.vmdata2.dnsServerAddress != undefined)
     		{
     			
     			this.vmdata2.isStatic = true;
     			if( regExp.test(this.vmdata2.ipAddr) && regExp.test(this.vmdata2.subnet) && regExp.test(this.vmdata2.gateway) && regExp.test(this.vmdata2.dnsServerAddress))
     			{
     				this.isInputCorrect = true;
     			}
     			else
     			{
     				this.isInputCorrect = false;
     			}
     			this.vmdata2.vmCluster = this.vmdata.vmCluster;
     			this.vmdatalist[this.vmindex] = this.vmdata2;
     			this.configureInput.vmData = this.vmdatalist
     		}
     		else
     		{
     			this.isInputCorrect = true;
     			this.vmdata2.isStatic = false;
     			this.vmdata2.vmCluster = this.vmdata.vmCluster;
     			this.vmdatalist[this.vmindex] = this.vmdata2;
     			this.configureInput.vmData = this.vmdatalist
     		}
     		
     		if(this.vmindex == 1 && this.vmdata1.vmHost == this.vmdata2.vmHost)
     		{
     			alert("Both the VMs cannot have the same host");
     			this.isInputCorrect = false;
     		}
		}
		     	
     	console.log(this.configureInput);
     	if(this.isInputCorrect)
     	{
     		//console.log("In IF "+this.configureInput);
     		this.showSuccessMessage = false;
     		this.showInfoMessage = true;
     		//alert("In IF "+this.showInfoMessage);
     		this.infomsg = "Configuration may take few minutes.";//Please check the latest log file from C:\\ProgramData\\VMware\\vCenterServer\\logs\\vsphere-client\\logs location";
     		this.configureService.configure(this.configureInput)
		 	.then((result: Message) => {
	            if (result) {
	            	this.showInfoMessage = false;
	            	//alert(result.message);
	            	
			        if(result.error != null)
			        {	
			        	alert(result.error);
			        	this.errormsg = result.error;
			        	this.showFailureMessage = true;
			        }
			        else
			     	{
			     		this.showSuccessMessage = true;
			        	this.ovcmsg = result.message;
			        }
	            } else {
	               alert("Data did not get saved!"+result.message);
	               this.errormsg = "Data did not get saved!";
	               this.showFailureMessage = true;
	            }
	         })
	         .catch(() => {
	            this.onCancel();
	         });
	         
     	}
     	else
     	{
     		alert("Incorrect data submitted. Please check the data again and click on Configure");
     	}
         this.isInputCorrect = false;
  	   }
}
