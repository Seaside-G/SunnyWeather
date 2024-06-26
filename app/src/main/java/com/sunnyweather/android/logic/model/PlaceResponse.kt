package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(@SerializedName("formatted_address") val address: String, val id: String,
                 val name: String, val location: Location, )
data class Location(val lng: String, val lat: String)