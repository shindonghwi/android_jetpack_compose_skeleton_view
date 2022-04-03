package com.example.jetpackcompose_skeletonview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcompose_skeletonview.ui.theme.JetpackCompose_SkeletonViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_SkeletonViewTheme {}
        }
    }
}