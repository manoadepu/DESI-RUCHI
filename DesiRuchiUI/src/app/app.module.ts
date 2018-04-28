import { AppRoutingModule, routingComponents } from './app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BothComponent } from './both/both.component';
import { HttpClient } from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    BothComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule.forRoot()
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
