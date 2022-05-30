package com.example.food.API;


import static com.example.food.Util.Ultis.getLocalIpAddress;

import com.example.food.API.ApiModel.HomePageModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    //    Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy HH:mm").create();
    String ipAddress = getLocalIpAddress();

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://"+ ipAddress+":3000/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);
    @GET("/api/home")
    Call<HomePageModel> getHomePageModel();

}