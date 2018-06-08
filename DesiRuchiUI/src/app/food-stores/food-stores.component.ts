import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs/Observable';
import { map } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-food-stores',
  templateUrl: './food-stores.component.html',
  styleUrls: ['./food-stores.component.css']
})
export class FoodStoresComponent implements OnInit {

  title = 'app';
  storesFromMongo: stores;
  constructor(private http: HttpClient) {
    }

  ngOnInit() {

    this.getStores().subscribe(response => {
      this.storesFromMongo = response._embedded.stores;
      console.log('items:::', this.storesFromMongo);
    });
  }

  getStores(): Observable<any> {
    return this.http.get('http://localhost:8080/stores')
    .map(
      response => {
        return response;
        // JSON.parse(response.json());
        // console.log(response.json()._embedded.items);
      }
    );

  }
}
interface stores{
  storeName: string;
}