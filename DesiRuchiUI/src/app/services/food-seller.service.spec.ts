import { TestBed, inject } from '@angular/core/testing';

import { FoodSellerService } from './food-seller.service';

describe('FoodSellerService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [FoodSellerService]
    });
  });

  it('should be created', inject([FoodSellerService], (service: FoodSellerService) => {
    expect(service).toBeTruthy();
  }));
});
