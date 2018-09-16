import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SellerLoginServiceService } from '../services/seller-login-service.service';
import { SellerLoginModel } from '../models/seller-login-model';

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

  constructor(private httpClient: HttpClient) { console.log('in seller login component'); }

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
     this.sellerLoginServiceService.sellerLoginValidation(this.sellerModel);
  }

}
