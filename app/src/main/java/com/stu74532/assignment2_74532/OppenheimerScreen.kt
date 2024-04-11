package com.stu74532.assignment2_74532


    import androidx.compose.foundation.Image
    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.Arrangement
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
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.mutableIntStateOf
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.graphics.painter.Painter
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.TextStyle
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import androidx.navigation.NavController


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun OppenheimerScreen(navController: NavController?, movie: Int) {
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
                                if (navController != null) {
                                    navController.navigate(Routes.ScreenHome.route)
                                }
                            },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_movie),
                                contentDescription = "Movie"
                            )
                        }
                        IconButton(
                            onClick = { /* "Search" */ },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = "Search"
                            )
                        }
                        IconButton(
                            onClick = { /* "Account" */ },
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
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.oppenheimer2),
                        contentDescription = "Oppenheimer",
                        modifier = Modifier.size(200.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = listMovie[movie].name + "  ${listMovie[movie].certification}",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    )
                }
                Row {
                    Text(
                        modifier = Modifier.padding(4.dp),
                        text = listMovie[movie].description,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp
                        )
                    )
                }
                Row {
                    Text(
                        modifier = Modifier.padding(4.dp),
                        text = "Genre: Drama, History, Biopic, Thriller, Biography\n" +
                                "Running time: ${listMovie[movie].runningTimeMins} mins\n" +
                                "Starring: ${listMovie[movie].starring.joinToString(", ")}",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 10.sp
                        )
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                val select = remember{ mutableIntStateOf(listMovie[movie].seatsSelected) }

                Text(text = "Seats Remaining: ${listMovie[movie].seatsRemaining}",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 14.sp))
                Text(text = "Seats Selected: ${select.value}",
                        style = TextStyle(
                        color = Color.White,
                        fontSize = 14.sp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    IconButton(
                        onClick = {
                            if (listMovie[movie].seatsSelected > 0) {
                                decrementSeatsSelected(listMovie[movie])
                                select.value = listMovie[movie].seatsSelected
                            }
                        },
                        enabled = listMovie[movie].seatsSelected > 0,
                        modifier = Modifier.size(48.dp),
                    ) {
                        Image(
                            painter = painterResource(if (listMovie[movie].seatsSelected > 0) R.drawable.moinsactif else R.drawable.moinsinactif),
                            contentDescription = "Remove Seat",
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    IconButton(
                        onClick = {
                            if (listMovie[movie].seatsRemaining > 0) {
                                incrementSeatsSelected(listMovie[movie])
                                select.value = listMovie[movie].seatsSelected
                            }
                        },
                        enabled = listMovie[movie].seatsRemaining > 0,
                        modifier = Modifier.size(48.dp),
                    ) {
                        Image(
                            painter = painterResource(if (listMovie[movie].seatsRemaining > 0) R.drawable.plusactif
                            else R.drawable.plusinactif),
                            contentDescription = "Add Seat",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }