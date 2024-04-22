package com.hickey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(ModelAndView mv) {
        mv.addObject("msg", "Hello Spring MVC");
        mv.setViewName("hello");
        return mv;
    }
}
