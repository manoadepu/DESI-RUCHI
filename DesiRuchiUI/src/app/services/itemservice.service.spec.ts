import { TestBed, inject } from '@angular/core/testing';

import { ItemserviceService } from './itemservice.service';

describe('ItemserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ItemserviceService]
    });
  });

  it('should be created', inject([ItemserviceService], (service: ItemserviceService) => {
    expect(service).toBeTruthy();
  }));
});
