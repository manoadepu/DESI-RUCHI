import { AppComponent } from './app.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemspageComponent } from './itemspage/itemspage.component';
import { StorespageComponent } from './storespage/storespage.component';
import { BothComponent } from './both/both.component';

const routes: Routes = [
    { path: '', component: BothComponent},
    { path: 'items', component: ItemspageComponent },
    { path: 'stores', component: StorespageComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [ItemspageComponent, StorespageComponent, BothComponent];

