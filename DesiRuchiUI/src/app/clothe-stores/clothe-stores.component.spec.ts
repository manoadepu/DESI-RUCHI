import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ClotheStoresComponent } from './clothe-stores.component';

describe('ClotheStoresComponent', () => {
  let component: ClotheStoresComponent;
  let fixture: ComponentFixture<ClotheStoresComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ClotheStoresComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ClotheStoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
