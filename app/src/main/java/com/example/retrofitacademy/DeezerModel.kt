package com.example.retrofitacademy

import com.google.gson.annotations.SerializedName

data class DeezerModel (
    @SerializedName("data") val data : List<DataModel>,
    @SerializedName("checksum") val checksum : String,
    @SerializedName("total") val total : Int
)
