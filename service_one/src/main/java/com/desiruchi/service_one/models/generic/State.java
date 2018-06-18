package com.desiruchi.service_one.models.generic;

public class State {
    private IndianStates[] indianStates;
    private USStates[] usStates;

    public IndianStates[] getIndianStates() {
        return indianStates;
    }

    public void setIndianStates(IndianStates[] indianStates) {
        this.indianStates = indianStates;
    }

    public USStates[] getUsStates() {
        return usStates;
    }

    public void setUsStates(USStates[] usStates) {
        this.usStates = usStates;
    }
}
