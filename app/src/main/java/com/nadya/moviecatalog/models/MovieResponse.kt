package com.nadya.moviecatalog.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.nadya.moviecatalog.models.Movie
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val movies : List<Movie>

) : Parcelable {
    constructor() : this(mutableListOf())
}
