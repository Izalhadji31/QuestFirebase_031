package com.example.questfirebase_031.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questfirebase_031.ui.home.pages.HomeScreen
import com.example.questfirebase_031.ui.insert.pages.InsertMhsView

@Composable
fun PengelolaHalaman(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ){
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiInsert.route)
                 },
            )
        }
        composable(DestinasiInsert.route){
            InsertMhsView(
                onBack = { navController.popBackStack() },
                onNavigate = { navController.navigate(DestinasiHome.route) }
            )
        }
    }
}