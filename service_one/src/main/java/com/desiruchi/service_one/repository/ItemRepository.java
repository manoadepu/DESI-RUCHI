package com.desiruchi.service_one.repository;


import com.desiruchi.service_one.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Desc: POST: Create
         PUT: Total update
         PATCH: Partial update
         DELETE: Delete
         GET: View
 */
@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemRepository extends MongoRepository<Item,String>{
}
