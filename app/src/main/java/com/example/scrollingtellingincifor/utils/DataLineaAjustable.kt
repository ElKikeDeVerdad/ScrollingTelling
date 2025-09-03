package com.example.scrollingtellingincifor.utils

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color

data class NumerosTextosLinea(
    val color: Color,
    @StringRes val numeroRes: Int, // ID del recurso para el número
    @StringRes val textoRes: Int   // ID del recurso para el texto
)

//Int busca el ID del stringResource a diferencia del String que solo te deja poner un texto fijo