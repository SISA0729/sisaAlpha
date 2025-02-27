package org.example.project


import org.example.project.estilos.AtlasAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import org.example.project.auth.inicio.PantallaInicio
import org.example.project.auth.inicio.PantallaInicioState


@Composable
@Preview
fun App() {
    AtlasAppTheme {
        PantallaInicio(
            uiState = PantallaInicioState(),
            onUsernameChange = {},
            onPasswordChange = {}
        )
    }
}