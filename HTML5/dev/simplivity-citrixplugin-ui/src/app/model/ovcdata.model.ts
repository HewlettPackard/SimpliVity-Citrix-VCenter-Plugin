/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
import {RemoteWindowsVMData} from "./remotewindowsvmdata.model";
export class OVCData {
   ovcIP: string;
   ovcUsername: string;
   ovcPassword: string;
   platform: boolean;
   iloAddress: string;
   remoteWindowsVMData: RemoteWindowsVMData;
}
