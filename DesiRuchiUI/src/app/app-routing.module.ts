import { ClotheStoresComponent } from './clothe-stores/clothe-stores.component';
import { ClothesComponent } from './clothes/clothes.component';
import { FoodComponent } from './food/food.component';
import { AppComponent } from './app.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemspageComponent } from './itemspage/itemspage.component';
import { StorespageComponent } from './storespage/storespage.component';
import { BothComponent } from './both/both.component';
import { SellerComponent } from './seller/seller.component';
import { SellerloginComponent } from './sellerlogin/sellerlogin.component';
import { SelleruploadComponent } from './sellerupload/sellerupload.component';
import { FoodStoresComponent } from './food-stores/food-stores.component';

const routes: Routes = [
    { path: '', component: BothComponent},
    { path: 'items', component: ItemspageComponent },
    { path: 'stores', component: StorespageComponent },
    { path: 'sellerlogin/sellerupload', component: SelleruploadComponent },
    { path: 'sellerlogin/seller', component: SellerComponent },
    { path: 'sellerlogin', component: SellerloginComponent },
    { path: 'items/food', component: FoodComponent },
    { path: 'items/clothes', component: ClothesComponent },
    { path: 'clothes/stores', component: ClotheStoresComponent },
    { path: 'food/stores', component: FoodStoresComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [
    ItemspageComponent,
    StorespageComponent,
    BothComponent, SellerComponent,
    SellerloginComponent,
    SelleruploadComponent,
    FoodComponent,
    ClothesComponent,
    ClotheStoresComponent,
    FoodStoresComponent
];

