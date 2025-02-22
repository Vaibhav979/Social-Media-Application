package com.social.Social.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.social.Social.models.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByEmail(String email);
    @Quer
    public List<User> searchUser(@Param("query") String query);

    // Optional findById(Integer id);
}
