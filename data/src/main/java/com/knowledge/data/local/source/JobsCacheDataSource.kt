package com.knowledge.data.local.source

import com.knowledge.domain.entities.AndroidJob
import io.reactivex.Single

interface JobsCacheDataSource {
    fun getJobs(): Single<List<AndroidJob>>

    fun insertData(list: List<AndroidJob>)
    fun updateData(list: List<AndroidJob>)
}