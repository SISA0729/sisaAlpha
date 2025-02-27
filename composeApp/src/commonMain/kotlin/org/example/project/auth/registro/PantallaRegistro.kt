package org.example.project.auth.registro

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import org.example.project.common.componentes.CtextField
import org.example.project.estilos.BotonHeight

@Composable
fun PantallaRegistro(
    modifier: Modifier = Modifier,
    uiState: PantallaRegistroState,
    onUsernameChange: (String) -> Unit,
    onCorreoChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                color = if (isSystemInDarkTheme()){
                    MaterialTheme.colors.background
                }else{
                    MaterialTheme.colors.surface
                }
            )
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 16.dp,
                bottom = 16.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        CtextField(
            value = uiState.username,
            onValueChange = onUsernameChange,
            keyboardType = KeyboardType.Text,
            placeholderText = "Usuario"

        )
        CtextField(
            value = uiState.correo,
            onValueChange = onCorreoChange,
            keyboardType = KeyboardType.Email,
            placeholderText = "Correo"
        )
        CtextField(
            value = uiState.password,
            onValueChange = onPasswordChange,
            keyboardType = KeyboardType.Password,
            isPassswordTextField = true,
            placeholderText = "Contraseña"
        )

        Button(
            onClick = {

            },
            modifier = modifier
                .fillMaxWidth()
                .height(BotonHeight),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp,
            ),
            shape = MaterialTheme.shapes.medium
        ){
            Text(text = "Registrarse")
        }
    }
}
