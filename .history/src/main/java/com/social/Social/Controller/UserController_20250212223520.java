package com.social.Social.Controller;

@RestController
public class UserController {
    
    @GetMapping("/users")
    public String users(){
        return "get all users";
    }
}
