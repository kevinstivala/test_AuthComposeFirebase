package com.ingeniovirtual.test_authcomposefirebase.navigation

sealed class AppScreens(val route: String) {
    object HomeScreen: AppScreens("home_screen")
    object LogInScreen: AppScreens("login_screen")
    object SignUpScreen: AppScreens("signup_screen")
}
