package com.smkwinner.todoapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.flowlayout.FlowColumn
import com.smkwinner.todoapp.components.AddNewTaskComposable
import com.smkwinner.todoapp.components.TaskList
import com.smkwinner.todoapp.ui.theme.kSecondaryColor

@Composable
fun HomeScreen() {
    Scaffold(
        backgroundColor = kSecondaryColor,
        bottomBar = {
            AddNewTaskComposable()
        },

        modifier = Modifier.fillMaxHeight(),
        topBar = {
            Text("Today's Task",

                style = TextStyle(
                    fontSize = 24.sp,
                    color = Color(0XFF1A1A1A),
                    fontWeight = FontWeight.W700
                ),
                modifier = Modifier.padding(20.dp)
            )
        }
    ) {

        TaskList()


    }
}