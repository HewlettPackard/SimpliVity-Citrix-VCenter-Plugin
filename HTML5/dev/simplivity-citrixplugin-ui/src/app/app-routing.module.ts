/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {Routes, RouterModule} from '@angular/router';

import {AppRoutingComponent} from './app-routing.component';
import {PageNotFoundComponent} from './page-not-found.component';
import {WelcomeComponent}  from './views/welcome/welcome.component';

import {OVCDataComponent}  from './views/ovcData/ovcData.component';
import {ConfigureComponent}  from './views/configure/configure.component';
import {DeconfigureComponent}  from './views/deconfigure/deconfigure.component';

import {VmMonitorComponent} from "./views/vm-views/vm-monitor.component";
import {VmConfigureComponent} from "./views/vm-views/vm-configure.component";
import {VmPortletComponent} from "./views/vm-views/vm-portlet.component";

const routes: Routes = [
   {path: '', pathMatch: 'full', redirectTo: 'index.html',},
   {path: 'index.html', component: AppRoutingComponent},
   {path: 'welcome', component: WelcomeComponent},
   {path: 'configure', component: ConfigureComponent},
   {path: 'readCfgFile', component: ConfigureComponent},
   {path: 'clusterInfo', component: ConfigureComponent},
   {path: 'hostInfo:id', component: ConfigureComponent},
   {path: 'isplatformset', component: ConfigureComponent},
   {path: 'setovcdata', component: OVCDataComponent},
   {path: 'isovcdataset', component: ConfigureComponent},
   {path: 'isovcdataset', component: DeconfigureComponent},
   {path: 'deconfigure', component: DeconfigureComponent},
   {path: 'deconfigureService', component: DeconfigureComponent},
   {path: 'deconfigureTable', component: DeconfigureComponent},
   {path: 'vm-monitor', component: VmMonitorComponent},
   {path: 'vm-configure', component: VmConfigureComponent},
   {path: 'vm-portlet', component: VmPortletComponent},
   {path: '**', pathMatch: 'full', component: PageNotFoundComponent}
];

@NgModule({
   imports: [RouterModule.forRoot(routes),
   			BrowserModule,
      		FormsModule],
   exports: [RouterModule]
})
export class AppRoutingModule {
}

export const routableComponents = [
   AppRoutingComponent,
   WelcomeComponent,
   OVCDataComponent,
   ConfigureComponent,
   DeconfigureComponent,
   PageNotFoundComponent,
   VmMonitorComponent,
   VmConfigureComponent,
   VmPortletComponent
];