package com.social.Social.Service;

import java.util.List;

import com.social.Social.models.User;

public interface UserService {

    public User registerUser(User user);

    public User findUserById(Integer userId) throws Exception;

    public User findUserByEmail(String email);

    public User followUser(Integer userId1, Integer userId2) throws Exception;

    public User updateUser(User user);

    public List<User> searchUser(String query);
}
