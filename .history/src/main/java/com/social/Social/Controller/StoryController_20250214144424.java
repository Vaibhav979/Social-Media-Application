package com.social.Social.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.models.Stories;

@RestController
public class StoryController {

    @GetMapping("/story")
    public List<Stories> getStory() {
        return null;
    }

}
