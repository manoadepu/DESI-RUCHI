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
    console.log('sellerLoginvalidation');
    this.getFoodSeller(sellerLoginModel).subscribe(response => {
      console.log('Response from get food seller:');
      console.log(response);
      console.log('router link: ' + this.routerLink);
    });
  }

  /**
 *
 * @param sellerLoginModel
 */
validateCredentialsAndSendRouterLink(sellerLoginModel: SellerLoginModel): String {
  console.log('validateCredentialsAndSendRouterLink');
  this.sellerLoginValidation(sellerLoginModel);
  console.log('router link in validateCredentialsAndSendRouterLink: ' + this.routerLink);
  return this.routerLink;
}

/**
 *
 * @param sellerLoginModel
 */
getFoodSeller(sellerLoginModel: SellerLoginModel): Observable<any> {
  console.log('getFoodSeller');
  return this.httpClient.post('http://localhost:8082/sellerLoginValidation',
    {
      "email": sellerLoginModel.email,
      "password": sellerLoginModel.password
    })
  .map(
    response => {
      console.log('Response with getEmail rest call' + response);
        this.routerLink = response.toString();
        console.log('router link: ' + this.routerLink);
      return response;
    }
  );
}}
