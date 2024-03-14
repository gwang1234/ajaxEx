package com.ajaxEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//ere
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
