package org.example.project


import org.example.project.estilos.AtlasAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import org.example.project.aplicacion.Empezar

@Composable
@Preview
fun App() {
    AtlasAppTheme {
        //NavegacionApp()
        Empezar()
    }
}
