package com.social.Social.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    public String homeController() {
        return "this is home controoler"
    }
}
