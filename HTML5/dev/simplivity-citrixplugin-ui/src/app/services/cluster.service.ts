/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Injectable} from "@angular/core";
import {Response} from "@angular/http";
import {ClusterAndHostInfo} from "../model/clusterandhostinfo.model";
import {GlobalService} from "./global.service";
import {Message} from "../model/message.model";

import "rxjs/add/operator/toPromise";

@Injectable()
export class ClusterService extends GlobalService{
   /**
    * Configure VM(s)
    * @param configureInput - the created object.
    */
   public getClusterInfo (): Promise<ClusterAndHostInfo> {

      const url = `${ClusterService.WEB_CONTEXT_PATH}/rest/clusterInfo`;

      return this.http.get(url, {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
         	
            if(response != null)
            {
            	let msg = response.json() as ClusterAndHostInfo;
	            console.log(msg);
	            return msg;
            }
            else
            {
            	return null;
            }
         })
        .catch(this.handleError);
   }
   
    public getHostInfo (id: string): Promise<ClusterAndHostInfo> {

      const url = `${ClusterService.WEB_CONTEXT_PATH}/rest/hostInfo/${id}`;

      return this.http.get(url, {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
         	
            if(response != null)
            {
            	let msg = response.json() as ClusterAndHostInfo;
	            return msg;
            }
            else
            {
            	return null;
            }
         })
        .catch(this.handleError);
   }
   
}

