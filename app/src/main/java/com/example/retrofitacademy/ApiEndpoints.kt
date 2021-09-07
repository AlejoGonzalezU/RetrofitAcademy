package com.example.retrofitacademy

import retrofit2.Call
import retrofit2.http.GET


interface ApiEndpoints {
    @GET("user/557531687/playlists")
    fun getUserPlaylists(): Call<DeezerModel>
}