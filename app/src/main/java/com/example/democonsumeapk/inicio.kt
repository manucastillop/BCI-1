package com.example.democonsumeapk

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Inicio(){
    Column() {
        Text(
            text = "Inicio",
            style = MaterialTheme.typography.h1
        )
    }
}