package com.social.Social.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.Repository.UserRepository;
import com.social.Social.Service.UserService;
import com.social.Social.models.User;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    // post method
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return savedUser;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll(); // for data retrieval use findAll()
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Integer id) throws Exception {
        User user = userService.findUserById(id);
        return user;
    }

    // update
    @PutMapping("/users/{userId}")
    public User updateUser(@RequestBody User user, @PathVariable Integer userId) throws Exception {
        User updateUser = userService.updateUser(user, userId)
    }

    // delete
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable("userId") Integer id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new Exception("User does not exist");
        }
        userRepository.delete(user.get());
        return "User with " + id + " deleted";
    }
}
