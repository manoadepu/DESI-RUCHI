import { Injectable } from '@angular/core';
import { FoodSellerModel } from '../models/food-seller-model';
import { HttpClientModule, HttpClient } from '@angular/common/http';

@Injectable()
export class RegisterStoreService {
  constructor(private httpClient: HttpClient) {}

  saveStore(foodSellerModel: FoodSellerModel) {
    if (foodSellerModel.storeCategory === 'Food') {
    console.log('In saveStore method');
    console.log('model');
    console.log(foodSellerModel);
    this.httpClient.post('http://localhost:8080/foodSellers',
    {
      // TODO:generate a unique storeID
      "storeID": foodSellerModel.storeID,
      "storeName": foodSellerModel.storeName,
      "description": foodSellerModel.description,
      //"logo": foodSellerModel.logo,
      "email": foodSellerModel.email,
      "password": foodSellerModel.password
  })
  .subscribe(
    (data: any) => {
      console.log(data);
    }
  );
  }

  if (foodSellerModel.storeCategory === 'Gifts') {}

  if (foodSellerModel.storeCategory === 'Clothes') {}

}

}
