package com.desiruchi.service_one.repository;

import com.desiruchi.service_one.models.food.FoodItem;
import com.desiruchi.service_one.models.food.FoodStoreCategory;
import com.desiruchi.service_one.models.food.collection.FoodStore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "FoodStores", path = "foodStores")
public interface FoodStoreRepository extends MongoRepository<FoodStore,Integer> {
    List<FoodStore> findByStoreId(@Param("storeID") int storeID);
    List<FoodStore> findByStoreName(@Param("storeName") String storeName);
    List<FoodStore> findByFoodStoreCategories(@Param("foodStoreCategory") String foodStoreCategory);
    List<FoodStore> findByLocation(@Param("location") String location);
    List<FoodStore> findByRating(@Param("rating") String rating);
    List<FoodStore> findByContactInfo(@Param("contactInfo") String contactInfo);
}
