package com.example.btvn_week08_lt.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpecialPrice {
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
