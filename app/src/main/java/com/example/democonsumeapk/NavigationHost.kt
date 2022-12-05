package com.example.democonsumeapk

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

//rutas
import com.example.democonsumeapk.Items_menu.Pantalla1
import com.example.democonsumeapk.Items_menu.Pantalla2
import com.example.democonsumeapk.Items_menu.Pantalla3

import com.example.democonsumeapk.MainActivity

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Pantalla1.route
    ) {
        composable(Pantalla1.route) {
            Inicio()
        }
        composable(Pantalla2.route) {
            Contenidos()
        }
        composable(Pantalla3.route) {
            Otro()
        }
    }
}