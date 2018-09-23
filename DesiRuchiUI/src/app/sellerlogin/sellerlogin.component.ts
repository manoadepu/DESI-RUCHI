import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SellerLoginServiceService } from '../services/seller-login-service.service';
import { SellerLoginModel } from '../models/seller-login-model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { FoodSellerModel } from '../models/food-seller-model';
@Component({
  selector: 'app-sellerlogin',
  templateUrl: './sellerlogin.component.html',
  styleUrls: ['./sellerlogin.component.css']
})
export class SellerloginComponent implements OnInit {
  email?: string;
  password?: string;
  sellerLoginServiceService: SellerLoginServiceService;
  sellerModel: SellerLoginModel;
  sellerForm: FormGroup;
  routerLink: String;
  foodSeller: FoodSellerModel;
    result: Boolean = false;
  constructor(private httpClient: HttpClient, private fb: FormBuilder) {
    console.log('in seller login component');
    this.sellerForm = this.fb.group({
      'email': ['', Validators.required],
      'password': ['', Validators.required]
    });
  }

  ngOnInit() {
  }

  sellerLoginSubmit() {
    console.log('in sellerLoginSubmit()');
    this.sellerLoginServiceService = new SellerLoginServiceService(this.httpClient);
    this.sellerModel = new SellerLoginModel;
    this.sellerModel.email = this.email;
    this.sellerModel.password = this.password;
    console.log(this.sellerModel);
    console.log('before calling method in service...');
    console.log('routerLink: ' + this.routerLink);
    this.sellerLoginServiceService.validateCredentialsAndSendRouterLink(this.sellerModel).subscribe(response => {
      this.foodSeller = response._embedded.FoodSellers[0];
      if (this.sellerModel.email === this.foodSeller.email && this.sellerModel.password === this.foodSeller.password) {
        this.result = true;
        this.routerLink = 'seller';
        console.log('router link in validateCredentialsAndSendRouterLink::: Success ' + this.routerLink);
      } else {
        this.routerLink = 'food/stores';
        console.log('router link in validateCredentialsAndSendRouterLink::: Failure ' + this.routerLink);
    }
    });
  }
}
