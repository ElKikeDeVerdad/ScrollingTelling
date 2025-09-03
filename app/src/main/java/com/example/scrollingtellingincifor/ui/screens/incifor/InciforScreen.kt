import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.scrollingtellingincifor.data.MiniScreenState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import com.example.scrollingtellingincifor.ui.screens.incifor.InciforViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.items
import com.example.scrollingtellingincifor.ui.screens.incifor.miniscreens.InciforMiniScreen0
import com.example.scrollingtellingincifor.ui.screens.incifor.miniscreens.InciforMiniScreen1

import com.example.scrollingtellingincifor.ui.screens.incifor.miniscreens.TestScreen0
import com.example.scrollingtellingincifor.ui.screens.incifor.miniscreens.TestScreen1

@Composable
fun InciforScreen() {
//fun InciforScreen(listState: LazyListState) {
    val viewModel: InciforViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is MiniScreenState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        is MiniScreenState.Success -> {
            val screens = (uiState as MiniScreenState.Success).screens
            LazyColumn(
                //state = listState,
                modifier = Modifier.fillMaxSize()
            ) {
                items(screens) { data ->
                    when (data.id) {
                        0 -> TestScreen0(data,Modifier.fillMaxWidth().fillParentMaxHeight())
                        1 -> TestScreen1(data,Modifier.fillMaxWidth().fillParentMaxHeight())
                        else -> Text("MiniScreen desconocida")
                    }
                }
            }
        }

        is MiniScreenState.Error -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = (uiState as MiniScreenState.Error).message,
                    color = Color.Red
                )
            }
        }
    }
}
