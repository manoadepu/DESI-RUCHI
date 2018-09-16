import { TestBed, inject } from '@angular/core/testing';

import { RegisterStoreService } from './register-store.service';

describe('RegisterStoreService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RegisterStoreService]
    });
  });

  it('should be created', inject([RegisterStoreService], (service: RegisterStoreService) => {
    expect(service).toBeTruthy();
  }));
});
