import { TestBed, inject } from '@angular/core/testing';

import { SellerLoginServiceService } from './seller-login-service.service';

describe('SellerLoginServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SellerLoginServiceService]
    });
  });

  it('should be created', inject([SellerLoginServiceService], (service: SellerLoginServiceService) => {
    expect(service).toBeTruthy();
  }));
});
