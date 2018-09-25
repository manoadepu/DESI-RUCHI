
package com.manoharadepu.BackendLogic.models.foodStoreCollection;

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
    "storeName",
    "foodStoreCategories",
    "location",
    "rating",
    "contactInfo",
    "_links"
})
public class FoodStore {

    @JsonProperty("storeName")
    private String storeName;
    @JsonProperty("foodStoreCategories")
    private List<FoodStoreCategory> foodStoreCategories = null;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("contactInfo")
    private ContactInfo contactInfo;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("storeName")
    public String getStoreName() {
        return storeName;
    }

    @JsonProperty("storeName")
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @JsonProperty("foodStoreCategories")
    public List<FoodStoreCategory> getFoodStoreCategories() {
        return foodStoreCategories;
    }

    @JsonProperty("foodStoreCategories")
    public void setFoodStoreCategories(List<FoodStoreCategory> foodStoreCategories) {
        this.foodStoreCategories = foodStoreCategories;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("contactInfo")
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    @JsonProperty("contactInfo")
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
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
