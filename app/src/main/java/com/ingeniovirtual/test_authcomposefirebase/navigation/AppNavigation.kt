package com.ingeniovirtual.test_authcomposefirebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ingeniovirtual.test_authcomposefirebase.viewmodels.AuthViewModel


val ROUTE_LOGIN = AppScreens.LogInScreen.route
val ROUTE_SIGNUP = AppScreens.SignUpScreen.route
val ROUTE_HOME = AppScreens.HomeScreen.route

@Composable
fun AppNavigation(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            // LoginScreen()
        }
        composable(ROUTE_SIGNUP) {
            // SignupScreen()
        }
        composable(ROUTE_HOME) {
            // HomeScreen()
        }
    }

}