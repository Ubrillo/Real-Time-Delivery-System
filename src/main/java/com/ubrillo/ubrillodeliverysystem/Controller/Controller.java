package com.ubrillo.ubrillodeliverysystem.Controller;

import com.ubrillo.ubrillodeliverysystem.Logic.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller   {
    @Autowired
    RequestService requestMan;

    @Autowired
    OrderList orderList;

    @Autowired
    DispatchQueue2nd dispatchQueue2nd;

    @Autowired
    BatchDispatcher batchDispatcher;


    @PostMapping("api/v1/ub-delivery/create-request")
    public newRequestResponse requestReceiver(@RequestBody Request request){
        Request order = requestMan.createRequest(request);

        orderList.addOrder(order);
        batchDispatcher.checkSizeTrigger();
        System.out.println(orderList.getSize());

        return new newRequestResponse(order);
    }

    @PostMapping("api/v1/ub-delivery/cancel-request")
    public void cancelOrder(@RequestBody Request request){
        String Id = request.getRequestId();
        orderList.removeOrderById(Id);
        //System.out.println(orderList.getSize());
    }


}
