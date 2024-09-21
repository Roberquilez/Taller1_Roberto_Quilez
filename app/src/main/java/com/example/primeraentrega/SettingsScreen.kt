package com.example.primeraentrega

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SettingsScreen(navController: NavHostController, onColorChange: (Color) -> Unit) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Settings Screen")
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { navController.navigate("home") }) {
                    Text(text = "Go to Home")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { onColorChange(Color.Red) }) {
                    Text(text = "Red")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { onColorChange(Color.Blue) }) {
                    Text(text = "Blue")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { onColorChange(Color.Yellow) }) {
                    Text(text = "Yellow")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { onColorChange(Color.Green) }) {
                    Text(text = "Green")
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    SettingsScreen(rememberNavController()) {}
}