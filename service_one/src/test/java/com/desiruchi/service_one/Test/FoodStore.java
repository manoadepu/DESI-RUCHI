package com.desiruchi.service_one.Test;

import com.desiruchi.service_one.Test.helpers.EndPoints;
import com.desiruchi.service_one.Test.helpers.Helpers;
import com.desiruchi.service_one.models.food.FoodStoreCategory;

import com.desiruchi.service_one.models.generic.Rating;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Random;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

public class FoodStore {

    Helpers helpers = new Helpers();


    FoodStoreCategory foodStoreCategory = new FoodStoreCategory();


    @Test
    public void insertFoodStores(){

        com.desiruchi.service_one.models.food.collection.FoodStore foodStore = new com.desiruchi.service_one.models.food.collection.FoodStore();
        for(int i = 0; i<10;i++) {
            foodStore.setStoreId(i);
            foodStore.setStoreName("Store"+i);
            i++;
            foodStore.setLocation(helpers.getRandomLocation());
            foodStore.setContactInfo(helpers.getRandomContactInfo());
            foodStore.setRating(Rating.FOUR);
            foodStore.setFoodStoreCategories(getRandomListOfFoodStoreCategories());
            //Response response = helpers.restCall("http://localhost:8080/foodStores",foodStore);
            //Assert.assertTrue(response.getStatusCode() == 201);

            //TODO: remmove this and investigate why helpers.restCall isn't working
            Gson gson = new Gson();
            String request = gson.toJson(foodStore);
            Response response = given().log().all()
                    .contentType(ContentType.JSON)
                    .body(foodStore, JACKSON_2)
                    .when().post("http://localhost:8080/foodStores").thenReturn();
            System.out.println("STATUS CODE: "+response.getStatusCode());
            Assert.assertTrue(response.getStatusCode() == 201);
        }
    }


    public ArrayList<FoodStoreCategory> getRandomListOfFoodStoreCategories(){
        Helpers helpers = new Helpers();
        ArrayList<FoodStoreCategory> foodStoreCategoriesList = new ArrayList<>();
        //Generate list of foodcategories for store
        for(int i=0;i<2;i++){
            FoodStoreCategory foodStoreCategory = new FoodStoreCategory();
            String randomFoodStoreCategory = helpers.getRandomCategoryForFoodStore();
            foodStoreCategory.setCategoryName(randomFoodStoreCategory);
            foodStoreCategory.setFoodItems(helpers.getRandomFoodItems(randomFoodStoreCategory));
            foodStoreCategoriesList.add(foodStoreCategory);
        }
        return foodStoreCategoriesList;
    }

}
