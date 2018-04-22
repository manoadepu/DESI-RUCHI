package com.desiruchi.service_one.repository;

import com.desiruchi.service_one.model.Store;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "stores", path = "stores")
public interface StoreRepository extends MongoRepository<Store,Integer> {
    List<Store> findByStoreCode(@Param("storeCode") String storeCode);
   // List<Store> findByStoreName(@Param("storeName") String storeName);
    List<Store> findByRating(@Param("rating") String rating);
    List<Store> findByLocation(@Param("location") String location);
}
