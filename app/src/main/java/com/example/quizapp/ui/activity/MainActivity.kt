package com.example.quizapp.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.quizapp.ui.screens.main.MainScreen
import com.example.quizapp.ui.screens.splash.SplashScreen
import com.example.quizapp.ui.theme.QuizAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizAppTheme {
                var showMainScreen by remember { mutableStateOf(false) }
                if (!showMainScreen) {
                    SplashScreen(
                        navigate = {
                            showMainScreen = true
                        }
                    )
                }
                else{
                    MainScreen()
                }
            }
        }
    }
}