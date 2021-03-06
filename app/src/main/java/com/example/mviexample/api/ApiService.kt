package com.example.mviexample.api

import androidx.lifecycle.LiveData
import com.example.mviexample.model.BlogPost
import com.example.mviexample.model.User
import com.example.mviexample.util.GenericApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("placeholder/user/{userId}")
    fun getUser(
        @Path("userId") userId: String
    ) : LiveData<GenericApiResponse<User>>

    @GET("placeholder/blogs")
    fun getBlogs() : LiveData<GenericApiResponse<List<BlogPost>>>
}