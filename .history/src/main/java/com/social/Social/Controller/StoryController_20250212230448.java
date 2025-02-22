package com.social.Social.Controller;

@RestController
public class StoryController {
    
    @GetMapping
    public String getStory() {
        return "story";
    }
}
