package com.social.Social.Controller;

// import java.util.ArrayList;
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
    public User getUserById(@PathVariable("userId") Integer id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }

        throw new Exception("user not exist with userid " + id);
    }

    // update
    @PutMapping("/users/{userId}")
    >public User updateUser(@RequestBody User user, @PathVariable Integer userId) throws Exception {
        Optional<User> user1 = userRepository.findById(userId);
        if (user1.isEmpty()) {
            throw new Exception("user not found");
        }

        User oldUser = user1.get();
        if (user.getFirstName() != null) {
            oldUser.setFirstName(user.getFirstName());
        }
        if (user.getLastName() != null) {
            oldUser.setLastName(user.getLastName());
        }
        if (user.getPassword() != null) {
            oldUser.setPassword(user.getPassword());
        }
        if (user.getEmail() != null) {
            oldUser.setEmail(user.getEmail());
        }

        return userRepository.save(oldUser);
    }

    // delete
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable("userId") Integer id) {
        return "User with id " + id + " deleted";
    }

    // Assignment: posts, reels, etc
}
