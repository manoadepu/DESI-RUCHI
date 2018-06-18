package com.desiruchi.service_one.models.generic;

public class City {
    private IndianCities[] indianCities;
    private USCities[] usCities;

    public IndianCities[] getIndianCities() {
        return indianCities;
    }

    public void setIndianCities(IndianCities[] indianCities) {
        this.indianCities = indianCities;
    }

    public USCities[] getUsCities() {
        return usCities;
    }

    public void setUsCities(USCities[] usCities) {
        this.usCities = usCities;
    }
}
