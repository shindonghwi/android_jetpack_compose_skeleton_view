package com.example.jetpackcompose_skeletonview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose_skeletonview.ui.theme.JetpackCompose_SkeletonViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_SkeletonViewTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    SkeletonView(
                        modifier = Modifier
                            .padding(20.dp)
                            .fillMaxWidth()
                            .height(100.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        repeatDelayTime = 100
                    )
                }
            }
        }
    }
}