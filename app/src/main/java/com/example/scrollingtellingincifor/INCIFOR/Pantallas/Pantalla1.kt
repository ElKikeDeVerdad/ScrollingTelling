package com.example.scrollingtellingincifor.INCIFOR.Pantallas


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.scrollingtellingincifor.Auxiliares.EtiquetasTexto.LectorEtiquetas
import com.example.scrollingtellingincifor.INCIFOR.Helpers.pantallaAltura
import com.example.scrollingtellingincifor.INCIFOR.Helpers.pantallaAncho
import com.example.scrollingtellingincifor.R

@Composable
fun InciforScreen1(modifier: Modifier = Modifier) {
    val altura = pantallaAltura()
    val ancho = pantallaAncho()

    val paddingTopTexto = altura * 0.3f
    val spacerEntreTextoImagen = altura * 0.03f
    val spacerCirculoLinea = altura * 0.02f
    val tamañoCirculo = ancho * 0.1f
    val grosorLinea = ancho * 0.03f

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Box para mover el bloque al centro con margen superior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = paddingTopTexto),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Texto
                Text(
                    text = LectorEtiquetas(stringResource(R.string.Incifor_texto_Item1)),
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.fillMaxWidth(0.7f),
                    lineHeight = 20.sp
                )

                Spacer(modifier = Modifier.height(spacerEntreTextoImagen))

                // Imagen
                Image(
                    painter = painterResource(R.drawable.noimagen),
                    contentDescription = "",
                    modifier = Modifier.fillMaxWidth(0.45f)
                )
            }
        }

        Spacer(modifier = Modifier.height(spacerCirculoLinea))

        // Círculo
        Box(
            modifier = Modifier
                .size(tamañoCirculo)
                .background(Color.White, CircleShape)
        )

        // Línea que ocupa el resto de la pantalla
        Box(
            modifier = Modifier
                .width(grosorLinea)
                .weight(1f)
                .background(Color.White)
        )
    }
}



