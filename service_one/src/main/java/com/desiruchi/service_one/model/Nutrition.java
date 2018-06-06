package com.desiruchi.service_one.model;

import java.util.HashMap;

public class Nutrition {

    HashMap<NutritionFacts, String> nutritionFacts = new HashMap<NutritionFacts, String>();

    public HashMap<NutritionFacts, String> getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(HashMap<NutritionFacts, String> nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }
}

