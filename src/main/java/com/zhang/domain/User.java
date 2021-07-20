package com.zhang.domain;

public class User {
    String userName;
    String userInfo;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userInfo='" + userInfo + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public User() {
    }

    public User(String userName, String userInfo) {
        this.userName = userName;
        this.userInfo = userInfo;
    }
}
