package com.example.democonsumeapk

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext


@Composable
    fun Otro() {
        val context = LocalContext.current
        Column() {
            Text(
                text = "Ayuda",
                style = MaterialTheme.typography.h1
            )
        }

        fun showBciPlusHelpFlow(){
            val bciPlusHelpContract = BciPlusHelpFlowImp()

            bciPlusHelpContract.startFlow(context)
        }

        Button(onClick = {
            showBciPlusHelpFlow()
        }) {
            Text(text = "Flujo Full Ejemplo")
        }

    }

