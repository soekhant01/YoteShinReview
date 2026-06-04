package com.droid.yoteshinreview.common.data

import com.droid.yoteshinreview.movie.data.remote.models.MovieDto

interface ApiMapper<Domain, Entity> {
    fun mapToDomain(apiDto: Entity): Domain
}