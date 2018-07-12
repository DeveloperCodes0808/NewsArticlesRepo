package com.tech.myapp.myapplication.apis;

import com.tech.myapp.myapplication.entities.MainNewsFeedResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Shemin on 7/11/2018.
 * api-key=295cd18179f842afb70b5a9c690c9fd0
 */

public interface ApiInterface {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/7.json?")
    Call<MainNewsFeedResponse> getNewsFeed(@Query("api-key") String apiKey);
}
