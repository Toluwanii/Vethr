package com.codose.vethr.network.response.location


import com.google.gson.annotations.SerializedName

data class Position(
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lng")
    val lng: Double
)