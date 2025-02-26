package com.social.Social.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String caption; // urls

    private String image; // urls

    private String video; // url

    private User user;

    private LocalDateTime creadtedAt;
}
