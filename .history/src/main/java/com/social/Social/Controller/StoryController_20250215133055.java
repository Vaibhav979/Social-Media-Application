package com.social.Social.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.Social.models.Stories;

@RestController
public class StoryController {

    @GetMapping("/story")
    public List<Stories> showStories() {
        List<Stories> story = new ArrayList<>();
        Stories story1 = new Stories("1", "0");
        Stories story2 = new Stories("1", "0");
        story.add(story1);
        story.add(story2);
        return story;
    }

    @GetMapping("story/{storyId}")
    public Stories getStory(@PathVariable String storyId) {
        Stories story = new Stories("1", "0");
        story.setSetStory(storyId);
        return story;
    }

    @PostMapping("/story")
    public Stories createStroy(@RequestBody Stories story) {
        Stories newStory = new Stories("1", "0");// This is a new object, it does not reference the object passed in the request body
        newStory.setSetStory(story.getSetStory());
        newStory.setRemoveStory(story.getRemoveStory());
    }

}
