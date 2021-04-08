package com.knowledge.data.di

import com.knowledge.data.AndroidJobsRepositoryImpl
import com.knowledge.domain.repository.AndroidJobsRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<AndroidJobsRepository> {
        AndroidJobsRepositoryImpl(
            jobsCacheDataSource = get(),
            remoteDataSource = get()
        )
    }
}

val dataModules = listOf(remoteDataSourceModule, repositoryModule, cacheDataModule)
