/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Injectable} from "@angular/core";
import {Response} from "@angular/http";
import {ConfigureInput} from "../model/configureinput.model";
import {Message} from "../model/message.model";
import {GlobalService} from "./global.service";

import "rxjs/add/operator/toPromise";

@Injectable()
export class ConfigureService extends GlobalService{
   /**
    * Configure VM(s)
    * @param configureInput - the created object.
    */
   public configure (configureInput: ConfigureInput): Promise<Message> {

      const url = `${ConfigureService.WEB_CONTEXT_PATH}/rest/configure`;

	alert("Configuration may take few minutes. Please check the log files for more information.");
      return this.http.post(url, JSON.stringify(configureInput), {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
            let msg = response.json() as Message;
            //alert(msg.message);
            return msg;
         })
        .catch(this.handleError);
   }

}

