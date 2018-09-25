
package com.manoharadepu.BackendLogic.models.foodSellerCollection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FoodSellers"
})
public class Embedded {

    @JsonProperty("FoodSellers")
    private List<FoodSeller> foodSellers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FoodSellers")
    public List<FoodSeller> getFoodSellers() {
        return foodSellers;
    }

    @JsonProperty("FoodSellers")
    public void setFoodSellers(List<FoodSeller> foodSellers) {
        this.foodSellers = foodSellers;
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
