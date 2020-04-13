/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Injectable} from "@angular/core";
import {Response} from "@angular/http";
import {Message} from "../model/message.model";
import {BaseInput} from "../model/baseinput.model";
import {GlobalService} from "./global.service";

import "rxjs/add/operator/toPromise";

@Injectable()
export class DeconfigureService extends GlobalService{
   /**
    * Deconfigure VM(s)
    * @param baseInput - the created object.
    */
  public deconfigure (baseInput: BaseInput): Promise<Message> {

      const url = `${DeconfigureService.WEB_CONTEXT_PATH}/rest/deconfigureService`;

	alert("De-configuration may take few minutes...");
	console.log("Entered service: "+baseInput);
      return this.http.post(url, JSON.stringify(baseInput), {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
            let msg = response.json() as Message;
            return msg;
         })
        .catch(this.handleError);
   }
}

