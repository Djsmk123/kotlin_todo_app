package com.smkwinner.todoapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.smkwinner.todoapp.Data
import com.smkwinner.todoapp.task

@Composable
fun AddNewTaskComposable() {
    val newTask = remember {
        mutableStateOf("Add Task")
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        TextField(
            value = newTask.value,
            onValueChange = {
                newTask.value = it
            },
            shape = RoundedCornerShape(16.dp),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            trailingIcon =  {
                IconButton(
                    modifier = Modifier.size(60.dp),
                    onClick = {
                        task.add(Data(newTask.value, false))
                    }
                ) {
                    Icon(
                        Icons.Outlined.AddCircle,
                        "contentDescription",
                        tint = Color.Blue,
                    )
                }
            }
        )
    }

}