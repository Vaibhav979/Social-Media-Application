package com.social.Social.Controller;

@RestController
public class UserController {
    
    @GetMapping()
    public String users(){
        return "get all users";
    }
}
