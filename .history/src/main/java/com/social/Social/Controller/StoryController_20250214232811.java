package com.social.Social.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.models.Stories;

@RestController
public class StoryController {

    @GetMapping("/story")
    public List<Stories> showStories() {
        List<Stories> story = new ArrayList<>();
        Stories story1 = new Stories("1","0");
        Stories story2 = new Stories("1","0");
        story.add(story1);
        story.add(story2);
        return story;
    }

    @GetMapping("story/{storyId}")
    public Stories getStory(@PathVariable String storyId) {
        
    }

}
