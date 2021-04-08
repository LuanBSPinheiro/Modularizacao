package com.knowledge.data.remote.source

import com.knowledge.data.remote.api.ServerApi
import com.knowledge.data.remote.mapper.AndroidJobMapper
import com.knowledge.domain.entities.AndroidJob
import io.reactivex.Single

class RemoteDataSourceImpl(private val serverApi: ServerApi):
    RemoteDataSource {

    override fun getJobs(): Single<List<AndroidJob>> {
        return serverApi.fetchJobs()
            .map { AndroidJobMapper.map(it) }
    }
}