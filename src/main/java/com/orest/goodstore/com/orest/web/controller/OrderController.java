package com.orest.goodstore.com.orest.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OrderController {

    @RequestMapping(value = "order")
    public ModelAndView order(){

        return new ModelAndView("order");
    }
}
