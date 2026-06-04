package com.droid.yoteshinreview.movie.data.remote.api

import com.droid.yoteshinreview.BuildConfig
import com.droid.yoteshinreview.movie.data.remote.models.MovieDto
import com.droid.yoteshinreview.utils.ApiConstants
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {

    @GET(ApiConstants.MOVIE_ENDPOINT)
    suspend fun fetchDiscoverMovie(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("include_adult") includeAdult: Boolean = false
    ) : MovieDto

    @GET(ApiConstants.TRENDING_MOVIE_ENDPOINT)
    suspend fun fetchTrendingMovie(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("include_adult") includeAdult: Boolean = false
    ) : MovieDto
}