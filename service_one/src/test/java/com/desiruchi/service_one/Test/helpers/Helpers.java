package com.desiruchi.service_one.Test.helpers;

import com.desiruchi.service_one.models.food.FoodItem;
import com.desiruchi.service_one.models.food.Ingredients;
import com.desiruchi.service_one.models.food.Nutrition;
import com.desiruchi.service_one.models.food.NutritionFacts;
import com.desiruchi.service_one.models.generic.*;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

public class Helpers {


    Random random = new Random();


    FoodItem foodItem = new FoodItem();
    /**
     *
     * @return
     */
    public Location getRandomLocation(){
        Location location = new Location();
        ArrayList<Location> locations = new ArrayList<>();

        //IndianStates
        ArrayList<IndianStates> indianStates = new ArrayList<>();
        indianStates.add(IndianStates.ANDHRAPRADESH);
        indianStates.add(IndianStates.TELANGANA);
        indianStates.add(IndianStates.KERALA);
        indianStates.add(IndianStates.TAMILNADU);
        indianStates.add(IndianStates.KARNATAKA);
        indianStates.add(IndianStates.GUJARAT);

        Random random = new Random();
        int randomIndex = random.nextInt(indianStates.size());
        location.setCountry(Country.INDIA);
        location.setIndianState(indianStates.get(randomIndex));
        if(indianStates.get(randomIndex).equals(IndianStates.ANDHRAPRADESH)){
            location.setIndianCity(IndianCities.VIJAYAWADA);
        } else if (indianStates.get(randomIndex).equals(IndianStates.TELANGANA)) {
            location.setIndianCity(IndianCities.HYDERABAD);
        } else if (indianStates.get(randomIndex).equals(IndianStates.KERALA)) {
            location.setIndianCity(IndianCities.TRIVANDRUM);
        }else if (indianStates.get(randomIndex).equals(IndianStates.TAMILNADU)) {
            location.setIndianCity(IndianCities.CHENNAI);
        }else if (indianStates.get(randomIndex).equals(IndianStates.KARNATAKA)) {
            location.setIndianCity(IndianCities.BANGALORE);
        }else if (indianStates.get(randomIndex).equals(IndianStates.GUJARAT)) {
            location.setIndianCity(IndianCities.AHMEDABAD);
        }

        return location;
    }

    /**
     *
     * @return
     */
    public ContactInfo getRandomContactInfo(){
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setManagerContact("9918192819");
        contactInfo.setManagerName("Abhilash Nomula");
        contactInfo.setStoreEmailId("storeemail@gmail.com");
        return contactInfo;
    }

    /**
     *
     */
    public String getRandomCategoryForFoodStore(){
        ArrayList<String> foodStoreCategories = new ArrayList<>();
        foodStoreCategories.add("hot");
        foodStoreCategories.add("sweet");
        return foodStoreCategories.get(random.nextInt(foodStoreCategories.size()));
    }

    /**
     *
     */
    public List<FoodItem> getRandomFoodItems(String foodItemStoreCategory){
        ArrayList<FoodItem> foodItemsList=null;
        if(foodItemStoreCategory.equals("hot")){
            foodItemsList = getListOfHotFoodItems();
        }
        if(foodItemStoreCategory.equals("sweet")){
            for(int i=0;i<5;i++){
                foodItemsList = getListOfSweetFoodItems();
            }
        }
        return foodItemsList;
    }

    /**
     *
     */
    public ArrayList<FoodItem> getListOfHotFoodItems(){
        ArrayList<FoodItem> foodItemsList = new ArrayList<>();
        for(int i=0;i<10;i++){
        FoodItem foodItem = new FoodItem();
        foodItem.setItemCategory("Hot");

        //foodItems
        ArrayList<String> foodItems = new ArrayList<>();
        foodItems.add("Boondi");
        foodItems.add("Mixture");
        foodItems.add("Murukulu");
        foodItems.add("Sakinalu");
        foodItems.add("Samosa");
        foodItems.add("Kachori");
        foodItems.add("Mirchi Bajji");
        foodItems.add("Chicken65");
        foodItems.add("Tandoori chicken");
        foodItems.add("Chicken majestic");

        foodItem.setItemName(foodItems.get(i));

        //Nutrition
        Nutrition nutrition = new Nutrition();
        HashMap<NutritionFacts,String> nutritionFactsStringHashMap= new HashMap<>();
        nutritionFactsStringHashMap.put(NutritionFacts.calcium,"10gm");
        nutritionFactsStringHashMap.put(NutritionFacts.cholestrol,"10gm");
        nutritionFactsStringHashMap.put(NutritionFacts.DietaryFiber,"10gm");
        nutritionFactsStringHashMap.put(NutritionFacts.Protien,"10gm");
        nutritionFactsStringHashMap.put(NutritionFacts.TotalCarbs,"10gm");

        nutrition.setNutritionFacts(nutritionFactsStringHashMap);
        foodItem.setNutritionFacts(nutrition);

        //Ingredients
        Ingredients ingredients = new Ingredients();
        ArrayList<String>ingredientsList = new ArrayList<>();
        ingredientsList.add("salt");
        ingredientsList.add("ginger");
        ingredientsList.add("chilli powder");
        ingredientsList.add("sesame powder");
        ingredientsList.add("garlic");

        ingredients.setIngredients(ingredientsList);
        foodItem.setIngredients(ingredients);

        //Rating
        foodItem.setRating(Rating.FOUR);

        //Price
        foodItem.setPrice(45);

        //ItemCategory
        foodItem.setItemCategory("Hot");

        foodItemsList.add(foodItem);
        }
        return foodItemsList;
    };

    /**
     *
     */
    public ArrayList<FoodItem> getListOfSweetFoodItems(){
        ArrayList<FoodItem> foodItemsList = new ArrayList<>();
        for(int i=0;i<10;i++){
            FoodItem foodItem = new FoodItem();
            foodItem.setItemCategory("Sweet");

            //foodItems
            ArrayList<String> foodItems = new ArrayList<>();
            foodItems.add("Kalakhand");
            foodItems.add("Jilebi");
            foodItems.add("Agra peta");
            foodItems.add("Rasgulla");
            foodItems.add("Rasmalai");
            foodItems.add("Bellam Jilebi");
            foodItems.add("Pootharekulu");
            foodItems.add("Kaju Barfi");
            foodItems.add("Laddu");
            foodItems.add("Dryfruits sweet");

            foodItem.setItemName(foodItems.get(i));

            //Nutrition
            Nutrition nutrition = new Nutrition();
            HashMap<NutritionFacts,String> nutritionFactsStringHashMap= new HashMap<>();
            nutritionFactsStringHashMap.put(NutritionFacts.calcium,"10gm");
            nutritionFactsStringHashMap.put(NutritionFacts.cholestrol,"10gm");
            nutritionFactsStringHashMap.put(NutritionFacts.DietaryFiber,"10gm");
            nutritionFactsStringHashMap.put(NutritionFacts.Protien,"10gm");
            nutritionFactsStringHashMap.put(NutritionFacts.TotalCarbs,"10gm");

            nutrition.setNutritionFacts(nutritionFactsStringHashMap);
            foodItem.setNutritionFacts(nutrition);

            //Ingredients
            Ingredients ingredients = new Ingredients();
            ArrayList<String>ingredientsList = new ArrayList<>();
            ingredientsList.add("sugar");
            ingredientsList.add("cream");
            ingredientsList.add("ghee");
            ingredientsList.add("Kaju");
            ingredientsList.add("Bellam");

            ingredients.setIngredients(ingredientsList);
            foodItem.setIngredients(ingredients);

            //Rating
            foodItem.setRating(Rating.FOUR);

            //Price
            foodItem.setPrice(60);

            //ItemCategory
            foodItem.setItemCategory("Sweet");

            foodItemsList.add(foodItem);
        }
        return foodItemsList;
    };

    public Response restCall(String endPoint, Object request) {

        Gson gson = new Gson();
        String requestJSON = gson.toJson(request);
        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .body(requestJSON, JACKSON_2)
                .when().post(endPoint).thenReturn();
        System.out.println("STATUS CODE: "+response.getStatusCode());
        return response;
    }

}
