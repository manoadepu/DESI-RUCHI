import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SellerLoginServiceService } from '../services/seller-login-service.service';
import { SellerLoginModel } from '../models/seller-login-model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
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
    this.routerLink = this.sellerLoginServiceService.validateCredentialsAndSendRouterLink(this.sellerModel);
    console.log('{{routerLink}} ' + this.routerLink);
  }
}
