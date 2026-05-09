package com.ubrillo.ubrillodeliverysystem.Logic;

public class newRequestResponse implements Response{
    private String customerName, trackId, deliveryAdress, postAddress;
    private String description, time;

    public newRequestResponse(Request newRequestObj) {
        this.customerName = newRequestObj.getCustomerName();
        this.trackId = newRequestObj.getRequestId();
        this.deliveryAdress = newRequestObj.getDeliveryAdress();
        this.description = newRequestObj.getDescription();
        this.time = newRequestObj.getTime();
        this.postAddress = newRequestObj.getPickupAdress();
    }

    @Override
    public void newRequestResponse() {

    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
