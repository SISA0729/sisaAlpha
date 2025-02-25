package org.example.project.auth.inicio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import org.example.project.estilos.AtlasAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun PantallaInicio(
    modifier: Modifier = Modifier,
    uiState: PantallaInicioState,
    onUsernameChange: (String) -> Unit,
    onCorreoChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
) {
    Column(modifier = modifier.padding(16.dp)) {
        TextField(
            value = uiState.username,
            onValueChange = onUsernameChange,
            label = { Text("Username") }
        )
        TextField(
            value = uiState.correo,
            onValueChange = onCorreoChange,
            label = { Text("Correo") }
        )
        TextField(
            value = uiState.password,
            onValueChange = onPasswordChange,
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation()
        )
    }
}

@Preview
@Composable
fun PantallaInicioPreview() {
    AtlasAppTheme {
        PantallaInicio(
            uiState = PantallaInicioState(),
            onUsernameChange = {},
            onCorreoChange = {},
            onPasswordChange = {},
        )
    }
}