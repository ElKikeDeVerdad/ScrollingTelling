package com.example.scrollingtellingincifor.INCIFOR

import android.content.res.Resources
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scrollingtellingincifor.R


@Composable
fun FuncionParallaxIncifor(
    modifier: Modifier = Modifier
) {
    /*    val lazyListStateUno =
            rememberLazyListState() //Para recordar el sitio de este bloque de parallax, define que objetos se van a ver


        val scrollProgress =
            remember { mutableStateOf(0f) } //Aqui manejamos el la varibale de PruebaLottie


        val nestedScrollConnection = object : NestedScrollConnection {
            override fun onPreScroll(
                available: Offset,
                source: NestedScrollSource
            ): Offset {
                val delta =
                    available.y

                val layoutInfo = lazyListStateUno.layoutInfo
                if (lazyListStateUno.firstVisibleItemIndex == 0) {
                    return Offset.Zero
                }
                if (layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1) {
                    return Offset.Zero
                }
                scrollProgress.value =
                    (scrollProgress.value + delta / 500f).let { (it % 1f + 1f) % 1f } //Esto esta diciendo que, primero sumamos delta y si el resultado es negativo, sumamos 1, asegurando que siempre este entre 0 y 1 y no hayan negativos
                return Offset.Zero //esto hace que no cambie nada
            }

        }*/


    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
        /*   .nestedScroll(nestedScrollConnection),
           state = lazyListStateUno*/
    ) {
        //item1
        item {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 200.dp),
                   /* .background(Color.Black),*/
                contentAlignment = Alignment.Center,


                ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.texto_Item1),
                        textAlign = TextAlign.Justify,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.fillMaxWidth(0.65f)
                    )

                    Spacer(modifier = Modifier.height(22.dp))


                    Image(
                        painter = painterResource(R.drawable.noimagen),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth(0.45f),
                        alignment = Alignment.Center,
                        )

                    Spacer(modifier = Modifier.height(22.dp))

                   Box(modifier = Modifier
                       .fillMaxWidth(0.1f)
                       .fillMaxHeight(0.5f)
                       .background(Color(0xFFFFFFFF), RectangleShape)
                   )
                }
            }
        }
    }



    fun Float.toDp(): Dp {
        return (this / Resources.getSystem().displayMetrics.density).dp
    }
}