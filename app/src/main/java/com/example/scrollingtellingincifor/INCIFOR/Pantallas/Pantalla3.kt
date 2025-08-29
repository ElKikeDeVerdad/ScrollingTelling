import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.scrollingtellingincifor.INCIFOR.Helpers.Data.NumerosTextosLinea
import com.example.scrollingtellingincifor.INCIFOR.Helpers.LineaAjustable
import com.example.scrollingtellingincifor.INCIFOR.Helpers.pantallaAltura
import com.example.scrollingtellingincifor.INCIFOR.Helpers.pantallaAncho
import com.example.scrollingtellingincifor.R


@Composable
fun InciforScreen3(modifier: Modifier = Modifier) {
    val altura = pantallaAltura()
    val ancho = pantallaAncho()

    val listaItems = listOf(
        NumerosTextosLinea(
            Color.White,
            R.string.Incifor_numero1_Item3,
            R.string.Incifor_texto2_Item3
        ),
        NumerosTextosLinea(
            Color.White,
            R.string.Incifor_numero2_Item3,
            R.string.Incifor_texto3_Item3
        ),
        NumerosTextosLinea(
            Color.White,
            R.string.Incifor_numero3_Item3,
            R.string.Incifor_texto4_Item3
        )
    )

    Row(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9)),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // Columna izquierda
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(start = ancho * 0.08f)
                /*.background(Color.Gray)*/,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                painter = painterResource(R.drawable.noimagen),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .aspectRatio(1f)
            )

            Spacer(modifier = Modifier.height(altura * 0.01f))

            Text(
                text = LectorEtiquetas(stringResource(R.string.Incifor_texto1_Item3)),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Justify,
                lineHeight = 20.sp,
                modifier = Modifier.fillMaxWidth(1f)
            )
        }

        // Columna derecha
        Box(
            modifier = Modifier
                .weight(1f)
                .padding( end = ancho * 0.1f)
                /*.background(Color.Red)*/
        ) {
            LineaAjustable(
                alturaPantalla = altura,
                anchoPantalla = ancho,
                listaItems = listaItems,
                espacioEntreCirculos = 0.33f,
                distanciaCirculos = -0.01f,

            )
        }
    }
}
/*alturaPantalla: Dp,
anchoPantalla: Dp,
listaItems: List<NumerosTextosLinea>,      // data class
distanciaBordeFraction: Float = 0.05f,     // distancia de la línea desde el borde
posicionDerecha: Boolean = true,           // true = línea a la derecha, false = a la izquierda
textoIzquierda: Boolean = true,            // true = textos a la izquierda de los círculos
espacioEntreCirculos: Float = 0.15f,       // espacio entre círculos
tamañoCirculos: Float = 0.08f,             // tamaño  de los círculos
grosorLineaFraction: Float = 0.02f*/
/*

   // Línea con círculos
        LineaAjustable(
            alturaPantalla = altura,
            anchoPantalla = ancho,
            listaItems = listaItems,
            espacioEntreCirculos = 0.4f,
            tamañoCirculos = 0.06f,
            distanciaLinea = 1f,
            distanciaCirculos = -0.04f,
            distanciaTextos = -0.1f









@Composable
fun InciforScreen3(modifier: Modifier) {
    val altura = pantallaAltura()
    val alturaItem3Numeros = pantallaAltura() * 0.35f
    val tamañoCirculo = pantallaAncho() * 0.1f
    val spacer = pantallaAltura() * 0.01f
    Box(
        modifier = Modifier
            .fillMaxSize()
            .height(altura)
    ) {
        Row(
            modifier = Modifier
                .background(Color(0XFFE5F4F9))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .fillMaxHeight()

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.3f)
                ) {
                    Image(
                        painter = painterResource(R.drawable.noimagen),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth(0.3f)
                            .fillMaxHeight(),
                        alignment = Alignment.BottomStart
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Spacer(modifier = Modifier.height(10.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.7f),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = LectorEtiquetas(stringResource(R.string.Incifor_texto1_Item3)),
                            textAlign = TextAlign.Justify,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.fillMaxWidth(),
                            lineHeight = 20.sp,
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Row(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.fillMaxWidth(0.7f)) {
                        Box() {
                            Column {
                                Text(
                                    text = LectorEtiquetas(stringResource(R.string.Incifor_numero1_Item3)),
                                    style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 20.sp,
                                    fontSize = 22.sp,
                                    color = Color(0xFF000000),

                                )

                                Text(
                                    text =
                                        LectorEtiquetas(stringResource(R.string.Incifor_texto2_Item3)),
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 20.sp,
                                    color = Color(0xFF32627E)
                                )
                            }
                            Spacer(modifier = Modifier.height(alturaItem3Numeros))
                        }
                        Box() {
                            Column {
                                Text(
                                    text = LectorEtiquetas(stringResource(R.string.Incifor_numero2_Item3)),
                                    style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 20.sp,
                                    fontSize = 22.sp,
                                    color = Color(0xFF000000)
                                )

                                Text(
                                    text = LectorEtiquetas(stringResource(R.string.Incifor_texto3_Item3)),
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 20.sp,
                                    color = Color(0xFF32627E)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(alturaItem3Numeros))

                        Box() {
                            Column {
                                Text(
                                    text = LectorEtiquetas(
                                        stringResource(R.string.Incifor_numero2_Item3)
                                    ),
                                    style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 20.sp,
                                    fontSize = 22.sp,
                                    color = Color(0xFF000000)
                                )
                                Text(
                                    text = LectorEtiquetas(stringResource(R.string.Incifor_texto3_Item3)),
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.fillMaxWidth(),
                                    lineHeight = 20.sp,
                                    color = Color(0xFF32627E)
                                )
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.3f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Box(
                            modifier = Modifier.fillMaxSize(),
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(0.5f)
                                    .fillMaxHeight()
                                    .background(Color(0xFFFFFFFF), RectangleShape)
                            )
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentAlignment = Alignment.TopCenter
                                    )
                                    {
                                        Box(
                                            modifier = Modifier
                                                .size(tamañoCirculo)
                                                */
/*.background(Color(0xFFFFFFFF), CircleShape)*//*

                                                .background(Color.Red, CircleShape),
                                        )
                                    }
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(tamañoCirculo)
                                                */
/*.background(Color(0xFFFFFFFF), CircleShape)*//*

                                                .background(Color.Blue, CircleShape)
                                        )
                                    }
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentAlignment = Alignment.BottomCenter
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(tamañoCirculo)
                                                */
/*.background(Color(0xFFFFFFFF), CircleShape)*//*

                                                .background(Color.Yellow, CircleShape)
                                        )
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}*/
