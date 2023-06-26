package com.weatherapp.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Main(
    val temp: Double,
    val pressure: Int,
    val humidity: Int,
    @SerializedName("temp_min") val tempMin: Double,
    @SerializedName("temp_max") val tempMax: Double
) : Serializable