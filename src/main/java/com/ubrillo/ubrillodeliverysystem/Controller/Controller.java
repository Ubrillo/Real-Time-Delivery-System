package com.ubrillo.ubrillodeliverysystem.Controller;

import com.ubrillo.ubrillodeliverysystem.Logic.Request;
import com.ubrillo.ubrillodeliverysystem.Logic.RequestService;
import com.ubrillo.ubrillodeliverysystem.Logic.newRequestResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/uby-delivery")
public class Controller   {
    RequestService requestMan = new RequestService();
    @PostMapping
    public newRequestResponse requestReceiver(@RequestBody Request request){
        Request new_request = requestMan.createRequest(request);
        newRequestResponse response = new newRequestResponse(new_request);
        return response;
    }
}
