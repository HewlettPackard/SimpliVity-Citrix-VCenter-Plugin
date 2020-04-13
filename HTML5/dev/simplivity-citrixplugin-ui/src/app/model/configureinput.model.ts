/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
import {CitrixData} from "./citrixdata.model";
import {VMData} from "./vmdata.model";
import {DomainData} from "./domaindata.model";
export class ConfigureInput {
   template: string;
   citrixData: CitrixData;
   vmData: VMData[];
   domainData: DomainData;
}
