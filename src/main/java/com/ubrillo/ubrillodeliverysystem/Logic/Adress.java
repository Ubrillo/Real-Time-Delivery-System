package com.ubrillo.ubrillodeliverysystem.Logic;

public class Adress {
    private String streetName;
    private String houseNo;
    private String postcode;

    public Adress(String streetName, String houseNo, String postcode) {
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.postcode = postcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
