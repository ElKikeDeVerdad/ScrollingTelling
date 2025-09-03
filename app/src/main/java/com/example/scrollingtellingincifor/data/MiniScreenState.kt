package com.example.scrollingtellingincifor.data

sealed class MiniScreenState {
    object Loading : MiniScreenState()
    data class Success(val screens: List<MiniScreenData>) : MiniScreenState()
    data class Error(val message: String) : MiniScreenState()
}