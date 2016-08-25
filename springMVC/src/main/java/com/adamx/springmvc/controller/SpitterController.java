package com.adamx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shangzhidong on 2016/8/25.
 */
@Controller
@RequestMapping(value = "/spitter",method = RequestMethod.GET)
public class SpitterController {
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegistrationForm(){
        return "registerForm";
    }
}
