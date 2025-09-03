package com.example.scrollingtellingincifor.ui.screens.incifor.miniscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.scrollingtellingincifor.data.MiniScreenData

@Composable
fun TestScreen0(data:MiniScreenData,modifier: Modifier){

    Column (modifier = modifier.border(width = 3.dp,color = Color.Yellow)) {
        Box(modifier = modifier.fillMaxSize().background(Color.Blue)){
            Text(color = Color.White,text = "...con probas")
        }
    }

}