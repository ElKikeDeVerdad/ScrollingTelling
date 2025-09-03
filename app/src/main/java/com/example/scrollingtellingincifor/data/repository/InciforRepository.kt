package com.example.scrollingtellingincifor.data.repository


import com.example.scrollingtellingincifor.R
import com.example.scrollingtellingincifor.data.MiniScreenData

class InciforRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_Incifor_miniscreen0_paragraph_0
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_Incifor_miniscreen0_paragraph_1,
                )
            )

            )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}
