package com.example.democonsumeapk

sealed class Items_menu (
    val icon: Int,
    val title: String,
    val route: String
){

    object Pantalla1: Items_menu(
        R.drawable.ic_baseline_class_24,
        "Inicio",
        "pantalla1"
    )
    object Pantalla2: Items_menu(
        R.drawable.ic_baseline_collections_24,
        "Full",
        "pantalla2"
    )
    object Pantalla3: Items_menu(
        R.drawable.ic_baseline_perm_contact_calendar_24,
        "Ayuda",
        "pantalla3"
    )
}