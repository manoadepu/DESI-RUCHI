package com.desiruchi.service_one.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

    @Id
    private int itemCode;
    private String itemName;
    private Nutrition nutritionFacts;
    private Ingredients ingredients;
    private Rating rating;
    private int price;

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Nutrition getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(Nutrition nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
