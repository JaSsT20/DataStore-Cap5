package com.levid.chapter3_datastore.service

import com.levid.chapter3_datastore.data.Tasks
import kotlinx.coroutines.flow.Flow

interface TaskService {
    fun getTasksFromPrefDataStore(): Flow<Tasks>
    suspend fun addTasks(tasks: Tasks)
}