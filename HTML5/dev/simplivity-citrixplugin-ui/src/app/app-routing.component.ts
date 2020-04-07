/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Component, OnInit} from "@angular/core";
import {Router, ActivatedRoute} from "@angular/router";
import {Subscription} from "rxjs/Subscription";


// The document URL is
// .../index.html?view=<name>&..._rest_of_the_parameters

@Component({
   template: '<router-outlet></router-outlet>'
})
export class AppRoutingComponent implements OnInit {
   private subscription: Subscription;

   constructor(private router: Router,
               private route: ActivatedRoute) {
   }

   ngOnInit(): void {
      // Extract query parameters and navigate to view
      this.subscription = this.route.queryParams.subscribe(
         (param: any) => {
            let view = param["view"];

            if (!view) {
               console.error("Missing view parameter!")
               return;
            }
            let commands: any[] = ["/" + view];
            // console.log('navigate commands:', commands);

            // Navigate without adding a new state in the browser history but rather
            // replace the current one {replaceUrl: true} since this is a second navigation
            // within the same call (the first one being the navigation to the very page).
            // Without this the user cannot go back with a simple click of the
            // browser 'back' button/shortcut
            this.router.navigate(commands, {replaceUrl : true});

         });
   }

   ngOnDestroy() {
      this.subscription.unsubscribe();
   }

}
