package com.social.Social.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.Social.models.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByEmail(String email);

    public Lis

    // Optional findById(Integer id);
}
