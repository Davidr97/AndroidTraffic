package com.example.branko.tester.model;

import java.util.List;

public class PhotoDetails {

    private Photo[] photo;
    private int page;

    public Photo[] getPhoto() {
        return photo;
    }

    public void setPhoto(Photo[] photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return String.format("page: %d",page);
    }
}