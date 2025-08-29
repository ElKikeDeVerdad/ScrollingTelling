package com.example.scrollingtellingincifor.Auxiliares.EtiquetasTexto

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight

@Composable
fun LectorEtiquetas(text: String, baseStyle: TextStyle = MaterialTheme.typography.bodyLarge): AnnotatedString {
    return buildAnnotatedString {
        var currentIndex = 0
        val regex = "<([a-zA-Z0-9]+)>(.*?)</\\1>".toRegex(RegexOption.DOT_MATCHES_ALL)

        regex.findAll(text).forEach { match ->
            val range = match.range
            append(text.substring(currentIndex, range.first))

            val tag = match.groupValues[1]
            val content = match.groupValues[2]

            when (tag) {
                "inciforNegrita" -> pushStyle(
                    baseStyle.toSpanStyle().copy( // 👈 parte del estilo base
                        color = Color(0xFFF18325),
                        fontWeight = FontWeight.Bold
                    )
                )


            }

            append(content)
            pop()
            currentIndex = range.last + 1
        }

        if (currentIndex < text.length) {
            append(text.substring(currentIndex))
        }
    }
}
// (&lt;inciforItem1&gt;INCIFOR&lt;/inciforItem1&gt;)