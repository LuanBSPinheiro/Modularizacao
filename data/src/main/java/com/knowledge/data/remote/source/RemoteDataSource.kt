package com.knowledge.data.remote.source

import com.knowledge.domain.entities.AndroidJob
import io.reactivex.Single


interface RemoteDataSource {
    fun getJobs(): Single<List<AndroidJob>>
}