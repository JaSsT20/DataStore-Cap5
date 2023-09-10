package com.levid.chapter3_datastore.ui.theme.tasks

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.levid.chapter3_datastore.data.TaskDataSource
import com.levid.chapter3_datastore.data.Tasks
import com.levid.chapter3_datastore.service.TaskService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val taskService: TaskService
) : ViewModel() {

    private var saveFinish: (() -> Unit)? = null

    fun saveTaskData(tasks: Tasks) {
        viewModelScope.launch {
            Log.d("GUARDADO CORRECTO", "La data se ha guardado.")
            Log.d("Datos 1", "$tasks.firstTask")
            Log.d("Datos 2", "$tasks.secondTask")
            Log.d("Datos 3", "$tasks.thirdTask")
            taskService.addTasks(tasks)
        }
    }


}