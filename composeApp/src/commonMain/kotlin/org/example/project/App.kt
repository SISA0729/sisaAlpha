package org.example.project


import androidx.compose.material.Text
import androidx.compose.runtime.*
import org.example.project.estilos.AtlasAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable




@Composable
@Preview
fun App() {
    AtlasAppTheme {
        val text by remember { mutableStateOf("Hello, World!") }
        Text(text)
    }
}