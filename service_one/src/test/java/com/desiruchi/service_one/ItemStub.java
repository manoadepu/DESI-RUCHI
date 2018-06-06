package com.desiruchi.service_one;

import com.desiruchi.service_one.model.*;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ItemStub {

    public void generateItemStub(){

        Nutrition nutrition = new Nutrition();
        HashMap<NutritionFacts, String> nutritionFactsHashMap = new HashMap<>();
        nutritionFactsHashMap.put(NutritionFacts.calcium,"0g");
        nutritionFactsHashMap.put(NutritionFacts.cholestrol,"0g");
        nutritionFactsHashMap.put(NutritionFacts.DietaryFiber,"0g");
        nutritionFactsHashMap.put(NutritionFacts.iron,"0g");
        nutritionFactsHashMap.put(NutritionFacts.Protien,"0g");
        nutritionFactsHashMap.put(NutritionFacts.TotalCarbs,"0g");
        nutritionFactsHashMap.put(NutritionFacts.totalFat,"0g");
        nutritionFactsHashMap.put(NutritionFacts.vitaminA,"0g");
        nutritionFactsHashMap.put(NutritionFacts.vitaminC,"0g");
        nutritionFactsHashMap.put(NutritionFacts.Sugars,"0g");

        nutrition.setNutritionFacts(nutritionFactsHashMap);

        Ingredients ingredients = new Ingredients();

        RestAssured.baseURI = "http://localhost:8080";
        String itemEndpoint = "/items";

        Random random = new Random();
        String[] categories = {"sweets","hot", "masala", "ingredients"};
        Rating[] ratings = {Rating.ONE,Rating.TWO,Rating.THREE,Rating.FOUR,Rating.FIVE};

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
