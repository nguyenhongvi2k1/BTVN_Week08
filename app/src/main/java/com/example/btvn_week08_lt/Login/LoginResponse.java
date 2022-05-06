package com.example.btvn_week08_lt.Login;

import java.io.Serializable;
import java.util.ArrayList;

public class LoginResponse implements Serializable {
    private String email ;
    private String password ;

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

    //    public DateFormat getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(DateFormat createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public DateFormat getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(DateFormat updatedAt) {
//        this.updatedAt = updatedAt;
//    }

}
