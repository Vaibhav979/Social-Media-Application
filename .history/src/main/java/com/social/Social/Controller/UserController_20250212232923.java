package com.social.Social.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.models.User;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "code", "Zosh", "codewithzosh@gmail.com", "1234");
        users.add(user1);
        return users;
    }

    @GetMapping("/users/{userId}")
    public List<User> getUserById(@PathVariable("userId") Integer id) {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "code", "Zosh", "codewithzosh@gmail.com", "1234");
        users.add(user1);
        return users;
    }
}
