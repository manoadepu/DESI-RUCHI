package com.desiruchi.service_one.model;

public class Location {
    private Country country;
    private IndianStates indianState;
    private USStates usState;
    private IndianCities indianCity;
    private USCities usCity;
    private int pincode;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public IndianStates getIndianState() {
        return indianState;
    }

    public void setIndianState(IndianStates indianState) {
        this.indianState = indianState;
    }

    public USStates getUsState() {
        return usState;
    }

    public void setUsState(USStates usState) {
        this.usState = usState;
    }

    public IndianCities getIndianCity() {
        return indianCity;
    }

    public void setIndianCity(IndianCities indianCity) {
        this.indianCity = indianCity;
    }

    public USCities getUsCity() {
        return usCity;
    }

    public void setUsCity(USCities usCity) {
        this.usCity = usCity;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
