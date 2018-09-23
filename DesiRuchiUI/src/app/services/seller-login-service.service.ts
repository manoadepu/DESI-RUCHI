import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import { map } from 'rxjs/operators';
import { SellerLoginModel } from '../models/seller-login-model';
import { FoodSellerModel } from '../models/food-seller-model';
@Injectable()
export class SellerLoginServiceService {
  routerLink: String = 'wrong';
  result: Boolean = false;
  foodSeller: FoodSellerModel;
  constructor(private httpClient: HttpClient) {console.log('in sellerlogin service'); }

  /**
   *
   * @param sellerLoginModel
   */
  sellerLoginValidation(sellerLoginModel: SellerLoginModel) {
    console.log('in sellerLoginvalidation');
    this.getFoodSeller(sellerLoginModel).subscribe(response => {
      this.foodSeller = response._embedded.FoodSellers[0];
      if (sellerLoginModel.email === this.foodSeller.email && sellerLoginModel.password === this.foodSeller.password) {
        this.result = true;
        this.routerLink = 'seller';
      } else {
        this.routerLink = 'food/stores';
    }
    });
  }

  /**
 *
 * @param sellerLoginModel
 */
validateCredentialsAndSendRouterLink(sellerLoginModel: SellerLoginModel): String {
  this.sellerLoginValidation(sellerLoginModel);
  console.log('router link in validateCredentialsAndSendRouterLink: ' + this.routerLink);
  return this.routerLink;
}

/**
 *
 * @param sellerLoginModel
 */
getFoodSeller(sellerLoginModel: SellerLoginModel): Observable<any> {
  console.log('In get food seller to convert the response object');
  console.log(sellerLoginModel.email);
  console.log('RestCall: http://localhost:8080/foodSellers/search/findByEmail?email=' + sellerLoginModel.email);
  return this.httpClient.get('http://localhost:8080/foodSellers/search/findByEmail?email=' + sellerLoginModel.email)
  .map(
    response => {
      console.log('Response with getEmail rest call' + response);
      return response;
    }
  );
}
}
