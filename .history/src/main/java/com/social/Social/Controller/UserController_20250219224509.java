package com.social.Social.Controller;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.Repository.UserRepository;
import com.social.Social.models.User;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    // post method
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setId(user.getId());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setEmail(user.getEmail());
        newUser.setFirstName(user.getFirstName());

        User savedUser = userRepository.save(newUser);
        return savedUser;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll(); // for data retrieval use findAll()
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Integer id) {
        Optional<User> userRepository.findById(userId);
    }

    // update
    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        User user1 = new User(1, "code", "zosh", "codewithzosh@gmail.com", "1234");
        if (user.getFirstName() != null) {
            user1.setFirstName(user.getFirstName());
        }
        return user1;
    }

    // delete
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable("userId") Integer id) {
        return "User with id " + id + " deleted";
    }

    // Assignment: posts, reels, etc
}
