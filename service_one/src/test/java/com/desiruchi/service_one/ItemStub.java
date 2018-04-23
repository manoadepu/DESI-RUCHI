package com.desiruchi.service_one;

import com.desiruchi.service_one.model.Ingredients;
import com.desiruchi.service_one.model.Item;
import com.desiruchi.service_one.model.Nutrition;
import com.desiruchi.service_one.model.Rating;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemStub {

    public void generateItemStub(){

        Nutrition nutrition = new Nutrition();
        Ingredients ingredients = new Ingredients();

        RestAssured.baseURI = "http://localhost:8080";
        String itemEndpoint = "/items";

        Random random = new Random();
        String[] categories = {"sweets","hot", "masala", "ingredients"};
        Rating[] ratings = {Rating.ONE,Rating.TWO,Rating.THREE,Rating.FOUR,Rating.FIVE};

        nutrition.setCalcium(10);
        nutrition.setCholestrol(12);
        nutrition.setDietaryFiber(5);
        nutrition.setIron(4);
        nutrition.setProtien(15);
        nutrition.setTotalCarbs(500);
        nutrition.setSugars(25);
        nutrition.setTotalFat(10);
        nutrition.setVitaminA(20);
        nutrition.setVitaminC(5);

        List< String > Ilist = new ArrayList<>();
        Ilist.add("sugar");
        Ilist.add("peanuts");
        Ilist.add("cashews");
        Ilist.add("almonds");
        Ilist.add("milk");
        Ilist.add("oil");
        Ilist.add("sweetener");
        ingredients.setIngredients(Ilist);

        for(int i=2;i<1500;i++){
            Item item = new Item();
            item.setItemCode(1 + i);
            item.setItemName(item +Integer.toString(i));

            int rating = random.nextInt(4);
            item.setRating(ratings[rating]);
            item.setPrice(15);

            int ctgry = random.nextInt(3);
            item.setItemCategory(categories[ctgry]);
            item.setIngredients(ingredients);
            item.setNutritionFacts(nutrition);

            Gson gson = new Gson();
            String request = gson.toJson(item);
            Response response = given().log().all()
                    .contentType(ContentType.JSON)
                    .body(item, JACKSON_2)
                    .when().post(itemEndpoint).thenReturn();
            System.out.println("STATUS CODE: "+response.getStatusCode());
            Assert.assertTrue(response.getStatusCode() == 201);
        }
    }

    @Test
    public void StubItemData(){
        generateItemStub();
    }
}
