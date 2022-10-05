package com.smkwinner.todoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smkwinner.todoapp.Data
import com.smkwinner.todoapp.task
import com.smkwinner.todoapp.ui.theme.kSecondaryColor

@Composable
fun TaskList(){

    LazyColumn{
        items(task) {
            val checkedColor: Color =when(it.status){
                true->{
                    Color.Blue
                }
                false->{
                    Color.Gray
                }
            }

            Card(
                backgroundColor = Color.White,
                elevation = 10.dp,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 20.dp)
                    .height(80.dp)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onLongPress = { _ ->
                                task.remove(it)
                            }
                        )
                    }


            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(kSecondaryColor)
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(it.title, style = TextStyle(
                        fontSize = 20.sp,
                        color = Color(0XFF1A1A1A),
                        fontWeight = FontWeight.W400
                    )
                    )
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = {
                            val index= task.indexOf(it)
                            if(index!=-1)
                            {
                                task[index]= Data(it.title,!it.status)
                            }

                        }
                    ) {
                        Icon(
                            Icons.Outlined.Check,

                            "contentDescription",
                            tint = checkedColor
                        )
                    }
                }
            }

        }
    }


}
