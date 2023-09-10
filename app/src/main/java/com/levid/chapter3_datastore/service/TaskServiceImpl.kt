package com.levid.chapter3_datastore.service

import com.levid.chapter3_datastore.data.DataStoreManager
import com.levid.chapter3_datastore.data.Tasks
import javax.inject.Inject

class TaskServiceImpl @Inject constructor(
    private val DataStoreManager: DataStoreManager
) : TaskService {
    override fun getTasksFromPrefDataStore() =
        DataStoreManager.getTasks()
    override suspend fun addTasks(tasks: Tasks) {
        DataStoreManager.saveTasks(tasks)
    }
}