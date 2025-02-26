package com.social.Social.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.social.Social.models.Post;
import com.social.Social.models.User;

public class PostServiceImplementation implements PostService {

    @Autowired
    UserService userService;

    @Override
    public Post createPost(Post post, Integer userId) throws Exception {
        User user = userService.findUserById(userId);
        Post newPost = new Post();
        newPost.setCaption(post.getCaption());
        newPost.setImage(post.getImage());
        newPost.setVideo(post.getVideo());
        newPost.setUser(user);
        return newPost;
    }

    @Override
    public String deletePost(Integer postId, Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePost'");
    }

    @Override
    public List<Post> findPostByUserId(Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findPostByUserId'");
    }

    @Override
    public Post findPostById(Integer postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findPostById'");
    }

    @Override
    public List<Post> findAllPost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllPost'");
    }

    @Override
    public Post savedPost(Integer postId, Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savedPost'");
    }

    @Override
    public Post likePost(Integer postId, Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'likePost'");
    }

}
