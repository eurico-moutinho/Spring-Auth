package com.bmt.MyStore.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping({"", "/"})
    public String home() {

        return "index";
        
    }

    @GetMapping("/contact")
    public String contact() {

        return "contact";
    }

}
