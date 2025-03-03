package com.example.quizapp.ui.screens.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quizapp.nav.Home
import com.example.quizapp.nav.SignIn
import com.example.quizapp.ui.screens.home.HomeScreen
import com.example.quizapp.ui.screens.signIn.SignIn

@Composable
fun MainScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            NavInnit()
        }
    }
}

@Composable
fun NavInnit() {
    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = SignIn
    ) {
        composable<SignIn> {
            SignIn(navigate = {
                navController.navigate(Home)
            })
        }
        composable<Home> {
            HomeScreen()
        }
    }
}
