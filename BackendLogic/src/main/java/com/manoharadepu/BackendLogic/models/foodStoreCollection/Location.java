
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
    "country",
    "indianState",
    "usState",
    "indianCity",
    "usCity",
    "pincode"
})
public class Location {

    @JsonProperty("country")
    private String country;
    @JsonProperty("indianState")
    private String indianState;
    @JsonProperty("usState")
    private Object usState;
    @JsonProperty("indianCity")
    private String indianCity;
    @JsonProperty("usCity")
    private Object usCity;
    @JsonProperty("pincode")
    private Integer pincode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("indianState")
    public String getIndianState() {
        return indianState;
    }

    @JsonProperty("indianState")
    public void setIndianState(String indianState) {
        this.indianState = indianState;
    }

    @JsonProperty("usState")
    public Object getUsState() {
        return usState;
    }

    @JsonProperty("usState")
    public void setUsState(Object usState) {
        this.usState = usState;
    }

    @JsonProperty("indianCity")
    public String getIndianCity() {
        return indianCity;
    }

    @JsonProperty("indianCity")
    public void setIndianCity(String indianCity) {
        this.indianCity = indianCity;
    }

    @JsonProperty("usCity")
    public Object getUsCity() {
        return usCity;
    }

    @JsonProperty("usCity")
    public void setUsCity(Object usCity) {
        this.usCity = usCity;
    }

    @JsonProperty("pincode")
    public Integer getPincode() {
        return pincode;
    }

    @JsonProperty("pincode")
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
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
