webpackJsonp(["main"],{

/***/ "../../../../../src/$$_gendir lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "../../../../../src/$$_gendir lazy recursive";

/***/ }),

/***/ "../../../../../src/app/app-routing.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppRoutingComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/@angular/router.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


// The document URL is
// .../index.html?view=<name>&..._rest_of_the_parameters
var AppRoutingComponent = (function () {
    function AppRoutingComponent(router, route) {
        this.router = router;
        this.route = route;
    }
    AppRoutingComponent.prototype.ngOnInit = function () {
        var _this = this;
        // Extract query parameters and navigate to view
        this.subscription = this.route.queryParams.subscribe(function (param) {
            var view = param["view"];
            if (!view) {
                console.error("Missing view parameter!");
                return;
            }
            var commands = ["/" + view];
            // console.log('navigate commands:', commands);
            // Navigate without adding a new state in the browser history but rather
            // replace the current one {replaceUrl: true} since this is a second navigation
            // within the same call (the first one being the navigation to the very page).
            // Without this the user cannot go back with a simple click of the
            // browser 'back' button/shortcut
            _this.router.navigate(commands, { replaceUrl: true });
        });
    };
    AppRoutingComponent.prototype.ngOnDestroy = function () {
        this.subscription.unsubscribe();
    };
    AppRoutingComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: '<router-outlet></router-outlet>'
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */]) === "function" && _b || Object])
    ], AppRoutingComponent);
    return AppRoutingComponent;
    var _a, _b;
}());

//# sourceMappingURL=app-routing.component.js.map

/***/ }),

/***/ "../../../../../src/app/app-routing.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppRoutingModule; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return routableComponents; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__ = __webpack_require__("../../../platform-browser/@angular/platform-browser.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/@angular/forms.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_router__ = __webpack_require__("../../../router/@angular/router.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__app_routing_component__ = __webpack_require__("../../../../../src/app/app-routing.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__page_not_found_component__ = __webpack_require__("../../../../../src/app/page-not-found.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__views_welcome_welcome_component__ = __webpack_require__("../../../../../src/app/views/welcome/welcome.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__views_ovcData_ovcData_component__ = __webpack_require__("../../../../../src/app/views/ovcData/ovcData.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__ = __webpack_require__("../../../../../src/app/views/configure/configure.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__views_deconfigure_deconfigure_component__ = __webpack_require__("../../../../../src/app/views/deconfigure/deconfigure.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__views_vm_views_vm_monitor_component__ = __webpack_require__("../../../../../src/app/views/vm-views/vm-monitor.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__views_vm_views_vm_configure_component__ = __webpack_require__("../../../../../src/app/views/vm-views/vm-configure.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__views_vm_views_vm_portlet_component__ = __webpack_require__("../../../../../src/app/views/vm-views/vm-portlet.component.ts");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};













var routes = [
    { path: '', pathMatch: 'full', redirectTo: 'index.html', },
    { path: 'index.html', component: __WEBPACK_IMPORTED_MODULE_4__app_routing_component__["a" /* AppRoutingComponent */] },
    { path: 'welcome', component: __WEBPACK_IMPORTED_MODULE_6__views_welcome_welcome_component__["a" /* WelcomeComponent */] },
    { path: 'configure', component: __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__["a" /* ConfigureComponent */] },
    { path: 'readCfgFile', component: __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__["a" /* ConfigureComponent */] },
    { path: 'clusterInfo', component: __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__["a" /* ConfigureComponent */] },
    { path: 'hostInfo:id', component: __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__["a" /* ConfigureComponent */] },
    { path: 'isplatformset', component: __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__["a" /* ConfigureComponent */] },
    { path: 'setovcdata', component: __WEBPACK_IMPORTED_MODULE_7__views_ovcData_ovcData_component__["a" /* OVCDataComponent */] },
    { path: 'isovcdataset', component: __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__["a" /* ConfigureComponent */] },
    { path: 'isovcdataset', component: __WEBPACK_IMPORTED_MODULE_9__views_deconfigure_deconfigure_component__["a" /* DeconfigureComponent */] },
    { path: 'deconfigure', component: __WEBPACK_IMPORTED_MODULE_9__views_deconfigure_deconfigure_component__["a" /* DeconfigureComponent */] },
    { path: 'deconfigureService', component: __WEBPACK_IMPORTED_MODULE_9__views_deconfigure_deconfigure_component__["a" /* DeconfigureComponent */] },
    { path: 'deconfigureTable', component: __WEBPACK_IMPORTED_MODULE_9__views_deconfigure_deconfigure_component__["a" /* DeconfigureComponent */] },
    { path: 'vm-monitor', component: __WEBPACK_IMPORTED_MODULE_10__views_vm_views_vm_monitor_component__["a" /* VmMonitorComponent */] },
    { path: 'vm-configure', component: __WEBPACK_IMPORTED_MODULE_11__views_vm_views_vm_configure_component__["a" /* VmConfigureComponent */] },
    { path: 'vm-portlet', component: __WEBPACK_IMPORTED_MODULE_12__views_vm_views_vm_portlet_component__["a" /* VmPortletComponent */] },
    { path: '**', pathMatch: 'full', component: __WEBPACK_IMPORTED_MODULE_5__page_not_found_component__["a" /* PageNotFoundComponent */] }
];
var AppRoutingModule = (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["M" /* NgModule */])({
            imports: [__WEBPACK_IMPORTED_MODULE_3__angular_router__["c" /* RouterModule */].forRoot(routes),
                __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */]],
            exports: [__WEBPACK_IMPORTED_MODULE_3__angular_router__["c" /* RouterModule */]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());

var routableComponents = [
    __WEBPACK_IMPORTED_MODULE_4__app_routing_component__["a" /* AppRoutingComponent */],
    __WEBPACK_IMPORTED_MODULE_6__views_welcome_welcome_component__["a" /* WelcomeComponent */],
    __WEBPACK_IMPORTED_MODULE_7__views_ovcData_ovcData_component__["a" /* OVCDataComponent */],
    __WEBPACK_IMPORTED_MODULE_8__views_configure_configure_component__["a" /* ConfigureComponent */],
    __WEBPACK_IMPORTED_MODULE_9__views_deconfigure_deconfigure_component__["a" /* DeconfigureComponent */],
    __WEBPACK_IMPORTED_MODULE_5__page_not_found_component__["a" /* PageNotFoundComponent */],
    __WEBPACK_IMPORTED_MODULE_10__views_vm_views_vm_monitor_component__["a" /* VmMonitorComponent */],
    __WEBPACK_IMPORTED_MODULE_11__views_vm_views_vm_configure_component__["a" /* VmConfigureComponent */],
    __WEBPACK_IMPORTED_MODULE_12__views_vm_views_vm_portlet_component__["a" /* VmPortletComponent */]
];
//# sourceMappingURL=app-routing.module.js.map

/***/ }),

/***/ "../../../../../src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<div class=\"appContent\">\r\n    <router-outlet></router-outlet>\r\n</div>\r\n\r\n"

/***/ }),

/***/ "../../../../../src/app/app.component.scss":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(true);
// imports


// module
exports.push([module.i, ":host {\n  display: block;\n  width: 100%;\n  height: 100%; }\n\n.appContent {\n  width: 100%;\n  height: 100%;\n  padding: 20px 20px 0 10px; }\n", "", {"version":3,"sources":["C:/Users/Administrator/Downloads/html-client-sdk/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/C:/Users/Administrator/Downloads/html-client-sdk/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/app.component.scss"],"names":[],"mappings":"AAAA;EACG,eAAc;EACd,YAAW;EACX,aAAY,EACd;;AAED;EACG,YAAW;EACX,aAAY;EAEZ,0BAAyB,EAC3B","file":"app.component.scss","sourcesContent":[":host {\r\n   display: block;\r\n   width: 100%;\r\n   height: 100%;\r\n}\r\n\r\n.appContent {\r\n   width: 100%;\r\n   height: 100%;\r\n\r\n   padding: 20px 20px 0 10px;\r\n}\r\n"],"sourceRoot":""}]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__ngx_translate_core__ = __webpack_require__("../../../../@ngx-translate/core/index.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AppComponent = (function () {
    function AppComponent(translate) {
        this.title = 'app';
        translate.addLangs(["en-US", "de-DE", "fr-FR"]);
        translate.setDefaultLang('en-US');
        var locale = window.frameElement.htmlClientSdk.app.getClientLocale();
        if (locale && translate.getLangs().indexOf(locale) > 0) {
            translate.use(locale);
        }
    }
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("../../../../../src/app/app.component.html"),
            styles: [__webpack_require__("../../../../../src/app/app.component.scss")]
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__ngx_translate_core__["c" /* TranslateService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__ngx_translate_core__["c" /* TranslateService */]) === "function" && _a || Object])
    ], AppComponent);
    return AppComponent;
    var _a;
}());

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export createTranslateLoader */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__ = __webpack_require__("../../../platform-browser/@angular/platform-browser.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/@angular/forms.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_http__ = __webpack_require__("../../../http/@angular/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_common_http__ = __webpack_require__("../../../common/@angular/common/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_clarity_angular__ = __webpack_require__("../../../../clarity-angular/clarity-angular.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_clarity_icons__ = __webpack_require__("../../../../clarity-icons/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_clarity_icons___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_6_clarity_icons__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__services_hosts_service__ = __webpack_require__("../../../../../src/app/services/hosts.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__services_modal_service__ = __webpack_require__("../../../../../src/app/services/modal.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__services_resource_service__ = __webpack_require__("../../../../../src/app/services/resource.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__views_status_status_component__ = __webpack_require__("../../../../../src/app/views/status/status.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__views_modal_label_input_modal_label_input_component__ = __webpack_require__("../../../../../src/app/views/modal-label-input/modal-label-input.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__views_sample_input_sample_input_component__ = __webpack_require__("../../../../../src/app/views/sample-input/sample-input.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__app_routing_module__ = __webpack_require__("../../../../../src/app/app-routing.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__angular_platform_browser_animations__ = __webpack_require__("../../../platform-browser/@angular/platform-browser/animations.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__views_ovcData_ovcData_component__ = __webpack_require__("../../../../../src/app/views/ovcData/ovcData.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__views_configure_configure_component__ = __webpack_require__("../../../../../src/app/views/configure/configure.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__views_deconfigure_deconfigure_component__ = __webpack_require__("../../../../../src/app/views/deconfigure/deconfigure.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__ngx_translate_core__ = __webpack_require__("../../../../@ngx-translate/core/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__ngx_translate_http_loader__ = __webpack_require__("../../../../@ngx-translate/http-loader/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21_clarity_icons_shapes_all_shapes__ = __webpack_require__("../../../../clarity-icons/shapes/all-shapes.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21_clarity_icons_shapes_all_shapes___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_21_clarity_icons_shapes_all_shapes__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__services_ovc_service__ = __webpack_require__("../../../../../src/app/services/ovc.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_23__services_configure_service__ = __webpack_require__("../../../../../src/app/services/configure.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_24__services_readcfgfile_service__ = __webpack_require__("../../../../../src/app/services/readcfgfile.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_25__services_cluster_service__ = __webpack_require__("../../../../../src/app/services/cluster.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_26__services_deconfigure_service__ = __webpack_require__("../../../../../src/app/services/deconfigure.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_27__services_deconfiguretable_service__ = __webpack_require__("../../../../../src/app/services/deconfiguretable.service.ts");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





























function createTranslateLoader(http) {
    return new __WEBPACK_IMPORTED_MODULE_20__ngx_translate_http_loader__["a" /* TranslateHttpLoader */](http, './assets/i18n/', '.json');
}
var AppModule = (function () {
    function AppModule() {
        __WEBPACK_IMPORTED_MODULE_6_clarity_icons__["ClarityIcons"].add({
            "chassisIcon": "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 16 16\"><title>chassis</title><g id=\"083e8a78-1df0-436f-9a22-5827915fd5f3\" data-name=\"Layer 1\"><path d=\"M.53,9H14.47a.53.53,0,0,1,.53.53v2.93a.53.53,0,0,1-.53.53H.54A.54.54,0,0,1,0,12.47V9.54A.53.53,0,0,1,.53,9Z\" fill=\"#cbd9e0\"/><path d=\"M15,9,13.17,4.07c-.15-.29-.22-.51-.77-.51H3.6c-.54,0-.62.23-.77.52L1,9Z\" fill=\"#cad8df\"/><path d=\"M.54,9H14.47a.53.53,0,0,1,.53.53v2.93a.53.53,0,0,1-.53.53H.54A.54.54,0,0,1,0,12.47V9.55A.54.54,0,0,1,.54,9Z\" fill=\"#9bb2ba\"/><path d=\"M15.44,9H.66a1,1,0,0,1,1-1H14.48A1,1,0,0,1,15.44,9Z\" fill=\"#fff\"/><path d=\"M15,14H1a1,1,0,0,1-1-1V9.26L2,3.77A1.2,1.2,0,0,1,3.23,3h9.39a1.2,1.2,0,0,1,1.23.77l.06.12L16,9.56V13A1,1,0,0,1,15,14ZM3.26,4C3,4,3,4,2.93,4.22L1,9.69V13l14,0,0-3.42v0L13,4.23C12.89,4,12.89,4,12.66,4Z\" fill=\"#235d80\"/><rect x=\"2\" y=\"10\" width=\"1\" height=\"2\" fill=\"#235d80\"/><rect x=\"4\" y=\"10.04\" width=\"0.91\" height=\"1.93\" fill=\"#235d80\"/><rect x=\"6\" y=\"10\" width=\"1\" height=\"2\" fill=\"#235d80\"/><rect x=\"8.02\" y=\"10\" width=\"3.98\" height=\"1\" fill=\"#235d80\"/><rect x=\"13\" y=\"10\" width=\"1\" height=\"1\" fill=\"#235d80\"/></g></svg>"
        });
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["M" /* NgModule */])({
            imports: [
                __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_5_clarity_angular__["a" /* ClarityModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_common_http__["b" /* HttpClientModule */],
                __WEBPACK_IMPORTED_MODULE_19__ngx_translate_core__["b" /* TranslateModule */].forRoot({
                    loader: {
                        provide: __WEBPACK_IMPORTED_MODULE_19__ngx_translate_core__["a" /* TranslateLoader */],
                        useFactory: (createTranslateLoader),
                        deps: [__WEBPACK_IMPORTED_MODULE_4__angular_common_http__["a" /* HttpClient */]]
                    }
                }),
                __WEBPACK_IMPORTED_MODULE_3__angular_http__["c" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_14__app_routing_module__["a" /* AppRoutingModule */],
                __WEBPACK_IMPORTED_MODULE_15__angular_platform_browser_animations__["a" /* BrowserAnimationsModule */]
            ],
            declarations: [__WEBPACK_IMPORTED_MODULE_7__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_14__app_routing_module__["b" /* routableComponents */],
                __WEBPACK_IMPORTED_MODULE_16__views_ovcData_ovcData_component__["a" /* OVCDataComponent */],
                __WEBPACK_IMPORTED_MODULE_17__views_configure_configure_component__["a" /* ConfigureComponent */],
                __WEBPACK_IMPORTED_MODULE_18__views_deconfigure_deconfigure_component__["a" /* DeconfigureComponent */],
                __WEBPACK_IMPORTED_MODULE_11__views_status_status_component__["a" /* StatusComponent */],
                __WEBPACK_IMPORTED_MODULE_12__views_modal_label_input_modal_label_input_component__["a" /* ModalLabelInputComponent */],
                __WEBPACK_IMPORTED_MODULE_13__views_sample_input_sample_input_component__["a" /* SampleInputComponent */]],
            providers: [__WEBPACK_IMPORTED_MODULE_9__services_modal_service__["a" /* ModalConfigService */], __WEBPACK_IMPORTED_MODULE_10__services_resource_service__["a" /* ResourceService */], __WEBPACK_IMPORTED_MODULE_8__services_hosts_service__["a" /* HostsService */], __WEBPACK_IMPORTED_MODULE_22__services_ovc_service__["a" /* OVCService */], __WEBPACK_IMPORTED_MODULE_23__services_configure_service__["a" /* ConfigureService */], __WEBPACK_IMPORTED_MODULE_24__services_readcfgfile_service__["a" /* ReadCfgFileService */], __WEBPACK_IMPORTED_MODULE_25__services_cluster_service__["a" /* ClusterService */], __WEBPACK_IMPORTED_MODULE_27__services_deconfiguretable_service__["a" /* DeconfigureTableService */], __WEBPACK_IMPORTED_MODULE_26__services_deconfigure_service__["a" /* DeconfigureService */]],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_7__app_component__["a" /* AppComponent */]]
        }),
        __metadata("design:paramtypes", [])
    ], AppModule);
    return AppModule;
}());

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ "../../../../../src/app/model/baseinput.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return BaseInput; });
var BaseInput = (function () {
    function BaseInput() {
    }
    return BaseInput;
}());

//# sourceMappingURL=baseinput.model.js.map

/***/ }),

/***/ "../../../../../src/app/model/citrixdata.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CitrixData; });
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var CitrixData = (function () {
    function CitrixData() {
    }
    return CitrixData;
}());

//# sourceMappingURL=citrixdata.model.js.map

/***/ }),

/***/ "../../../../../src/app/model/configureinput.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ConfigureInput; });
var ConfigureInput = (function () {
    function ConfigureInput() {
    }
    return ConfigureInput;
}());

//# sourceMappingURL=configureinput.model.js.map

/***/ }),

/***/ "../../../../../src/app/model/domaindata.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DomainData; });
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var DomainData = (function () {
    function DomainData() {
    }
    return DomainData;
}());

//# sourceMappingURL=domaindata.model.js.map

/***/ }),

/***/ "../../../../../src/app/model/ovcdata.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return OVCData; });
var OVCData = (function () {
    function OVCData() {
    }
    return OVCData;
}());

//# sourceMappingURL=ovcdata.model.js.map

/***/ }),

/***/ "../../../../../src/app/model/remotewindowsvmdata.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RemoteWindowsVMData; });
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var RemoteWindowsVMData = (function () {
    function RemoteWindowsVMData() {
    }
    return RemoteWindowsVMData;
}());

//# sourceMappingURL=remotewindowsvmdata.model.js.map

/***/ }),

/***/ "../../../../../src/app/model/vmdata.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return VMData; });
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var VMData = (function () {
    function VMData() {
    }
    return VMData;
}());

//# sourceMappingURL=vmdata.model.js.map

/***/ }),

/***/ "../../../../../src/app/page-not-found.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PageNotFoundComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var PageNotFoundComponent = (function () {
    function PageNotFoundComponent() {
    }
    PageNotFoundComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: "\n    <article class=\"template animated slideInRight\">\n      <h4>Page Not Found!</h4>\n    </article>\n  "
        })
    ], PageNotFoundComponent);
    return PageNotFoundComponent;
}());

//# sourceMappingURL=page-not-found.component.js.map

/***/ }),

/***/ "../../../../../src/app/services/cluster.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ClusterService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var ClusterService = (function (_super) {
    __extends(ClusterService, _super);
    function ClusterService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    ClusterService_1 = ClusterService;
    /**
     * Configure VM(s)
     * @param configureInput - the created object.
     */
    ClusterService.prototype.getClusterInfo = function () {
        var url = ClusterService_1.WEB_CONTEXT_PATH + "/rest/clusterInfo";
        return this.http.get(url, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            if (response != null) {
                var msg = response.json();
                console.log(msg);
                return msg;
            }
            else {
                return null;
            }
        })
            .catch(this.handleError);
    };
    ClusterService.prototype.getHostInfo = function (id) {
        var url = ClusterService_1.WEB_CONTEXT_PATH + "/rest/hostInfo/" + id;
        return this.http.get(url, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            if (response != null) {
                var msg = response.json();
                return msg;
            }
            else {
                return null;
            }
        })
            .catch(this.handleError);
    };
    ClusterService = ClusterService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], ClusterService);
    return ClusterService;
    var ClusterService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=cluster.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/configure.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ConfigureService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var ConfigureService = (function (_super) {
    __extends(ConfigureService, _super);
    function ConfigureService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    ConfigureService_1 = ConfigureService;
    /**
     * Configure VM(s)
     * @param configureInput - the created object.
     */
    ConfigureService.prototype.configure = function (configureInput) {
        var url = ConfigureService_1.WEB_CONTEXT_PATH + "/rest/configure";
        alert("Configuration may take few minutes. Please check the log files for more information.");
        return this.http.post(url, JSON.stringify(configureInput), { headers: this.headers })
            .toPromise()
            .then(function (response) {
            var msg = response.json();
            //alert(msg.message);
            return msg;
        })
            .catch(this.handleError);
    };
    ConfigureService = ConfigureService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], ConfigureService);
    return ConfigureService;
    var ConfigureService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=configure.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/deconfigure.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DeconfigureService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var DeconfigureService = (function (_super) {
    __extends(DeconfigureService, _super);
    function DeconfigureService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    DeconfigureService_1 = DeconfigureService;
    /**
     * Deconfigure VM(s)
     * @param baseInput - the created object.
     */
    DeconfigureService.prototype.deconfigure = function (baseInput) {
        var url = DeconfigureService_1.WEB_CONTEXT_PATH + "/rest/deconfigureService";
        alert("De-configuration may take few minutes...");
        console.log("Entered service: " + baseInput);
        return this.http.post(url, JSON.stringify(baseInput), { headers: this.headers })
            .toPromise()
            .then(function (response) {
            var msg = response.json();
            return msg;
        })
            .catch(this.handleError);
    };
    DeconfigureService = DeconfigureService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], DeconfigureService);
    return DeconfigureService;
    var DeconfigureService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=deconfigure.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/deconfiguretable.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DeconfigureTableService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var DeconfigureTableService = (function (_super) {
    __extends(DeconfigureTableService, _super);
    function DeconfigureTableService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    DeconfigureTableService_1 = DeconfigureTableService;
    /**
     * deconfigure VM table list
     */
    DeconfigureTableService.prototype.getDeconfigureEntries = function () {
        var url = DeconfigureTableService_1.WEB_CONTEXT_PATH + "/rest/deconfigureTable";
        return this.http.get(url, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            if (response != null) {
                var entries = response.json();
                console.log(entries);
                return entries;
            }
            else {
                return null;
            }
        })
            .catch(this.handleError);
    };
    DeconfigureTableService = DeconfigureTableService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], DeconfigureTableService);
    return DeconfigureTableService;
    var DeconfigureTableService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=deconfiguretable.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/global.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return GlobalService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/@angular/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var GlobalService = (function () {
    function GlobalService(http) {
        this.http = http;
        this.headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ "Content-Type": "application/json" });
        this.htmlClientSdk = window.frameElement.htmlClientSdk;
    }
    GlobalService.prototype.handleError = function (error) {
        var errMsg = error.message || "Server error: check console for details";
        return Promise.reject(errMsg);
    };
    GlobalService.WEB_CONTEXT_PATH = "/ui/simplivity-citrixplugin";
    GlobalService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]) === "function" && _a || Object])
    ], GlobalService);
    return GlobalService;
    var _a;
}());

//# sourceMappingURL=global.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/hosts.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HostsService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var HostsService = (function (_super) {
    __extends(HostsService, _super);
    function HostsService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    HostsService_1 = HostsService;
    /**
     * sends a get message to get all connected hosts
     */
    HostsService.prototype.getConnectedHosts = function () {
        var listUrl = HostsService_1.WEB_CONTEXT_PATH + "/rest/hosts";
        return this.http.get(listUrl, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    HostsService = HostsService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], HostsService);
    return HostsService;
    var HostsService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=hosts.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/modal.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ModalConfigService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__resource_service__ = __webpack_require__("../../../../../src/app/services/resource.service.ts");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ModalConfigService = (function () {
    function ModalConfigService(resources) {
        this.resources = resources;
    }
    ModalConfigService.prototype.createAddConfig = function () {
        var addAction = {
            url: "simplivity-citrixplugin/index.html?view=create",
            title: this.resources.getString("shared.modal.createChassis"),
            size: { width: 700, height: 400 }
        };
        return addAction;
    };
    ModalConfigService.prototype.createAddWizardConfig = function () {
        var addWizardAction = {
            url: "simplivity-citrixplugin/index.html?view=create-wizard",
            closable: false,
            size: { width: 800, height: 500 }
        };
        return addWizardAction;
    };
    ModalConfigService.prototype.createDeleteConfig = function () {
        var deleteAction = {
            url: "simplivity-citrixplugin/index.html?view=delete",
            size: { width: 400, height: 120 },
            closable: false
        };
        return deleteAction;
    };
    ModalConfigService.prototype.createEditConfig = function () {
        var editAction = {
            url: "simplivity-citrixplugin/index.html?view=edit",
            title: this.resources.getString("shared.modal.editChassis"),
            size: { width: 700, height: 400 }
        };
        return editAction;
    };
    ModalConfigService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__resource_service__["a" /* ResourceService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__resource_service__["a" /* ResourceService */]) === "function" && _a || Object])
    ], ModalConfigService);
    return ModalConfigService;
    var _a;
}());

//# sourceMappingURL=modal.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/ovc.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return OVCService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var OVCService = (function (_super) {
    __extends(OVCService, _super);
    function OVCService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    OVCService_1 = OVCService;
    /**
     * Creates a new object of type OVCData
     * @param ovcData - the created object.
     */
    OVCService.prototype.setOvcData = function (ovcData) {
        var url = OVCService_1.WEB_CONTEXT_PATH + "/rest/setovcdata";
        return this.http.post(url, JSON.stringify(ovcData), { headers: this.headers })
            .toPromise()
            .then(function (response) {
            var msg = response.json();
            return msg;
        })
            .catch(this.handleError);
    };
    OVCService.prototype.isOVCDataSet = function () {
        var url = OVCService_1.WEB_CONTEXT_PATH + "/rest/isovcdataset";
        return this.http.get(url, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            if (response != null) {
                var msg = response.json();
                return msg;
            }
            return null;
        })
            .catch(this.handleError);
    };
    OVCService.prototype.isNonSimplivityPlatform = function () {
        var url = OVCService_1.WEB_CONTEXT_PATH + "/rest/isplatformset";
        return this.http.get(url, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            if (response != null) {
                var msg = response.json();
                return msg;
            }
            return null;
        })
            .catch(this.handleError);
    };
    OVCService = OVCService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], OVCService);
    return OVCService;
    var OVCService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=ovc.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/readcfgfile.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ReadCfgFileService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var ReadCfgFileService = (function (_super) {
    __extends(ReadCfgFileService, _super);
    function ReadCfgFileService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    ReadCfgFileService_1 = ReadCfgFileService;
    /**
     * Configure VM(s)
     * @return configureInput - the created object.
     */
    ReadCfgFileService.prototype.readcfgfile = function () {
        var url = ReadCfgFileService_1.WEB_CONTEXT_PATH + "/rest/readCfgFile";
        return this.http.get(url, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            var configInput = response.json();
            return configInput;
        })
            .catch(this.handleError);
    };
    ReadCfgFileService = ReadCfgFileService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], ReadCfgFileService);
    return ReadCfgFileService;
    var ReadCfgFileService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=readcfgfile.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/resource.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ResourceService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__ngx_translate_core__ = __webpack_require__("../../../../@ngx-translate/core/index.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ResourceService = (function () {
    function ResourceService(translate) {
        var _this = this;
        this.translate = translate;
        var strings = ["shared.modal.createChassis",
            "shared.modal.editChassis",
            "common.active",
            "common.standBy",
            "shared.modal.createChassis",
            "shared.modal.editChassis",
            "actions.create.emptyNameError",
            "actions.create.usedNameError"];
        this.translate.get(strings).subscribe(function (result) {
            _this.localizedStrings = result;
        });
    }
    ResourceService.prototype.getString = function (str) {
        return this.localizedStrings && this.localizedStrings.hasOwnProperty(str) ? this.localizedStrings[str] : str;
    };
    ResourceService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__ngx_translate_core__["c" /* TranslateService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__ngx_translate_core__["c" /* TranslateService */]) === "function" && _a || Object])
    ], ResourceService);
    return ResourceService;
    var _a;
}());

//# sourceMappingURL=resource.service.js.map

/***/ }),

/***/ "../../../../../src/app/services/validation.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ValidationUtil; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var ValidationUtil = (function () {
    function ValidationUtil() {
    }
    ValidationUtil.isNullOrEmpty = function (name) {
        return !(name && name.trim().length != 0);
    };
    ValidationUtil.isOVCDtataValid = function (ip, username, password) {
        return (ip != null && ip.trim().length == 0 && username != null && username.trim().length == 0 && username != null && username.trim().length == 0);
    };
    ValidationUtil = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], ValidationUtil);
    return ValidationUtil;
}());

//# sourceMappingURL=validation.js.map

/***/ }),

/***/ "../../../../../src/app/views/configure/configure.component.html":
/***/ (function(module, exports) {

module.exports = "<head>\r\n<style>\r\ntd {\r\n     text-align: left;\r\n}\r\ntitlebar-text {\r\n    max-width: 85%;\r\n    display: inline-block;\r\n}\r\n</style>\r\n</head>\r\n\r\n<div class=\"viewTitle\">Configure</div>\r\n\r\n<div> <strong>Note:</strong>All the fields are mandatory</div>\r\n\r\n<div class=\"alert alert-success\" *ngIf=\"showSuccessMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"alert-icon\" shape=\"check-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{ovcmsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div class=\"alert alert-danger\" *ngIf=\"showFailureMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"is-error\" shape=\"info-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{errormsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div class=\"alert alert-info\" *ngIf=\"showInfoMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"is-error\" shape=\"info-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{infomsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div  ng-app=\"app\" > <!-- style=\"border-style:solid;border-color:red;border-spacing:1px;\"> -->\r\n\r\n<form clrForm (ngSubmit)=\"onSubmit()\" class=\"modal-content-chassis\" name=\"mainForm\">\r\n<section class=\"form-block\">\r\n\r\n<div><!--  style=\"border-style:solid;border-color:coral;border-spacing:1px;\"> -->\r\n<table style=\"border-spacing:10px;\" border=\"0\" >\r\n<tr>\r\n\t<td><h3><span class=\"titlebar-text\">Domain Information</span></h3></td>\r\n\t<td><h3><span class=\"titlebar-text\">Citrix Information</span></h3></td>\r\n</tr>\r\n<tr>\r\n\t<td>\r\n\t\t<table border=\"0\" style=\"border-spacing:10px;\">\r\n\t\t\t<!-- <tr><h3 style=\"text-align:center;\">Domain Information</h3></tr> -->\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Domain Name<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"demo.local\" id=\"dmnName\" name=\"dmnName\" [(ngModel)]=\"domaindata.domainName\" \r\n\t\t\t\t\t(ngModelChange)=\"setDomainName($event)\"  required size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label><span>Username<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"Username\" id=\"dmnUsername\" name=\"dmnUsername\" [(ngModel)]=\"domaindata.dmnUserName\" \r\n\t\t\t\t\t(ngModelChange)=\"setDomainUsername($event)\"  required size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Password<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"password\" placeholder=\"*******\" id=\"dmnPassword\" name=\"dmnPassword\" [(ngModel)]=\"domaindata.dmnPassword\" \r\n\t\t\t\t\t(ngModelChange)=\"setDomainPassword($event)\"  required size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr></tr>\r\n\t\t</table>\r\n\t</td>\r\n\t<td>\r\n\t\t<table border=\"0\" style=\"border-spacing:8px;\">\r\n\t\t\t<!-- <tr><h3 style=\"text-align:center;\">Citrix Information</h3></tr> -->\r\n\t\t\t<tr>\r\n\t\t\t\t<td  width=\"80%\">\r\n\t\t\t\t\t<label ><span>Citrix Key<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"password\" placeholder=\"demo.local\" id=\"citrixKey\" name=\"citrixKey\" [(ngModel)]=\"citrixdata.citrixKey\" \r\n\t\t\t\t\t(ngModelChange)=\"setCitrixKey($event)\"  required size=\"40px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label><span>Customer Name<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"80px\">\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"customer name\" id=\"customerName\" name=\"customerName\" [(ngModel)]=\"citrixdata.customerName\" \r\n\t\t\t\t\t(ngModelChange)=\"setCustomerName($event)\"  required size=\"40px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>ClientID<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"password\" placeholder=\"client id\" id=\"clientId\" name=\"clientId\" [(ngModel)]=\"citrixdata.clientId\" \r\n\t\t\t\t\t(ngModelChange)=\"setClientId($event)\"  required size=\"40px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Resource Location<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"Resource Location\" id=\"resourceLocation\" name=\"resourceLocation\" [(ngModel)]=\"citrixdata.resourceLocation\" \r\n\t\t\t\t\t(ngModelChange)=\"setResourceLocation($event)\"  required size=\"40px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n</tr>\r\n<tr>\r\n\t<td><h3><span class=\"titlebar-text\">Simplivity Information</span></h3></td>\r\n\t<td><h3><span class=\"titlebar-text\">Template Information</span></h3></td>\r\n</tr>\r\n<tr>\r\n\t<td>\r\n\t\t<table border=\"0\" style=\"border-spacing:10px;\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"100%\">\r\n\t\t\t\t\t<label><span>Cluster<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<select name=\"cluster\" id=\"cluster\" [(ngModel)]=\"vmdata.vmCluster\" (change)=\"getHosts()\" style=\"width:280px\" > <!-- ng-options=\"item for item in clusters\"> -->\r\n\t\t\t\t\t <option *ngFor=\"let item of clusters\">{{item}}</option> \r\n\t\t\t\t\t</select>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n\t<td>\r\n\t\t<table border=\"0\" style=\"border-spacing:10px;\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Windows Image Template<span style=\"color:red;\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" id=\"template\" name=\"template\" [(ngModel)]=\"configureInput.template\" \r\n\t\t\t\t\t(ngModelChange)=\"setTemplate($event)\"  required size=\"32px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n</tr>\r\n\r\n</table>\r\n</div>\r\n\r\n<div ><!-- style=\"border-style:solid;border-color:purple;border-spacing:1px\"> -->\r\n<table style=\"border-spacing:1px\" border=\"0\" >\r\n\t<tr style=\"height:10px;\">\r\n\t\t<td style=\"width:150px;\" ><h4><span class=\"titlebar-text\">Properties</span></h4></td>\r\n\t\t<td style=\"text-align:center;\" width=\"42%\"><h4><span class=\"titlebar-text\">VM1</span></h4></td>\r\n\t\t<td style=\"text-align:center;\" width=\"42%\"><h4><span class=\"titlebar-text\">VM2</span></h4></td>\r\n\t</tr>\r\n</table>\r\n<table style=\"border-spacing:8px\" border=\"0\" >\r\n\t<!-- <tr style=\"height:10px;\">\r\n\t\t<td style=\"width:150px;\" ><label style=\"font-size:18;\"><span class=\"titlebar-text\">Properties</span></label></td>\r\n\t\t<td style=\"text-align:center;\" width=\"45%\"><label style=\"font-size:18;\"><span class=\"titlebar-text\">VM1</span></label></td>\r\n\t\t<td style=\"text-align:center;\" ><label style=\"font-size:18;\"><span class=\"titlebar-text\">VM2</span></label></td>\r\n\t</tr> -->\r\n\t<tr style=\"height:5px;\">\r\n\t\t<td  ><label style=\"font-size:18;width:150px;\"><span  class=\"titlebar-text\">VM Name<span style=\"color:red\">*</span></span></label></td>\r\n\t\t<td width=\"42%\">\r\n\t\t\t<input clrInput type=\"text\" placeholder=\"CC01\" id=\"vmName1\" name=\"vmName1\" [(ngModel)]=\"vmdata1.vmName\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t\t<td width=\"42%\">\r\n\t\t\t<input clrInput type=\"text\" placeholder=\"CC02\" id=\"vmName2\" name=\"vmName2\" [(ngModel)]=\"vmdata2.vmName\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr style=\"height:5px;\">\r\n\t\t<td ><label style=\"font-size:18;\"><span class=\"titlebar-text\">VM Username<span style=\"color:red\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<input clrInput type=\"text\" placeholder=\"Username\" id=\"vmUsername1\" name=\"vmUsername1\" [(ngModel)]=\"vmdata1.vmUsername\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<input clrInput type=\"text\" placeholder=\"Username\" id=\"vmUsername2\" name=\"vmUsername2\" [(ngModel)]=\"vmdata2.vmUsername\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr style=\"height:5px;\">\r\n\t\t<td ><label style=\"font-size:18;\"><span class=\"titlebar-text\">Password<span style=\"color:red\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<input clrInput type=\"password\" placeholder=\"*******\" id=\"vmPassword1\" name=\"vmPassword1\" [(ngModel)]=\"vmdata1.vmPassword\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<input clrInput type=\"password\" placeholder=\"*******\" id=\"vmPassword2\" name=\"vmPassword2\" [(ngModel)]=\"vmdata2.vmPassword\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr style=\"height:5px;\">\r\n\t\t<td ><label style=\"font-size:18;\"><span class=\"titlebar-text\"style>VM Host<span class=\"color:red;\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<select name=\"vmHost1\" id=\"vmHost1\" [(ngModel)]=\"vmdata1.vmHost\" style=\"width:300px\" (change)=\"validatePlatform()\">\r\n\t\t\t\t\t  <option *ngFor=\"let x of hosts\">{{x}}</option>\r\n\t\t\t</select>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<select name=\"vmHost2\" id=\"vmHost2\" [(ngModel)]=\"vmdata2.vmHost\" style=\"width:300px\" (change)=\"validatePlatform()\">\r\n\t\t\t\t\t  <option *ngFor=\"let x of hosts\">{{x}}</option>\r\n\t\t\t</select>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr style=\"height:5px;\">\r\n\t\t<td ><label style=\"font-size:18;\"><span class=\"titlebar-text\">IP Assignment<span style=\"color:red;\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<label>  \r\n\t\t\t\t<input type=\"radio\" name=\"isstaiccheck1\" value=\"DHCP\" (click)=\"setradio1('DHCP')\" checked ngModel>DHCP \r\n\t\t\t</label>\r\n\t\t\r\n\t\t\t<label>  \r\n\t\t\t\t<input type=\"radio\" name=\"isstaiccheck1\" value=\"Static IP\" (click)=\"setradio1('StaticIP')\" ngModel> Static IP  \r\n\t\t\t</label>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<label>  \r\n\t\t\t\t<input type=\"radio\" name=\"isstaiccheck2\" value=\"DHCP\" (click)=\"setradio2('DHCP')\" checked ngModel>DHCP \r\n\t\t\t</label>\r\n\t\t\r\n\t\t\t<label>  \r\n\t\t\t\t<input type=\"radio\" name=\"isstaiccheck2\" value=\"Static IP\" (click)=\"setradio2('StaticIP')\" ngModel> Static IP  \r\n\t\t\t</label>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr  style=\"height:5px;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t<td ><label style=\"font-size:18;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t\t<span class=\"titlebar-text\">IP Address<span style=\"color:red;\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected1('StaticIP')\" clrInput type=\"text\"  id=\"ipAddr1\" name=\"ipAddr1\" [(ngModel)]=\"vmdata1.ipAddr\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected2('StaticIP')\" clrInput type=\"text\"  id=\"ipAddr2\" name=\"ipAddr2\" [(ngModel)]=\"vmdata2.ipAddr\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr style=\"height:5px;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t<td ><label style=\"font-size:18;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t\t<span class=\"titlebar-text\">Subnet<span style=\"color:red;\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected1('StaticIP')\" clrInput type=\"text\"  id=\"subnet1\" name=\"subnet1\" [(ngModel)]=\"vmdata1.subnet\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected2('StaticIP')\" clrInput type=\"text\"  id=\"subnet2\" name=\"subnet2\" [(ngModel)]=\"vmdata2.subnet\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr style=\"height:5px;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t<td ><label style=\"font-size:18;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t\t<span class=\"titlebar-text\">Gateway<span style=\"color:red;\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected1('StaticIP')\" clrInput type=\"text\" id=\"gateway1\" name=\"gateway1\" [(ngModel)]=\"vmdata1.gateway\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected2('StaticIP')\" clrInput type=\"text\" id=\"gateway2\" name=\"gateway2\" [(ngModel)]=\"vmdata2.gateway\" required size=\"35px\"/>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr style=\"height:5px;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t<td ><label style=\"font-size:18;\" *ngIf=\"isSelected1('StaticIP') || isSelected2('StaticIP')\">\r\n\t\t\t<span class=\"titlebar-text\">DNS Server<span style=\"color:red;\">*</span></span></label></td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected1('StaticIP')\" clrInput type=\"text\" id=\"dnsServerAddress1\" name=\"dnsServerAddress1\" [(ngModel)]=\"vmdata1.dnsServerAddress\" \r\n\t\t\t\trequired size=\"35px\"/>\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t<input *ngIf=\"isSelected2('StaticIP')\" clrInput type=\"text\" id=\"dnsServerAddress2\" name=\"dnsServerAddress2\" [(ngModel)]=\"vmdata2.dnsServerAddress\" \r\n\t\t\trequired size=\"35px\"/>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</div>\r\n\r\n  <div class=\"modal-footer\">\r\n            <button class=\"btn\" (click)=\"onCancel()\" id=\"cancelBtn\">Cancel</button>\r\n            <button type=\"submit\" class=\"btn btn-primary\"\r\n                     id=\"saveBtn\">Configure</button>\r\n   </div>\r\n   </section>\r\n        \r\n</form>\r\n\r\n    </div>"

/***/ }),

/***/ "../../../../../src/app/views/configure/configure.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ConfigureComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_configure_service__ = __webpack_require__("../../../../../src/app/services/configure.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_cluster_service__ = __webpack_require__("../../../../../src/app/services/cluster.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_ovc_service__ = __webpack_require__("../../../../../src/app/services/ovc.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_readcfgfile_service__ = __webpack_require__("../../../../../src/app/services/readcfgfile.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__model_vmdata_model__ = __webpack_require__("../../../../../src/app/model/vmdata.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_citrixdata_model__ = __webpack_require__("../../../../../src/app/model/citrixdata.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__model_domaindata_model__ = __webpack_require__("../../../../../src/app/model/domaindata.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__model_configureinput_model__ = __webpack_require__("../../../../../src/app/model/configureinput.model.ts");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};









var ConfigureComponent = (function () {
    function ConfigureComponent(configureService, readcfgfileService, clusterService, ovcService) {
        var _this = this;
        this.configureService = configureService;
        this.readcfgfileService = readcfgfileService;
        this.clusterService = clusterService;
        this.ovcService = ovcService;
        this.showSuccessMessage = false;
        this.showFailureMessage = false;
        this.showInfoMessage = false;
        this.ovcmsg = null;
        this.errormsg = null;
        this.infomsg = null;
        this.selectedIsStatic1 = "";
        this.selectedIsStatic2 = "";
        this.index = 0;
        this.isStatic1 = false;
        this.isStatic2 = false;
        this.isInputCorrect = false;
        this.vm1EntryCheck = false;
        this.vmindex = 0;
        this.vmdatalist = new Array();
        this.platformset = false;
        this.domaindata = new __WEBPACK_IMPORTED_MODULE_7__model_domaindata_model__["a" /* DomainData */]();
        this.citrixdata = new __WEBPACK_IMPORTED_MODULE_6__model_citrixdata_model__["a" /* CitrixData */]();
        this.vmdata = new __WEBPACK_IMPORTED_MODULE_5__model_vmdata_model__["a" /* VMData */]();
        this.vmdata1 = new __WEBPACK_IMPORTED_MODULE_5__model_vmdata_model__["a" /* VMData */]();
        this.vmdata2 = new __WEBPACK_IMPORTED_MODULE_5__model_vmdata_model__["a" /* VMData */]();
        this.configureInput = new __WEBPACK_IMPORTED_MODULE_8__model_configureinput_model__["a" /* ConfigureInput */]();
        this.ovcService.isOVCDataSet().then(function (result) {
            console.log(result);
            if (result != null) {
                _this.errormsg = result.error;
                _this.showFailureMessage = true;
                alert(result.error);
            }
        });
        this.readcfgfileService.readcfgfile()
            .then(function (result) {
            if (result) {
                if (result.template) {
                    _this.configureInput.template = result.template;
                }
                if (result.citrixData) {
                    _this.citrixdata = result.citrixData;
                    _this.configureInput.citrixData = result.citrixData;
                }
                if (result.domainData) {
                    _this.domaindata = result.domainData;
                    _this.configureInput.domainData = result.domainData;
                }
            }
            else {
                alert("No data from the Cfg file is read");
            }
            if (_this.showFailureMessage != true) {
                _this.showInfoMessage = true;
                _this.infomsg = "Please wait until the Cluster and host details are loaded!";
            }
        });
        this.ovcService.isNonSimplivityPlatform()
            .then(function (result) {
            if (result) {
                if (result.message == "set") {
                    _this.platformset = true;
                }
            }
        });
        this.clusterService.getClusterInfo().then(function (result) {
            if (result) {
                if (result.clusters) {
                    _this.clusters = result.clusters;
                    console.log(_this.clusters);
                }
            }
            else {
                alert("Failed to fetch Cluster details. Please check the OVC/ILO details submitted. For more information please check the logs");
            }
            _this.showInfoMessage = false;
        });
    }
    ConfigureComponent.prototype.ngOnInit = function () {
    };
    ConfigureComponent.prototype.isSelected1 = function (name) {
        if (!this.selectedIsStatic1) {
            return false;
        }
        return (this.selectedIsStatic1 === name);
    };
    ConfigureComponent.prototype.isSelected2 = function (name) {
        if (!this.selectedIsStatic2) {
            return false;
        }
        return (this.selectedIsStatic2 === name);
    };
    ConfigureComponent.prototype.setradio1 = function (e) {
        this.selectedIsStatic1 = e;
        if (e === "StaticIP") {
            //this.vmdata1.isStatic = true;
            this.isStatic1 = true;
        }
        if (e === "DHCP") {
            //this.vmdata1.isStatic = false;
            this.isStatic1 = false;
        }
    };
    ConfigureComponent.prototype.setradio2 = function (e) {
        this.selectedIsStatic2 = e;
        if (e === "StaticIP") {
            //this.vmdata2.isStatic = true;
            this.isStatic2 = true;
        }
        if (e === "DHCP") {
            //this.vmdata2.isStatic = false;
            this.isStatic2 = false;
        }
    };
    ConfigureComponent.prototype.setCluster = function (newValue) {
        var _this = this;
        this.clusterService.getHostInfo(newValue).then(function (result) {
            _this.hosts = result.hosts;
            console.log(_this.hosts);
        });
    };
    ConfigureComponent.prototype.getHosts = function () {
        var _this = this;
        this.clusterService.getHostInfo(this.vmdata.vmCluster).then(function (result) {
            _this.hosts = result.hosts;
            console.log(_this.hosts);
        });
    };
    ConfigureComponent.prototype.onCancel = function (result) {
    };
    ConfigureComponent.prototype.clear = function () { };
    /**
    * Triggered when user clicks on "Update" button.
    */
    ConfigureComponent.prototype.onSubmit = function () {
        var _this = this;
        this.configureInput.citrixData = this.citrixdata;
        this.configureInput.domainData = this.domaindata;
        //vm2EntryCheck: boolean = false;      	
        var regExp = new RegExp('^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$');
        if (this.vmdata1.vmName != undefined && this.vmdata1.vmUsername != undefined && this.vmdata1.vmPassword != undefined) {
            if (this.isStatic1 == true && this.vmdata1.ipAddr != undefined && this.vmdata1.subnet != undefined &&
                this.vmdata1.gateway != undefined && this.vmdata1.dnsServerAddress != undefined) {
                this.vmdata1.isStatic = true;
                if (regExp.test(this.vmdata1.ipAddr) && regExp.test(this.vmdata1.subnet) && regExp.test(this.vmdata1.gateway) && regExp.test(this.vmdata1.dnsServerAddress)) {
                    this.isInputCorrect = true;
                }
                else {
                    this.isInputCorrect = false;
                }
                this.vmdata1.vmCluster = this.vmdata.vmCluster;
                this.vmdatalist[0] = this.vmdata1;
                this.configureInput.vmData = this.vmdatalist;
            }
            else {
                this.isInputCorrect = true;
                this.vmdata1.isStatic = false;
                this.vmdata1.vmCluster = this.vmdata.vmCluster;
                this.vmdatalist[0] = this.vmdata1;
                this.configureInput.vmData = this.vmdatalist;
            }
            this.vm1EntryCheck = true;
        }
        if (this.vmdata2.vmName != undefined && this.vmdata2.vmUsername != undefined && this.vmdata2.vmPassword != undefined) {
            this.isInputCorrect = false;
            if (this.vm1EntryCheck) {
                this.vmindex = 1;
            }
            if (this.isStatic2 == true && this.vmdata2.ipAddr != undefined && this.vmdata2.subnet != undefined &&
                this.vmdata2.gateway != undefined && this.vmdata2.dnsServerAddress != undefined) {
                this.vmdata2.isStatic = true;
                if (regExp.test(this.vmdata2.ipAddr) && regExp.test(this.vmdata2.subnet) && regExp.test(this.vmdata2.gateway) && regExp.test(this.vmdata2.dnsServerAddress)) {
                    this.isInputCorrect = true;
                }
                else {
                    this.isInputCorrect = false;
                }
                this.vmdata2.vmCluster = this.vmdata.vmCluster;
                this.vmdatalist[this.vmindex] = this.vmdata2;
                this.configureInput.vmData = this.vmdatalist;
            }
            else {
                this.isInputCorrect = true;
                this.vmdata2.isStatic = false;
                this.vmdata2.vmCluster = this.vmdata.vmCluster;
                this.vmdatalist[this.vmindex] = this.vmdata2;
                this.configureInput.vmData = this.vmdatalist;
            }
            if (this.vmindex == 1 && this.vmdata1.vmHost == this.vmdata2.vmHost) {
                alert("Both the VMs cannot have the same host");
                this.isInputCorrect = false;
            }
        }
        console.log(this.configureInput);
        if (this.isInputCorrect) {
            //console.log("In IF "+this.configureInput);
            this.showSuccessMessage = false;
            this.showInfoMessage = true;
            //alert("In IF "+this.showInfoMessage);
            this.infomsg = "Configuration may take few minutes."; //Please check the latest log file from C:\\ProgramData\\VMware\\vCenterServer\\logs\\vsphere-client\\logs location";
            this.configureService.configure(this.configureInput)
                .then(function (result) {
                if (result) {
                    _this.showInfoMessage = false;
                    //alert(result.message);
                    if (result.error != null) {
                        alert(result.error);
                        _this.errormsg = result.error;
                        _this.showFailureMessage = true;
                    }
                    else {
                        _this.showSuccessMessage = true;
                        _this.ovcmsg = result.message;
                    }
                }
                else {
                    alert("Data did not get saved!" + result.message);
                    _this.errormsg = "Data did not get saved!";
                    _this.showFailureMessage = true;
                }
            })
                .catch(function () {
                _this.onCancel();
            });
        }
        else {
            alert("Incorrect data submitted. Please check the data again and click on Configure");
        }
        this.isInputCorrect = false;
    };
    ConfigureComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/configure/configure.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_configure_service__["a" /* ConfigureService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_configure_service__["a" /* ConfigureService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_4__services_readcfgfile_service__["a" /* ReadCfgFileService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__services_readcfgfile_service__["a" /* ReadCfgFileService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_2__services_cluster_service__["a" /* ClusterService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_cluster_service__["a" /* ClusterService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_3__services_ovc_service__["a" /* OVCService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_ovc_service__["a" /* OVCService */]) === "function" && _d || Object])
    ], ConfigureComponent);
    return ConfigureComponent;
    var _a, _b, _c, _d;
}());

//# sourceMappingURL=configure.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/deconfigure/deconfigure.component.html":
/***/ (function(module, exports) {

module.exports = "<head>\r\n<style>\r\ntd {\r\n     text-align: left;\r\n}\r\n</style>\r\n</head>\r\n\r\n<div class=\"viewTitle\">Deconfigure</div>\r\n<div></div>\r\n<div> <strong>Note:</strong>Select the VM and click on Update Fields button and enter the password of domain and the VM</div>\r\n\r\n<div class=\"alert alert-success\" *ngIf=\"showSuccessMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"alert-icon\" shape=\"check-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{ovcmsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div class=\"alert alert-danger\" *ngIf=\"showFailureMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"is-error\" shape=\"info-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{errormsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div class=\"alert alert-info\" *ngIf=\"showInfoMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"is-error\" shape=\"info-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{infomsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div  ng-app=\"app\" align=\"left\" position=\"relative\">\r\n\r\n<form clrForm (ngSubmit)=\"onSubmit()\" class=\"modal-content-chassis\" name=\"mainForm\">\r\n<section class=\"form-block\">\r\n\r\n<div>\r\n<table style=\"border-spacing:20px;\">\r\n<tr>\r\n\t<td><h3 style=\"text-align:center;\">Domain Information</h3></td>\r\n\t<td><h3 style=\"text-align:center;\">VM Information</h3></td>\r\n</tr>\r\n<tr>\r\n\t<td>\r\n\t\t<table >\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Domain Name<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"demo.local\" id=\"dmnName\" name=\"dmnName\" [(ngModel)]=\"domaindata.domainName\" disabled size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label><span>Username<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"Username\" id=\"dmnUsername\" name=\"dmnUsername\" [(ngModel)]=\"domaindata.dmnUserName\" disabled size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Password<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"password\" placeholder=\"*******\" id=\"dmnPassword\" name=\"dmnPassword\" [(ngModel)]=\"domaindata.dmnPassword\" required size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr><td><br/></td></tr>\r\n\t\t\t<tr><td><br/></td></tr>\r\n\t\t</table>\r\n\t</td>\r\n\t<td>\r\n\t\t<table>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>VM Name<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"CC01\" id=\"vmName\" name=\"vmName\" [(ngModel)]=\"vmdata.vmName\" disabled size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label><span>Username<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"100px\">\r\n\t\t\t\t\t<input clrInput type=\"text\" placeholder=\"Username\" id=\"vmUsername\" name=\"vmUsername\" [(ngModel)]=\"vmdata.vmUsername\" disabled size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Password<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"password\" id=\"vmPassword\" name=\"vmPassword\" [(ngModel)]=\"vmdata.vmPassword\" required size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Host name<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" id=\"vmHost\" name=\"vmHost\" [(ngModel)]=\"vmdata.vmHost\" disabled size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t<label ><span>Cluster name<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"text\" id=\"vmCluster\" name=\"vmCluster\" [(ngModel)]=\"vmdata.vmCluster\" disabled size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n</tr>\r\n<tr>\r\n\t<td></td>\r\n\t<td>\r\n\t\t <button class=\"btn\" (click)=\"onCancel()\" id=\"cancelBtn\">Cancel</button>\r\n            <button type=\"submit\" class=\"btn btn-primary\"\r\n                     id=\"saveBtn\">Deconfigure</button>\r\n\t</td>\r\n</tr>\r\n</table>\r\n\r\n</div>\r\n</section>\r\n</form>\r\n <div style=\"align-content:left;\">\r\n \t<div class=\"container\"> \r\n \t<div class=\"row\">\r\n \t\t<div class=\"col-xs-3 col-sm-2 col-lg-1\" style=\"background-color:#e0e0e0;border:0.1px solid #c2c2c2;\" >Select</div>\r\n \t\t<div class=\"col-xs-6 col-sm-4 col-lg-2\" style=\"background-color:#e0e0e0;border:0.1px solid #c2c2c2;\">Cluster</div>\r\n \t\t<div class=\"col-xs-6 col-sm-4 col-lg-2\" style=\"background-color:#e0e0e0;border:0.1px solid #c2c2c2;\">Host</div>\r\n \t\t<div class=\"col-xs-6 col-sm-4 col-lg-2\" style=\"background-color:#e0e0e0;border:0.1px solid #c2c2c2;\">VM</div>\r\n \t</div>\r\n \t<div class=\"row\" *ngFor=\"let entry of decnofigEntries\" >\r\n \t\t<div class=\"col-xs-3 col-sm-2 col-lg-1\" style=\"background-color:#fff;\">\r\n \t\t\t<!-- <input #rb1 type=\"radio\" name=\"rowNumber1\" value=\"{{entry.rowNumber}}\" (click)=\"rowSelected1($event)\" checked [(ngModel)]=\"selectedRowNumber\" />{{entry.rowNumber}} -->\r\n \t\t\t<input #rb2 type=\"radio\" name=\"rowNumber2\" value=\"{{entry.rowNumber}}\" (click)=\"rowSelected($event)\" checked [(ngModel)]=\"selectedRowNumber\" /><!--{{entry.rowNumber}} -->\r\n \t\t</div>\r\n \t\t<div class=\"col-xs-6 col-sm-4 col-lg-2\" style=\"background-color:#fff;\">{{entry.vmCluster}}</div>\r\n \t\t<div class=\"col-xs-6 col-sm-4 col-lg-2\" style=\"background-color:#fff;\">{{entry.vmHost}}</div>\r\n \t\t<div class=\"col-xs-6 col-sm-4 col-lg-2\" style=\"background-color:#fff;\">{{entry.vmName}}</div>\r\n \t</div>\r\n </div>\r\n </div>\r\n <br/>\r\n <div align=\"center\">\r\n \t<button class=\"btn\" (click)=\"updateFields()\" id=\"refreshBtn\">Update fields</button>\r\n\t<button class=\"btn btn-primary\" (click)=\"getDeconfigureEntries()\" id=\"refreshBtn\">Refresh Entries</button>\r\n</div>\r\n\r\n</div>"

/***/ }),

/***/ "../../../../../src/app/views/deconfigure/deconfigure.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DeconfigureComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_deconfiguretable_service__ = __webpack_require__("../../../../../src/app/services/deconfiguretable.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_deconfigure_service__ = __webpack_require__("../../../../../src/app/services/deconfigure.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_ovc_service__ = __webpack_require__("../../../../../src/app/services/ovc.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__model_vmdata_model__ = __webpack_require__("../../../../../src/app/model/vmdata.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__model_domaindata_model__ = __webpack_require__("../../../../../src/app/model/domaindata.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__model_baseinput_model__ = __webpack_require__("../../../../../src/app/model/baseinput.model.ts");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};







var DeconfigureComponent = (function () {
    function DeconfigureComponent(deconfigureService, deconfigureTableService, ovcService) {
        var _this = this;
        this.deconfigureService = deconfigureService;
        this.deconfigureTableService = deconfigureTableService;
        this.ovcService = ovcService;
        this.showSuccessMessage = false;
        this.showFailureMessage = false;
        this.showInfoMessage = false;
        this.infomsg = null;
        this.ovcmsg = null;
        this.errormsg = null;
        this.selectedRowNumber = 0;
        this.vmdatalist = new Array();
        this.decnofigEntries = new Array();
        this.domaindata = new __WEBPACK_IMPORTED_MODULE_5__model_domaindata_model__["a" /* DomainData */]();
        this.vmdata = new __WEBPACK_IMPORTED_MODULE_4__model_vmdata_model__["a" /* VMData */]();
        this.baseInput = new __WEBPACK_IMPORTED_MODULE_6__model_baseinput_model__["a" /* BaseInput */]();
        this.ovcService.isOVCDataSet().then(function (result) {
            console.log(result);
            if (result != null) {
                _this.errormsg = result.error;
                _this.showFailureMessage = true;
            }
        });
        this.deconfigureTableService.getDeconfigureEntries().then(function (result) {
            //this.hosts = result.hosts;
            console.log(result);
            console.log("Entries" + result.deconfigureTableEntries);
            _this.dentries = result;
            _this.decnofigEntries = result.deconfigureTableEntries;
            console.log("Entries1" + _this.decnofigEntries);
        });
    }
    DeconfigureComponent.prototype.ngOnInit = function () {
    };
    DeconfigureComponent.prototype.getDeconfigureEntries = function () {
        var _this = this;
        this.deconfigureTableService.getDeconfigureEntries().then(function (result) {
            _this.dentries = result;
            _this.decnofigEntries = result.deconfigureTableEntries;
            console.log("After Refresh::" + _this.decnofigEntries);
        });
    };
    DeconfigureComponent.prototype.rowSelected = function (element) {
        for (var _i = 0, _a = this.dentries.deconfigureTableEntries; _i < _a.length; _i++) {
            var item = _a[_i];
            if (item.rowNumber == element) {
                this.vmdata.vmName = item.vmName;
                this.vmdata.vmUsername = item.vmUserName;
                this.vmdata.vmHost = item.vmHost;
                this.vmdata.vmCluster = item.vmCluster;
                this.domaindata.domainName = item.domainName;
                this.domaindata.dmnUserName = item.domainUserName;
                this.selectedRowNumber = element; //+element.target.value;
            }
        }
    };
    DeconfigureComponent.prototype.updateFields = function () {
        for (var _i = 0, _a = this.dentries.deconfigureTableEntries; _i < _a.length; _i++) {
            var item = _a[_i];
            if (item.rowNumber == this.selectedRowNumber) {
                this.vmdata.vmName = item.vmName;
                this.vmdata.vmUsername = item.vmUserName;
                this.vmdata.vmHost = item.vmHost;
                this.vmdata.vmCluster = item.vmCluster;
                this.domaindata.domainName = item.domainName;
                this.domaindata.dmnUserName = item.domainUserName;
                this.selectedRowNumber = this.selectedRowNumber; //+element.target.value;
            }
        }
    };
    DeconfigureComponent.prototype.onCancel = function (result) {
    };
    DeconfigureComponent.prototype.clear = function () { };
    /**
    * Triggered when user clicks on "Update" button.
    */
    DeconfigureComponent.prototype.onSubmit = function () {
        var _this = this;
        this.baseInput.domainData = this.domaindata;
        this.vmdatalist[0] = this.vmdata;
        this.baseInput.vmData = this.vmdatalist;
        this.baseInput.rowNumber = this.selectedRowNumber;
        console.log("ONSubmit:" + this.baseInput);
        this.showSuccessMessage = false;
        this.showFailureMessage = false;
        this.showInfoMessage = true;
        this.infomsg = "Deconfiguration may take few minutes.";
        this.deconfigureService.deconfigure(this.baseInput)
            .then(function (result) {
            if (result) {
                _this.showInfoMessage = false;
                if (result.error == null) {
                    alert(result.message);
                    _this.showSuccessMessage = true;
                    _this.ovcmsg = result.message;
                }
                else {
                    alert(result.error);
                    _this.errormsg = result.error;
                    _this.showFailureMessage = true;
                }
            }
            else {
                alert("Error occured while performing deconfiguration. Please check the log file for more information.");
                _this.errormsg = "Error occured while performing deconfiguration. Please check the log file for more information.";
                _this.showFailureMessage = true;
            }
            _this.vmdata.vmName = "";
            _this.vmdata.vmUsername = "";
            _this.vmdata.vmHost = "";
            _this.vmdata.vmCluster = "";
            _this.domaindata.domainName = "";
            _this.domaindata.dmnUserName = "";
            _this.domaindata.dmnPassword = "";
            _this.vmdata.vmPassword = "";
            _this.selectedRowNumber = -1;
        })
            .catch(function () {
            _this.onCancel();
        });
    };
    DeconfigureComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/deconfigure/deconfigure.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2__services_deconfigure_service__["a" /* DeconfigureService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_deconfigure_service__["a" /* DeconfigureService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__services_deconfiguretable_service__["a" /* DeconfigureTableService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_deconfiguretable_service__["a" /* DeconfigureTableService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_3__services_ovc_service__["a" /* OVCService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_ovc_service__["a" /* OVCService */]) === "function" && _c || Object])
    ], DeconfigureComponent);
    return DeconfigureComponent;
    var _a, _b, _c;
}());

//# sourceMappingURL=deconfigure.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/modal-label-input/modal-label-input.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<div class=\"form-group\" [ngStyle]=\"customStyle\">\r\n    <label for=\"{{inputId}}\" class=\"{{valueRequired? 'required' : ''}}\">{{labelValue | translate}}</label>\r\n    <input *ngIf=\"!valueRequired\"\r\n           id=\"{{inputId}}\"\r\n           type=\"{{inputType}}\"\r\n           size=\"{{inputSize}}\"\r\n           placeholder=\"{{placeholderValue | translate}}\"\r\n           [ngModel]=\"inputValue\"\r\n           (ngModelChange)=\"onInputValueChanged($event)\">\r\n\r\n    <label *ngIf=\"valueRequired\"\r\n           for=\"{{inputId}}_with_tooltip\"\r\n           [class.invalid]=\"invalidValue\"\r\n           aria-haspopup=\"true\" role=\"tooltip\"\r\n           class=\"tooltip tooltip-validation tooltip-bottom-left tooltip-md\">\r\n        <input type=\"{{InputType}}\"\r\n               id=\"{{inputId}}_with_tooltip\"\r\n               size=\"{{inputSize}}\"\r\n               placeholder=\"{{placeholderValue | translate}}\"\r\n               [ngModel]=\"inputValue\"\r\n               (ngModelChange)=\"onInputValueChanged($event)\" required>\r\n        <span class=\"tooltip-content\">\r\n            {{invalidValueError}}\r\n        </span>\r\n    </label>\r\n    \r\n     <label for=\"{{inputId}}_password\"  class=\"{{valueRequired? 'required' : ''}}\">\r\n        <input *ngIf=\"!valueRequired\" type=\"password\"\r\n               id=\"{{inputId}}_password\"\r\n               size=\"{{inputSize}}\"\r\n               [ngModel]=\"inputValue\"\r\n               (ngModelChange)=\"onInputValueChanged($event)\" required>\r\n    </label>\r\n    \r\n   <!--  <label for=\"{{inputId}}_radio\" class=\"{{valueRequired? 'required' : ''}}\">\r\n    <input *ngIf=\"!valueRequired\" type=\"radio\"\r\n           id=\"{{inputId}}_radio\"\r\n           name=\"{{inputName}}\"\r\n           value=\"{{inputValue}}\"\r\n           [ngModel]=\"inputValue\"\r\n           (ngModelChange)=\"onInputValueChanged($event)\">\r\n    </label> -->\r\n     \r\n    <label for=\"{{inputId}}_check\" class=\"{{valueRequired? 'required' : ''}}\">{{labelValue | translate}}\r\n    <input *ngIf=\"!valueRequired\" type=\"checkbox\"\r\n           id=\"{{inputId}}_check\"\r\n           [ngModel]=\"inputValue\"\r\n           (ngModelChange)=\"onInputValueChanged($event)\">\r\n    </label>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/modal-label-input/modal-label-input.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ModalLabelInputComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ModalLabelInputComponent = (function () {
    function ModalLabelInputComponent() {
        this.inputSize = 40;
        this.inputValueChanged = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    ModalLabelInputComponent.prototype.onInputValueChanged = function (newValue) {
        this.inputValueChanged.emit(newValue);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], ModalLabelInputComponent.prototype, "customStyle", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], ModalLabelInputComponent.prototype, "inputId", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Object)
    ], ModalLabelInputComponent.prototype, "inputType", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], ModalLabelInputComponent.prototype, "inputName", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Number)
    ], ModalLabelInputComponent.prototype, "inputSize", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Object)
    ], ModalLabelInputComponent.prototype, "inputValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]) === "function" && _a || Object)
    ], ModalLabelInputComponent.prototype, "inputValueChanged", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], ModalLabelInputComponent.prototype, "labelValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], ModalLabelInputComponent.prototype, "placeholderValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Boolean)
    ], ModalLabelInputComponent.prototype, "invalidValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Boolean)
    ], ModalLabelInputComponent.prototype, "valueRequired", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], ModalLabelInputComponent.prototype, "invalidValueError", void 0);
    ModalLabelInputComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: "modal-label-input",
            template: __webpack_require__("../../../../../src/app/views/modal-label-input/modal-label-input.component.html")
        })
    ], ModalLabelInputComponent);
    return ModalLabelInputComponent;
    var _a;
}());

//# sourceMappingURL=modal-label-input.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/ovcData/ovcData.component.html":
/***/ (function(module, exports) {

module.exports = "<head>\r\n<style>\r\ntd {\r\n     text-align: left;\r\n}\r\ntitlebar-text {\r\n    max-width: 85%;\r\n    display: inline-block;\r\n}\r\n</style>\r\n</head>\r\n\r\n<div class=\"viewTitle\"></div>\r\n<div></div>\r\n<div> <label>Note:</label>Select the platform and enter the credentials. If vCenter is not deployed on Windows, Please provide remote windows VM details</div>\r\n\r\n<div class=\"alert alert-success\" *ngIf=\"showSuccessMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"alert-icon\" shape=\"check-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{ovcmsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div class=\"alert alert-danger\" *ngIf=\"showFailureMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"is-error\" shape=\"info-circle\"></clr-icon>\r\n            </div>\r\n             <span class=\"alert-text\">\r\n                {{errormsg}}\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<div ng-app=\"app\" align=\"left\">\r\n\r\n<form clrForm (ngSubmit)=\"onSubmit()\" class=\"modal-content-chassis\" name=\"mainForm\">\r\n<section class=\"form-block\">\r\n\r\n<div>\r\n<table style=\"border-spacing:18px;\">\r\n<tr>\r\n\t<td><h3><span class=\"titlebar-text\">OVC/ILO Information</span></h3></td>\r\n\t<td><h3><span class=\"titlebar-text\">Remote Windows Information</span></h3></td>\r\n</tr>\r\n<tr>\r\n\t<td>\r\n\t\t<table style=\"border-spacing:10px;\">\r\n\t\t<!-- <tr><h3><span class=\"titlebar-text\">OVC/ILO Information</span></h3></tr> -->\r\n\t\t<!-- <tr><td><br/></td></tr> -->\r\n\t\t<tr>\r\n\t\t\t<td  width=\"80%\">\r\n\t\t\t\t<label>  \r\n\t\t               <input type=\"radio\" name=\"platform\" value=\"Simplivity\" (click)=\"setradio('Simplivity')\" [checked]='true' ngModel>  \r\n\t\t               SimpliVity  \r\n\t\t           </label> \r\n\t\t\t</td>\r\n\t\t\t<td  width=\"80%\">\r\n\t\t\t\t<label>  \r\n\t\t               <input type=\"radio\" name=\"platform\" value=\"NonSimplivity\" (click)=\"setradio('NonSimplivity')\" ngModel>  \r\n\t\t               HPE Platform  \r\n\t\t           </label>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td  width=\"80%\">\r\n\t\t\t\t<label  *ngIf=\"isSelected('Simplivity')\" ><span>OVC IPAddress <span class=\"color:red\">*</span></span></label>\r\n\t\t \t\t<label  *ngIf=\"isSelected('NonSimplivity')\" ><span>ILO IPAddress</span></label>\r\n\t\t\t</td>\r\n\t\t\t<td>\r\n\t\t\t\t<input clrInput type=\"text\" placeholder=\"IP Address\" id=\"ovcIP\" name=\"ovcIP\" [(ngModel)]=\"ovcdata.ovcIP\"\r\n\t\t\t\t\t(ngModelChange)=\"setIP($event)\" ng-ip-address size=\"30px\"/>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td  width=\"80%\">\r\n\t\t\t\t<label  *ngIf=\"isSelected('Simplivity')\" ><span>OVC Username <span class=\"color:red\">*</span></span></label>\r\n\t\t \t\t<label  *ngIf=\"isSelected('NonSimplivity')\" ><span>vCenter Username<span class=\"color:red\">*</span></span></label>\r\n\t\t\t</td>\r\n\t\t\t<td>\r\n\t\t\t\t<input clrInput type=\"text\" placeholder=\"Username\" id=\"ovcUsername\" name=\"ovcUsername\" [(ngModel)]=\"ovcdata.ovcUsername\" \r\n\t\t\t\t(ngModelChange)=\"setUsername($event)\"  required size=\"30px\"/>\r\n\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td >\r\n\t\t\t\t<label  *ngIf=\"isSelected('Simplivity')\" ><span>OVC Password <span class=\"color:red\">*</span></span></label>\r\n\t\t \t\t<label  *ngIf=\"isSelected('NonSimplivity')\" ><span>vCenter Password<span class=\"color:red\">*</span></span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"password\" placeholder=\"Password\" id=\"ovcPassword\" name=\"ovcPassword\" [(ngModel)]=\"ovcdata.ovcPassword\" \r\n\t\t\t\t\t(ngModelChange)=\"setPassword($event)\" required size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n\r\n\t<td>\r\n\t\t<table style=\"border-spacing:10px;\" >\r\n\t\t\r\n\t\t<!-- <tr><h3><span class=\"titlebar-text\">Remote Windows Information</span></h3></tr> -->\r\n\t\t<!-- <tr><td><br/></td></tr> -->\r\n\t\t<tr><td><br/></td></tr>\r\n\t\t<tr>\r\n\t\t\t<td   width=\"80%\">\r\n\t\t\t\t<label><span>Windows IPAddress</span></label>\r\n\t\t\t</td>\r\n\t\t\t<td>\r\n\t\t\t\t<input clrInput type=\"text\" placeholder=\"IP Address\" id=\"winIP\" name=\"winIP\" [(ngModel)]=\"remoteWin.winIP\" size=\"30px\"/>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td  width=\"80%\">\r\n\t\t\t\t<label ><span>Username </span></label>\r\n\t\t\t</td>\r\n\t\t\t<td>\r\n\t\t\t\t<input clrInput type=\"text\" placeholder=\"Username\" id=\"winUsername\" name=\"winUsername\" [(ngModel)]=\"remoteWin.winUsername\" size=\"30px\"/>\r\n\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td  width=\"80%\">\r\n\t\t\t\t\t<label ><span>Password </span></label>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input clrInput type=\"password\" placeholder=\"Password\" id=\"winPassword\" name=\"winPassword\" [(ngModel)]=\"remoteWin.winPassword\" size=\"30px\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n</tr>\r\n</table>\r\n</div>\r\n\r\n  <div class=\"modal-footer\">\r\n            <button class=\"btn\" (click)=\"onCancel()\" id=\"cancelBtn\">Cancel</button>\r\n            <button type=\"submit\" class=\"btn btn-primary\"\r\n                     id=\"saveBtn\">OK</button>\r\n   </div>\r\n   </section>\r\n        \r\n</form>\r\n\r\n    </div>"

/***/ }),

/***/ "../../../../../src/app/views/ovcData/ovcData.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return OVCDataComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_ovc_service__ = __webpack_require__("../../../../../src/app/services/ovc.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__model_ovcdata_model__ = __webpack_require__("../../../../../src/app/model/ovcdata.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__model_remotewindowsvmdata_model__ = __webpack_require__("../../../../../src/app/model/remotewindowsvmdata.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_validation__ = __webpack_require__("../../../../../src/app/services/validation.ts");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var OVCDataComponent = (function () {
    function OVCDataComponent(ovcService) {
        this.ovcService = ovcService;
        this.showSuccessMessage = false;
        this.showFailureMessage = false;
        this.ovcmsg = null;
        this.errormsg = null;
        this.selectedPlatform = "Simplivity";
        this.pltform = false;
        this.inputCorrect = false;
    }
    OVCDataComponent.prototype.ngOnInit = function () {
        this.ovcdata = new __WEBPACK_IMPORTED_MODULE_2__model_ovcdata_model__["a" /* OVCData */]();
        this.remoteWin = new __WEBPACK_IMPORTED_MODULE_3__model_remotewindowsvmdata_model__["a" /* RemoteWindowsVMData */]();
    };
    OVCDataComponent.prototype.setradio = function (e) {
        this.selectedPlatform = e;
        if (e === "NonSimplivity") {
            this.ovcdata.platform = true;
        }
    };
    OVCDataComponent.prototype.isSelected = function (name) {
        if (!this.selectedPlatform) {
            return false;
        }
        return (this.selectedPlatform === name); // if current radio button is selected, return true, else return false  
    };
    OVCDataComponent.prototype.onCancel = function (result) {
    };
    OVCDataComponent.prototype.isInputValid = function () {
        return __WEBPACK_IMPORTED_MODULE_4__services_validation__["a" /* ValidationUtil */].isOVCDtataValid(this.ovcdata.ovcIP, this.ovcdata.ovcUsername, this.ovcdata.ovcPassword);
    };
    /**
     * Triggered when user clicks on "Update" button.
     */
    OVCDataComponent.prototype.onSubmit = function () {
        var _this = this;
        //console.log(this.ovcdata);
        if (this.ovcdata.platform) {
            this.ovcdata.iloAddress = this.ovcdata.ovcIP;
            //this.ovcdata.ovcIP = null;
            if (this.ovcdata.ovcUsername != undefined && this.ovcdata.ovcPassword != undefined) {
                this.inputCorrect = true;
            }
        }
        else {
            var regExp = new RegExp('^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$');
            if (this.ovcdata.ovcIP != undefined && regExp.test(this.ovcdata.ovcIP) && this.ovcdata.ovcUsername != undefined && this.ovcdata.ovcPassword != undefined) {
                this.inputCorrect = true;
            }
        }
        //	alert("nputCorrect:"+this.inputCorrect);
        if (this.inputCorrect) {
            this.ovcdata.remoteWindowsVMData = this.remoteWin;
            console.log(this.ovcdata);
            this.ovcService.setOvcData(this.ovcdata)
                .then(function (result) {
                if (result) {
                    // alert(result.message);
                    if (result.error != null) {
                        alert(result.error);
                        _this.errormsg = result.error;
                        _this.showFailureMessage = true;
                    }
                    else {
                        alert(result.message);
                        _this.ovcmsg = result.message;
                        _this.showSuccessMessage = true;
                    }
                }
                else {
                    alert(result.error);
                    _this.showFailureMessage = true;
                    _this.errormsg = "Data did not get saved!";
                }
            })
                .catch(function () {
                _this.onCancel();
            });
        }
        else {
            alert("Invalid details provided.");
            this.errormsg = "Invalid details provided";
            this.showFailureMessage = true;
        }
        this.showSuccessMessage = false;
        this.showFailureMessage = false;
    };
    OVCDataComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/ovcData/ovcData.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_ovc_service__["a" /* OVCService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_ovc_service__["a" /* OVCService */]) === "function" && _a || Object])
    ], OVCDataComponent);
    return OVCDataComponent;
    var _a;
}());

//# sourceMappingURL=ovcData.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/sample-input/sample-input.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<div class=\"form-group\" [ngStyle]=\"customStyle\">\r\n    <label for=\"{{inputId}}\" class=\"{{valueRequired? 'required' : ''}}\">{{labelValue | translate}}</label>\r\n    <input *ngIf=\"!valueRequired\"\r\n           type=\"text\"\r\n           id=\"{{inputId}}\"\r\n           size=\"{{inputSize}}\"\r\n           placeholder=\"{{placeholderValue | translate}}\"\r\n           [ngModel]=\"inputValue\"\r\n           (ngModelChange)=\"onInputValueChanged($event)\">\r\n\r\n    <label *ngIf=\"valueRequired\"\r\n           for=\"{{inputId}}_with_tooltip\"\r\n           [class.invalid]=\"invalidValue\"\r\n           aria-haspopup=\"true\" role=\"tooltip\"\r\n           class=\"tooltip tooltip-validation tooltip-bottom-left tooltip-md\">\r\n        <input type=\"text\"\r\n               id=\"{{inputId}}_with_tooltip\"\r\n               size=\"{{inputSize}}\"\r\n               placeholder=\"{{placeholderValue | translate}}\"\r\n               [ngModel]=\"inputValue\"\r\n               (ngModelChange)=\"onInputValueChanged($event)\" required>\r\n               \r\n        <span class=\"tooltip-content\">\r\n            {{invalidValueError}}\r\n        </span>\r\n    </label>\r\n    <label for=\"{{inputId}}\" class=\"{{valueRequired? 'required' : ''}}\">{{labelValue | translate}}</label>\r\n    <input type=\"password\"\r\n               id=\"{{inputId}}_password\"\r\n               size=\"{{inputSize}}\"\r\n               placeholder=\"{{placeholderValue | translate}}\"\r\n               [ngModel]=\"inputValue\"\r\n               (ngModelChange)=\"onInputValueChanged($event)\" required>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/sample-input/sample-input.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SampleInputComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var SampleInputComponent = (function () {
    function SampleInputComponent() {
        this.inputSize = 40;
        this.inputValueChanged = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    SampleInputComponent.prototype.onInputValueChanged = function (newValue) {
        this.inputValueChanged.emit(newValue);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], SampleInputComponent.prototype, "customStyle", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], SampleInputComponent.prototype, "inputId", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Number)
    ], SampleInputComponent.prototype, "inputSize", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Object)
    ], SampleInputComponent.prototype, "inputValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]) === "function" && _a || Object)
    ], SampleInputComponent.prototype, "inputValueChanged", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], SampleInputComponent.prototype, "labelValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], SampleInputComponent.prototype, "placeholderValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Boolean)
    ], SampleInputComponent.prototype, "invalidValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Boolean)
    ], SampleInputComponent.prototype, "valueRequired", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], SampleInputComponent.prototype, "invalidValueError", void 0);
    SampleInputComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: "sample-input",
            template: __webpack_require__("../../../../../src/app/views/sample-input/sample-input.component.html")
        })
    ], SampleInputComponent);
    return SampleInputComponent;
    var _a;
}());

//# sourceMappingURL=sample-input.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/status/status.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<clr-icon class=\"status-icon\" [attr.shape]=\"isActive ? 'check' : 'exclamation-circle'\"></clr-icon>\r\n{{isActive ? ('common.active' | translate) : ('common.standBy' | translate)}}\r\n"

/***/ }),

/***/ "../../../../../src/app/views/status/status.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StatusComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var StatusComponent = (function () {
    function StatusComponent() {
    }
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Boolean)
    ], StatusComponent.prototype, "isActive", void 0);
    StatusComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: "chassis-status",
            template: __webpack_require__("../../../../../src/app/views/status/status.component.html")
        })
    ], StatusComponent);
    return StatusComponent;
}());

//# sourceMappingURL=status.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/vm-views/vm-configure.component.html":
/***/ (function(module, exports) {

module.exports = "<h4>{{ 'vsphere.vm.configure' | translate }}</h4>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/vm-views/vm-configure.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return VmConfigureComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var VmConfigureComponent = (function () {
    function VmConfigureComponent() {
    }
    VmConfigureComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/vm-views/vm-configure.component.html")
        })
    ], VmConfigureComponent);
    return VmConfigureComponent;
}());

//# sourceMappingURL=vm-configure.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/vm-views/vm-monitor.component.html":
/***/ (function(module, exports) {

module.exports = "<h4>{{ 'vsphere.vm.monitor' | translate }}</h4>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/vm-views/vm-monitor.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return VmMonitorComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var VmMonitorComponent = (function () {
    function VmMonitorComponent() {
    }
    VmMonitorComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/vm-views/vm-monitor.component.html")
        })
    ], VmMonitorComponent);
    return VmMonitorComponent;
}());

//# sourceMappingURL=vm-monitor.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/vm-views/vm-portlet.component.html":
/***/ (function(module, exports) {

module.exports = "<h4>{{ 'vsphere.vm.portlet' | translate }}</h4>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/vm-views/vm-portlet.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return VmPortletComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var VmPortletComponent = (function () {
    function VmPortletComponent() {
    }
    VmPortletComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/vm-views/vm-portlet.component.html")
        })
    ], VmPortletComponent);
    return VmPortletComponent;
}());

//# sourceMappingURL=vm-portlet.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/welcome/welcome.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"viewTitle\">{{'welcome.title' | translate }}</div>\r\n<div>{{ 'welcome.text' | translate }}</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/welcome/welcome.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return WelcomeComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var WelcomeComponent = (function () {
    function WelcomeComponent() {
    }
    WelcomeComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/welcome/welcome.component.html")
        })
    ], WelcomeComponent);
    return WelcomeComponent;
}());

//# sourceMappingURL=welcome.component.js.map

/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false
};
//# sourceMappingURL=environment.js.map

/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/@angular/platform-browser-dynamic.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_23" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });
//# sourceMappingURL=main.js.map

/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map