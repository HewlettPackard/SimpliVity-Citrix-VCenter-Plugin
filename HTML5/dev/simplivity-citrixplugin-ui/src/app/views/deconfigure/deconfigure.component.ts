/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Component, EventEmitter} from '@angular/core';
import {OnInit, Input} from "@angular/core";
import {DeconfigureTableService} from "../../services/deconfiguretable.service";
import {DeconfigureService} from "../../services/deconfigure.service";
import {OVCService} from "../../services/ovc.service";
import {VMData} from "../../model/vmdata.model";
import {DomainData} from "../../model/domaindata.model";
import {BaseInput} from "../../model/baseinput.model";
import {DeconfigureTableEntries} from "../../model/deconfiguretableentries.model";
import {DeconfigureTableEntry} from "../../model/deconfiguretableentry.model";
import {Message} from "../../model/message.model";
import {ValidationUtil} from "../../services/validation";
import {NgForm} from '@angular/forms';
import {NgModule} from '@angular/core';

@Component(
    {
        templateUrl: './deconfigure.component.html'
    }
)

export class DeconfigureComponent implements OnInit{
	
	showSuccessMessage: boolean = false;
	showFailureMessage: boolean = false;
	showInfoMessage: boolean = false;
	public infomsg: string =null;
	public ovcmsg: string =null;
	public errormsg: string =null;
	public selectedRowNumber : number = 0;

	domaindata: DomainData;
	vmdata: VMData;
	baseInput: BaseInput;
	vmdatalist: VMData[]= new Array();
	dentries: DeconfigureTableEntries;
	decnofigEntries: DeconfigureTableEntry[] = new Array();
	
	constructor( private deconfigureService: DeconfigureService, private deconfigureTableService: DeconfigureTableService, private ovcService: OVCService) {
		this.domaindata = new DomainData();
		this.vmdata = new VMData();
		this.baseInput = new BaseInput();
		this.ovcService.isOVCDataSet().then((result: Message)=> {
			console.log(result);
			if(result != null)
			{
				this.errormsg = result.error;
				this.showFailureMessage = true;
			}
		});
		this.deconfigureTableService.getDeconfigureEntries().then((result: DeconfigureTableEntries)=>{
         	//this.hosts = result.hosts;
         	console.log(result);
         	console.log("Entries"+result.deconfigureTableEntries);
         	this.dentries = result;
         	this.decnofigEntries = result.deconfigureTableEntries;
         	console.log("Entries1"+this.decnofigEntries);
         	});
    }
    ngOnInit(): void {
       
    }
   	
   	getDeconfigureEntries(): void {
   		this.deconfigureTableService.getDeconfigureEntries().then((result: DeconfigureTableEntries)=>{
   			this.dentries = result;
         	this.decnofigEntries = result.deconfigureTableEntries;
         	console.log("After Refresh::"+this.decnofigEntries);
         	});
   	}
   	rowSelected(element): void{
   		for(let item of this.dentries.deconfigureTableEntries)
   		{
   			if(item.rowNumber == element)//(+element.target.value))
   			{
   				this.vmdata.vmName = item.vmName;
   				this.vmdata.vmUsername = item.vmUserName;
   				this.vmdata.vmHost = item.vmHost;
   				this.vmdata.vmCluster = item.vmCluster;
   				this.domaindata.domainName= item.domainName;
   				this.domaindata.dmnUserName = item.domainUserName;
   				this.selectedRowNumber = element;//+element.target.value;
   			}
   		}
   	}
   	updateFields():void {
   		for(let item of this.dentries.deconfigureTableEntries)
   		{
   			if(item.rowNumber == this.selectedRowNumber)//(+element.target.value))
   			{
   				this.vmdata.vmName = item.vmName;
   				this.vmdata.vmUsername = item.vmUserName;
   				this.vmdata.vmHost = item.vmHost;
   				this.vmdata.vmCluster = item.vmCluster;
   				this.domaindata.domainName= item.domainName;
   				this.domaindata.dmnUserName = item.domainUserName;
   				this.selectedRowNumber = this.selectedRowNumber;//+element.target.value;
   			}
   		}
   	}
   	
   	
  	onCancel(result?: any): void {
      
   	}
    clear() {}
     /**
     * Triggered when user clicks on "Update" button.
     */
     
    onSubmit(): void {
     	this.baseInput.domainData = this.domaindata;
     	this.vmdatalist[0] = this.vmdata;
     	this.baseInput.vmData = this.vmdatalist;
     	this.baseInput.rowNumber = this.selectedRowNumber;
     	console.log("ONSubmit:"+this.baseInput);
     	this.showSuccessMessage = false;
     	this.showFailureMessage = false;
     	this.showInfoMessage = true;
     	this.infomsg = "Deconfiguration may take few minutes.";
     	this.deconfigureService.deconfigure(this.baseInput)
	 	.then((result: Message) => {
            if (result) {
            	this.showInfoMessage = false;
            	if(result.error == null)
            	{
               		alert(result.message);
		            this.showSuccessMessage = true;
		            this.ovcmsg = result.message;
		        }
		        else
		        {
		        	alert(result.error);
					this.errormsg = result.error;
					this.showFailureMessage = true;	
		        }
            } else {
               alert("Error occured while performing deconfiguration. Please check the log file for more information.");
               this.errormsg = "Error occured while performing deconfiguration. Please check the log file for more information.";
               this.showFailureMessage = true;
            }
            this.vmdata.vmName = "";
   				this.vmdata.vmUsername = "";
   				this.vmdata.vmHost = "";
   				this.vmdata.vmCluster = "";
   				this.domaindata.domainName= "";
   				this.domaindata.dmnUserName = "";
   				this.domaindata.dmnPassword = "";
   				this.vmdata.vmPassword = "";
   				this.selectedRowNumber = -1;
         })
         .catch(() => {
            this.onCancel();
         });
     }
}
