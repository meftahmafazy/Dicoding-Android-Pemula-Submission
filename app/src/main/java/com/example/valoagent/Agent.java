package com.example.valoagent;

public class Agent {
    private String name;
    private String role;
    private String detail;
    private int photo;

    public Agent() {
        this.name = name;
        this.role = role;
        this.detail = detail;
        this.photo = photo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getRole() {

        return role;
    }

    public void setRole(String role) {

        this.role = role;
    }

    public int getPhoto() {

        return photo;
    }

    public void setPhoto(int photo) {

        this.photo = photo;
    }
}

