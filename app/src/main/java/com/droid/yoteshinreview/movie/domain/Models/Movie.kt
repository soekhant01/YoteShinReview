package com.droid.yoteshinreview.movie.domain.Models

import kotlinx.serialization.SerialName

data class Movie(
    val backdropPath: String? = null,
    val genreIds: List<Int?>? = null,
    val id: Int? = null,
    val originalLanguage: String? = null,
    val originalTitle: String? = null,
    val overview: String? = null,
    val popularity: Double? = null,
    val posterPath: String? = null,
    val releaseDate: String? = null,
    val softcore: Boolean? = null,
    val title: String? = null,
    val voteAverage: Double? = null,
    val voteCount: Int? = null
)
