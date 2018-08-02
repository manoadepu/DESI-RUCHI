package com.desiruchi.service_one.repository;

import com.desiruchi.service_one.models.food.collection.FoodSellersCollection;
import com.desiruchi.service_one.models.food.collection.FoodStore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "FoodSellers", path = "foodSellers")
public interface FoodSellersRepository extends MongoRepository<FoodSellersCollection,Integer> {
    List<FoodSellersCollection> storeID(@Param("storeID") int storeID);
    List<FoodSellersCollection> findByEmail(@Param("email") String email);
    List<FoodSellersCollection> findByPassword(@Param("password") String password);
}
