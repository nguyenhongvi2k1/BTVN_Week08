package com.example.btvn_week08_lt.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Room {
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("specialPrice")
    @Expose
    private SpecialPrice specialPrice;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("hotel")
    @Expose
    private Hotel hotel;
    @SerializedName("roomNumber")
    @Expose
    private Integer roomNumber;
    @SerializedName("typeRoom")
    @Expose
    private String typeRoom;
    @SerializedName("maxOfAdult")
    @Expose
    private Integer maxOfAdult;
    @SerializedName("maxOfChildren")
    @Expose
    private Integer maxOfChildren;
    @SerializedName("isSale")
    @Expose
    private Boolean isSale;
    @SerializedName("isAvailable")
    @Expose
    private Boolean isAvailable;
    @SerializedName("bookings")
    @Expose
    private List<Object> bookings = null;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("image")
    @Expose
    private String image;



    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public SpecialPrice getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(SpecialPrice specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public Integer getMaxOfAdult() {
        return maxOfAdult;
    }

    public void setMaxOfAdult(Integer maxOfAdult) {
        this.maxOfAdult = maxOfAdult;
    }

    public Integer getMaxOfChildren() {
        return maxOfChildren;
    }

    public void setMaxOfChildren(Integer maxOfChildren) {
        this.maxOfChildren = maxOfChildren;
    }

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public List<Object> getBookings() {
        return bookings;
    }

    public void setBookings(List<Object> bookings) {
        this.bookings = bookings;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
