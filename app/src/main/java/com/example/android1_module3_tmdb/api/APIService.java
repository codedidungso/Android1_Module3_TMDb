package com.example.android1_module3_tmdb.api;

import com.example.android1_module3_tmdb.models.GetMoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    String apiKey = "a5753dd20d8bf169dbcdff9e7d730148";

    @GET("discover/movie?api_key=" + apiKey)
    Call<GetMoviesResponse> getMovies();
}
