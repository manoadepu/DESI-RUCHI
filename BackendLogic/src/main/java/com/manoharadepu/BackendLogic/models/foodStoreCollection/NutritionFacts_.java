
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
    "TotalCarbs",
    "Protien",
    "DietaryFiber",
    "cholestrol",
    "calcium"
})
public class NutritionFacts_ {

    @JsonProperty("TotalCarbs")
    private String totalCarbs;
    @JsonProperty("Protien")
    private String protien;
    @JsonProperty("DietaryFiber")
    private String dietaryFiber;
    @JsonProperty("cholestrol")
    private String cholestrol;
    @JsonProperty("calcium")
    private String calcium;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TotalCarbs")
    public String getTotalCarbs() {
        return totalCarbs;
    }

    @JsonProperty("TotalCarbs")
    public void setTotalCarbs(String totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    @JsonProperty("Protien")
    public String getProtien() {
        return protien;
    }

    @JsonProperty("Protien")
    public void setProtien(String protien) {
        this.protien = protien;
    }

    @JsonProperty("DietaryFiber")
    public String getDietaryFiber() {
        return dietaryFiber;
    }

    @JsonProperty("DietaryFiber")
    public void setDietaryFiber(String dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    @JsonProperty("cholestrol")
    public String getCholestrol() {
        return cholestrol;
    }

    @JsonProperty("cholestrol")
    public void setCholestrol(String cholestrol) {
        this.cholestrol = cholestrol;
    }

    @JsonProperty("calcium")
    public String getCalcium() {
        return calcium;
    }

    @JsonProperty("calcium")
    public void setCalcium(String calcium) {
        this.calcium = calcium;
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
