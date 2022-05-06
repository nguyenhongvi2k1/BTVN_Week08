package com.example.btvn_week08_lt.Model;

public class The_Slide_Items_Model_Class {
    private int featured_image;
    private String the_caption_Title;
    private String description;

    public The_Slide_Items_Model_Class(int featured_image, String the_caption_Title, String description) {
        this.featured_image = featured_image;
        this.the_caption_Title = the_caption_Title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFeatured_image() {
        return featured_image;
    }

    public void setFeatured_image(int featured_image) {
        this.featured_image = featured_image;
    }

    public String getThe_caption_Title() {
        return the_caption_Title;
    }

    public void setThe_caption_Title(String the_caption_Title) {
        this.the_caption_Title = the_caption_Title;
    }
}
