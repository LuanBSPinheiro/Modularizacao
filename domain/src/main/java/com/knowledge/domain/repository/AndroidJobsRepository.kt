package com.knowledge.domain.repository

import com.knowledge.domain.entities.AndroidJob
import io.reactivex.Observable
import io.reactivex.Single

interface AndroidJobsRepository {
    fun getJobs(forceUpdate: Boolean): Single<List<AndroidJob>>
}