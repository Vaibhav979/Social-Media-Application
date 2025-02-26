package com.social.Social.Service;

import java.util.List;

import com.social.Social.models.Post;

public class PostServiceImplementation implements PostService {

    @Override
    public Post createPost(Post post, Integer userId) throws Exception {
        Post newPost = new Post();
        newPost.setCaption(post.getCaption());
        newPost.setImage(post.getImage());
        newPost.setVideo(post.getVideo());
        newPost.setUserId(post.getUserId)
        return null;
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
