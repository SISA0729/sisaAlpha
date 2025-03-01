package org.example.project.aplicacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import sisaalpha.composeapp.generated.resources.Res
import sisaalpha.composeapp.generated.resources.atlasinventory

@Composable
fun ShoeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(contentAlignment = Alignment.Center) {
            CircleDesign()
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Entra en tu estilo",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xFF673AB7))
        )
        Text(
            text = "Un mundo de zapatos",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Light, color = Color.Gray)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Explora los últimos estilos de las mejores marcas")
        Text("Obtén recomendaciones personalizadas")
        Text("Disfruta de envíos rápidos y gratuitos")
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(0xFF673AB7)),
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text(text = "Button", color = Color.White)
        }
    }
}

@Composable
fun CircleDesign() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color(0xFF673AB7), shape = CircleShape),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            painter = painterResource(Res.drawable.atlasinventory),
            contentDescription = "Shoe",
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        LabelTag("NEW APP", Color(0xFFFFC107))
    }
}

@Composable
fun LabelTag(text: String, color: Color) {
    Box(
        modifier = Modifier
            .background(color, shape = CircleShape)
            .padding(8.dp)
    ) {
        BasicText(text = text, style = TextStyle(color = Color.Black, fontSize = 12.sp))
    }
}
