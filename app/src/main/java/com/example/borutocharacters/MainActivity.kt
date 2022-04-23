package com.example.borutocharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.borutocharacters.navigation.SetupNavGraph
import com.example.borutocharacters.ui.theme.ui.theme.BorutoCharactersTheme

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BorutoCharactersTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }

    }
}
