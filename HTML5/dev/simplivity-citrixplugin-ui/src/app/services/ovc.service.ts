/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Injectable} from "@angular/core";
import {Response} from "@angular/http";
import {OVCData} from "../model/ovcdata.model";
import {Message} from "../model/message.model";
import {GlobalService} from "./global.service";

import "rxjs/add/operator/toPromise";

@Injectable()
export class OVCService extends GlobalService{
   /**
    * Creates a new object of type OVCData
    * @param ovcData - the created object.
    */
   public setOvcData (ovcData: OVCData): Promise<Message> {

      const url = `${OVCService.WEB_CONTEXT_PATH}/rest/setovcdata`;

      return this.http.post(url, JSON.stringify(ovcData), {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
            let msg = response.json() as Message;
            return msg;
         })
        .catch(this.handleError);
   }

   public isOVCDataSet (): Promise<Message> {

      const url = `${OVCService.WEB_CONTEXT_PATH}/rest/isovcdataset`;

      return this.http.get(url, {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
         	 if(response != null)
            {
            	let msg = response.json() as Message;
            	return msg;
            }
            return null;
         })
        .catch(this.handleError);
   }
   
   public isNonSimplivityPlatform (): Promise<Message> {

      const url = `${OVCService.WEB_CONTEXT_PATH}/rest/isplatformset`;

      return this.http.get(url, {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
         	 if(response != null)
            {
            	let msg = response.json() as Message;
            	return msg;
            }
            return null;
         })
        .catch(this.handleError);
   }
}

