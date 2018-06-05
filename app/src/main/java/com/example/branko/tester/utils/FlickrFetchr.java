package com.example.branko.tester.utils;

import android.util.Log;

import com.example.branko.tester.model.Photo;
import com.example.branko.tester.model.PhotoInfo;
import com.example.branko.tester.searchModel.CongestionSearchResult;
import com.example.branko.tester.web.CitiesApi;
import com.example.branko.tester.web.FlickrApi;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FlickrFetchr {

    private Map<String,String> attributes;
    private static final String apiKey = "89373326dbb5b8443a275c92dcb8c12d";
    private static final String method = "flickr.photos.search";
    private static final String format = "json";
    private static final String nojsoncallback = "1";




    public FlickrFetchr(){
        attributes = new HashMap<>();
    }

    private FlickrApi establishConnection(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.flickr.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(FlickrApi.class);
    }

    public String getPhoto(String tags,String lat, String lon) throws IOException{
        attributes.put("tags",tags);
        attributes.put("lat",lat);
        attributes.put("lon",lon);
        attributes.put("api_key",apiKey);
        attributes.put("method",method);
        attributes.put("format",format);
        attributes.put("nojsoncallback",nojsoncallback);
        FlickrApi service = establishConnection();
        Call<PhotoInfo> call = service.getPhotoInfo(attributes);
        Log.i("RETROFIT",call.request().url().toString());
        Log.i("BEFOREEXECUTE","TRUE");
        PhotoInfo result = call.execute().body();
        Log.i("BEFOREEXECUTE","TRUE");

        if(result != null){
            return result.toString();
        }
        return "";
    }
}