package com.nc.ncproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String SayHello(){
        return "Hello world";
    }
}
