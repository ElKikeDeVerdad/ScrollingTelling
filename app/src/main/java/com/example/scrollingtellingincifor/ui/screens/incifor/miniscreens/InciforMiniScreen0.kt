package com.example.scrollingtellingincifor.ui.screens.incifor.miniscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import com.example.scrollingtellingincifor.data.MiniScreenData
import com.example.scrollingtellingincifor.utils.LineaAjustable

@Composable
fun InciforMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    paddingCenterFraction: Float = 0.15f,
    paddingTopFraction: Float = 0.3f
) {
    val context = LocalContext.current

    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF4189B5))
    ) {
        val width = this@BoxWithConstraints.maxWidth
        val height = this@BoxWithConstraints.maxHeight
        val paddingHorizontal = width * paddingCenterFraction
        val paddingVertical = height * paddingTopFraction

        Column {

            Box(modifier = Modifier.padding(start = paddingHorizontal, end = paddingHorizontal, top = paddingVertical)) {
                data.bodyParagraphs.forEach { res ->
                    Text(
                        text = runCatching { context.getString(res) }.getOrElse { "???" },
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center
                    )
                }
            }
            LineaAjustable()
        }
    }
}