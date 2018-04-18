package com.desiruchi.service_one.repository;

import com.desiruchi.service_one.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item,String>{
    public Item findByIname(String iname);
}
