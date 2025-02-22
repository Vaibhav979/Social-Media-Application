package com.social.Social.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    public String homeControllerHandler() {
        return "this is home controoler"
    }
}
