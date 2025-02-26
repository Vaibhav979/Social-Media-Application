package com.social.Social.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    public ResponseEntity<Post> createPost(Post post){
        Post post = postsService.cr
    }
}
