package com.poetry.forefront.jectpackcomposes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.poetry.forefront.jectpackcomposes.ui.theme.JectPackComposesTheme
import com.poetry.forefront.jectpackcomposes.ui.theme.Views

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            appViews()

        }
    }
}


@Preview(showBackground = true, heightDp = 520, widthDp = 320)
@Composable
fun DefaultPreview() {
    JectPackComposesTheme {
        appViews()
    }
}

@Composable
fun appViews(names: List<String> = List(200) { ("its Me,  Ayaz") }) {

    Surface(
        color = MaterialTheme.colors.background
    ) {
        Column {
            LazyColumn {
                items(names) { name ->
                    run {
                        Views.Greeting(name)
                    }
                }
            }

        }
    }

}
