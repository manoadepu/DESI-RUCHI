package com.desiruchi.service_one.repository;


import com.desiruchi.service_one.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Desc: POST: Create
         PUT: Total update
         PATCH: Partial update
         DELETE: Delete
         GET: View
 EndPoint: http://localhost:8080/items/
 */
@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemRepository extends MongoRepository<Item,String>{
    List<Item> findByRating(@Param("rating") String availability);
    List<Item> findByItemName(@Param("itemName") String itemName);
    List<Item> findByItemCode(@Param("itemCode") String itemCode);
}
