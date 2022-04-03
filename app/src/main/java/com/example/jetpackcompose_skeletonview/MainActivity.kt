package com.example.jetpackcompose_skeletonview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
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
                    )
                }
            }
        }
    }
}

@Composable
private fun SkeletonView(
    modifier: Modifier = Modifier,
    colorList: List<Color> = listOf(
        Color(android.graphics.Color.parseColor("#E5E7EB")),
        Color(android.graphics.Color.parseColor("#F0F2F4")),
        Color(android.graphics.Color.parseColor("#E5E7EB")),
    ),
) {
    BoxWithConstraints(
        modifier = modifier
    ) {
        val cardWidthPx = with(LocalDensity.current) { maxWidth.toPx() }
        val cardHeightPx = with(LocalDensity.current) { maxHeight.toPx() }
        val gradientWidth: Float = (0.3f * cardHeightPx) // 대각선의 가로 넓이

        val infiniteTransition = rememberInfiniteTransition()
        val xCardShimmer = infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = (cardWidthPx + gradientWidth),
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = 1000,
                    easing = LinearEasing,
                    delayMillis = 300
                ),
                repeatMode = RepeatMode.Restart
            )
        )
        val yCardShimmer = infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = (cardHeightPx + gradientWidth),
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = 1000,
                    easing = LinearEasing,
                    delayMillis = 300
                ),
                repeatMode = RepeatMode.Restart
            )
        )

        val brush = linearGradient(
            colors = colorList,
            start = Offset(xCardShimmer.value - gradientWidth, yCardShimmer.value - gradientWidth),
            end = Offset(xCardShimmer.value, yCardShimmer.value)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = brush)
        )
    }
}