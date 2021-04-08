package com.knowledge.data.remote.mapper

import com.knowledge.data.remote.model.AndroidJobPayload
import com.knowledge.data.remote.model.JobsPayload
import com.knowledge.domain.entities.AndroidJob

object AndroidJobMapper {

    fun map(payload: JobsPayload) = payload.jobsPayload.map { map(it) }

    private fun map(payload: AndroidJobPayload) = AndroidJob(
        title = payload.title,
        experienceTimeRequired = payload.requiredExperienceYears,
        native = payload.native,
        country = payload.country
    )
}