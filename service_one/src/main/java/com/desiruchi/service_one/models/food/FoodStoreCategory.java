package com.desiruchi.service_one.models.food;

import org.springframework.data.annotation.Id;

import java.util.List;

public class FoodStoreCategory {
    //this is name of the category the seller names
    @Id
    private String categoryName;
    private List<FoodItem> foodItems;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }
}
