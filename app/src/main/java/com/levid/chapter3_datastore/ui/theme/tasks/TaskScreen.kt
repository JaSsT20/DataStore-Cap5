package com.levid.chapter3_datastore.ui.theme.tasks

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.levid.chapter3_datastore.data.Tasks
import com.levid.chapter3_datastore.util.TaskButton
import com.levid.chapter3_datastore.util.TaskTextField


@Composable
fun TaskScreen(taskViewModel: TaskViewModel) {
    val firstText = remember {
        mutableStateOf("")
    }
    val secondText = remember {
        mutableStateOf("")
    }
    val thirdText = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TaskTextField(text = firstText.value, onFieldChange = { firstText.value = it },
            label = { Text(text = "Primera tarea") })

        TaskTextField(text = secondText.value, onFieldChange = { secondText.value = it },
            label = { Text(text = "Segunda tarea") })

        TaskTextField(text = thirdText.value, onFieldChange = { thirdText.value = it },
            label = { Text(text = "Tercera tarea") })

        TaskButton(onClick = {
            val tasks = Tasks(
                firstTask = firstText.value,
                secondTask = secondText.value,
                thirdTask = thirdText.value
            )
            taskViewModel.saveTaskData(tasks)
        }, text = "Guardar")
    }
}