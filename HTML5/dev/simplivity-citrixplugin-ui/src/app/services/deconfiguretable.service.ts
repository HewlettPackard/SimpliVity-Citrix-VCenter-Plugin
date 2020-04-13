/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Injectable} from "@angular/core";
import {Response} from "@angular/http";
import {DeconfigureTableEntries} from "../model/deconfiguretableentries.model";
import {GlobalService} from "./global.service";

import "rxjs/add/operator/toPromise";

@Injectable()
export class DeconfigureTableService extends GlobalService{
   /**
    * deconfigure VM table list
    */
   public getDeconfigureEntries (): Promise<DeconfigureTableEntries> {

      const url = `${DeconfigureTableService.WEB_CONTEXT_PATH}/rest/deconfigureTable`;

      return this.http.get(url, {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
         	
            if(response != null)
            {
            	let entries = response.json() as DeconfigureTableEntries;
	            console.log(entries);
	            return entries;
            }
            else
            {
            	return null;
            }
         })
        .catch(this.handleError);
   }

}

