package com.example.scrollingtellingincifor.INCIFOR.Helpers
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Dp

@Composable
fun pantallaAltura(): Dp {
    return LocalConfiguration.current.screenHeightDp.dp
}
@Composable
fun pantallaAncho(): Dp {
    return LocalConfiguration.current.screenWidthDp.dp
}

