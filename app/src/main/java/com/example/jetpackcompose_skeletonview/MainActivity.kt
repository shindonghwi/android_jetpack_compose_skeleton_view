package com.example.jetpackcompose_skeletonview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose_skeletonview.ui.theme.JetpackCompose_SkeletonViewTheme
import dev.wolf.skeleton_ui.SkeletonView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_SkeletonViewTheme {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {

                    SkeletonView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        repeatDelayTime = 100
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        items(5) {
                            SkeletonView(
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                repeatDelayTime = 100
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    SkeletonView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(24.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        repeatDelayTime = 100
                    )

                    Spacer(modifier = Modifier.height(30.dp))


                    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        items(5) {
                            SkeletonView(
                                modifier = Modifier
                                    .width(130.dp)
                                    .height(250.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                repeatDelayTime = 100
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        SkeletonView(
                            modifier = Modifier
                                .size(130.dp)
                                .clip(RoundedCornerShape(100.dp)),
                            repeatDelayTime = 100
                        )
                    }
                }
            }
        }
    }
}