package com.boot.setup.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/setup")
public class HomeController {

    @RequestMapping(value = "/getDetails/{id}", method = RequestMethod.GET)
    String firstTest(@PathVariable("id") String id) {
        return "Prince :" + id;
    }


    @RequestMapping(value = "/getJson", method = RequestMethod.POST)
    String secondTest() {
        return null;
    }


}
