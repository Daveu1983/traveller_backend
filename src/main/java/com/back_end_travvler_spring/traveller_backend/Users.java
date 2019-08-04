package com.back_end_travvler_spring.traveller_backend;

import org.springframework.data.annotation.Id;

public class Users {

    @Id private String id;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}