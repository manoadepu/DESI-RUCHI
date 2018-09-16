import { Component, OnInit } from '@angular/core';
import { FoodSellerModel } from '../models/food-seller-model';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { RegisterStoreService } from '../services/register-store.service';

@Component({
  selector: 'app-seller',
  templateUrl: './seller.component.html',
  styleUrls: ['./seller.component.css']
})
export class SellerComponent implements OnInit {

  foodSeller: FoodSellerModel = new FoodSellerModel();
  goalText: string;
  storeName: string;
  email: string;
  password: string;
  storeCategory: string;
  logo: string;
  storeDescription: string;
  rs: RegisterStoreService;
  constructor(private httpClient: HttpClient) {}

  ngOnInit() {
  }

  onSubmit() {
    console.log('OnSubmit');
    console.log(this.storeName);
    this.foodSeller.storeID = 6352;
    this.foodSeller.storeName = this.storeName;
    this.foodSeller.email = this.email;
    // this.foodSeller.logo = this.logo;
    this.foodSeller.password = this.password;
    this.foodSeller.description = this.storeDescription;
    this.foodSeller.storeCategory = this.storeCategory;
    console.log('From seller.component.ts' + this.foodSeller.storeCategory);
    this.rs = new RegisterStoreService(this.httpClient);
    this.rs.saveStore(this.foodSeller);
    console.log('After post!!');
  }
}

