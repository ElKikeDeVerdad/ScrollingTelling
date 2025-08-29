import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scrollingtellingincifor.Auxiliares.EtiquetasTexto.LectorEtiquetas
import com.example.scrollingtellingincifor.INCIFOR.Helpers.pantallaAltura
import com.example.scrollingtellingincifor.INCIFOR.Helpers.pantallaAncho
import com.example.scrollingtellingincifor.R

@Composable
fun InciforScreen2(modifier: Modifier = Modifier) {
    val altura = pantallaAltura()
    val tamañoCirculo = pantallaAncho() * 0.1f
    val grosorLinea = pantallaAncho() * 0.03f

    Box(
        modifier = Modifier
            .fillMaxSize()
            .height(altura)
            .background(Color(0xFFBCE0F0))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            //Linea
            Box(
                modifier = Modifier
                    .width(grosorLinea)
                    .fillMaxHeight(0.3f)
                    .background(Color(0xFFFFFFFF), RectangleShape)
            )
            //Circulo
            Box(
                modifier = Modifier
                    .size(tamañoCirculo)
                    .background(Color(0xFFFFFFFF), CircleShape)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = LectorEtiquetas(stringResource(R.string.Incifor_texto_Item2)),
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.fillMaxWidth(0.65f),
                lineHeight = 20.sp,
            )

            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(R.drawable.noimagen),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.2f)
                    .background(Color(0XFFE5F4F9))
            )
        }
    }

}