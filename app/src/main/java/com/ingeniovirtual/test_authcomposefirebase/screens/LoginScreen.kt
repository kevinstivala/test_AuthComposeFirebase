package com.ingeniovirtual.test_authcomposefirebase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ingeniovirtual.test_authcomposefirebase.viewmodels.AuthViewModel

@Composable
fun LoginScreen(viewModel: AuthViewModel?, navController: NavController) {

    var email by remember{mutableStateOf("")}
    var password by remember {mutableStateOf("")}

    val authResource = viewModel?.loginFlow?.collectAsState()
    
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (refHeader, refEmail,refPassword, refButtonLogin, refTextSignup, refLoading) = createRefs()
        //


    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreviewLight() {
    LoginScreen(null, rememberNavController())
}