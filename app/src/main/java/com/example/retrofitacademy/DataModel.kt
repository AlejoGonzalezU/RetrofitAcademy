package com.example.retrofitacademy

import com.google.gson.annotations.SerializedName


data class DataModel (

    @SerializedName("id") val id : Long,
    @SerializedName("title") val title : String,
    @SerializedName("duration") val duration : Int,
    @SerializedName("public") val public : Boolean,
    @SerializedName("is_loved_track") val is_loved_track : Boolean,
    @SerializedName("collaborative") val collaborative : Boolean,
    @SerializedName("nb_tracks") val nb_tracks : Int,
    @SerializedName("fans") val fans : Int,
    @SerializedName("link") val link : String,
    @SerializedName("picture") val picture : String,
    @SerializedName("picture_small") val picture_small : String,
    @SerializedName("picture_medium") val picture_medium : String,
    @SerializedName("picture_big") val picture_big : String,
    @SerializedName("picture_xl") val picture_xl : String,
    @SerializedName("checksum") val checksum : String,
    @SerializedName("tracklist") val tracklist : String,
    @SerializedName("creation_date") val creation_date : String,
    @SerializedName("md5_image") val md5_image : String,
    @SerializedName("picture_type") val picture_type : String,
    @SerializedName("time_add") val time_add : Int,
    @SerializedName("time_mod") val time_mod : Int,
    @SerializedName("creator") val creator : CreatorModel,
    @SerializedName("type") val type : String
)