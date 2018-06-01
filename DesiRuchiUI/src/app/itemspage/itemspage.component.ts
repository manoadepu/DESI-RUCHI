import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs/Observable';
import { map } from 'rxjs/operators';
@Component({
  selector: 'app-itemspage',
  templateUrl: './itemspage.component.html',
  styleUrls: ['./itemspage.component.css']
})
export class ItemspageComponent implements OnInit {
  title = 'app';
  itemsFromMongo: items;
  constructor(private http: HttpClient) {
    }

  ngOnInit() {

    this.getItems().subscribe(response => {
      this.itemsFromMongo = response._embedded.items;
      console.log('items:::', this.itemsFromMongo);
    });
  }

  getItems(): Observable<any> {
    return this.http.get('http://localhost:8080/items')
    .map(
      response => {
        return response;
        // JSON.parse(response.json());
        // console.log(response.json()._embedded.items);
      }
    );

  }

}
interface items {
  ingredients: string[];
  itemCategory: string;
  itemName: string;
  nutritionFacts: string[];
  price: number;
  rating: string;
}