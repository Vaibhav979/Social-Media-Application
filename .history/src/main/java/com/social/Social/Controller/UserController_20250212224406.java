package com.social.Social.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.models.User;

@RestController
public class UserController {

    @GetMapping("/users")
    public User getUsers() {
        return null;
    }
}
