package com.example.democonsumeapk

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun Contenidos(){
    val context = LocalContext.current
    Column() {
        Text(
            text = "Contenidos",
            style = MaterialTheme.typography.h1
        )
    }

    fun showBciPlusFullFlow(){
        val bciPlusFullContract = BciPlusFullFlowImp()

        bciPlusFullContract.startFlow(context)
    }

    Button(onClick = {
        showBciPlusFullFlow()
    }) {
        Text(text = "Flujo de Full Ejemplo")
    }


}

