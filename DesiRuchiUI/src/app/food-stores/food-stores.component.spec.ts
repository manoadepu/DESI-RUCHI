import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodStoresComponent } from './food-stores.component';

describe('FoodStoresComponent', () => {
  let component: FoodStoresComponent;
  let fixture: ComponentFixture<FoodStoresComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FoodStoresComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FoodStoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
