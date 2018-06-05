package com.example.branko.tester.model;

import android.util.Log;

public class PhotoInfo {

    private PhotoDetails photos;
    private String stat;

    public PhotoInfo(){
        Log.i("PHOTOINFO","CREATED");
    }


    public PhotoDetails getPhotos() {
        return photos;
    }

    public void setPhotos(PhotoDetails photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return String.format(stat);
    }
}