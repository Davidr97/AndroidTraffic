package com.example.branko.tester.web;

import com.example.branko.tester.model.CityInfo;
import com.example.branko.tester.model.PhotoInfo;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface FlickrApi {

    @GET("/services/rest/")
    Call<PhotoInfo> getPhotoInfo(@QueryMap Map<String, String> attributes);
}