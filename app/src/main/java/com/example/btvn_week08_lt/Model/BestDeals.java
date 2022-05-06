package com.example.btvn_week08_lt.Model;

import android.view.View;

import com.example.btvn_week08_lt.Adapter.PopularDestinationAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestDeals {
//    @SerializedName("rooms")
//    @Expose
//    private List<Room> rooms = null;
//    @SerializedName("pagination")
//    @Expose
//    private Pagination pagination;
//
//    public List<Room> getRooms() {
//        return rooms;
//    }
//
//    public void setRooms(List<Room> rooms) {
//        this.rooms = rooms;
//    }
//
//    public Pagination getPagination() {
//        return pagination;
//    }
//
//    public void setPagination(Pagination pagination) {
//        this.pagination = pagination;
//    }


    int image;
    String title;
    String rating;
    int old_price;
    String new_price;
    String location;
    String perNight;

    public int getImg_sale_price() {
        return img_sale_price;
    }

    public void setImg_sale_price(int img_sale_price) {
        this.img_sale_price = img_sale_price;
    }

    int img_sale_price;

    public BestDeals( int img_sale_price, String title, String location, int bg_image, String rating, int old_price, String new_price, String pernight ) {
        this.img_sale_price = img_sale_price;
        this.title = title;
        this.location = location;
        this.image = bg_image;
        this.rating = rating;
        this.old_price = old_price;
        this.new_price = new_price;
        this.perNight = pernight;

    }

    public String getPerNight() {
        return perNight;
    }

    public void setPerNight(String perNight) {
        this.perNight = perNight;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getOld_price() {
        return old_price;
    }

    public void setOld_price(int old_price) {
        this.old_price = old_price;
    }

    public String getNew_price() {
        return new_price;
    }

    public void setNew_price(String new_price) {
        this.new_price = new_price;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
