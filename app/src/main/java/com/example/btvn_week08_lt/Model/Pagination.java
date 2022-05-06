package com.example.btvn_week08_lt.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {
    @SerializedName("totalPage")
    @Expose
    private Integer totalPage;
    @SerializedName("totalNumber")
    @Expose
    private Integer totalNumber;
    @SerializedName("hasPreviosPage")
    @Expose
    private Integer hasPreviosPage;
    @SerializedName("hasNextPage")
    @Expose
    private Integer hasNextPage;

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getHasPreviosPage() {
        return hasPreviosPage;
    }

    public void setHasPreviosPage(Integer hasPreviosPage) {
        this.hasPreviosPage = hasPreviosPage;
    }

    public Integer getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Integer hasNextPage) {
        this.hasNextPage = hasNextPage;
    }
}
