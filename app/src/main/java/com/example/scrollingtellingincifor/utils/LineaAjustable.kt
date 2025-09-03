package com.example.scrollingtellingincifor.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LineaAjustable(
    listaItems: List<NumerosTextosLinea> = emptyList(),
    posicionDerecha: Boolean = true,
    textoIzquierda: Boolean = true,
    offSetTextosY: Float = 0f, // offset vertical
    distanciaLinea: Float = 0.05f,
    distanciaCirculos: Float = 0.1f,
    espacioEntreCirculos: Float = 0.15f,
    anchoTextosFraction: Float = 0.22f,
    tamañoCirculos: Float = 0.08f,
    grosorLineaFraction: Float = 0.03f,
    borderFraction: Float = 0.005f
) {
    BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
        val ancho = this@BoxWithConstraints.maxWidth
        val alto = this@BoxWithConstraints.maxHeight

        // Línea vertical
        Box(
            modifier = Modifier
                .width(ancho * grosorLineaFraction)
                .fillMaxHeight()
                .background(Color.White)
                .align(if (posicionDerecha) Alignment.CenterEnd else Alignment.CenterStart)
                .offset(
                    x = if (posicionDerecha) -ancho * distanciaLinea else ancho * distanciaLinea
                )
        )

        // Column con items
        Column(
            modifier = Modifier
                .align(if (posicionDerecha) Alignment.CenterEnd else Alignment.CenterStart)
                .offset(
                    x = if (posicionDerecha) -ancho * distanciaCirculos else ancho * distanciaCirculos,
                    y = alto * offSetTextosY
                ),
            verticalArrangement = Arrangement.spacedBy(alto * espacioEntreCirculos),
            horizontalAlignment = Alignment.Start
        ) {
            listaItems.forEach { item ->
                Row(verticalAlignment = Alignment.Top) {
                    if (textoIzquierda) {
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(ancho * anchoTextosFraction)
                        ) {
                            Text(
                                text = stringResource(id = item.numeroRes),
                                style = MaterialTheme.typography.bodyLarge,
                                fontSize = 22.sp,
                                color = Color.Black
                            )
                            Text(
                                text = stringResource(id = item.textoRes),
                                style = MaterialTheme.typography.titleSmall,
                                fontSize = 16.sp,
                                color = Color(0xFF32627E)
                            )
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        Box(
                            modifier = Modifier
                                .size(ancho * tamañoCirculos)
                                .border(
                                    width = ancho * borderFraction,
                                    color = Color.Black,
                                    shape = CircleShape
                                )
                                .background(item.color, CircleShape)
                        )
                    } else {
                        Box(
                            modifier = Modifier
                                .size(ancho * tamañoCirculos)
                                .border(
                                    width = ancho * borderFraction,
                                    color = Color.Black,
                                    shape = CircleShape
                                )
                                .background(item.color, CircleShape)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(ancho * anchoTextosFraction)
                        ) {
                            Text(
                                text = stringResource(id = item.numeroRes),
                                style = MaterialTheme.typography.bodyLarge,
                                fontSize = 22.sp,
                                color = Color.Black
                            )
                            Text(
                                text = stringResource(id = item.textoRes),
                                style = MaterialTheme.typography.titleSmall,
                                fontSize = 16.sp,
                                color = Color(0xFF32627E)
                            )
                        }
                    }
                }
            }
        }
    }
}
