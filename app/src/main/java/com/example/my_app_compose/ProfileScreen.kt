package com.example.my_app_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.my_app_compose.ui.theme.My_app_composeTheme


@Preview(showBackground = true, device = Devices.PIXEL_2)
@Composable
fun ProfileScreen() {
    MyAppTheme {
        Surface(
            color = MaterialTheme.colors.surface
        ) {
            Scaffold(
                floatingActionButton = {
                    ExtendedFloatingActionButton(
                        icon = { Icon(Icons.Outlined.Phone,"") },
                        text = { Text("Adopt me") },
                        onClick = { /*TODO*/ },
                        backgroundColor = MaterialTheme.colors.primary,
                    )
                },
                content = {
                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.cat3),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Column(modifier = Modifier.padding(15.dp)) {
                            Text(
                                "Lucy",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.onPrimary,
                            )
                            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                                Spacer(
                                    Modifier
                                        .height(2.dp)
                                        .fillMaxWidth()
                                        .background(color = MaterialTheme.colors.secondaryVariant)
                                )
                            }

                            Text(
                                "Sex",
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.secondary
                            )
                            Text(
                                "Female",
                                fontSize = 15.sp,
                                color = MaterialTheme.colors.onPrimary,
                            )
                            Column(modifier = Modifier.padding(vertical = 5.dp)) {
                                Spacer(
                                    Modifier
                                        .height(2.dp)
                                        .fillMaxWidth()
                                        .background(color = MaterialTheme.colors.secondaryVariant)
                                )
                            }

                            Text(
                                "Age",
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.secondary
                            )
                            Text(
                                "8",
                                fontSize = 15.sp,
                                color = MaterialTheme.colors.onPrimary,
                            )
                            Column(modifier = Modifier.padding(vertical = 5.dp)) {
                                Spacer(
                                    Modifier
                                        .height(2.dp)
                                        .fillMaxWidth()
                                        .background(color = MaterialTheme.colors.secondaryVariant)
                                )
                            }

                            Text(
                                "Personality",
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.secondary
                            )
                            Text(
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                                fontSize = 15.sp,
                                color = MaterialTheme.colors.onPrimary,
                            )
                        }
                    }
                }
            )
        }
    }
}
