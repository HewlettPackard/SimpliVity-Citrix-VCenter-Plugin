/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
import {VMData} from "./vmdata.model";
import {DomainData} from "./domaindata.model";
export class BaseInput {
   vmData: VMData[];
   domainData: DomainData;
   rowNumber: number;
}
