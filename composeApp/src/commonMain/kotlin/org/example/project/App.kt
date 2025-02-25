package org.example.project


import org.example.project.estilos.AtlasAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import org.example.project.componentes.CtextField


@Composable
@Preview
fun App() {
    AtlasAppTheme {
        CtextField(
            value = "",
            onValueChange = { },
            keyboardType = KeyboardType.Text,
            isPassswordTextField = false,
        )
    }
}