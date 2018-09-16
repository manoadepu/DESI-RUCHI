import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import { map } from 'rxjs/operators';
import { SellerLoginModel } from '../models/seller-login-model';
import { FoodSellerModel } from '../models/food-seller-model';
@Injectable()
export class SellerLoginServiceService {

  foodSeller: FoodSellerModel;
  constructor(private httpClient: HttpClient) {console.log('in sellerlogin service'); }

  sellerLoginValidation(sellerLoginModel: SellerLoginModel) {
    this.getFoodSeller(sellerLoginModel).subscribe(response => {
      this.foodSeller = response._embedded.FoodSellers[0];
      console.log(this.foodSeller);
    });
  }


getFoodSeller(sellerLoginModel: SellerLoginModel): Observable<any> {
  console.log('In get food seller to convert the response object');
  console.log(sellerLoginModel.email);
  return this.httpClient.get('http://localhost:8080/foodSellers/search/findByEmail?email=' + sellerLoginModel.email)
  .map(
    response => {
      console.log(response);
      return response;
    }
  );
}

}
