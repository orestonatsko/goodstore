package com.orest.goodstore.com.orest.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreetingController {

    @GetMapping("goodstore")
    public ModelAndView greeting() {

        return new ModelAndView("greeting.html");
    }
}


