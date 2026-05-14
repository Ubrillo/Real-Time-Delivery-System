package com.ubrillo.ubrillodeliverysystem.Logic;

import java.util.*;

public class OrderList {
    private Map<String, Request> orderList;

    public OrderList(){
        //this.order = order;
        this.orderList = new LinkedHashMap<>();
    }

    public void addOrder(Request order){
        orderList.put(order.getRequestId(), order);
    }

    public Request getOrder(String Id){
        if (orderList.containsKey(Id)){
            return orderList.get(Id);
        }
        return null;
    }

    public void removeOrderById(String Id){
        orderList.remove(Id);
    }
    public void removeOrderByObj(Request Order){
        //sorderList.rem
    }

    public int getSize(){
        return orderList.size();
    }
    @Override
    public String toString() {
        return "OrderQueue{" +
                "orderQueue=" + orderList +
                '}';
    }
}