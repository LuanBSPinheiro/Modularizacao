package com.knowledge.domain.repository

import com.knowledge.domain.entities.AndroidJob
import io.reactivex.Observable

interface AndroidJobsRepository {
    fun getJobs(forceUpdate: Boolean): Observable<List<AndroidJob>>
}