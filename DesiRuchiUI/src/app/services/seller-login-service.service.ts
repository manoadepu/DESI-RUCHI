import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import { map } from 'rxjs/operators';
import { SellerLoginModel } from '../models/seller-login-model';
@Injectable()
export class SellerLoginServiceService {
  routerLink: String = 'wrong';
  constructor(private httpClient: HttpClient) {console.log('in sellerlogin service'); }

  /**
   *
   * @param sellerLoginModel
   */
  sellerLoginValidation(sellerLoginModel: SellerLoginModel): Observable<any> {
    console.log('in sellerLoginvalidation');
    return this.getFoodSeller(sellerLoginModel);
  }

  /**
 *
 * @param sellerLoginModel
 */
validateCredentialsAndSendRouterLink(sellerLoginModel: SellerLoginModel) {
  return this.sellerLoginValidation(sellerLoginModel);
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
