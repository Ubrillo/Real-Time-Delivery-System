package com.ubrillo.ubrillodeliverysystem.Logic;

import java.util.LinkedList;
import java.util.Queue;

public class DispatchQueue {
    private Queue<Request> mainQueue;
    private Queue<Request> queueNorthLondon;
    private Queue<Request> queueCentralLondon;
    private Queue<Request> queueWestLondon;
    private Queue<Request> queueEastLondon;
    private Queue<Request> queueSouthLondon;
    private Zone zone;

    public DispatchQueue(){
        mainQueue = new LinkedList<>();
        queueSouthLondon = new LinkedList<>();
        queueCentralLondon = new LinkedList<>();
        queueNorthLondon = new LinkedList<>();
        queueEastLondon = new LinkedList<>();
    }

    public void addOrder(Request order){
        mainQueue.add(order);
    }

    public Request getOrder(){
        return mainQueue.poll();
    }

    public void sorter(){
        while (!mainQueue.isEmpty()){
            Request order = mainQueue.poll();
            //findZone(order);

        }
    }

//    public void findZone(Request order){
//        if (order.getDeliveryLocation() == Zone.WESTL)
//    }
}


