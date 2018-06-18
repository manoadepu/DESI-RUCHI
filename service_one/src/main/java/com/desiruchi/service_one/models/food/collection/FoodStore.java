package com.desiruchi.service_one.models.food.collection;

import com.desiruchi.service_one.models.food.FoodStoreCategory;
import com.desiruchi.service_one.models.generic.ContactInfo;
import com.desiruchi.service_one.models.generic.Location;
import com.desiruchi.service_one.models.generic.Rating;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class FoodStore {
    @Id
    private int storeId;

    private String storeName;
    private List<FoodStoreCategory> foodStoreCategories;
    private Location location;
    private Rating rating;
    private ContactInfo contactInfo;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<FoodStoreCategory> getFoodStoreCategories() {
        return foodStoreCategories;
    }

    public void setFoodStoreCategories(List<FoodStoreCategory> foodStoreCategories) {
        this.foodStoreCategories = foodStoreCategories;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
