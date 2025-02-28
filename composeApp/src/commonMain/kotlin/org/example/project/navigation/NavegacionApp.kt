package org.example.project.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.example.project.auth.inicio.PantallaInicio
import org.example.project.auth.inicio.PantallaInicioState
import org.example.project.auth.registro.PantallaRegistro
import org.example.project.auth.registro.PantallaRegistroState

@Composable
fun NavegacionApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") {
            PantallaInicio(
                navController = navController,
                uiState = PantallaInicioState(),
                onUsernameChange = {},
                onPasswordChange = {}
            )
        }
        composable("registro") {
            PantallaRegistro(
                uiState = PantallaRegistroState(),
                navController = navController,
                onUsernameChange = { },
                onCorreoChange = {  },
                onPasswordChange = { }
            )
        }
    }
}