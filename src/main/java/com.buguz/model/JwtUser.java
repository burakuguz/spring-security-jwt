package com.buguz.model;

public class JwtUser {
    private String userName;
    private long userId;
    private String role;
    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setId(long userId) {
        this.userId = userId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public long getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }
}
