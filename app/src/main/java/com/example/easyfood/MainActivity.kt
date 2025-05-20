package com.example.easyfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.easyfood.ui.theme.EasyFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EasyFoodTheme {

                //entry point
                AppEntryPoint()
                }

        }
    }
}

@Composable
fun AppEntryPoint() {
    // This is where you can set up your navigation or main screen
    // For example, you can call a function to set up the navigation graph
    // NavigationGraph()
}

