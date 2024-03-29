package com.example.first

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()

        }
    }
}

@Composable
fun details(navController: NavController) {
    Column(modifier = Modifier.padding(10.dp)) {
        Button(
            onClick = {
                      navController.navigate("form")

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .height(56.dp)
                .padding(horizontal = 16.dp)
                .clickable {  navController.navigate("form")
                }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Add Icon",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "ADD MEMBER")

            }
        }
    }
}


@Composable
fun app() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "detail") {
        composable(route = "detail") { details(navController) } // Pass navController
        composable(route = "form") { FormScreen() }
    }
}
