package com.poetry.forefront.jectpackcomposes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.poetry.forefront.jectpackcomposes.ui.theme.JectPackComposesTheme
import com.poetry.forefront.jectpackcomposes.ui.theme.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JectPackComposesTheme {}
            TextView.Greeting("i am starting on Composes Android")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JectPackComposesTheme {
        TextView.Greeting("i am starting on Composes Android")
    }
}