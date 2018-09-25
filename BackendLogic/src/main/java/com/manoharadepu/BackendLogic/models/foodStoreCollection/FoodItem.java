
package com.manoharadepu.BackendLogic.models.foodStoreCollection;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nutritionFacts",
    "ingredients",
    "rating",
    "price",
    "itemCategory"
})
public class FoodItem {

    @JsonProperty("nutritionFacts")
    private NutritionFacts nutritionFacts;
    @JsonProperty("ingredients")
    private Ingredients ingredients;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("itemCategory")
    private String itemCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nutritionFacts")
    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    @JsonProperty("nutritionFacts")
    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    @JsonProperty("ingredients")
    public Ingredients getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("itemCategory")
    public String getItemCategory() {
        return itemCategory;
    }

    @JsonProperty("itemCategory")
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
