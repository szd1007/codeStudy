package com.adamx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shangzhidong on 2016/8/17.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String index(){
        return "home";
    }
    @RequestMapping(value = "/get" ,method = RequestMethod.GET)
    public String get(){
        return "get";
    }

}
