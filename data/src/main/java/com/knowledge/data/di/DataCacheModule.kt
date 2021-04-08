package com.knowledge.data.di

import com.knowledge.data.local.database.JobsDataBase
import com.knowledge.data.local.source.JobsCacheDataSource
import com.knowledge.data.local.source.JobsCacheSourceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val cacheDataModule = module {
    single { JobsDataBase.createDataBase(androidContext()) }
    factory<JobsCacheDataSource> { JobsCacheSourceImpl(jobsDao = get()) }
}