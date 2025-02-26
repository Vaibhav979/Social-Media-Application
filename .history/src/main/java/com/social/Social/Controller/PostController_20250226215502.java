package com.social.Social.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.Service.PostService;
import com.social.Social.models.Post;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/posts/user/{userId}")
    public ResponseEntity<Post> createPost(@RequestBody Post post, @PathVariable Integer userId) 
        Post createdPost = postService.createPost(post, userId);
        return new ResponseEntity<>(createdPost,HttpStatus.ACCEPTED);
    }
}
