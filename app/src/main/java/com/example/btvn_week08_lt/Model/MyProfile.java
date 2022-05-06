package com.example.btvn_week08_lt.Model;

import java.util.ArrayList;

public class MyProfile {
    private String _id;
    private String email;
    private String password;
    private String fullname;
    private String phoneNumber;
    private String currency;
    private String __v;
    ArrayList<String> bookedHotels;
    ArrayList<String> favoriteHotels;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String get__v() {
        return __v;
    }

    public void set__v(String __v) {
        this.__v = __v;
    }

    public ArrayList<String> getBookedHotels() {
        return bookedHotels;
    }

    public void setBookedHotels(ArrayList<String> bookedHotels) {
        this.bookedHotels = bookedHotels;
    }

    public ArrayList<String> getFavoriteHotels() {
        return favoriteHotels;
    }

    public void setFavoriteHotels(ArrayList<String> favoriteHotels) {
        this.favoriteHotels = favoriteHotels;
    }

}
