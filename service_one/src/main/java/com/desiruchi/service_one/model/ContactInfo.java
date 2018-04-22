package com.desiruchi.service_one.model;

public class ContactInfo {
    private String managerName;
    private String storeEmailId;
    private String storeContact;
    private String managerContact;

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getStoreEmailId() {
        return storeEmailId;
    }

    public void setStoreEmailId(String storeEmailId) {
        storeEmailId = storeEmailId;
    }

    public String getStoreContact() {
        return storeContact;
    }

    public void setStoreContact(String storeContact) {
        this.storeContact = storeContact;
    }

    public String getManagerContact() {
        return managerContact;
    }

    public void setManagerContact(String managerContact) {
        this.managerContact = managerContact;
    }
}
