package com.air.baggageservice.model;

public class BaggageRequest {
    private String baggageID;
    private String baggageCategory;

    public String getBaggageID() {
        return baggageID;
    }

    public void setBaggageID(String baggageID) {
        this.baggageID = baggageID;
    }

    public String getBaggageCategory() {
        return baggageCategory;
    }

    public void setBaggageCategory(String baggageCategory) {
        this.baggageCategory = baggageCategory;
    }

}
