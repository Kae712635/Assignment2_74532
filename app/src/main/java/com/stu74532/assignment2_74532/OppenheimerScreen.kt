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
    import coil.compose.rememberImagePainter


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun OppenheimerScreen(navController: NavController?, movie: Int) {
        val Tempo = listMovie[movie]
        var im = R.drawable.oppenheimer2
        if (movie == 1) im = R.drawable.madameweb
        else if (movie == 2) im = R.drawable.le_dernier_jaguar
        else if (movie == 3) im = R.drawable.dune
        else if (movie == 4) im = R.drawable.karaoke
        else if (movie == 5) im = R.drawable.immacule
        else if (movie == 6) im = R.drawable.migration
        else if (movie == 7) im = R.drawable.maisonderetraite2
        else if (movie == 8) im = R.drawable.wonka

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
                                navController?.navigate(Routes.ScreenHome.route)
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
                        painter = painterResource(id = im),
                        contentDescription = Tempo.name,
                        modifier = Modifier.size(200.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = Tempo.name + "  ${Tempo.certification}",
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
                        text = Tempo.description,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp
                        )
                    )
                }
                Row {
                    Text(
                        modifier = Modifier.padding(4.dp),
                        text =  "Running time: ${Tempo.runningTimeMins} mins\n" +
                                "Starring: ${Tempo.starring.joinToString(", ")}",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 10.sp
                        )
                    )

                }
                Spacer(modifier = Modifier.height(16.dp))

                val select = remember{ mutableIntStateOf(Tempo.seatsSelected) }

                Text(text = "Seats Remaining: ${Tempo.seatsRemaining}",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 14.sp))
                Text(text = "Seats Selected: ${select.intValue}",
                        style = TextStyle(
                        color = Color.White,
                        fontSize = 14.sp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    IconButton(
                        onClick = {
                            if (Tempo.seatsSelected > 0) {
                                decrementSeatsSelected(Tempo)
                                select.intValue = Tempo.seatsSelected
                            }
                        },
                        enabled = Tempo.seatsSelected > 0,
                        modifier = Modifier.size(48.dp),
                    ) {
                        Image(
                            painter = painterResource(if (Tempo.seatsSelected > 0) R.drawable.moinsactif else R.drawable.moinsinactif),
                            contentDescription = "Remove Seat",
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    IconButton(
                        onClick = {
                            if (Tempo.seatsRemaining > 0) {
                                incrementSeatsSelected(Tempo)
                                select.intValue = Tempo.seatsSelected
                            }
                        },
                        enabled = Tempo.seatsRemaining > 0,
                        modifier = Modifier.size(48.dp),
                    ) {
                        Image(
                            painter = painterResource(if (Tempo.seatsRemaining > 0) R.drawable.plusactif
                            else R.drawable.plusinactif),
                            contentDescription = "Add Seat",
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }