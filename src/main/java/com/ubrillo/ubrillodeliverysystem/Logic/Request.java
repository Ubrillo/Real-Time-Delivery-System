package com.ubrillo.ubrillodeliverysystem.Logic;

public class Request {
    private String customerName;
    private String pickupAdress;
    private String deliveryAdress;
    private String pickupPostcode, deliveryPostcode;
    private String requestId;
    private String description;
    private RequestStatus status;
    private Location currentLocation;
    private Location deliveryLocation;
    private String time;

    public Request(String customerName,
                   String pickupAdress, String deliveryAdress,
                   String pickupPostcode, String deliveryPostcode,
                   String requestId, String description,
                   Location currentLocation, Location deliveryLocation,
                   String time) {

        this.customerName = customerName;
        this.pickupAdress = pickupAdress;
        this.deliveryAdress = deliveryAdress;
        this.pickupPostcode = pickupPostcode;
        this.deliveryPostcode = deliveryPostcode;
        this.requestId = requestId;
        this.description = description;
        this.currentLocation = currentLocation;
        this.deliveryLocation = deliveryLocation;
        this.time = time;
        this.status = RequestStatus.WAITING;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupAdress() {
        return pickupAdress;
    }

    public void setPickupAdress(String pickupAdress) {
        this.pickupAdress = pickupAdress;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Location getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(Location deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDeliveryPostcode() {
        return deliveryPostcode;
    }

    public void setDeliveryPostcode(String deliveryPostcode) {
        this.deliveryPostcode = deliveryPostcode;
    }

    public String getPickupPostcode() {
        return pickupPostcode;
    }

    public void setPickupPostcode(String pickupPostcode) {
        this.pickupPostcode = pickupPostcode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Request{" +
                "customerName='" + customerName + '\'' +
                ", pickupAdress='" + pickupAdress + '\'' +
                ", deliveryAdress='" + deliveryAdress + '\'' +
                ", pickupPostcode='" + pickupPostcode + '\'' +
                ", deliveryPostcode='" + deliveryPostcode + '\'' +
                ", requestId='" + requestId + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", currentLocation=" + currentLocation +
                ", deliveryLocation=" + deliveryLocation +
                ", time='" + time + '\'' +
                '}';
    }
}