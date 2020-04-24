package com.example.android1_module3_tmdb.api;

import com.example.android1_module3_tmdb.models.GetMovieDetailResponse;
import com.example.android1_module3_tmdb.models.GetMoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {
    String apiKey = "a5753dd20d8bf169dbcdff9e7d730148";

    @GET("discover/movie?api_key=" + apiKey)
    Call<GetMoviesResponse> getMovies(@Query("page") int page);

    @GET("movie/{movie_id}?api_key=" + apiKey + "&append_to_response=videos")
    Call<GetMovieDetailResponse> getMovieDetail(@Path("movie_id") int movieId);
}
