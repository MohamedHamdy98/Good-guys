package com.example.firebasetest;

public class Users {
    private String name_user;
    private String address_user;

    public Users() {
    }

    public Users(String name_user, String address_user) {
        this.name_user = name_user;
        this.address_user = address_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getAddress_user() {
        return address_user;
    }

    public void setAddress_user(String address_user) {
        this.address_user = address_user;
    }
}
