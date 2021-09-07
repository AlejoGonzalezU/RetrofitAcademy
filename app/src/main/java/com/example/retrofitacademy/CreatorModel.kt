package com.example.retrofitacademy

import com.google.gson.annotations.SerializedName


data class CreatorModel (
    @SerializedName("id") var id : Int,
    @SerializedName("name") var name : String,
    @SerializedName("tracklist") var tracklist : String,
    @SerializedName("type") var type : String
)