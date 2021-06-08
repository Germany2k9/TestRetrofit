package com.germany.testretrofit.Retrofit.model.Interface;

import com.germany.testretrofit.Retrofit.model.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Posts>> getPosts();
}
