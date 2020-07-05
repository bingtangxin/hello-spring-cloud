package com.test.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "hello" ,method = RequestMethod.GET)
    public String sayHello(String message){
        return String.format("Hello!your message is %s port is %s",message,port);
    }


    @RequestMapping(value = "hello2" ,method = RequestMethod.GET)
    public String sayHello2(@RequestParam(value = "message4") String message2){
        return String.format("Hello!your message is %s port is %s",message2,port);
    }
}
