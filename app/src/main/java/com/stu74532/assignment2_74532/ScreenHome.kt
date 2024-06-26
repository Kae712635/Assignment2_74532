package com.stu74532.assignment2_74532

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenHome(navController: NavController) {
        Scaffold(
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        val logoPainter: Painter = painterResource(id = R.drawable.logo)
                        Icon(
                            painter = logoPainter,
                            contentDescription = "Logo",
                            modifier = Modifier.size(150.dp)
                        )
                    },
                    colors = topAppBarColors(containerColor = Color(0xFF379683)),
                    title = { }
                )
            },
            bottomBar = {
                BottomAppBar(
                    containerColor = Color(0xFF379683),
                    contentColor = Color.Black,
                    modifier = Modifier.height(56.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = {
                                navController.navigate(Routes.ScreenHome.route)
                            },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_movie),
                                contentDescription = "Movie"
                            )
                        }
                        IconButton(
                            onClick = { /* Action pour le bouton "Search" */ },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = "Search"
                            )
                        }
                        IconButton(
                            onClick = { /* Action pour le bouton "Account" */ },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_account),
                                contentDescription = "Account"
                            )
                        }
                    }
                }
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .background(Color.Black)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.oppenheimer2,
                            contentDescription = "Oppenheimer",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(0)
                                navController.navigate(value)
                            }
                        )
                        seat(id = 0)
                    }

                    Spacer(modifier = Modifier.width(16.dp))
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.madameweb,
                            contentDescription = "Madame Web",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(1)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 1)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.le_dernier_jaguar,
                            contentDescription = "Th Last Jaguar",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(2)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 2)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row {
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.dune,
                            contentDescription = "Dune",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(3)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 3)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.karaoke,
                            contentDescription = "Karaoke",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(4)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 4)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.immacule,
                            contentDescription = "Immacule",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(5)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 5)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row {
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.migration,
                            contentDescription = "Migration",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(6)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 6)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.maisonderetraite2,
                            contentDescription = "Maison de retraite",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(7)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 7)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ImageWithNavigation(
                            imageId = R.drawable.wonka,
                            contentDescription = "Wonka",
                            onClick = {
                                val value = Routes.OppenheimerScreen.withArgs(8)
                                navController.navigate(value)
                            }
                        )

                        seat(id = 8)
                    }
                }
            }
        }
    }


@Composable
fun seat(id : Int)
{
    if(listMovie[id].seatsSelected != 0){
        Box(modifier = Modifier.background(Color.White))
        {
            Text(text = "Seat Selected = " + listMovie[id].seatsSelected,
                fontSize= 12.sp,
                color = Color.Black,
            )
        }

    }
    else{
        Box (modifier = Modifier.background(Color.Cyan)){
            Text(text = "Seat Remaining = " + listMovie[id].seatsRemaining,
                fontSize= 12.sp,
                color = Color.Black
            )
        }
    }
}

@Composable
fun ImageWithNavigation(
    imageId: Int,
    contentDescription: String,
    onClick: () -> Unit
) {
    val painter: Painter = painterResource(id = imageId)
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = Modifier
            .clickable(onClick = onClick)
    )
}