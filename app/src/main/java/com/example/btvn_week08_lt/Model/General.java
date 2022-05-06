package com.example.btvn_week08_lt.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class General {
    @SerializedName("tips")
    @Expose
    private List<Tip> tips = null;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;

    public List<Tip> getTips() {
        return tips;
    }

    public void setTips(List<Tip> tips) {
        this.tips = tips;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
