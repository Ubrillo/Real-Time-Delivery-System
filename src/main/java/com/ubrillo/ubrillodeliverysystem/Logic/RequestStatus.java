package com.ubrillo.ubrillodeliverysystem.Logic;

public enum RequestStatus {
    DELIVERED("Delivered"), CREATED("Created"), QUEUED("Queued"),
    DISPATCHED("Dispatched"), CANCELLED("Cancelled");
    private String status;
    private RequestStatus(String st){
        status = st;
    }
    public String toString(){
        return status;
    }
}
