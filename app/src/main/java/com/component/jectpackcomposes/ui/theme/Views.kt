package com.poetry.forefront.jectpackcomposes.ui.theme

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.poetry.forefront.jectpackcomposes.R

object Views {

    @Composable
    fun Greeting(name: String) {

        var expanded by rememberSaveable { mutableStateOf(false) }

        val extraPadding by animateDpAsState(
            targetValue = if (expanded) 48.dp else 0.dp,
            animationSpec = tween(
                durationMillis = 1000
            )




        )

        Surface(color = MaterialTheme.colors.primary,
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {



            Column(modifier = Modifier.padding(bottom = extraPadding)) {
                Row(modifier = Modifier
                    .fillMaxWidth(1f)) {
                    val painter = painterResource(id = R.drawable.flower)
                    Image(
                        painter = painter,
                        contentDescription = "Contact profile picture",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .weight(0.2f)
                            .padding(bottom = extraPadding)
                    )

                    Text(
                        text = name,
                        color = white,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(0.4f)
                            .padding(top = 24.dp))


                    Column(modifier = Modifier
                        .weight(0.4f)
                        .padding(top = 6.dp)
                    ) {
                        OutlinedButton(onClick = { expanded = !expanded }) {
                            Text(if (expanded) "Show Less" else "Show More")

                        }

                    }


                }
            }


        }

        /* Column(modifier = Modifier.padding(start = 20.dp).also { Modifier.padding(end = 20.dp) }) {

             Spacer(modifier = Modifier.height(260.dp))

             Button(
                 onClick = { },
                 // Uses ButtonDefaults.ContentPadding by default
                 contentPadding = PaddingValues(
                     start = 12.dp,
                     top = 12.dp,
                     end = 20.dp,
                     bottom = 12.dp
                 )
             ) {
                 // Inner content including an icon and a text label
                 Icon(
                     Icons.Filled.Favorite,
                     contentDescription = "Favorite",
                     modifier = Modifier.size(ButtonDefaults.IconSize)
                 )
                 Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                 Text("Like")
             }

         }*/


    }


}