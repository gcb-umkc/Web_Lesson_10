package com.example.web_lesson_10;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONAPI {
    @GET("posts")
    Call<List<Post>> getPosts();
}
