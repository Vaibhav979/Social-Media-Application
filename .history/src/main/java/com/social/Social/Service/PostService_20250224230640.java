package com.social.Social.Service;

import java.util.List;

import com.social.Social.models.Post;

public interface PostService {
    Post createPost(Post post, Integer userId) throws Exception;

    String deletePost(Integer postId, Integer userId) throws Exception;

    List<Post> findPostByUserId(Integer userId);

    Post findPostById(Integer postId) throws Exception;

    List<Post> findAllPost();

    Post savedPost(Integer postId, Integer userId);

    Post likePost(Integer postId, Integer userId);
}
