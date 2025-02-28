package org.example.project


import org.example.project.estilos.AtlasAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cafe.adriel.voyager.transitions.SlideTransition
import cafe.adriel.voyager.navigator.*
import org.example.project.auth.inicio.PantallaInicio
import org.example.project.auth.inicio.PantallaInicioState
import org.example.project.auth.registro.PantallaRegistro
import org.example.project.auth.registro.PantallaRegistroState
import org.example.project.navigation.NavegacionApp


@Composable
@Preview
fun App() {
    AtlasAppTheme {
        NavegacionApp()
    }
}
