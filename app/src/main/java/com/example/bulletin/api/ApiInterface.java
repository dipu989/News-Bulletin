package com.example.bulletin.api;

import com.example.bulletin.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(
            @Query("country") String country ,
            @Query("apiKey") String apiKey
    );

    @GET("everything")
    Call<News> getNewsSearch(
            @Query("q") String keyword ,
            @Query("language") String language ,
            @Query("sortBy") String sortBye ,
            @Query("apiKey") String apiKey
    );
}
