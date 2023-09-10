package com.levid.chapter3_datastore.data

import kotlinx.coroutines.flow.Flow

interface DataStoreManager {
    suspend fun saveTasks(tasks: Tasks)
    fun getTasks(): Flow<Tasks>
}