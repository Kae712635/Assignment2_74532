package com.stu74532.assignment2_74532

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.ScreenHome.route
    ) {
        composable(route = Routes.ScreenHome.route) {
            ScreenHome(navController = navController)
        }
        composable(
            route = Routes.OppenheimerScreen.route + "/{movie}",
            arguments = listOf(
                navArgument("movieId") {
                    defaultValue = 0
                    type = NavType.IntType
                }
            )
        ) {
            val movieId = it.arguments?.getInt("movieId")
            OppenheimerScreen(navController = navController, movie = movieId!!)
        }
    }
}