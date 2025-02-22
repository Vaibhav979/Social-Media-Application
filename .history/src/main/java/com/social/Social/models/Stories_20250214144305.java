package com.social.Social.models;

public class Stories {
    private String setStory;
    private String removeStory;
    public Stories() {
    }
    public Stories(String setStory, String removeStory) {
        this.setStory = setStory;
        this.removeStory = removeStory;
    }
    public String getSetStory() {
        return setStory;
    }
    public void setSetStory(String setStory) {
        this.setStory = setStory;
    }
    public String getRemoveStory() {
        return removeStory;
    }
    public void setRemoveStory(String removeStory) {
        this.removeStory = removeStory;
    }

    
}
