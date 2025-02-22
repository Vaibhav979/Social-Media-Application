package com.social.Social.Controller;

@RestController
public class UserController {
    
    @GetMapping("/usets")
    public String users(){
        return "get all users";
    }
}
