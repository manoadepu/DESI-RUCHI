import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StorespageComponent } from './storespage.component';

describe('StorespageComponent', () => {
  let component: StorespageComponent;
  let fixture: ComponentFixture<StorespageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StorespageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StorespageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
