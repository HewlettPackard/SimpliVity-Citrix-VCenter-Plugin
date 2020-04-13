/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Component, EventEmitter} from '@angular/core';
import {OnInit, Input} from "@angular/core";
import {OVCService} from "../../services/ovc.service";
import {OVCData} from "../../model/ovcdata.model";
import {Message} from "../../model/message.model";
import {RemoteWindowsVMData} from "../../model/remotewindowsvmdata.model";
import {ValidationUtil} from "../../services/validation";
import {NgForm} from '@angular/forms';

@Component(
    {
        templateUrl: './ovcData.component.html'
    }
)

export class OVCDataComponent implements OnInit{
	
	showSuccessMessage: boolean = false;
	showFailureMessage: boolean = false;
	public ovcmsg: string =null;
	public errormsg: string =null;
	public selectedPlatform: string = "Simplivity";
	private pltform:boolean = false;
	public ipAddr :string;
	public remoteWin :RemoteWindowsVMData;
	inputCorrect:boolean = false;

	ovcdata: OVCData;
	
	constructor( private ovcService: OVCService) {
		
    }

    ngOnInit(): void {
        this.ovcdata = new OVCData();
        this.remoteWin = new RemoteWindowsVMData();
    }
	setradio(e: string): void   
    {  
        this.selectedPlatform = e;  
        if( e === "NonSimplivity")
        {
        	this.ovcdata.platform = true; 
        }
    }  
  
    isSelected(name: string): boolean   
  	{  
        if (!this.selectedPlatform) { // if no radio button is selected, always return false so every nothing is shown  
            return false;  
  		}  
        return (this.selectedPlatform === name); // if current radio button is selected, return true, else return false  
    } 
    
   	 onCancel(result?: any): void {
      
   }

	isInputValid(): boolean {

		return ValidationUtil.isOVCDtataValid(this.ovcdata.ovcIP, this.ovcdata.ovcUsername, this.ovcdata.ovcPassword);
	}
    /**
     * Triggered when user clicks on "Update" button.
     */
     
     onSubmit(): void {
     	//console.log(this.ovcdata);
     	if(this.ovcdata.platform)
     	{
     		this.ovcdata.iloAddress= this.ovcdata.ovcIP;
     		//this.ovcdata.ovcIP = null;
     		if(this.ovcdata.ovcUsername != undefined && this.ovcdata.ovcPassword != undefined)
     		{
     			this.inputCorrect = true;
     		}
     	}
     	else
     	{
     		let regExp = new RegExp('^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$');
     		if(this.ovcdata.ovcIP != undefined && regExp.test(this.ovcdata.ovcIP) && this.ovcdata.ovcUsername != undefined && this.ovcdata.ovcPassword != undefined)
     		{
     			this.inputCorrect = true;
     		}
     	}
     //	alert("nputCorrect:"+this.inputCorrect);
     	if(this.inputCorrect)
     	{
     		this.ovcdata.remoteWindowsVMData = this.remoteWin;
     		console.log(this.ovcdata);
     		this.ovcService.setOvcData(this.ovcdata)
		 	.then((result: Message) => {
	            if (result) {
	              // alert(result.message);
	               if(result.error != null)
	               {
	                alert(result.error);
	               	this.errormsg = result.error;
	               	this.showFailureMessage = true;
	               }
	               else
	               {
	               	alert(result.message);
	               	this.ovcmsg = result.message;
	               	this.showSuccessMessage = true;
	               }
	            } else {
	               alert(result.error);
	               this.showFailureMessage = true;
	               this.errormsg = "Data did not get saved!";
	            }
	         })
	         .catch(() => {
	            this.onCancel();
	         });
     	}
     	else
     	{
     		alert("Invalid details provided.");
     		this.errormsg = "Invalid details provided";
     		this.showFailureMessage = true;
     	}
     	  this.showSuccessMessage = false;
     this.showFailureMessage = false;
     }
   
}
