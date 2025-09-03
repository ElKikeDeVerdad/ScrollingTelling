package com.example.scrollingtellingincifor.ui.screens.incifor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.scrollingtellingincifor.data.MiniScreenState
import com.example.scrollingtellingincifor.data.repository.InciforRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class InciforViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens(){
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaCimusRepository = InciforRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaCimusRepository.getData(0),
                )
            )

        }
    }
}