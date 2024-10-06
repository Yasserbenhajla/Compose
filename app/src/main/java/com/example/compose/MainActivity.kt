package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JetpackComposerTutorial(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun JetpackComposerTutorial(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Image en haut
        Image(
            painter = painterResource(R.drawable.bg_compose_background__1_),
            contentDescription = "Jetpack Compose",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
        Spacer(modifier = Modifier.height(16.dp)) // Ajout d'un espace de 16dp

        // Première composable Text avec une taille de police plus grande
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp), // Ajout de padding autour du texte
            textAlign = TextAlign.Center // Centré horizontalement
        )

        Spacer(modifier = Modifier.height(8.dp)) // Ajout d'un espace de 8dp

        // Deuxième texte aligné de manière justifiée
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify, // Texte justifié
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun JetpackComposeTutorialPreview() {
    ComposeTheme {
        JetpackComposerTutorial()
    }
}
