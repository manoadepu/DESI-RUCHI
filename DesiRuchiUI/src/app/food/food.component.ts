import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs/Observable';
import { map } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-food',
  templateUrl: './food.component.html',
  styleUrls: ['./food.component.css']
})
export class FoodComponent implements OnInit {

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
