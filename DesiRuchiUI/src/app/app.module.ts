import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FoodComponent } from './food/food.component';
import { ClothesComponent } from './clothes/clothes.component';
import { ClotheStoresComponent } from './clothe-stores/clothe-stores.component';
import { FoodStoresComponent } from './food-stores/food-stores.component';


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    FoodComponent,
    ClothesComponent,
    ClotheStoresComponent,
    FoodStoresComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule.forRoot(),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
