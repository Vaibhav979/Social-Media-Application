package com.social.Social.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.models.User;

@RestController
public class UserController {

    @GetMapping("/users")
    public User getUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User ("code", "Zosh", "codewithzosh@gmail.com", "1234");
        users
        return null;
    } 
}
