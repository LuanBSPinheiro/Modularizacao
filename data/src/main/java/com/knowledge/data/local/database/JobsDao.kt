package com.knowledge.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.knowledge.data.local.model.AndroidJobCache
import io.reactivex.Single

@Dao
interface JobsDao {

    @Query("SELECT * FROM jobs")
    fun getJobs(): Single<List<AndroidJobCache>>

    @Query("SELECT * FROM jobs where id = :id")
    fun getJobById(id: Int): AndroidJobCache

    @Query("SELECT * FROM jobs where title = :title")
    fun getJobByTitle(title: String): AndroidJobCache

    @Transaction
    fun updateData(users: List<AndroidJobCache>) {
        deleteAll()
        insertAll(users)
    }

    @Insert
    fun insertAll(users: List<AndroidJobCache>)

    @Query("DELETE FROM jobs")
    fun deleteAll()
}