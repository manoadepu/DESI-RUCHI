
package com.manoharadepu.BackendLogic.models.foodSellerCollection;

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
    "self",
    "foodSellersCollection"
})
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("foodSellersCollection")
    private FoodSellersCollection foodSellersCollection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("self")
    public Self getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
    }

    @JsonProperty("foodSellersCollection")
    public FoodSellersCollection getFoodSellersCollection() {
        return foodSellersCollection;
    }

    @JsonProperty("foodSellersCollection")
    public void setFoodSellersCollection(FoodSellersCollection foodSellersCollection) {
        this.foodSellersCollection = foodSellersCollection;
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
