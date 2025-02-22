package com.social.Social.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.Social.models.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(List<User> findByEmail(String email);

}
