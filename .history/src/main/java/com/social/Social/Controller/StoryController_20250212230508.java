package com.social.Social.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoryController {
    
    @GetMapping(/story")
    public String getStory() {
        return "story";
    }

    
}
