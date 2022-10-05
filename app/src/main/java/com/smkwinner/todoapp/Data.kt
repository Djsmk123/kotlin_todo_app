package com.smkwinner.todoapp

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

data class Data(
    val title:String,
    val status:Boolean
)

var task= mutableStateListOf(Data("Study",status = false),Data("Pubg",status = true),Data("Assignment",status = false))
