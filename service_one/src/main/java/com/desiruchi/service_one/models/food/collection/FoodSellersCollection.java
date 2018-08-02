package com.desiruchi.service_one.models.food.collection;

import org.springframework.data.annotation.Id;

public class FoodSellersCollection {
    @Id
    private int storeID;
    private String email;
    private String password;

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
