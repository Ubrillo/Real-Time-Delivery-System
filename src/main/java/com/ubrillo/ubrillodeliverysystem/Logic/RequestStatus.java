package com.ubrillo.ubrillodeliverysystem.Logic;

public enum RequestStatus {
    DELIVERED("Delivered"), INTRANSIT("Intransit"), WAITING("Waiting");
    private String status;
    private RequestStatus(String st){
        status = st;
    }
    public String toString(){
        return status;
    }
}
