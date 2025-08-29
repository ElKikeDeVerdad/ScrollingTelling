package com.example.scrollingtellingincifor.INCIFOR.Helpers

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
import com.example.scrollingtellingincifor.INCIFOR.Helpers.Data.NumerosTextosLinea
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@Composable
fun LineaAjustable(
    alturaPantalla: Dp,
    anchoPantalla: Dp,
    listaItems: List<NumerosTextosLinea>,

    distanciaLinea: Float = 0.05f,
    distanciaCirculos: Float = 0.1f,
    offSetTextosX: Float = 0.15f,

    posicionDerecha: Boolean = true,
    textoIzquierda: Boolean = true,
    espacioEntreCirculos: Float = 0.15f,
    tamañoCirculos: Float = 0.08f,
    grosorLineaFraction: Float = 0.03f,

    offSetTextosY: Float = 0f
) {
    val tamañoCirculo = anchoPantalla * tamañoCirculos
    val grosorLinea = anchoPantalla * grosorLineaFraction
    val espacio = alturaPantalla * espacioEntreCirculos

    // Ancho fijo para todos los textos, igual para todas las filas
    val anchoTextos = anchoPantalla * 0.22f

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        // Línea vertical
        Box(
            modifier = Modifier
                .width(grosorLinea)
                .fillMaxHeight()
                .background(Color.White)
                .align(if (posicionDerecha) Alignment.CenterEnd else Alignment.CenterStart)
                .offset(
                    x = if (posicionDerecha) -anchoPantalla * distanciaLinea
                    else anchoPantalla * distanciaLinea
                )
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .align(if (posicionDerecha) Alignment.CenterEnd else Alignment.CenterStart)
                .offset(
                    x = if (posicionDerecha) -anchoPantalla * distanciaCirculos
                    else anchoPantalla * distanciaCirculos,
                    y = alturaPantalla * offSetTextosY
                ),
            verticalArrangement = Arrangement.spacedBy(espacio),
            horizontalAlignment = Alignment.Start
        ) {
            listaItems.forEach { item ->
                Row(
                    verticalAlignment = Alignment.Top
                ) {
                    if (textoIzquierda) {
                        // Columna de texto con ancho fijo
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(anchoTextos)
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

                        // Círculo
                        Box(
                            modifier = Modifier
                                .size(tamañoCirculo)
                                .border(
                                    width = (anchoPantalla * 0.005f),
                                    color = Color.Black,
                                    shape = CircleShape
                                )
                                .background(item.color, CircleShape)
                        )
                    } else {
                        // Círculo primero
                        Box(
                            modifier = Modifier
                                .size(tamañoCirculo)
                                .border(
                                    width = (anchoPantalla * 0.005f),
                                    color = Color.Black,
                                    shape = CircleShape
                                )
                                    .background(item.color, CircleShape)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        // Columna de texto con ancho fijo
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(anchoTextos)
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