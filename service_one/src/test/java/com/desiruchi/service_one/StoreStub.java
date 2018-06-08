package com.desiruchi.service_one;

import com.desiruchi.service_one.model.*;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

public class StoreStub {

    public void generateStoreStub(){

        for(int i=2;i<100;i++){
            Store store = new Store();
            ArrayList<Item> items = new ArrayList<>();
            Location location = new Location();

            String storename = "Store_"+Integer.toString(i);

            //RATING
            store.setRating(getRating());

            //CONTACT INFO
            ContactInfo contactInfo = new ContactInfo();
            store.setStoreCode(i);
            store.setStoreName(storename);

            //GET ITEMS
            items = getItems(storename);
            store.setItems(items);

            //LOCATION
            Location storeLocation = new Location();
            location.setCountry(Country.INDIA);
            location.setIndianState(IndianStates.GUJARAT);
            location.setIndianCity(IndianCities.AHMEDABAD);
            store.setLocation(location);

            //CONTACT INFO
            ContactInfo storeContactInfo = new ContactInfo();
            storeContactInfo.setManagerContact("9919192819");
            storeContactInfo.setManagerName("ManageName");
            storeContactInfo.setStoreEmailId("storeEmail@gmail.com");
            store.setContactInfo(storeContactInfo);

            RestAssured.baseURI = "http://localhost:8080";
            String storeEndpoint = "/stores";

            Gson gson = new Gson();
            String request = gson.toJson(store);
            Response response = given().log().all()
                    .contentType(ContentType.JSON)
                    .body(store, JACKSON_2)
                    .when().post(storeEndpoint).thenReturn();
            System.out.println("STATUS CODE: "+response.getStatusCode());
            Assert.assertTrue(response.getStatusCode() == 201);
        }
    }

    /**
     * Returns list of items
     * @param storeName
     * @return
     */
    public ArrayList<Item> getItems(String storeName){
        ArrayList<Item> items = new ArrayList<>();

        for(int i=0;i<50;i++){
            Item item = new Item();
            item.setItemCode(i);

            item.setItemName(storeName+"_item"+i);
            item.setNutritionFacts(getNutritionFacts());
            item.setIngredients(getIngredients());
            item.setRating(getRating());
            item.setPrice(100);
            item.setItemCategory(getItemCategory());
            items.add(item);
        }
        return items;
    }

    /**
     * returns category
     * @return
     */
    public String getItemCategory(){
        ArrayList list = new ArrayList();
        list.add("Hot");
        list.add("Sweets");
        list.add("Biryani");
        list.add("Curries");
        list.add("Snacks");
        list.add("Gujrat Snacks");
        list.add("Telangana Snacks");

        Random random = new Random();
        return list.get(random.nextInt(list.size())).toString();
    }

    /**
     * returns Ingredients
     * @return
     */
    public Ingredients getIngredients(){
        Ingredients ingredients = new Ingredients();

        ArrayList<String> ingredientsList = new ArrayList<>();
        ingredientsList.add("sugar");
        ingredientsList.add("salt");
        ingredientsList.add("gluten");
        ingredientsList.add("cardamon");
        ingredientsList.add("carom");
        ingredientsList.add("refined floor");
        ingredientsList.add("mustard");
        ingredientsList.add("jeera");
        ingredientsList.add("elaichi");
        ingredientsList.add("garam masala");
        ingredientsList.add("kastoori methi");
        ingredientsList.add("cinamon");
        ingredientsList.add("kaju");
        ingredientsList.add("badam");
        ingredientsList.add("pista");
        ingredientsList.add("ghee");
        ingredientsList.add("coconut oil");
        ingredientsList.add("mustard oil");


        ArrayList<String> ingredients_random = new ArrayList<>();
        Random random = new Random();
        ingredients_random.add(ingredientsList.get(random.nextInt(ingredientsList.size())));
        ingredients_random.add(ingredientsList.get(random.nextInt(ingredientsList.size())));
        ingredients_random.add(ingredientsList.get(random.nextInt(ingredientsList.size())));
        ingredients_random.add(ingredientsList.get(random.nextInt(ingredientsList.size())));
        ingredients_random.add(ingredientsList.get(random.nextInt(ingredientsList.size())));
        ingredients_random.add(ingredientsList.get(random.nextInt(ingredientsList.size())));
        ingredients_random.add(ingredientsList.get(random.nextInt(ingredientsList.size())));

        ingredients.setIngredients(ingredients_random);
        return ingredients;
    }

    /**
     * Returns Rating object
     * @return
     */
    public Rating getRating(){
        Rating[] ratings = {Rating.ONE,Rating.TWO,Rating.THREE,Rating.FOUR,Rating.FIVE};
        Random random = new Random();
        int rating = random.nextInt(4);
        return ratings[rating];
    }

    /**
     * Returns Nutrition object
     * @return
     */
    public Nutrition getNutritionFacts(){
        Nutrition nutrition = new Nutrition();
            Random random = new Random();

            HashMap<NutritionFacts,String> nutritionFacts1 = new HashMap<>();
            nutritionFacts1.put(NutritionFacts.TotalCarbs, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.DietaryFiber, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.Sugars, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.Protien, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.totalFat, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.cholestrol, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.vitaminA, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.vitaminC, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.calcium, Integer.toString(random.nextInt(10)));
            nutritionFacts1.put(NutritionFacts.iron, Integer.toString(random.nextInt(10)));

            nutrition.setNutritionFacts(nutritionFacts1);
        return nutrition;
    }

    @Test
    public void StubItemData(){
        generateStoreStub();
    }
}
