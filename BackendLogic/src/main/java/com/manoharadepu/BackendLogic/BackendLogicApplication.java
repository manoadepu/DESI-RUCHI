package com.manoharadepu.BackendLogic;

import com.manoharadepu.BackendLogic.models.foodSellerCollection.FoodSellerCollectionModel;
import com.manoharadepu.BackendLogic.models.foodStoreCollection.FoodStoreCollectionModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableAutoConfiguration
@CrossOrigin
@ComponentScan("com.manoharadepu.BackendLogic.controllers")
public class BackendLogicApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackendLogicApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		FoodSellerCollectionModel foodSeller = restTemplate.getForObject("http://localhost:8080/foodSellers/search/findByEmail?email=mano.adepu2@gmail.com", FoodSellerCollectionModel.class);

		System.out.println("Additional properties: "+foodSeller.getAdditionalProperties().toString());
		System.out.println(foodSeller.toString());

		RestTemplate restTemplate1 = new RestTemplate();
		FoodStoreCollectionModel foodStore = restTemplate1.getForObject("http://localhost:8080/foodStores/search/findByStoreName?storeName=Store100",FoodStoreCollectionModel.class);
		System.out.println(foodStore);
	}
}
