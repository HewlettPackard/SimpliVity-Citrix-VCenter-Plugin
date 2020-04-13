/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

import {Component, Input, Output, EventEmitter} from '@angular/core';

@Component(
   {
      selector: "sample-input",
      templateUrl: './sample-input.component.html'
   }
)

export class SampleInputComponent {
   @Input()
   customStyle: string;

   @Input()
   inputId: string;

   @Input()
   inputSize: number = 40;

   @Input()
   inputValue: any;

   @Output()
   inputValueChanged:EventEmitter<any> = new EventEmitter<any>();

   @Input()
   labelValue: string;

   @Input()
   placeholderValue: string;

   @Input()
   invalidValue: boolean;

   @Input()
   valueRequired: boolean;

   @Input()
   invalidValueError: string;

   onInputValueChanged(newValue: any) {
      this.inputValueChanged.emit(newValue);
   }
}
