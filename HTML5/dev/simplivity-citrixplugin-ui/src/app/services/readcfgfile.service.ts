/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Injectable} from "@angular/core";
import {Response} from "@angular/http";
import {ConfigureInput} from "../model/configureinput.model";
import {Message} from "../model/message.model";
import {GlobalService} from "./global.service";

import "rxjs/add/operator/toPromise";

@Injectable()
export class ReadCfgFileService extends GlobalService{
   /**
    * Configure VM(s)
    * @return configureInput - the created object.
    */
   public readcfgfile (): Promise<ConfigureInput> {

      const url = `${ReadCfgFileService.WEB_CONTEXT_PATH}/rest/readCfgFile`;

      return this.http.get(url, {headers: this.headers})
         .toPromise()
         .then(function (response: Response) {
            let configInput = response.json() as ConfigureInput;
            return configInput;
         })
        .catch(
        this.handleError
        );
   }

}

