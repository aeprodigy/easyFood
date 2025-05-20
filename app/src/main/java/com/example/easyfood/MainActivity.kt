package com.example.easyfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.easyfood.ui.theme.EasyFoodTheme
import com.example.easyfood.ui.theme.navigation.AppNavigationGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EasyFoodTheme {
                //surface
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White)
                ) {

                    //entry point
                    AppEntryPoint()
                }
            }

        }
    }
}

@Composable
fun AppEntryPoint() {
    // This is where you can set up your navigation or main screen
    // For example, you can call a function to set up the navigation graph
    // NavigationGraph()
    AppNavigationGraph()
}

