package com.example.btvn_week08_lt.Model;

import com.google.gson.annotations.SerializedName;

public class Place {
    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String imageUrl;

    public Place(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
