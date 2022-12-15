package com.example.Group7_MAPD711_001_ASSIGNMET2

import com.google.android.gms.maps.model.LatLng

data class Place(
    val name: String,
    val latLng: LatLng,
    val address: LatLng,
    val rating: Float
)