package com.example.scrollingtellingincifor.ui.screens.incifor.miniscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.scrollingtellingincifor.data.MiniScreenData
import com.example.scrollingtellingincifor.R


@Composable
fun InciforMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    paddingCenterFraction: Float = 0.15f,

    ) {
    val context = LocalContext.current

    BoxWithConstraints(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF4189B5))
    ) {
        val width = this@BoxWithConstraints.maxWidth
        val height = this@BoxWithConstraints.maxHeight
        val paddingHorizontal = width * paddingCenterFraction
        val SpacerVertical = height * 0.05f

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = paddingHorizontal, end = paddingHorizontal)
        ) {
            Box { }

            Box() {
                data.bodyParagraphs.forEach { res ->
                    Text(
                        text = runCatching { context.getString(res) }.getOrElse { "???" },
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = modifier
                    .height(SpacerVertical))


                Box(){
                    Image(
                        painter = painterResource(R.drawable.noimagen),
                        contentDescription = "Control de alcohol y drogas en ilustración"
                    )
                }
            }

        }
    }

}