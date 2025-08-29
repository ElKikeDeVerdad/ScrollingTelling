package com.example.scrollingtellingincifor.INCIFOR

import InciforScreen2
import InciforScreen3
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.scrollingtellingincifor.INCIFOR.Helpers.pantallaAltura
import com.example.scrollingtellingincifor.INCIFOR.Pantallas.InciforScreen1


@Composable
fun FuncionParallaxIncifor() {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        // item 1
        item {
            InciforScreen1(
                modifier = Modifier.height(pantallaAltura())
            )
        }

        // item 2
        item {
            InciforScreen2(
                modifier = Modifier.height(pantallaAltura())
            )
        }

        //item 3
        item {
            InciforScreen3(
                modifier = Modifier.height(pantallaAltura())
            )
        }
    }
}