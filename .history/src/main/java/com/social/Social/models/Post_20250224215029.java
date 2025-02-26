package com.social.Social.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    private Integer id;

    private String caption;

    private String image;

    private String vide // url
}
