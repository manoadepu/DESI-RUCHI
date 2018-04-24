import { TestBed, inject } from '@angular/core/testing';

import { StoreserviceService } from './storeservice.service';

describe('StoreserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [StoreserviceService]
    });
  });

  it('should be created', inject([StoreserviceService], (service: StoreserviceService) => {
    expect(service).toBeTruthy();
  }));
});
