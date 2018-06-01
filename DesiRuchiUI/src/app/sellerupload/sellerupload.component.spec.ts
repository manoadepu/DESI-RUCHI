import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SelleruploadComponent } from './sellerupload.component';

describe('SelleruploadComponent', () => {
  let component: SelleruploadComponent;
  let fixture: ComponentFixture<SelleruploadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SelleruploadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SelleruploadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
