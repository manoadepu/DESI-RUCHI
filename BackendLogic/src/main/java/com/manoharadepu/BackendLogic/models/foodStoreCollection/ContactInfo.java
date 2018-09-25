
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
    "managerName",
    "storeEmailId",
    "storeContact",
    "managerContact"
})
public class ContactInfo {

    @JsonProperty("managerName")
    private String managerName;
    @JsonProperty("storeEmailId")
    private Object storeEmailId;
    @JsonProperty("storeContact")
    private Object storeContact;
    @JsonProperty("managerContact")
    private String managerContact;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("managerName")
    public String getManagerName() {
        return managerName;
    }

    @JsonProperty("managerName")
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @JsonProperty("storeEmailId")
    public Object getStoreEmailId() {
        return storeEmailId;
    }

    @JsonProperty("storeEmailId")
    public void setStoreEmailId(Object storeEmailId) {
        this.storeEmailId = storeEmailId;
    }

    @JsonProperty("storeContact")
    public Object getStoreContact() {
        return storeContact;
    }

    @JsonProperty("storeContact")
    public void setStoreContact(Object storeContact) {
        this.storeContact = storeContact;
    }

    @JsonProperty("managerContact")
    public String getManagerContact() {
        return managerContact;
    }

    @JsonProperty("managerContact")
    public void setManagerContact(String managerContact) {
        this.managerContact = managerContact;
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
