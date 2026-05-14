package com.ubrillo.ubrillodeliverysystem.Controller;

import com.ubrillo.ubrillodeliverysystem.Logic.OrderList;
import com.ubrillo.ubrillodeliverysystem.Logic.Request;
import com.ubrillo.ubrillodeliverysystem.Logic.RequestService;
import com.ubrillo.ubrillodeliverysystem.Logic.newRequestResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller   {
    RequestService requestMan = new RequestService();
    OrderList orderList = new OrderList();

    @PostMapping("api/v1/ub-delivery/create-request")
    public newRequestResponse requestReceiver(@RequestBody Request request){
        Request order = requestMan.createRequest(request);
        orderList.addOrder(order);

        System.out.println(orderList.getSize());



        newRequestResponse response = new newRequestResponse(order);
        return response;
    }

    @PostMapping("api/v1/ub-delivery/cancel-request")
    public void cancelOrder(@RequestBody Request request){
        String Id = request.getRequestId();
        orderList.removeOrderById(Id);
        System.out.println(orderList.getSize());
    }
}
