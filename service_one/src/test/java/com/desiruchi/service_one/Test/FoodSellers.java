package com.desiruchi.service_one.Test;

import com.desiruchi.service_one.models.food.collection.FoodSellersCollection;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

public class FoodSellers {
    @Test
    public void mockFoodSellers(){
        for(int i=1;i<500;i++){
            FoodSellersCollection foodSellersCollection = new FoodSellersCollection();
            foodSellersCollection.setStoreID(i);
            foodSellersCollection.setEmail("mano.adepu"+i+"@gmail.com");
            foodSellersCollection.setPassword("5a$$w0rd"+i);

            //TODO: remmove this and investigate why helpers.restCall isn't working
            Gson gson = new Gson();
            String request = gson.toJson(foodSellersCollection);
            Response response = given().log().all()
                    .contentType(ContentType.JSON)
                    .body(foodSellersCollection, JACKSON_2)
                    .when().post("http://localhost:8080/foodSellers").thenReturn();
            System.out.println("STATUS CODE: "+response.getStatusCode());
            Assert.assertTrue(response.getStatusCode() == 201);
        }


    }
}
