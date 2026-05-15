package com.ubrillo.ubrillodeliverysystem.Logic;

public class Customer {
    private String name;
    private String postcode;

    public Customer(String nane, String postcode){
        this.name = name;
        this.postcode = postcode;
    }

    public String getname() {
        return name;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void trackDelivery(){}
    public void placeDelivery(){}
    public void cancelDelivery(){}

    public void Register(){}
    public void login(){}
}
