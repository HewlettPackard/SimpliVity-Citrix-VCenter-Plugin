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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/@angular/router.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_routing_component__ = __webpack_require__("../../../../../src/app/app-routing.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__views_list_list_component__ = __webpack_require__("../../../../../src/app/views/list/list.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__page_not_found_component__ = __webpack_require__("../../../../../src/app/page-not-found.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__views_actions_create_edit_create_edit_component__ = __webpack_require__("../../../../../src/app/views/actions/create-edit/create-edit.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__views_actions_create_edit_create_wizard_component__ = __webpack_require__("../../../../../src/app/views/actions/create-edit/create-wizard.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__views_actions_delete_delete_component__ = __webpack_require__("../../../../../src/app/views/actions/delete/delete.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__views_details_view_details_view_component__ = __webpack_require__("../../../../../src/app/views/details-view/details-view.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__views_welcome_welcome_component__ = __webpack_require__("../../../../../src/app/views/welcome/welcome.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__views_settings_settings_component__ = __webpack_require__("../../../../../src/app/views/settings/settings.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__views_actions_vm_vm_action_modal_component__ = __webpack_require__("../../../../../src/app/views/actions/vm/vm-action-modal.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__views_vm_views_vm_monitor_component__ = __webpack_require__("../../../../../src/app/views/vm-views/vm-monitor.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__views_vm_views_vm_configure_component__ = __webpack_require__("../../../../../src/app/views/vm-views/vm-configure.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__views_vm_views_vm_portlet_component__ = __webpack_require__("../../../../../src/app/views/vm-views/vm-portlet.component.ts");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};















var routes = [
    { path: '', pathMatch: 'full', redirectTo: 'index.html', },
    { path: 'index.html', component: __WEBPACK_IMPORTED_MODULE_2__app_routing_component__["a" /* AppRoutingComponent */] },
    { path: 'create', component: __WEBPACK_IMPORTED_MODULE_5__views_actions_create_edit_create_edit_component__["a" /* CreateEditComponent */] },
    { path: 'create-wizard', component: __WEBPACK_IMPORTED_MODULE_6__views_actions_create_edit_create_wizard_component__["a" /* CreateWizardComponent */] },
    { path: 'edit', component: __WEBPACK_IMPORTED_MODULE_5__views_actions_create_edit_create_edit_component__["a" /* CreateEditComponent */] },
    { path: 'delete', component: __WEBPACK_IMPORTED_MODULE_7__views_actions_delete_delete_component__["a" /* DeleteComponent */] },
    { path: 'list', component: __WEBPACK_IMPORTED_MODULE_3__views_list_list_component__["a" /* ListComponent */] },
    { path: 'welcome', component: __WEBPACK_IMPORTED_MODULE_9__views_welcome_welcome_component__["a" /* WelcomeComponent */] },
    { path: 'settings', component: __WEBPACK_IMPORTED_MODULE_10__views_settings_settings_component__["a" /* SettingsComponent */] },
    { path: 'vm-action-modal', component: __WEBPACK_IMPORTED_MODULE_11__views_actions_vm_vm_action_modal_component__["a" /* VmActionModalComponent */] },
    { path: 'vm-monitor', component: __WEBPACK_IMPORTED_MODULE_12__views_vm_views_vm_monitor_component__["a" /* VmMonitorComponent */] },
    { path: 'vm-configure', component: __WEBPACK_IMPORTED_MODULE_13__views_vm_views_vm_configure_component__["a" /* VmConfigureComponent */] },
    { path: 'vm-portlet', component: __WEBPACK_IMPORTED_MODULE_14__views_vm_views_vm_portlet_component__["a" /* VmPortletComponent */] },
    { path: '**', pathMatch: 'full', component: __WEBPACK_IMPORTED_MODULE_4__page_not_found_component__["a" /* PageNotFoundComponent */] }
];
var AppRoutingModule = (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["M" /* NgModule */])({
            imports: [__WEBPACK_IMPORTED_MODULE_1__angular_router__["c" /* RouterModule */].forRoot(routes)],
            exports: [__WEBPACK_IMPORTED_MODULE_1__angular_router__["c" /* RouterModule */]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());

var routableComponents = [
    __WEBPACK_IMPORTED_MODULE_2__app_routing_component__["a" /* AppRoutingComponent */],
    __WEBPACK_IMPORTED_MODULE_5__views_actions_create_edit_create_edit_component__["a" /* CreateEditComponent */],
    __WEBPACK_IMPORTED_MODULE_6__views_actions_create_edit_create_wizard_component__["a" /* CreateWizardComponent */],
    __WEBPACK_IMPORTED_MODULE_7__views_actions_delete_delete_component__["a" /* DeleteComponent */],
    __WEBPACK_IMPORTED_MODULE_9__views_welcome_welcome_component__["a" /* WelcomeComponent */],
    __WEBPACK_IMPORTED_MODULE_10__views_settings_settings_component__["a" /* SettingsComponent */],
    __WEBPACK_IMPORTED_MODULE_11__views_actions_vm_vm_action_modal_component__["a" /* VmActionModalComponent */],
    __WEBPACK_IMPORTED_MODULE_3__views_list_list_component__["a" /* ListComponent */],
    __WEBPACK_IMPORTED_MODULE_8__views_details_view_details_view_component__["a" /* DetailsViewComponent */],
    __WEBPACK_IMPORTED_MODULE_4__page_not_found_component__["a" /* PageNotFoundComponent */],
    __WEBPACK_IMPORTED_MODULE_12__views_vm_views_vm_monitor_component__["a" /* VmMonitorComponent */],
    __WEBPACK_IMPORTED_MODULE_13__views_vm_views_vm_configure_component__["a" /* VmConfigureComponent */],
    __WEBPACK_IMPORTED_MODULE_14__views_vm_views_vm_portlet_component__["a" /* VmPortletComponent */]
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
exports.push([module.i, ":host {\n  display: block;\n  width: 100%;\n  height: 100%; }\n\n.appContent {\n  width: 100%;\n  height: 100%;\n  padding: 20px 20px 0 10px; }\n", "", {"version":3,"sources":["C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/app.component.scss"],"names":[],"mappings":"AAAA;EACG,eAAc;EACd,YAAW;EACX,aAAY,EACd;;AAED;EACG,YAAW;EACX,aAAY;EAEZ,0BAAyB,EAC3B","file":"app.component.scss","sourcesContent":[":host {\r\n   display: block;\r\n   width: 100%;\r\n   height: 100%;\r\n}\r\n\r\n.appContent {\r\n   width: 100%;\r\n   height: 100%;\r\n\r\n   padding: 20px 20px 0 10px;\r\n}\r\n"],"sourceRoot":""}]);

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
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__services_hosts_service__ = __webpack_require__("../../../../../src/app/services/hosts.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__services_modal_service__ = __webpack_require__("../../../../../src/app/services/modal.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__services_resource_service__ = __webpack_require__("../../../../../src/app/services/resource.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__views_header_header_component__ = __webpack_require__("../../../../../src/app/views/header/header.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__views_status_status_component__ = __webpack_require__("../../../../../src/app/views/status/status.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__views_modal_label_input_modal_label_input_component__ = __webpack_require__("../../../../../src/app/views/modal-label-input/modal-label-input.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__app_routing_module__ = __webpack_require__("../../../../../src/app/app-routing.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__angular_platform_browser_animations__ = __webpack_require__("../../../platform-browser/@angular/platform-browser/animations.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__views_tabs_summary_summary_component__ = __webpack_require__("../../../../../src/app/views/tabs/summary/summary.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__views_tabs_monitor_monitor_component__ = __webpack_require__("../../../../../src/app/views/tabs/monitor/monitor.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__views_tabs_configure_configure_component__ = __webpack_require__("../../../../../src/app/views/tabs/configure/configure.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__views_tabs_hosts_hosts_list_component__ = __webpack_require__("../../../../../src/app/views/tabs/hosts/hosts-list.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__views_tabs_configure_settings_settings_component__ = __webpack_require__("../../../../../src/app/views/tabs/configure/settings/settings.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__views_tabs_configure_additional_additional_view_component__ = __webpack_require__("../../../../../src/app/views/tabs/configure/additional/additional-view.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_23__ngx_translate_core__ = __webpack_require__("../../../../@ngx-translate/core/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_24__ngx_translate_http_loader__ = __webpack_require__("../../../../@ngx-translate/http-loader/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_25_clarity_icons_shapes_all_shapes__ = __webpack_require__("../../../../clarity-icons/shapes/all-shapes.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_25_clarity_icons_shapes_all_shapes___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_25_clarity_icons_shapes_all_shapes__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_26__services_settings_service__ = __webpack_require__("../../../../../src/app/services/settings.service.ts");
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
    return new __WEBPACK_IMPORTED_MODULE_24__ngx_translate_http_loader__["a" /* TranslateHttpLoader */](http, './assets/i18n/', '.json');
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
                __WEBPACK_IMPORTED_MODULE_5_clarity_angular__["a" /* ClarityModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_common_http__["b" /* HttpClientModule */],
                __WEBPACK_IMPORTED_MODULE_23__ngx_translate_core__["b" /* TranslateModule */].forRoot({
                    loader: {
                        provide: __WEBPACK_IMPORTED_MODULE_23__ngx_translate_core__["a" /* TranslateLoader */],
                        useFactory: (createTranslateLoader),
                        deps: [__WEBPACK_IMPORTED_MODULE_4__angular_common_http__["a" /* HttpClient */]]
                    }
                }),
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_http__["c" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_15__app_routing_module__["a" /* AppRoutingModule */],
                __WEBPACK_IMPORTED_MODULE_16__angular_platform_browser_animations__["a" /* BrowserAnimationsModule */]
            ],
            declarations: [__WEBPACK_IMPORTED_MODULE_7__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_15__app_routing_module__["b" /* routableComponents */],
                __WEBPACK_IMPORTED_MODULE_17__views_tabs_summary_summary_component__["a" /* SummaryComponent */],
                __WEBPACK_IMPORTED_MODULE_18__views_tabs_monitor_monitor_component__["a" /* MonitorComponent */],
                __WEBPACK_IMPORTED_MODULE_19__views_tabs_configure_configure_component__["a" /* ConfigureComponent */],
                __WEBPACK_IMPORTED_MODULE_20__views_tabs_hosts_hosts_list_component__["a" /* HostListComponent */],
                __WEBPACK_IMPORTED_MODULE_21__views_tabs_configure_settings_settings_component__["a" /* SettingsComponent */],
                __WEBPACK_IMPORTED_MODULE_22__views_tabs_configure_additional_additional_view_component__["a" /* AdditionalViewComponent */],
                __WEBPACK_IMPORTED_MODULE_12__views_header_header_component__["a" /* HeaderComponent */],
                __WEBPACK_IMPORTED_MODULE_13__views_status_status_component__["a" /* StatusComponent */],
                __WEBPACK_IMPORTED_MODULE_14__views_modal_label_input_modal_label_input_component__["a" /* ModalLabelInputComponent */]],
            providers: [__WEBPACK_IMPORTED_MODULE_8__services_chassis_service__["a" /* ChassisService */], __WEBPACK_IMPORTED_MODULE_10__services_modal_service__["a" /* ModalConfigService */], __WEBPACK_IMPORTED_MODULE_11__services_resource_service__["a" /* ResourceService */], __WEBPACK_IMPORTED_MODULE_9__services_hosts_service__["a" /* HostsService */], __WEBPACK_IMPORTED_MODULE_26__services_settings_service__["a" /* SettingsService */]],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_7__app_component__["a" /* AppComponent */]]
        }),
        __metadata("design:paramtypes", [])
    ], AppModule);
    return AppModule;
}());

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ "../../../../../src/app/model/chassis.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Chassis; });
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var Chassis = (function () {
    function Chassis() {
    }
    return Chassis;
}());

//# sourceMappingURL=chassis.model.js.map

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

/***/ "../../../../../src/app/services/chassis.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ChassisService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__ = __webpack_require__("../../../../rxjs/add/operator/toPromise.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__);
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




var ChassisService = (function (_super) {
    __extends(ChassisService, _super);
    function ChassisService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    ChassisService_1 = ChassisService;
    /**
     * Creates a new object of type Chassis
     * @param chassis - the created object.
     */
    ChassisService.prototype.create = function (chassis) {
        chassis.name = chassis.name.trim();
        var url = ChassisService_1.WEB_CONTEXT_PATH + "/rest/create";
        return this.http.post(url, JSON.stringify(chassis), { headers: this.headers })
            .toPromise()
            .then(function (response) {
            if (response !== null && response.text()) {
                chassis.id = response.text();
                chassis.healthStatus = 45;
                chassis.complianceStatus = 81;
                return chassis;
            }
            else {
                return null;
            }
        })
            .catch(this.handleError);
    };
    /**
     * Edit the given chassis.
     * @param chassis - the edited chassis.
     */
    ChassisService.prototype.edit = function (chassis) {
        var newChassis = Object.assign(new __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */](), chassis);
        newChassis.name = newChassis.name.trim();
        var url = ChassisService_1.WEB_CONTEXT_PATH + "/rest/edit/";
        return this.http.post(url, JSON.stringify(chassis), { headers: this.headers })
            .toPromise()
            .then(function (response) {
            return (response.text() === "true");
        })
            .catch(this.handleError);
    };
    ChassisService.prototype.delete = function () {
        var url = ChassisService_1.WEB_CONTEXT_PATH + "/rest/delete";
        return this.http.post(url, this.htmlClientSdk.app.getContextObjects(), { headers: this.headers })
            .toPromise()
            .then(function (response) {
            return response.text();
        })
            .catch(this.handleError);
    };
    ChassisService.prototype.getChassis = function (objectId) {
        var dataUrl = ChassisService_1.WEB_CONTEXT_PATH + "/rest/" + objectId;
        return this.http.get(dataUrl, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            var chassis = response.json();
            chassis.healthStatus = 45;
            chassis.complianceStatus = 81;
            return chassis;
        })
            .catch(this.handleError);
    };
    ChassisService.prototype.getAllChassis = function () {
        var listUrl = ChassisService_1.WEB_CONTEXT_PATH + "/rest/list";
        var data;
        return this.http.get(listUrl, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            data = response.json();
            for (var _i = 0, data_1 = data; _i < data_1.length; _i++) {
                var chassis = data_1[_i];
                chassis.healthStatus = 45;
                chassis.complianceStatus = 81;
            }
            return data;
        })
            .catch(this.handleError);
    };
    ChassisService = ChassisService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], ChassisService);
    return ChassisService;
    var ChassisService_1;
}(__WEBPACK_IMPORTED_MODULE_2__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=chassis.service.js.map

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

/***/ "../../../../../src/app/services/settings.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SettingsService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__global_service__ = __webpack_require__("../../../../../src/app/services/global.service.ts");
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


var SettingsService = (function (_super) {
    __extends(SettingsService, _super);
    function SettingsService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    SettingsService_1 = SettingsService;
    SettingsService.prototype.getServerInfos = function () {
        var serverInfosUrl = SettingsService_1.WEB_CONTEXT_PATH + "/rest/serverInfos";
        return this.http.get(serverInfosUrl, { headers: this.headers })
            .toPromise()
            .then(function (response) {
            return response.json();
        })
            .catch(this.handleError);
    };
    /**
     * Property name used to set the number of displayed
     * chassis per page in the local storage.
     * @type {string}
     */
    SettingsService.NUMBER_CHASSIS_PER_PAGE_PROPERTY = "com.vmware.samples.customobject.numberChassisPerPage";
    /**
     *  Default number of chassis displayed in Chassis List per page.
     * @type {number}
     */
    SettingsService.DEFAULT_NUMBER_CHASSIS_PER_PAGE = 10;
    SettingsService = SettingsService_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], SettingsService);
    return SettingsService;
    var SettingsService_1;
}(__WEBPACK_IMPORTED_MODULE_1__global_service__["a" /* GlobalService */]));

//# sourceMappingURL=settings.service.js.map

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
    ValidationUtil = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])()
    ], ValidationUtil);
    return ValidationUtil;
}());

//# sourceMappingURL=validation.js.map

/***/ }),

/***/ "../../../../../src/app/views/actions/create-edit/create-edit.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<form (ngSubmit)=\"onSubmit()\" class=\"modal-content-chassis\">\r\n    <section class=\"form-block\">\r\n        <modal-label-input\r\n                [inputId]=\"'chassisName'\"\r\n                [inputValue]=\"chassis.name\"\r\n                [labelValue]=\"'common.name'\"\r\n                [placeholderValue]=\"'actions.namePlaceholder'\"\r\n                [valueRequired]=\"true\"\r\n                [invalidValue]=\"!isValid() || chassisExists\"\r\n                [invalidValueError]=\"invalidNameError()\"\r\n                (inputValueChanged)=\"nameChanged($event)\">\r\n        </modal-label-input>\r\n\r\n        <modal-label-input\r\n                [inputId]=\"'chassisServerType'\"\r\n                [inputValue]=\"chassis.serverType\"\r\n                [labelValue]=\"'common.serverType'\"\r\n                [placeholderValue]=\"'actions.serverTypePlaceholder'\"\r\n                (inputValueChanged)=\"serverTypeChanged($event)\">\r\n        </modal-label-input>\r\n\r\n        <modal-label-input\r\n                [inputId]=\"'chassisDimensions'\"\r\n                [inputValue]=\"chassis.dimensions\"\r\n                [labelValue]=\"'common.dimensions'\"\r\n                [placeholderValue]=\"'actions.dimensionsPlaceholder'\"\r\n                (inputValueChanged)=\"dimensionsChanged($event)\">\r\n        </modal-label-input>\r\n\r\n        <div class=\"form-group\">\r\n            <label>\r\n                {{ 'common.state' | translate }}:\r\n                <div role=\"tooltip\" aria-haspopup=\"true\" class=\"tooltip tooltip-md tooltip-top-right\">\r\n                    <clr-icon class=\"info-icon\" shape=\"info-circle\" size=\"18\"></clr-icon>\r\n                    <span class=\"tooltip-content\">{{ 'actions.whatCanTheStateBe' | translate }}</span>\r\n                </div>\r\n            </label>\r\n            <clr-checkbox id=\"chassisState\" name=\"state\" [(ngModel)]=\"chassis.isActive \">\r\n                {{ 'common.active' | translate }}\r\n            </clr-checkbox>\r\n        </div>\r\n\r\n        <div class=\"modal-footer\">\r\n            <button class=\"btn\" (click)=\"onCancel()\" id=\"cancelBtn\">{{ 'common.cancel' | translate }}</button>\r\n            <button type=\"submit\" class=\"btn btn-primary\"\r\n                    [disabled]=\"!isValid()\" id=\"saveBtn\">{{ 'common.ok' | translate }}</button>\r\n        </div>\r\n    </section>\r\n</form>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/actions/create-edit/create-edit.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CreateEditComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__create_edit__ = __webpack_require__("../../../../../src/app/views/actions/create-edit/create-edit.ts");
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


/**
 * Represents a form for creating or editing a chassis.
 */
var CreateEditComponent = (function (_super) {
    __extends(CreateEditComponent, _super);
    function CreateEditComponent() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CreateEditComponent.prototype.onSubmit = function () {
        if (this.isEditAction()) {
            this.edit();
        }
        else {
            this.create();
        }
    };
    CreateEditComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/actions/create-edit/create-edit.component.html")
        })
    ], CreateEditComponent);
    return CreateEditComponent;
}(__WEBPACK_IMPORTED_MODULE_1__create_edit__["a" /* CreateEditChassis */]));

//# sourceMappingURL=create-edit.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/actions/create-edit/create-edit.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CreateEditChassis; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_resource_service__ = __webpack_require__("../../../../../src/app/services/resource.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_router__ = __webpack_require__("../../../router/@angular/router.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__services_validation__ = __webpack_require__("../../../../../src/app/services/validation.ts");
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
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};






var CreateEditChassis = (function () {
    function CreateEditChassis(chassisService, resourceService, route) {
        this.chassisService = chassisService;
        this.resourceService = resourceService;
        this.route = route;
        this.action = route.snapshot.url[0].path;
        this.chassis = new __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */]();
        if (this.isEditAction()) {
            Object.assign(this.chassis, this.chassisService.htmlClientSdk.app.getContextObjects()[0]);
        }
    }
    CreateEditChassis.prototype.onCancel = function (result) {
        this.chassisService.htmlClientSdk.modal.close(result);
    };
    CreateEditChassis.prototype.isValid = function () {
        return !__WEBPACK_IMPORTED_MODULE_5__services_validation__["a" /* ValidationUtil */].isNullOrEmpty(this.chassis.name);
    };
    CreateEditChassis.prototype.invalidNameError = function () {
        if (!this.chassisExists) {
            return this.resourceService.getString("actions.create.emptyNameError");
        }
        else {
            return this.resourceService.getString("actions.create.usedNameError");
        }
    };
    CreateEditChassis.prototype.isEditAction = function () {
        return this.action === CreateEditChassis.EDIT_ACTION;
    };
    CreateEditChassis.prototype.nameChanged = function (newValue) {
        this.chassis.name = newValue;
    };
    CreateEditChassis.prototype.serverTypeChanged = function (newValue) {
        this.chassis.serverType = newValue;
    };
    CreateEditChassis.prototype.dimensionsChanged = function (newValue) {
        this.chassis.dimensions = newValue;
    };
    CreateEditChassis.prototype.onCreateChassisFailed = function () {
        this.chassisExists = true;
    };
    CreateEditChassis.prototype.create = function () {
        var _this = this;
        this.chassisExists = false;
        this.chassisService.create(this.chassis)
            .then(function (result) {
            if (result) {
                _this.onCancel(result);
            }
            else {
                _this.onCreateChassisFailed();
            }
        })
            .catch(function () {
            _this.onCancel();
        });
    };
    CreateEditChassis.prototype.edit = function () {
        var _this = this;
        this.chassisService.edit(this.chassis)
            .then(function (chassisObjectUpdated) {
            if (!chassisObjectUpdated) {
                _this.chassisExists = true;
            }
            else {
                _this.onCancel(_this.chassis);
            }
        })
            .catch(function () {
            _this.onCancel();
        });
    };
    CreateEditChassis.EDIT_ACTION = "edit";
    CreateEditChassis = __decorate([
        __param(0, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Inject */])(__WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */])),
        __param(1, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Inject */])(__WEBPACK_IMPORTED_MODULE_3__services_resource_service__["a" /* ResourceService */])),
        __param(2, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Inject */])(__WEBPACK_IMPORTED_MODULE_4__angular_router__["a" /* ActivatedRoute */])),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_3__services_resource_service__["a" /* ResourceService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_resource_service__["a" /* ResourceService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_4__angular_router__["a" /* ActivatedRoute */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__angular_router__["a" /* ActivatedRoute */]) === "function" && _c || Object])
    ], CreateEditChassis);
    return CreateEditChassis;
    var _a, _b, _c;
}());

//# sourceMappingURL=create-edit.js.map

/***/ }),

/***/ "../../../../../src/app/views/actions/create-edit/create-wizard.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<clr-wizard #wizard\r\n            [clrWizardOpen]=\"true\"\r\n            [clrWizardSize]=\"'lg'\"\r\n            [clrWizardPreventModalAnimation]=\"true\"\r\n            class=\"clr-wizard--inline clr-wizard--no-shadow\"\r\n            style=\"height: 500px;\">\r\n\r\n    <clr-wizard-title>Add Chassis</clr-wizard-title>\r\n\r\n    <clr-wizard-button [type]=\"'cancel'\" (click)=\"onCancel()\">{{ 'common.cancel' | translate }}</clr-wizard-button>\r\n    <clr-wizard-button [type]=\"'previous'\">{{ 'common.back' | translate }}</clr-wizard-button>\r\n    <clr-wizard-button [type]=\"'next'\">{{ 'common.next' | translate }}</clr-wizard-button>\r\n    <clr-wizard-button [type]=\"'finish'\">{{ 'common.ok' | translate }}</clr-wizard-button>\r\n\r\n    <clr-wizard-page [clrWizardPageNextDisabled]=\"!isValid()\">\r\n        <ng-template clrPageTitle>\r\n            {{ 'actions.create.wizardPage1' | translate }}\r\n        </ng-template>\r\n        <form>\r\n            <modal-label-input\r\n                    [customStyle]=\"{'padding-left': '120px'}\"\r\n                    [inputId]=\"'chassisName'\"\r\n                    [inputValue]=\"chassis.name\"\r\n                    [labelValue]=\"'common.name'\"\r\n                    [placeholderValue]=\"'actions.namePlaceholder'\"\r\n                    [valueRequired]=\"true\"\r\n                    [invalidValue]=\"!isValid() || chassisExists\"\r\n                    [invalidValueError]=\"invalidNameError()\"\r\n                    (inputValueChanged)=\"nameChanged($event)\">\r\n            </modal-label-input>\r\n\r\n            <modal-label-input\r\n                    [customStyle]=\"{'padding-left': '120px'}\"\r\n                    [inputId]=\"'chassisServerType'\"\r\n                    [inputValue]=\"chassis.serverType\"\r\n                    [labelValue]=\"'common.serverType'\"\r\n                    [placeholderValue]=\"'actions.serverTypePlaceholder'\"\r\n                    (inputValueChanged)=\"serverTypeChanged($event)\">\r\n            </modal-label-input>\r\n        </form>\r\n    </clr-wizard-page>\r\n    <clr-wizard-page>\r\n        <ng-template clrPageTitle>\r\n            {{ 'actions.create.wizardPage2' | translate }}\r\n        </ng-template>\r\n        <form>\r\n            <modal-label-input\r\n                    [customStyle]=\"{'padding-left': '120px'}\"\r\n                    [inputId]=\"'chassisDimensions'\"\r\n                    [inputValue]=\"chassis.dimensions\"\r\n                    [labelValue]=\"'common.dimensions'\"\r\n                    [placeholderValue]=\"'actions.dimensionsPlaceholder'\"\r\n                    (inputValueChanged)=\"dimensionsChanged($event)\">\r\n            </modal-label-input>\r\n\r\n            <div class=\"form-group\" style=\"padding-left: 120px\">\r\n                <label>\r\n                    {{ 'common.state' | translate }}:\r\n                    <div role=\"tooltip\" aria-haspopup=\"true\" class=\"tooltip tooltip-md tooltip-top-right\">\r\n                        <clr-icon class=\"info-icon\" shape=\"info-circle\" size=\"18\"></clr-icon>\r\n                        <span class=\"tooltip-content\">{{ 'actions.whatCanTheStateBe' | translate }}</span>\r\n                    </div>\r\n                </label>\r\n                <clr-checkbox id=\"chassisState\" name=\"state\" [(ngModel)]=\"chassis.isActive \">\r\n                    {{ 'common.active' | translate }}\r\n                </clr-checkbox>\r\n            </div>\r\n        </form>\r\n    </clr-wizard-page>\r\n    <clr-wizard-page #myFinishPage (clrWizardPageOnLoad)=\"loadReadyToCompletePageData()\"\r\n                     clrWizardPagePreventDefault=\"true\"\r\n                     (clrWizardPageOnCommit)=\"onSubmit()\"\r\n                     (clrWizardPageOnCancel)=\"onCancel()\"\r\n                     (clrWizardPagePrevious)=\"onGoBack()\">\r\n        <ng-template clrPageTitle>\r\n            {{ 'actions.create.wizardPage3' | translate }}\r\n        </ng-template>\r\n        <form>\r\n            <clr-alert *ngIf=\"chassisExists\" clrAlertType=\"alert-danger\">\r\n                <div class=\"alert-item\">\r\n                    {{ 'actions.create.usedNameError' | translate }}\r\n                </div>\r\n            </clr-alert>\r\n            <form>\r\n                <div class=\"form-group\" style=\"margin-bottom: 0px\">\r\n                    <span>{{ 'common.name' | translate }}:</span>\r\n                    <span>{{readyToCompleteData.name}}</span>\r\n                </div>\r\n                <div class=\"form-group\" style=\"margin-bottom: 0px\">\r\n                    <span>{{ 'common.serverType' | translate }}:</span>\r\n                    <span>{{readyToCompleteData.serverType}}</span>\r\n                </div>\r\n                <div class=\"form-group\" style=\"margin-bottom: 0px\">\r\n                    <span>{{ 'common.dimensions' | translate }}:</span>\r\n                    <span>{{readyToCompleteData.dimensions}}</span>\r\n                </div>\r\n                <div class=\"form-group\" style=\"margin-bottom: 0px\">\r\n                    <span>{{ 'common.state' | translate }}:</span>\r\n                    <span>\r\n                    <chassis-status [isActive]=\"readyToCompleteData.state\"></chassis-status>\r\n                </span>\r\n                </div>\r\n            </form>\r\n        </form>\r\n    </clr-wizard-page>\r\n</clr-wizard>"

/***/ }),

/***/ "../../../../../src/app/views/actions/create-edit/create-wizard.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CreateWizardComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_clarity_angular__ = __webpack_require__("../../../../clarity-angular/clarity-angular.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__create_edit__ = __webpack_require__("../../../../../src/app/views/actions/create-edit/create-edit.ts");
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
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var CreateWizardComponent = (function (_super) {
    __extends(CreateWizardComponent, _super);
    function CreateWizardComponent() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.readyToCompleteData = {};
        return _this;
    }
    CreateWizardComponent.prototype.formatEmptyOrNullValue = function (value) {
        if (value == null || value.trim() == "") {
            return "--";
        }
        return value;
    };
    CreateWizardComponent.prototype.loadReadyToCompletePageData = function () {
        this.readyToCompleteData = {
            name: this.chassis.name,
            serverType: this.formatEmptyOrNullValue(this.chassis.serverType),
            dimensions: this.formatEmptyOrNullValue(this.chassis.dimensions),
            state: this.chassis.isActive
        };
    };
    CreateWizardComponent.prototype.onCreateChassisFailed = function () {
        _super.prototype.onCreateChassisFailed.call(this);
        this.finishPage.completed = false;
    };
    CreateWizardComponent.prototype.onSubmit = function () {
        this.finishPage.completed = true;
        this.create();
    };
    CreateWizardComponent.prototype.onGoBack = function () {
        this.wizard.previous();
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_16" /* ViewChild */])("wizard"),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1_clarity_angular__["b" /* Wizard */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_clarity_angular__["b" /* Wizard */]) === "function" && _a || Object)
    ], CreateWizardComponent.prototype, "wizard", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_16" /* ViewChild */])("myFinishPage"),
        __metadata("design:type", typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1_clarity_angular__["c" /* WizardPage */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_clarity_angular__["c" /* WizardPage */]) === "function" && _b || Object)
    ], CreateWizardComponent.prototype, "finishPage", void 0);
    CreateWizardComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/actions/create-edit/create-wizard.component.html"),
            styles: ["\n         .appContent {\n            padding: 0 0 0 0 !important;\n         }\n      "],
            encapsulation: __WEBPACK_IMPORTED_MODULE_0__angular_core__["_19" /* ViewEncapsulation */].None
        })
    ], CreateWizardComponent);
    return CreateWizardComponent;
    var _a, _b;
}(__WEBPACK_IMPORTED_MODULE_2__create_edit__["a" /* CreateEditChassis */]));

//# sourceMappingURL=create-wizard.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/actions/delete/delete.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<form (ngSubmit)=\"onSubmit()\" class=\"modal-content-delete\" #deleteChassisForm=\"ngForm\">\r\n    <div class=\"modal-body content\">\r\n        {{ 'actions.delete.deleteTheChassis' | translate }}?\r\n    </div>\r\n    <div class=\"modal-footer\">\r\n        <button class=\"btn\" type=\"button\" (click)=\"onCancel()\">{{ 'common.no' | translate }}</button>\r\n        <button class=\"btn btn-primary\" type=\"submit\">{{ 'common.yes' | translate }}</button>\r\n    </div>\r\n</form>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/actions/delete/delete.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DeleteComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
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


var DeleteComponent = (function () {
    function DeleteComponent(chassisService) {
        this.chassisService = chassisService;
    }
    DeleteComponent.prototype.onSubmit = function () {
        var _this = this;
        this.chassisService.delete()
            .then(function (result) {
            _this.chassisService.htmlClientSdk.modal.close(result);
        })
            .catch(function () {
            _this.chassisService.htmlClientSdk.modal.close();
        });
    };
    DeleteComponent.prototype.onCancel = function () {
        this.chassisService.htmlClientSdk.modal.close();
    };
    DeleteComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: '[delete-dialog-content]',
            template: __webpack_require__("../../../../../src/app/views/actions/delete/delete.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__["a" /* ChassisService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__["a" /* ChassisService */]) === "function" && _a || Object])
    ], DeleteComponent);
    return DeleteComponent;
    var _a;
}());

//# sourceMappingURL=delete.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/actions/vm/vm-action-modal.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<form (ngSubmit)=\"closeModal()\" class=\"vm-action-modal-content\">\r\n    <section class=\"form-block\">\r\n        <modal-label-input\r\n                [inputId]=\"'name'\"\r\n                [labelValue]=\"'common.name'\">\r\n        </modal-label-input>\r\n        <modal-label-input\r\n                [inputId]=\"'type'\"\r\n                [labelValue]=\"'common.serverType'\">\r\n        </modal-label-input>\r\n\r\n        <div class=\"modal-footer\">\r\n            <button class=\"btn\" (click)=\"closeModal()\" id=\"cancelBtn\">{{ 'common.cancel' | translate }}</button>\r\n            <button type=\"submit\" class=\"btn btn-primary\" id=\"okBtn\">{{ 'common.ok' | translate }}</button>\r\n        </div>\r\n    </section>\r\n</form>"

/***/ }),

/***/ "../../../../../src/app/views/actions/vm/vm-action-modal.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return VmActionModalComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
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


var VmActionModalComponent = (function () {
    function VmActionModalComponent(chassisService) {
        this.chassisService = chassisService;
    }
    VmActionModalComponent.prototype.closeModal = function () {
        this.chassisService.htmlClientSdk.modal.close();
    };
    VmActionModalComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/actions/vm/vm-action-modal.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__["a" /* ChassisService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__["a" /* ChassisService */]) === "function" && _a || Object])
    ], VmActionModalComponent);
    return VmActionModalComponent;
    var _a;
}());

//# sourceMappingURL=vm-action-modal.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/details-view/details-view.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<custom-header [chassis]=\"chassis\"\r\n      (chassisUpdated)=\"onChassisUpdated($event)\"\r\n      (chassisDeleted)=\"onChassisDeleted($event)\"></custom-header>\r\n<clr-tabs>\r\n   <clr-tab>\r\n      <button clrTabLink>{{ 'main.summary' | translate }}</button>\r\n      <clr-tab-content *clrIfActive>\r\n         <summary-view [chassis]=\"chassis\"></summary-view>\r\n      </clr-tab-content>\r\n   </clr-tab>\r\n\r\n   <clr-tab>\r\n      <button clrTabLink>{{ 'main.monitor' | translate }}</button>\r\n      <clr-tab-content *clrIfActive>\r\n         <monitor-view [chassis]=\"chassis\"\r\n               (chassisUpdated)=\"onChassisUpdated($event)\"></monitor-view>\r\n      </clr-tab-content>\r\n   </clr-tab>\r\n\r\n   <clr-tab>\r\n      <button clrTabLink>{{ 'main.configure' | translate }}</button>\r\n      <clr-tab-content *clrIfActive>\r\n         <configure-view [chassis]=\"chassis\"\r\n               (chassisUpdated)=\"onChassisUpdated($event)\"></configure-view>\r\n      </clr-tab-content>\r\n   </clr-tab>\r\n   <clr-tab>\r\n      <button clrTabLink>{{ 'vsphere.objects.hosts' | translate }}</button>\r\n      <clr-tab-content *clrIfActive>\r\n         <hosts-list-view></hosts-list-view>\r\n      </clr-tab-content>\r\n   </clr-tab>\r\n\r\n</clr-tabs>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/details-view/details-view.component.scss":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(true);
// imports


// module
exports.push([module.i, "/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\n:host {\n  display: block; }\n", "", {"version":3,"sources":["C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/details-view/C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/details-view/details-view.component.scss"],"names":[],"mappings":"AAAA,wDAAwD;AAExD;EACG,eAAc,EAChB","file":"details-view.component.scss","sourcesContent":["/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\r\n\r\n:host {\r\n   display: block;\r\n}\r\n"],"sourceRoot":""}]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/views/details-view/details-view.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DetailsViewComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
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


var DetailsViewComponent = (function () {
    function DetailsViewComponent() {
        this.chassisUpdated = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
        this.chassisDeleted = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    DetailsViewComponent.prototype.onChassisUpdated = function (chassis) {
        this.chassis = chassis;
        this.chassisUpdated.emit(chassis);
    };
    DetailsViewComponent.prototype.onChassisDeleted = function (chassis) {
        this.chassisDeleted.emit(chassis);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */]) === "function" && _a || Object)
    ], DetailsViewComponent.prototype, "chassis", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", Object)
    ], DetailsViewComponent.prototype, "chassisUpdated", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", Object)
    ], DetailsViewComponent.prototype, "chassisDeleted", void 0);
    DetailsViewComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: "details-view",
            template: __webpack_require__("../../../../../src/app/views/details-view/details-view.component.html"),
            styles: [__webpack_require__("../../../../../src/app/views/details-view/details-view.component.scss")]
        })
    ], DetailsViewComponent);
    return DetailsViewComponent;
    var _a;
}());

//# sourceMappingURL=details-view.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/header/header.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<div *ngIf=\"chassis\">\r\n   <span class=\"chassis-title\">{{chassis.name}}</span>\r\n   <clr-dropdown [clrCloseMenuOnItemClick]=\"true\">\r\n      <button type=\"button\" class=\"dropdown-toggle btn btn-link\" clrDropdownTrigger>\r\n         {{ 'common.actions' | translate }}\r\n         <clr-icon shape=\"caret down\" class=\"is-info\"></clr-icon>\r\n      </button>\r\n      <clr-dropdown-menu>\r\n         <button type=\"button\" clrDropdownItem (click)=\"onEdit()\"><clr-icon shape=\"edit\"></clr-icon> {{ 'common.edit' | translate }}</button>\r\n         <button type=\"button\" clrDropdownItem (click)=\"onDelete()\"><clr-icon shape=\"times-circle\"></clr-icon> {{ 'common.delete' | translate }}</button>\r\n         <button type=\"button\" class=\"btn btn-link\" clrDropdownItem [ngClass]=\"(chassis.isActive) ? 'disabled' : 'enabled'\"\r\n                 (click)=\"(!chassis.isActive) ? onActivate() : null\">\r\n            <clr-icon shape=\"check\"></clr-icon>\r\n            {{ 'common.activate' | translate }}\r\n         </button>\r\n      </clr-dropdown-menu>\r\n   </clr-dropdown>\r\n\r\n   <clr-alert [clrAlertType]=\"'alert-success'\" [clrAlertSizeSmall]=\"true\" (clrAlertClosedChange)=\"onAlertClose()\" *ngIf=\"this.showAlert\">\r\n      <div class=\"alert-item\">\r\n           <span class=\"alert-text\">\r\n               {{ 'header.theChassisIsNowActive' | translate }}\r\n           </span>\r\n      </div>\r\n   </clr-alert>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/header/header.component.scss":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(true);
// imports


// module
exports.push([module.i, "/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\n.chassis-title {\n  margin-right: 20px; }\n", "", {"version":3,"sources":["C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/header/C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/header/header.component.scss"],"names":[],"mappings":"AAAA,wDAAwD;AAExD;EACG,mBAAkB,EACpB","file":"header.component.scss","sourcesContent":["/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\r\n\r\n.chassis-title {\r\n   margin-right: 20px;\r\n}\r\n"],"sourceRoot":""}]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/views/header/header.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HeaderComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_modal_service__ = __webpack_require__("../../../../../src/app/services/modal.service.ts");
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




var HeaderComponent = (function () {
    function HeaderComponent(zone, chassisService, modalService) {
        this.zone = zone;
        this.chassisService = chassisService;
        this.modalService = modalService;
        this.chassisUpdated = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
        this.chassisDeleted = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    HeaderComponent.prototype.ngOnInit = function () {
        this.showAlert = false;
    };
    HeaderComponent.prototype.onDelete = function () {
        var _this = this;
        var config = this.modalService.createDeleteConfig();
        config.contextObjects = [this.chassis.id];
        config.onClosed = function (result) {
            if (result) {
                _this.zone.run(function () {
                    _this.chassisDeleted.emit(_this.chassis);
                });
            }
        };
        this.chassisService.htmlClientSdk.modal.open(config);
    };
    HeaderComponent.prototype.onEdit = function () {
        var _this = this;
        var config = this.modalService.createEditConfig();
        config.contextObjects = [Object.assign(new __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */](), this.chassis)];
        config.onClosed = function (result) {
            if (result) {
                _this.zone.run(function () {
                    _this.chassis = result;
                    _this.chassisUpdated.emit(_this.chassis);
                });
            }
        };
        this.chassisService.htmlClientSdk.modal.open(config);
    };
    HeaderComponent.prototype.onActivate = function () {
        var _this = this;
        var newChassis = Object.assign(new __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */](), this.chassis);
        newChassis.isActive = true;
        this.chassisService.edit(newChassis)
            .then(function () {
            _this.showAlert = true;
            _this.chassis = Object.assign(new __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */](), _this.chassis);
            _this.chassis.isActive = true;
            _this.chassisUpdated.emit(_this.chassis);
        })
            .catch(function () {
        });
    };
    HeaderComponent.prototype.onAlertClose = function () {
        this.showAlert = false;
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */]) === "function" && _a || Object)
    ], HeaderComponent.prototype, "chassis", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", Object)
    ], HeaderComponent.prototype, "chassisUpdated", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", Object)
    ], HeaderComponent.prototype, "chassisDeleted", void 0);
    HeaderComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: "custom-header",
            template: __webpack_require__("../../../../../src/app/views/header/header.component.html"),
            styles: [__webpack_require__("../../../../../src/app/views/header/header.component.scss")],
        }),
        __metadata("design:paramtypes", [typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_3__services_modal_service__["a" /* ModalConfigService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_modal_service__["a" /* ModalConfigService */]) === "function" && _d || Object])
    ], HeaderComponent);
    return HeaderComponent;
    var _a, _b, _c, _d;
}());

//# sourceMappingURL=header.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/list/list.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<div class=\"spinner-overlay \" *ngIf=\"loading\">\r\n   <span class=\"spinner\"></span>\r\n</div>\r\n<div class=\"viewTitle\">{{ 'list.chassisList' | translate }}</div>\r\n<div class=\"chassis-list-view\">\r\n   <div class=\"chassises-datagrid-container\">\r\n      <clr-datagrid [(clrDgSelected)]=\"selectedChassis\"\r\n            [clDgRowSelection]=\"true\">\r\n         <clr-dg-placeholder>{{ 'list.noData' | translate }}\r\n         </clr-dg-placeholder>\r\n         <clr-dg-action-bar>\r\n            <div class=\"btn-group\">\r\n               <button type=\"button\" class=\"btn btn-sm btn-secondary\"\r\n                     (click)=\"onAdd()\">\r\n                  <clr-icon shape=\"plus\"></clr-icon>\r\n                  {{ 'list.addChassis' | translate }}\r\n               </button>\r\n               <button type=\"button\" class=\"btn btn-sm btn-secondary\"\r\n                     (click)=\"onAddWizard()\">\r\n                  <clr-icon shape=\"plus\"></clr-icon>\r\n                  {{ 'list.addChassisWizard' | translate }}\r\n               </button>\r\n               <button type=\"button\" class=\"btn btn-sm btn-secondary\"\r\n                     (click)=\"onEdit()\"\r\n                     [disabled]=\"selectedChassis.length != 1\">\r\n                  <clr-icon shape=\"pencil\"></clr-icon>\r\n                  {{ 'common.edit' | translate }}\r\n               </button>\r\n               <button type=\"button\" class=\"btn btn-sm btn-secondary\"\r\n                     (click)=\"onDelete()\"\r\n                     [disabled]=\"selectedChassis.length <= 0\">\r\n                  <clr-icon shape=\"times-circle\"></clr-icon>\r\n                  {{ 'common.delete' | translate }}\r\n               </button>\r\n            </div>\r\n         </clr-dg-action-bar>\r\n\r\n         <clr-dg-column>{{ 'common.name' | translate }}</clr-dg-column>\r\n         <clr-dg-column>{{ 'common.state' | translate }}</clr-dg-column>\r\n\r\n         <clr-dg-row *clrDgItems=\"let chassis of chassisList\"\r\n               [clrDgItem]=\"chassis\">\r\n            <clr-dg-cell>\r\n               <clr-icon shape=\"chassisIcon\"></clr-icon>\r\n               <span (contextmenu)=\"onContextMenu()\">{{chassis.name}}</span>\r\n            </clr-dg-cell>\r\n            <clr-dg-cell>\r\n               <chassis-status [isActive]=\"chassis.isActive\"></chassis-status>\r\n            </clr-dg-cell>\r\n         </clr-dg-row>\r\n         <clr-dg-footer>\r\n            <clr-dg-pagination #pagination\r\n                  [clrDgPageSize]=\"numberOfChassisPerPage\"></clr-dg-pagination>\r\n         </clr-dg-footer>\r\n      </clr-datagrid>\r\n   </div>\r\n   <div class=\"splitter\"></div>\r\n   <div class=\"details-container\">\r\n      <div *ngIf=\"selectedChassis.length === 0\" class=\"details-message\">{{\r\n         'list.noObjectsSelected' | translate }}\r\n      </div>\r\n      <div *ngIf=\"selectedChassis.length > 1\" class=\"details-message\">{{\r\n         'list.multipleObjectsSelected' | translate }}\r\n      </div>\r\n      <details-view [chassis]=\"selectedChassis[0]\"\r\n            *ngIf=\"selectedChassis.length === 1\"\r\n            (chassisUpdated)=\"onChassisUpdated($event)\"\r\n            (chassisDeleted)=\"onChassisDeleted($event)\"></details-view>\r\n   </div>\r\n</div>\r\n\r\n"

/***/ }),

/***/ "../../../../../src/app/views/list/list.component.scss":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(true);
// imports


// module
exports.push([module.i, "/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\n:host {\n  position: relative;\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-direction: column;\n      flex-direction: column;\n  width: 100%;\n  height: 100%;\n  min-height: 100%; }\n\n.chassis-list-view {\n  -ms-flex: 1 1 auto;\n      flex: 1 1 auto;\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-direction: row;\n      flex-direction: row;\n  width: 100%;\n  height: 100%; }\n\n.datagrid-container {\n  -ms-flex: 0 0 auto;\n      flex: 0 0 auto;\n  margin-right: 40px; }\n\nclr-datagrid {\n  margin-top: -7px;\n  min-width: 400px;\n  height: auto !important; }\n\n.details-container {\n  -ms-flex: 1 1 100%;\n      flex: 1 1 100%; }\n\n.details-message {\n  display: -ms-flexbox;\n  display: flex;\n  width: 100%;\n  height: 100%;\n  -ms-flex-align: center;\n      align-items: center;\n  -ms-flex-pack: center;\n      justify-content: center; }\n\n.splitter {\n  -ms-flex: 0 0 auto;\n      flex: 0 0 auto;\n  width: 1px;\n  margin: 0 20px;\n  background-color: var(--border-color); }\n\n.spinner-overlay {\n  position: absolute;\n  z-index: 1;\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-align: center;\n      align-items: center;\n  -ms-flex-pack: center;\n      justify-content: center;\n  width: 100%;\n  height: 100%;\n  pointer-events: auto;\n  background: var(--overlay-color); }\n", "", {"version":3,"sources":["C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/list/C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/list/list.component.scss"],"names":[],"mappings":"AAAA,wDAAwD;AAExD;EACG,mBAAkB;EAClB,qBAAa;EAAb,cAAa;EACb,2BAAsB;MAAtB,uBAAsB;EACtB,YAAW;EACX,aAAY;EACZ,iBAAgB,EAClB;;AAED;EACG,mBAAc;MAAd,eAAc;EACd,qBAAa;EAAb,cAAa;EACb,wBAAmB;MAAnB,oBAAmB;EACnB,YAAW;EACX,aAAY,EACd;;AAED;EACG,mBAAc;MAAd,eAAc;EACd,mBAAkB,EACpB;;AAED;EACG,iBAAgB;EAChB,iBAAgB;EAChB,wBAAuB,EACzB;;AAED;EACG,mBAAc;MAAd,eAAc,EAChB;;AAED;EACG,qBAAa;EAAb,cAAa;EACb,YAAW;EACX,aAAY;EACZ,uBAAmB;MAAnB,oBAAmB;EACnB,sBAAuB;MAAvB,wBAAuB,EACzB;;AAED;EACG,mBAAc;MAAd,eAAc;EACd,WAAU;EACV,eAAc;EACd,sCAAqC,EACvC;;AAED;EACG,mBAAkB;EAClB,WAAU;EACV,qBAAa;EAAb,cAAa;EACb,uBAAmB;MAAnB,oBAAmB;EACnB,sBAAuB;MAAvB,wBAAuB;EACvB,YAAW;EACX,aAAY;EACZ,qBAAoB;EACpB,iCAAgC,EAClC","file":"list.component.scss","sourcesContent":["/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\r\n\r\n:host {\r\n   position: relative;\r\n   display: flex;\r\n   flex-direction: column;\r\n   width: 100%;\r\n   height: 100%;\r\n   min-height: 100%;\r\n}\r\n\r\n.chassis-list-view {\r\n   flex: 1 1 auto;\r\n   display: flex;\r\n   flex-direction: row;\r\n   width: 100%;\r\n   height: 100%;\r\n}\r\n\r\n.datagrid-container {\r\n   flex: 0 0 auto;\r\n   margin-right: 40px;\r\n}\r\n\r\nclr-datagrid {\r\n   margin-top: -7px;\r\n   min-width: 400px;\r\n   height: auto !important;\r\n}\r\n\r\n.details-container {\r\n   flex: 1 1 100%;\r\n}\r\n\r\n.details-message {\r\n   display: flex;\r\n   width: 100%;\r\n   height: 100%;\r\n   align-items: center;\r\n   justify-content: center;\r\n}\r\n\r\n.splitter {\r\n   flex: 0 0 auto;\r\n   width: 1px;\r\n   margin: 0 20px;\r\n   background-color: var(--border-color);\r\n}\r\n\r\n.spinner-overlay {\r\n   position: absolute;\r\n   z-index: 1;\r\n   display: flex;\r\n   align-items: center;\r\n   justify-content: center;\r\n   width: 100%;\r\n   height: 100%;\r\n   pointer-events: auto;\r\n   background: var(--overlay-color);\r\n}"],"sourceRoot":""}]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/views/list/list.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ListComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_modal_service__ = __webpack_require__("../../../../../src/app/services/modal.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_settings_service__ = __webpack_require__("../../../../../src/app/services/settings.service.ts");
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





var ListComponent = (function () {
    function ListComponent(zone, chassisService, modalService) {
        this.zone = zone;
        this.chassisService = chassisService;
        this.modalService = modalService;
        this.loading = false;
        this.onContextMenu = ListComponent_1.preventContextMenu;
    }
    ListComponent_1 = ListComponent;
    ListComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.chassisMap = new Map();
        this.selectedChassis = [];
        this.numberOfChassisPerPage = __WEBPACK_IMPORTED_MODULE_4__services_settings_service__["a" /* SettingsService */].DEFAULT_NUMBER_CHASSIS_PER_PAGE;
        var persistedNumberOfChassisPerPage = parseInt(localStorage.getItem(__WEBPACK_IMPORTED_MODULE_4__services_settings_service__["a" /* SettingsService */].NUMBER_CHASSIS_PER_PAGE_PROPERTY));
        if (persistedNumberOfChassisPerPage && persistedNumberOfChassisPerPage > 0) {
            this.numberOfChassisPerPage = persistedNumberOfChassisPerPage;
        }
        this.chassisService.htmlClientSdk.event.onGlobalRefresh(function () {
            if (_this.loading) {
                return;
            }
            _this.zone.run(function () {
                _this.refresh();
            });
        });
        this.refresh();
    };
    ListComponent.prototype.onAdd = function () {
        var _this = this;
        var config = this.modalService.createAddConfig();
        config.onClosed = function (result) {
            if (result) {
                _this.zone.run(function () {
                    _this.chassisMap.set(result.id, result);
                });
            }
        };
        this.chassisService.htmlClientSdk.modal.open(config);
    };
    ListComponent.prototype.onAddWizard = function () {
        var _this = this;
        var config = this.modalService.createAddWizardConfig();
        config.onClosed = function (result) {
            if (result) {
                _this.zone.run(function () {
                    _this.chassisMap.set(result.id, result);
                });
            }
        };
        this.chassisService.htmlClientSdk.modal.open(config);
    };
    ListComponent.prototype.onDelete = function () {
        var _this = this;
        var config = this.modalService.createDeleteConfig();
        config.contextObjects = this.selectedChassis.map(function (value) {
            return value.id;
        });
        config.onClosed = function (result) {
            if (result) {
                _this.zone.run(function () {
                    /*
                       Copy the collection so that we don't modify it while
                       traversing it, because this leads to bugs i.e. some
                       items not being removed from the collection (this is a
                       common iterator problem)
                     */
                    _this.selectedChassis.concat().forEach(function (item) {
                        _this.onChassisDeleted(item);
                    });
                });
            }
        };
        this.chassisService.htmlClientSdk.modal.open(config);
    };
    ListComponent.prototype.onEdit = function () {
        var _this = this;
        var config = this.modalService.createEditConfig();
        config.contextObjects = this.selectedChassis.map(function (value) {
            return Object.assign(new __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */](), value);
        });
        config.onClosed = function (result) {
            if (result) {
                _this.zone.run(function () {
                    _this.onChassisUpdated(result);
                });
            }
        };
        this.chassisService.htmlClientSdk.modal.open(config);
    };
    Object.defineProperty(ListComponent.prototype, "chassisList", {
        /**
         * Returns array of chassis objects.
         */
        get: function () {
            if (this.chassisMap) {
                return Array.from(this.chassisMap.values());
            }
            return null;
        },
        enumerable: true,
        configurable: true
    });
    ListComponent.prototype.onChassisUpdated = function (chassis) {
        this.chassisMap.set(chassis.id, chassis);
        for (var i = 0; i < this.selectedChassis.length; i++) {
            var selectedChassis = this.selectedChassis[i];
            if (selectedChassis.id !== chassis.id) {
                continue;
            }
            this.selectedChassis[i] = chassis;
            break;
        }
    };
    ListComponent.prototype.onChassisDeleted = function (chassis) {
        this.chassisMap.delete(chassis.id);
        for (var i = 0; i < this.selectedChassis.length; i++) {
            var selectedChassis = this.selectedChassis[i];
            if (selectedChassis.id !== chassis.id) {
                continue;
            }
            this.selectedChassis.splice(i, 1);
            break;
        }
    };
    /**
     * Refresh the list of chassis objects.
     */
    ListComponent.prototype.refresh = function () {
        var _this = this;
        this.loading = true;
        this.chassisService.getAllChassis().then(function (result) {
            _this.loading = false;
            var oldSelectedChassisIds = {};
            _this.selectedChassis.forEach(function (item) { return oldSelectedChassisIds[item.id] = undefined; });
            _this.selectedChassis = [];
            _this.chassisMap = new Map();
            result.forEach(function (item) {
                _this.chassisMap.set(item.id, item);
                if (oldSelectedChassisIds.hasOwnProperty(item.id)) {
                    _this.selectedChassis.push(item);
                }
            });
        });
    };
    ListComponent.preventContextMenu = function () {
        return false;
    };
    ListComponent = ListComponent_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/list/list.component.html"),
            styles: [__webpack_require__("../../../../../src/app/views/list/list.component.scss")]
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_3__services_modal_service__["a" /* ModalConfigService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_modal_service__["a" /* ModalConfigService */]) === "function" && _c || Object])
    ], ListComponent);
    return ListComponent;
    var ListComponent_1, _a, _b, _c;
}());

//# sourceMappingURL=list.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/modal-label-input/modal-label-input.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<div class=\"form-group\" [ngStyle]=\"customStyle\">\r\n    <label for=\"{{inputId}}\" class=\"{{valueRequired? 'required' : ''}}\">{{labelValue | translate}}</label>\r\n    <input *ngIf=\"!valueRequired\"\r\n           type=\"text\"\r\n           id=\"{{inputId}}\"\r\n           size=\"{{inputSize}}\"\r\n           placeholder=\"{{placeholderValue | translate}}\"\r\n           [ngModel]=\"inputValue\"\r\n           (ngModelChange)=\"onInputValueChanged($event)\">\r\n\r\n    <label *ngIf=\"valueRequired\"\r\n           for=\"{{inputId}}_with_tooltip\"\r\n           [class.invalid]=\"invalidValue\"\r\n           aria-haspopup=\"true\" role=\"tooltip\"\r\n           class=\"tooltip tooltip-validation tooltip-bottom-left tooltip-md\">\r\n        <input type=\"text\"\r\n               id=\"{{inputId}}_with_tooltip\"\r\n               size=\"{{inputSize}}\"\r\n               placeholder=\"{{placeholderValue | translate}}\"\r\n               [ngModel]=\"inputValue\"\r\n               (ngModelChange)=\"onInputValueChanged($event)\" required>\r\n        <span class=\"tooltip-content\">\r\n            {{invalidValueError}}\r\n        </span>\r\n    </label>\r\n</div>\r\n"

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

/***/ "../../../../../src/app/views/settings/settings.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<div class=\"viewTitle\">{{ 'common.settings' | translate }}</div>\r\n\r\n<div class=\"alert alert-success\" *ngIf=\"showSuccessMessage\">\r\n    <div class=\"alert-items\">\r\n        <div class=\"alert-item static\">\r\n            <div class=\"alert-icon-wrapper\">\r\n                <clr-icon class=\"alert-icon\" shape=\"check-circle\"></clr-icon>\r\n            </div>\r\n            <span class=\"alert-text\">\r\n                {{ 'settings.theNumberOfDisplayedChassisPerPage' | translate }}\r\n                '{{numberOfChassisPerPage}}' {{ 'settings.wasUpdatedInTheWebLocalStorage' | translate }}.\r\n            </span>\r\n        </div>\r\n    </div>\r\n</div>\r\n<div style=\"direction: rtl\">\r\n    <button class=\"btn btn-sm\" (click)=\"onUpdate()\">{{ 'common.update' | translate }}</button>\r\n</div>\r\n<clr-stack-view>\r\n    <clr-stack-block>\r\n        <clr-stack-label>{{ 'settings.numberOfChassisPerPage' | translate }}</clr-stack-label>\r\n        <clr-stack-content>\r\n            <span>\r\n            <input type=\"number\" min=\"1\" max=\"20\"  [(ngModel)]=\"numberOfChassisPerPage\"/>\r\n                </span>\r\n        </clr-stack-content>\r\n    </clr-stack-block>\r\n</clr-stack-view>\r\n\r\n<clr-stack-view>\r\n    <clr-stack-header>\r\n        <clr-dropdown>\r\n            <button type=\"button\" class=\"dropdown-toggle btn btn-link\" clrDropdownTrigger>\r\n                {{ 'vsphere.vcenterSelector' | translate }}\r\n                <clr-icon shape=\"caret down\"></clr-icon>\r\n            </button>\r\n            <clr-dropdown-menu *clrIfOpen>\r\n                <div *ngIf=\"loading\" style=\"display: flex; justify-content: center\">\r\n                    <span class=\"spinner spinner-md\"></span>\r\n                </div>\r\n                <div *ngIf=\"!loading\">\r\n                    <h4 class=\"dropdown-header\">{{ 'vsphere.vcSelectMessage' | translate }}:</h4>\r\n                    <button type=\"button\"\r\n                            *ngFor=\"let serverName of serverNames\"\r\n                            (click)=\"showVcInfo(serverName)\" clrDropdownItem>\r\n                        {{ serverName }}\r\n                    </button>\r\n                </div>\r\n            </clr-dropdown-menu>\r\n        </clr-dropdown>\r\n    </clr-stack-header>\r\n    <clr-stack-block>\r\n        <clr-stack-label>{{ 'vsphere.vcName' | translate }}:</clr-stack-label>\r\n        <clr-stack-content *ngIf=\"selectedServerInfo\">{{selectedServerInfo.name}}\r\n        </clr-stack-content>\r\n    </clr-stack-block>\r\n    <clr-stack-block>\r\n        <clr-stack-label>{{ 'vsphere.vcGuid' | translate }}:</clr-stack-label>\r\n        <clr-stack-content *ngIf=\"selectedServerInfo\">{{selectedServerInfo.guid}}\r\n        </clr-stack-content>\r\n    </clr-stack-block>\r\n</clr-stack-view>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/settings/settings.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SettingsComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_settings_service__ = __webpack_require__("../../../../../src/app/services/settings.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
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



var SettingsComponent = (function () {
    function SettingsComponent(settingsService, zone, chassisService) {
        this.settingsService = settingsService;
        this.zone = zone;
        this.chassisService = chassisService;
        this.numberOfChassisPerPage = __WEBPACK_IMPORTED_MODULE_1__services_settings_service__["a" /* SettingsService */].DEFAULT_NUMBER_CHASSIS_PER_PAGE;
        this.showSuccessMessage = false;
        this.loading = false;
    }
    SettingsComponent.prototype.ngOnInit = function () {
        var _this = this;
        var value = parseInt(localStorage.getItem(__WEBPACK_IMPORTED_MODULE_1__services_settings_service__["a" /* SettingsService */].NUMBER_CHASSIS_PER_PAGE_PROPERTY));
        if (value && value > 0) {
            this.numberOfChassisPerPage = value;
        }
        this.chassisService.htmlClientSdk.event.onGlobalRefresh(function () {
            _this.zone.run(function () {
                _this.setServerInfos();
            });
        });
        this.setServerInfos();
    };
    /**
     * Sets the new value in the local storage.
     * @param numberChassisPerPage -
     * number of chassis displayed in the chassis list per page.
     */
    SettingsComponent.prototype.setNumberChassisPerPageInLocalStorage = function (numberChassisPerPage) {
        localStorage.setItem(__WEBPACK_IMPORTED_MODULE_1__services_settings_service__["a" /* SettingsService */].NUMBER_CHASSIS_PER_PAGE_PROPERTY, numberChassisPerPage.toString());
    };
    /**
     * Triggered when user clicks on "Update" button.
     */
    SettingsComponent.prototype.onUpdate = function () {
        var value = parseInt(this.numberOfChassisPerPage.toString());
        if (value === Number.NaN || value <= 0) {
            value = __WEBPACK_IMPORTED_MODULE_1__services_settings_service__["a" /* SettingsService */].DEFAULT_NUMBER_CHASSIS_PER_PAGE;
        }
        this.numberOfChassisPerPage = value;
        this.setNumberChassisPerPageInLocalStorage(value);
        this.showSuccessMessage = true;
    };
    SettingsComponent.prototype.setServerInfos = function () {
        var _this = this;
        this.loading = true;
        this.settingsService.getServerInfos().then(function (result) {
            _this.serverInfos = result;
            _this.serverNames = Object.keys(_this.serverInfos).sort();
            _this.loading = false;
        });
    };
    SettingsComponent.prototype.showVcInfo = function (serverName) {
        this.selectedServerInfo = {
            name: serverName,
            guid: this.serverInfos[serverName]
        };
    };
    SettingsComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            template: __webpack_require__("../../../../../src/app/views/settings/settings.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_settings_service__["a" /* SettingsService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_settings_service__["a" /* SettingsService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_chassis_service__["a" /* ChassisService */]) === "function" && _c || Object])
    ], SettingsComponent);
    return SettingsComponent;
    var _a, _b, _c;
}());

//# sourceMappingURL=settings.component.js.map

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

/***/ "../../../../../src/app/views/tabs/configure/additional/additional-view.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<div>\r\n   {{ 'tabs.configure.additional.provideYourAdditionalSettingsHere' | translate }}.\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/tabs/configure/additional/additional-view.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AdditionalViewComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* Copyright (c) 2018 VMware, Inc. All rights reserved. */
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AdditionalViewComponent = (function () {
    function AdditionalViewComponent() {
    }
    AdditionalViewComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: 'additional-view',
            template: __webpack_require__("../../../../../src/app/views/tabs/configure/additional/additional-view.component.html")
        })
    ], AdditionalViewComponent);
    return AdditionalViewComponent;
}());

//# sourceMappingURL=additional-view.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/tabs/configure/configure.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<div class=\"main-container\">\r\n   <div class=\"content-container\">\r\n      <div class=\"content-area\">\r\n         <settings-view (chassisUpdated)=\"afterChassisUpdatedHandler($event)\"\r\n                        [chassis]=\"chassis\"\r\n                        *ngIf=\"contentType === 'settings'\">\r\n         </settings-view>\r\n         <additional-view *ngIf=\"contentType === 'additional'\"></additional-view>\r\n      </div>\r\n      <nav class=\"sidenav\">\r\n         <section class=\"sidenav-content\">\r\n            <section class=\"nav-group collapsible\">\r\n               <input id=\"settings-category\" type=\"checkbox\">\r\n               <label for=\"settings-category\">{{ 'common.settings' | translate }}</label>\r\n               <ul class=\"nav-list\">\r\n                  <li><a class=\"nav-link\"\r\n                         (click)=\"setContent('settings')\"\r\n                         [class.active]=\"contentType === 'settings'\">\r\n                     {{ 'common.general' | translate }}\r\n                  </a></li>\r\n               </ul>\r\n            </section>\r\n               <a class=\"nav-link\" (click)=\"setContent('additional')\"\r\n                  [class.active]=\"contentType === 'additional'\">\r\n                  {{ 'tabs.configure.additionalSettings' | translate }}\r\n               </a>\r\n         </section>\r\n      </nav>\r\n   </div>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/tabs/configure/configure.component.scss":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(true);
// imports


// module
exports.push([module.i, "/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\n#container {\n  margin: 10px; }\n\n.sidenav .sidenav-content > .nav-link {\n  margin-top: 0.5rem; }\n", "", {"version":3,"sources":["C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/tabs/configure/C:/Users/Public/CitrixDevSetup/vsphere-client-sdk-6.7.0.20000-10167231/html-client-sdk/samples/simplivity-citrixplugin/simplivity-citrixplugin-ui/src/app/views/tabs/configure/configure.component.scss"],"names":[],"mappings":"AAAA,wDAAwD;AAExD;EACE,aAAY,EACb;;AAED;EACE,mBAAkB,EACnB","file":"configure.component.scss","sourcesContent":["/*Copyright (c) 2018 VMware, Inc. All rights reserved.*/\r\n\r\n#container {\r\n  margin: 10px;\r\n}\r\n\r\n.sidenav .sidenav-content>.nav-link {\r\n  margin-top: 0.5rem;\r\n}\r\n"],"sourceRoot":""}]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/views/tabs/configure/configure.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ConfigureComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
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
    function ConfigureComponent() {
        this.chassisUpdated = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    ConfigureComponent.prototype.ngOnInit = function () {
        this.contentType = '';
    };
    ConfigureComponent.prototype.setContent = function (name) {
        this.contentType = name;
    };
    ConfigureComponent.prototype.afterChassisUpdatedHandler = function (chassis) {
        this.chassis = chassis;
        this.chassisUpdated.emit(chassis);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */]) === "function" && _a || Object)
    ], ConfigureComponent.prototype, "chassis", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", Object)
    ], ConfigureComponent.prototype, "chassisUpdated", void 0);
    ConfigureComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: 'configure-view',
            template: __webpack_require__("../../../../../src/app/views/tabs/configure/configure.component.html"),
            styles: [__webpack_require__("../../../../../src/app/views/tabs/configure/configure.component.scss")],
        })
    ], ConfigureComponent);
    return ConfigureComponent;
    var _a;
}());

//# sourceMappingURL=configure.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/tabs/configure/settings/settings.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<clr-stack-view *ngIf=\"chassis\">\r\n   <clr-stack-header>\r\n      {{ 'tabs.configure.settings.chassisSettings' | translate }}\r\n      <button\r\n            (click)=\"onEdit()\"\r\n            class=\"stack-action btn btn-md btn-link\"\r\n            type=\"button\">{{ 'common.edit' | translate }}\r\n      </button>\r\n   </clr-stack-header>\r\n\r\n   <clr-stack-block>\r\n      <clr-stack-label>{{ 'common.name' | translate }}</clr-stack-label>\r\n      <clr-stack-content>{{chassis.name}}</clr-stack-content>\r\n   </clr-stack-block>\r\n   <clr-stack-block>\r\n      <clr-stack-label>{{ 'common.serverType' | translate }}</clr-stack-label>\r\n      <clr-stack-content>{{chassis.serverType}}</clr-stack-content>\r\n   </clr-stack-block>\r\n   <clr-stack-block>\r\n      <clr-stack-label>{{ 'common.dimensions' | translate }}</clr-stack-label>\r\n      <clr-stack-content>{{chassis.dimensions}}</clr-stack-content>\r\n   </clr-stack-block>\r\n   <clr-stack-block>\r\n      <clr-stack-label>{{ 'common.state' | translate }}</clr-stack-label>\r\n      <clr-stack-content>\r\n         <chassis-status [isActive]=\"chassis.isActive\"></chassis-status>\r\n      </clr-stack-content>\r\n   </clr-stack-block>\r\n</clr-stack-view>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/tabs/configure/settings/settings.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SettingsComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__ = __webpack_require__("../../../../../src/app/services/chassis.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_modal_service__ = __webpack_require__("../../../../../src/app/services/modal.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
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




var SettingsComponent = (function () {
    function SettingsComponent(chassisService, zone, modalService) {
        this.chassisService = chassisService;
        this.zone = zone;
        this.modalService = modalService;
        this.chassisUpdated = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    SettingsComponent.prototype.onEdit = function () {
        var _this = this;
        var config = this.modalService.createEditConfig();
        config.contextObjects = [Object.assign(new __WEBPACK_IMPORTED_MODULE_3__model_chassis_model__["a" /* Chassis */](), this.chassis)];
        config.onClosed = function (result) {
            if (result) {
                _this.zone.run(function () {
                    _this.chassis = result;
                    _this.chassisUpdated.emit(_this.chassis);
                });
            }
        };
        this.chassisService.htmlClientSdk.modal.open(config);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_3__model_chassis_model__["a" /* Chassis */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__model_chassis_model__["a" /* Chassis */]) === "function" && _a || Object)
    ], SettingsComponent.prototype, "chassis", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", Object)
    ], SettingsComponent.prototype, "chassisUpdated", void 0);
    SettingsComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: 'settings-view',
            template: __webpack_require__("../../../../../src/app/views/tabs/configure/settings/settings.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__["a" /* ChassisService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_chassis_service__["a" /* ChassisService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["R" /* NgZone */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_2__services_modal_service__["a" /* ModalConfigService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_modal_service__["a" /* ModalConfigService */]) === "function" && _d || Object])
    ], SettingsComponent);
    return SettingsComponent;
    var _a, _b, _c, _d;
}());

//# sourceMappingURL=settings.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/tabs/hosts/hosts-list.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<div *ngIf=\"loading\" style=\"display: flex; justify-content: center\">\r\n   <span class=\"spinner\"></span>\r\n</div>\r\n<clr-datagrid *ngIf=\"!loading\">\r\n   <clr-dg-placeholder>{{ 'list.noData' | translate }}</clr-dg-placeholder>\r\n\r\n   <clr-dg-column>{{ 'common.name' | translate }}</clr-dg-column>\r\n   <clr-dg-column>{{ 'common.state' | translate }}</clr-dg-column>\r\n   <clr-dg-column>{{ 'vsphere.memorySize' | translate }}</clr-dg-column>\r\n   <clr-dg-column>{{ 'common.cpus' | translate }}</clr-dg-column>\r\n   <clr-dg-column>{{ 'vsphere.vcName' | translate }}</clr-dg-column>\r\n\r\n   <clr-dg-row *clrDgItems=\"let host of hostsList\" [clrDgItem]=\"host\">\r\n      <clr-dg-cell>\r\n         <clr-icon shape=\"host\"></clr-icon>\r\n         <a [routerLink]=\"\" (click)=\"navigateToHostSummaryView(host.id)\"\r\n               (contextmenu)=\"onContextMenu()\">{{host.name}}</a>\r\n      </clr-dg-cell>\r\n      <clr-dg-cell>{{host[\"state\"]}}</clr-dg-cell>\r\n      <clr-dg-cell>{{host[\"memorySize\"]}} (MB)</clr-dg-cell>\r\n      <clr-dg-cell>{{host[\"numCpus\"]}}</clr-dg-cell>\r\n      <clr-dg-cell>{{host.vCenterName}}</clr-dg-cell>\r\n   </clr-dg-row>\r\n</clr-datagrid>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/tabs/hosts/hosts-list.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HostListComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_hosts_service__ = __webpack_require__("../../../../../src/app/services/hosts.service.ts");
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


var HostListComponent = (function () {
    function HostListComponent(hostsService) {
        this.hostsService = hostsService;
        this.loading = false;
        this.onContextMenu = HostListComponent_1.preventContextMenu;
    }
    HostListComponent_1 = HostListComponent;
    HostListComponent.prototype.ngOnInit = function () {
        this.retrieveHosts();
    };
    /**
     * Navigate To the host summary view of a given objectId
     */
    HostListComponent.prototype.navigateToHostSummaryView = function (objectId) {
        var navigateParams = {
            targetViewId: HostListComponent_1.HOST_SUMMARY_VIEW_EXTENSION_ID,
            objectId: objectId
        };
        this.hostsService.htmlClientSdk.app.navigateTo(navigateParams);
    };
    /**
     * Refresh the list of host objects.
     */
    HostListComponent.prototype.retrieveHosts = function () {
        var _this = this;
        this.loading = true;
        this.hostsService.getConnectedHosts()
            .then(function (result) { _this.hostsList = result; _this.loading = false; });
    };
    HostListComponent.preventContextMenu = function () {
        return false;
    };
    HostListComponent.HOST_SUMMARY_VIEW_EXTENSION_ID = "vsphere.core.host.summary";
    HostListComponent = HostListComponent_1 = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: 'hosts-list-view',
            template: __webpack_require__("../../../../../src/app/views/tabs/hosts/hosts-list.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_hosts_service__["a" /* HostsService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_hosts_service__["a" /* HostsService */]) === "function" && _a || Object])
    ], HostListComponent);
    return HostListComponent;
    var HostListComponent_1, _a;
}());

//# sourceMappingURL=hosts-list.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/tabs/monitor/monitor.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n\r\n<div class=\"col-xs-12 col-sm-6\">\r\n   <div class=\"card\">\r\n      <div class=\"card-block\">\r\n         <h4 class=\"card-title\">{{ 'tabs.monitor.chassisStatusInformation' | translate }}</h4>\r\n         <div class=\"progress-block\">\r\n            <label>{{ 'common.health' | translate }}</label>\r\n            <div class=\"progress-static danger\">\r\n               <div class=\"progress-meter\" [attr.data-value]=\"chassis.healthStatus\"></div>\r\n            </div>\r\n            <span>&emsp;{{chassis.healthStatus}}%</span>\r\n         </div>\r\n         <div class=\"progress-block\">\r\n            <label>{{ 'common.compliance' | translate }}</label>\r\n            <div class=\"progress-static success\">\r\n               <div class=\"progress-meter\" [attr.data-value]=\"chassis.complianceStatus\"></div>\r\n            </div>\r\n            <span>&emsp;{{chassis.complianceStatus}}%</span>\r\n         </div>\r\n      </div>\r\n      <div class=\"card-footer\">\r\n         <button class=\"btn btn-link\" (click)=\"refreshData()\">{{ 'common.refresh' | translate }}</button>\r\n      </div>\r\n   </div>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/tabs/monitor/monitor.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MonitorComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
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


var MonitorComponent = (function () {
    function MonitorComponent() {
        this.chassisUpdated = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    MonitorComponent.prototype.refreshData = function () {
        this.chassis = Object.assign(new __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */](), this.chassis);
        this.chassis.healthStatus = Math.floor(Math.random() * 100) + 1;
        this.chassis.complianceStatus = Math.floor(Math.random() * 100) + 1;
        this.chassisUpdated.emit(this.chassis);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */]) === "function" && _a || Object)
    ], MonitorComponent.prototype, "chassis", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
        __metadata("design:type", Object)
    ], MonitorComponent.prototype, "chassisUpdated", void 0);
    MonitorComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: 'monitor-view',
            template: __webpack_require__("../../../../../src/app/views/tabs/monitor/monitor.component.html")
        })
    ], MonitorComponent);
    return MonitorComponent;
    var _a;
}());

//# sourceMappingURL=monitor.component.js.map

/***/ }),

/***/ "../../../../../src/app/views/tabs/summary/summary.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Copyright (c) 2018 VMware, Inc. All rights reserved. -->\r\n<div class=\"row\">\r\n   <div class=\"col-lg-4 col-md-12 col-sm-12 col-xs-12\">\r\n      <div class=\"card\">\r\n         <div class=\"card-header\">\r\n            {{ 'tabs.summary.mainInformation' | translate }}\r\n         </div>\r\n         <div class=\"card-block\">\r\n            <clr-stack-view *ngIf=\"chassis\">\r\n               <clr-stack-block>\r\n                  <clr-stack-label>{{ 'common.name' | translate }}</clr-stack-label>\r\n                  <clr-stack-content>{{chassis.name}}</clr-stack-content>\r\n               </clr-stack-block>\r\n               <clr-stack-block>\r\n                  <clr-stack-label>{{ 'common.state' | translate }}</clr-stack-label>\r\n                  <clr-stack-content>\r\n                     <chassis-status [isActive]=\"chassis.isActive\"></chassis-status>\r\n                  </clr-stack-content>\r\n               </clr-stack-block>\r\n            </clr-stack-view>\r\n         </div>\r\n      </div>\r\n   </div>\r\n\r\n   <div class=\"col-lg-4 col-md-12 col-sm-12 col-xs-12\">\r\n      <div class=\"card\">\r\n         <div class=\"card-header\">\r\n            {{ 'tabs.summary.additionalDetails' | translate }}\r\n         </div>\r\n         <div class=\"card-block\">\r\n            <clr-stack-view *ngIf=\"chassis\">\r\n               <clr-stack-block>\r\n                  <clr-stack-label>{{ 'common.serverType' | translate }}</clr-stack-label>\r\n                  <clr-stack-content>{{chassis.serverType}}</clr-stack-content>\r\n               </clr-stack-block>\r\n               <clr-stack-block>\r\n                  <clr-stack-label>{{ 'common.dimensions' | translate }}</clr-stack-label>\r\n                  <clr-stack-content>{{chassis.dimensions}}</clr-stack-content>\r\n               </clr-stack-block>\r\n            </clr-stack-view>\r\n         </div>\r\n      </div>\r\n   </div>\r\n</div>\r\n"

/***/ }),

/***/ "../../../../../src/app/views/tabs/summary/summary.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SummaryComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__ = __webpack_require__("../../../../../src/app/model/chassis.model.ts");
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


var SummaryComponent = (function () {
    function SummaryComponent() {
    }
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__model_chassis_model__["a" /* Chassis */]) === "function" && _a || Object)
    ], SummaryComponent.prototype, "chassis", void 0);
    SummaryComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
            selector: 'summary-view',
            template: __webpack_require__("../../../../../src/app/views/tabs/summary/summary.component.html")
        })
    ], SummaryComponent);
    return SummaryComponent;
    var _a;
}());

//# sourceMappingURL=summary.component.js.map

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