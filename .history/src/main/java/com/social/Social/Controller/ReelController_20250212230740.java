package com.social.Social.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReelController {
    
    @GetMapping("/reels")
    public Strin reels(){
        return "reels";
    }
}
