package com.social.Social.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.Social.models.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query("select p from post ")
    List<Post> findPostByUserId(Integer userId);
}
