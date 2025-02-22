package com.social.Social.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.social.Social.Repository.UserRepository;
import com.social.Social.models.User;

@Service
public class UserServiceImplementation implements UserService {

    UserRepository userRepository;
    @Override
    public User registerUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
    }

    @Override
    public User findUserById(Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserById'");
    }

    @Override
    public User findUserByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserByEmail'");
    }

    @Override
    public User followUser(Integer userId1, Integer userId2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'followUser'");
    }

    @Override
    public User updateUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public List<User> searchUser(String query) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchUser'");
    }

}
