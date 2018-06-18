//package com.desiruchi.service_one;
//
//import com.desiruchi.service_one.model.ClothesItemsCategories;
//import com.desiruchi.service_one.model.FoodItemsCategories;
//import com.google.gson.Gson;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static io.restassured.RestAssured.given;
//import static io.restassured.mapper.ObjectMapperType.JACKSON_2;
//
//public class CategoriesStub {
//
//    @Test
//    public void StubItemData(){
//        generateFoodCategories();
//        generateClothesCategories();
//    }
//
//    /**
//     * Inserts dummy food categories in food categories collections
//     */
//    public void generateFoodCategories(){
//        RestAssured.baseURI = "http://localhost:8080";
//        String foodCategoriesEndPoint = "/foodItemsCategories";
//
//        for(int i=0;i<10;i++) {
//            FoodItemsCategories fc = new FoodItemsCategories();
//            String category = "FoodItemCategory_"+i;
//            fc.setFoodId(i);
//            fc.setFoodItem(category);
//
//            ArrayList<Integer> storeCodes = new ArrayList<>();
//            for(int j=0;j<100;j++){
//                storeCodes.add(j);
//            }
//            fc.setStoreCodes(storeCodes);
//
//            Gson gson = new Gson();
//            String request = gson.toJson(fc);
//            Response response = given().log().all()
//                    .contentType(ContentType.JSON)
//                    .body(fc, JACKSON_2)
//                    .when().post(foodCategoriesEndPoint).thenReturn();
//            System.out.println("STATUS CODE: "+response.getStatusCode());
//            Assert.assertTrue(response.getStatusCode() == 201);
//        }
//    }
//
//    /**
//     * Inserts dummy clothes categories in clothes categories collections
//     */
//    public void generateClothesCategories(){
//        RestAssured.baseURI = "http://localhost:8080";
//        String clothesCategoriesEndPoint = "/clothesItemsCategories";
//
//        for(int i=0;i<10;i++) {
//            ClothesItemsCategories cc = new ClothesItemsCategories();
//
//            String category = "ClothesCategory_"+i;
//            cc.setClothesCategory(category);
//
//            Gson gson = new Gson();
//            String request = gson.toJson(cc);
//            Response response = given().log().all()
//                    .contentType(ContentType.JSON)
//                    .body(cc, JACKSON_2)
//                    .when().post(clothesCategoriesEndPoint).thenReturn();
//            System.out.println("STATUS CODE: "+response.getStatusCode());
//            Assert.assertTrue(response.getStatusCode() == 201);
//        }
//    }
//
//}
