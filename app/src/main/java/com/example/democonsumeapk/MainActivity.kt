package com.example.democonsumeapk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.democonsumeapk.ui.theme.DemoConsumeAPKTheme
import com.example.democonsumeapk.Items_menu.Pantalla1
import com.example.democonsumeapk.Items_menu.Pantalla2
import com.example.democonsumeapk.Items_menu.Pantalla3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoConsumeAPKTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PantallaPrincipal()
                }
            }
        }
    }

    @Composable
    fun PantallaPrincipal() {
        val navController = rememberNavController()
        val scaffoldState = rememberScaffoldState()
        val scope = rememberCoroutineScope()

        //Listado de pantallas
        val navigation_item = listOf(
            Pantalla1,
            Pantalla2,
            Pantalla3
        )

        //Navegacion Barra Inferior
        Scaffold(scaffoldState = scaffoldState,
            bottomBar = {navegacionInferior(navController,navigation_item)}) {
            NavigationHost(navController)
        }

    }

    @Composable
    fun currentRoute(navController: NavHostController) : String?{
        val entry by navController.currentBackStackEntryAsState()
        return entry?.destination?.route
    }

    @Composable
    fun navegacionInferior(
        navController: NavHostController,
        menu_items : List<Items_menu>
    ){
        BottomAppBar() {
            val currentRoute = currentRoute(navController = navController)
            BottomNavigation() {
                menu_items.forEach{ item ->
                    BottomNavigationItem(
                        selected = currentRoute == item.route,
                        onClick = { navController.navigate(item.route) },
                        icon = {
                            Icon (
                                painter = painterResource(id = item.icon),
                                contentDescription = item.title
                            )
                        },
                        label = { Text(item.title)}
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PantallaPrincipalPreview() {
        DemoConsumeAPKTheme {
            PantallaPrincipal()
        }
    }

    public fun showBciPlusFullFlow(){
        val bciPlusFullContract = BciPlusFullFlowImp()

        bciPlusFullContract.startFlow(this)
    }

    public fun showBciPlusHelpFlow(){
        val bciPlusHelpContract = BciPlusHelpFlowImp()

        bciPlusHelpContract.startFlow(this)
    }

}

