package com.example.retrofitacademy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(), Callback<DeezerModel> {
    val retrofitBuilder: Retrofit.Builder = Retrofit.Builder()
    val retrofitClient: Retrofit = retrofitBuilder
        .baseUrl(BASEURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val services : ApiEndpoints = retrofitClient.create(ApiEndpoints::class.java)
    val obtainDeezer : Call<DeezerModel> = services.getUserPlaylists()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        obtainDeezer.enqueue(this)
    }

    companion object {
        const val BASEURL = "https://api.deezer.com/"
    }

    override fun onResponse(call: Call<DeezerModel>, response: Response<DeezerModel>) {
        if (response.isSuccessful) {
            if (response.body() != null) {
                val playlists = response.body()
                Log.d("SUCCESS FROM CLIENT", "${playlists?.data!![0].title}")
            }
        }
    }

    override fun onFailure(call: Call<DeezerModel>, t: Throwable) {
        Log.e("FAILURE FROM CLIENT", "${t.message}")
    }
}