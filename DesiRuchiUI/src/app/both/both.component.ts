import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-both',
  templateUrl: './both.component.html',
  styleUrls: ['./both.component.css']
})
export class BothComponent implements OnInit {

  // constructor(private httpClient: HttpClient) {}

  // getItems() {
  //   // return this.httpClient.get('http://localhost:8080/items')
  //   // .map(
  //   //   (data) => {
  //   //       console.log(data);
  //   //       return data;
  //   //   }
  //   // );
  //   console.log('service code comes here!!');
  //   }

  ngOnInit() {
  }

}
