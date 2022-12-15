package com.example.Group7_MAPD711_001_ASSIGNMET2

import android.content.Context


/**
 * Reads a list of place JSON objects from the file places.json
 */
class PlacesReader(private val context: Context) {

    // GSON object responsible for converting from JSON to a Place object
//    private val gson = Gson()
//
//    // InputStream representing places.json
//    private val inputStream: InputStream
//        get() = context.resources.openRawResource(R.raw.place)

    /**
     * Reads the list of place JSON objects in the file places.json
     * and returns a list of Place objects
     */
//    fun read(): List<Place> {
//        val itemType = object : TypeToken<List<PlaceResponse>>() {}.type
//        val reader = InputStreamReader(inputStream)
//        return gson.fromJson<List<PlaceResponse>>(reader, itemType).map {
//            it.toPlace()
//        }
//    }
}