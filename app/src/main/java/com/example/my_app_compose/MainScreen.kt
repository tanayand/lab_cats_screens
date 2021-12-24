package com.example.my_app_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_app_compose.ui.theme.My_app_composeTheme


data class Item(
    val title: String,
    val description: String,
    val image: Int = R.drawable.ic_launcher_background
)

val ItemsList = listOf<Item>(
    Item(title = "Monty", description = "Male", image = R.drawable.cat1),
    Item(title = "Chloe", description = "Female", image = R.drawable.cat2),
    Item(title = "Lucy", description = "Female", image = R.drawable.cat3),
    Item(title = "Robert", description = "Male", image = R.drawable.cat4),
    Item(title = "Winky", description = "Male", image = R.drawable.cat5),
    Item(title = "Tomas", description = "Male", image = R.drawable.cat6),
    Item(title = "Casia", description = "Female", image = R.drawable.cat7),
)

@Composable
fun ItemRow(item: Item,) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 5.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colors.background,
                    shape = RoundedCornerShape(15.dp))
                .padding(5.dp)
            ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = item.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .absolutePadding(right = 10.dp, left = 10.dp, top = 10.dp, bottom = 10.dp)
                    .clip(RoundedCornerShape(15.dp)),
            )
            Column(
                modifier = Modifier.absolutePadding(left = 5.dp)
            ) {
                Text(item.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onPrimary)
                Text(item.description,
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.onPrimary)
            }
        }
    }

}

@Composable
fun ItemsComponent(data: List<Item>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ){
        items(data) {
                item -> ItemRow(item = item)
        }
    }
}

//@Preview(showBackground = true, device = Devices.PIXEL_2)
@Preview(showBackground = true)
@Composable
fun MainScreen() {
    MyAppTheme{
        // A surface container using the 'background' color from the theme
        Surface(
            color = MaterialTheme.colors.surface
        ) {
            ItemsComponent(data = ItemsList)
            //ProfileScreen()
        }
    }
}

