package com.stu74532.assignment2_74532

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.stu74532.assignment2_74532.ui.theme.Assignment2_74532Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2_74532Theme {
                init_movie()
                AppNavigation()
            }
        }
    }
}

var listMovie = mutableListOf<Movie>()

@Composable
fun init_movie()
{
    var oppenheimer = Movie(
        name = "Oppenheimer",
        image = "https://poster.moncinepack.fr/FR/poster/6649EE64/320/RAY6M.jpg?optimizer=image",
        certification = "15A",
        description = "    In 1942, convinced that Nazi Germany was in the process of developing a nuclear weapon, the United States initiated, in the greatest secrecy, the \"Manhattan Project\" aimed at developing the first atomic bomb in history. To oversee the project, the government hired J. Robert Oppenheimer, a brilliant physicist who would soon be dubbed \"the father of the atomic bomb\". It was in the ultra-secret Los Alamos laboratory, in the heart of the New Mexico desert, that the scientist and his team developed a revolutionary weapon whose dizzying consequences continue to have an impact on the world today...orence Pugh",
        starring = listOf("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr", "Florence Pugh"),
        runningTimeMins = 181,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var madameweb = Movie(
        name = "Madame Web",
        image = "https://m.media-amazon.com/images/M/MV5BMTM2YjI4MzYtNjc1Zi00ZjkyLWFiOWItMDVhODNjYWQzN2M4XkEyXkFqcGdeQXVyNjMxMTE2Mjg@._V1_.jpg",
        certification = "12A",
        description = "   Cassandra Web is a Manhattan ambulance driver who is said to be able to see into the future. Forced to confront revelations about her past, she forms a relationship with three young women destined for an extraordinary future... if they can survive their deadly present.",
        starring = listOf("Dakota Johnson", "Sydney Sweeney", "Isabela Merced", "Celeste O'Connor"),
        runningTimeMins = 116,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var jaguar = Movie(
        name = "The Last Jaguar",
        image = "https://fr.web.img6.acsta.net/c_310_420/pictures/23/11/28/11/27/1028805.jpg",
        certification = "G",
        description = "Autumn grows up in the Amazon rainforest alongside Hope, an adorable baby female jaguar she has taken in. But when she turns six, a family tragedy forces Autumn and her father to move back to New York. Eight years go by, and Autumn, now a teenager, has never forgotten her jaguar friend. When she learns that Hope is in mortal danger, Autumn decides to return to the jungle to save her!",
        starring = listOf("Lumi Pollack", "Sydney Sweeney", "Isabela Merced", "Emily Bett Rickards", "Wayne Charles Baker"),
        runningTimeMins = 100,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var dune2 = Movie(
        name = "Oppenheimer",
        image = "https://poster.moncinepack.fr/FR/poster/6649EE64/320/RAY6M.jpg?optimizer=image",
        certification = "PG-13",
        description = "    In 1942, convinced that Nazi Germany was in the process of developing a nuclear weapon, the United States initiated, in the greatest secrecy, the \"Manhattan Project\" aimed at developing the first atomic bomb in history. To oversee the project, the government hired J. Robert Oppenheimer, a brilliant physicist who would soon be dubbed \"the father of the atomic bomb\". It was in the ultra-secret Los Alamos laboratory, in the heart of the New Mexico desert, that the scientist and his team developed a revolutionary weapon whose dizzying consequences continue to have an impact on the world today...orence Pugh",
        starring = listOf("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr", "Florence Pugh"),
        runningTimeMins = 181,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var karaoke = Movie(
        name = "Oppenheimer",
        image = "https://poster.moncinepack.fr/FR/poster/6649EE64/320/RAY6M.jpg?optimizer=image",
        certification = "PG-13",
        description = "    In 1942, convinced that Nazi Germany was in the process of developing a nuclear weapon, the United States initiated, in the greatest secrecy, the \"Manhattan Project\" aimed at developing the first atomic bomb in history. To oversee the project, the government hired J. Robert Oppenheimer, a brilliant physicist who would soon be dubbed \"the father of the atomic bomb\". It was in the ultra-secret Los Alamos laboratory, in the heart of the New Mexico desert, that the scientist and his team developed a revolutionary weapon whose dizzying consequences continue to have an impact on the world today...orence Pugh",
        starring = listOf("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr", "Florence Pugh"),
        runningTimeMins = 181,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var immaculee = Movie(
        name = "Oppenheimer",
        image = "https://poster.moncinepack.fr/FR/poster/6649EE64/320/RAY6M.jpg?optimizer=image",
        certification = "PG-13",
        description = "    In 1942, convinced that Nazi Germany was in the process of developing a nuclear weapon, the United States initiated, in the greatest secrecy, the \"Manhattan Project\" aimed at developing the first atomic bomb in history. To oversee the project, the government hired J. Robert Oppenheimer, a brilliant physicist who would soon be dubbed \"the father of the atomic bomb\". It was in the ultra-secret Los Alamos laboratory, in the heart of the New Mexico desert, that the scientist and his team developed a revolutionary weapon whose dizzying consequences continue to have an impact on the world today...orence Pugh",
        starring = listOf("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr", "Florence Pugh"),
        runningTimeMins = 181,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var migration = Movie(
        name = "Oppenheimer",
        image = "https://poster.moncinepack.fr/FR/poster/6649EE64/320/RAY6M.jpg?optimizer=image",
        certification = "PG-13",
        description = "    In 1942, convinced that Nazi Germany was in the process of developing a nuclear weapon, the United States initiated, in the greatest secrecy, the \"Manhattan Project\" aimed at developing the first atomic bomb in history. To oversee the project, the government hired J. Robert Oppenheimer, a brilliant physicist who would soon be dubbed \"the father of the atomic bomb\". It was in the ultra-secret Los Alamos laboratory, in the heart of the New Mexico desert, that the scientist and his team developed a revolutionary weapon whose dizzying consequences continue to have an impact on the world today...orence Pugh",
        starring = listOf("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr", "Florence Pugh"),
        runningTimeMins = 181,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var maisonderetraite = Movie(
        name = "Oppenheimer",
        image = "https://poster.moncinepack.fr/FR/poster/6649EE64/320/RAY6M.jpg?optimizer=image",
        certification = "PG-13",
        description = "    In 1942, convinced that Nazi Germany was in the process of developing a nuclear weapon, the United States initiated, in the greatest secrecy, the \"Manhattan Project\" aimed at developing the first atomic bomb in history. To oversee the project, the government hired J. Robert Oppenheimer, a brilliant physicist who would soon be dubbed \"the father of the atomic bomb\". It was in the ultra-secret Los Alamos laboratory, in the heart of the New Mexico desert, that the scientist and his team developed a revolutionary weapon whose dizzying consequences continue to have an impact on the world today...orence Pugh",
        starring = listOf("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr", "Florence Pugh"),
        runningTimeMins = 181,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var wonka = Movie(
        name = "Oppenheimer",
        image = "https://poster.moncinepack.fr/FR/poster/6649EE64/320/RAY6M.jpg?optimizer=image",
        certification = "PG-13",
        description = "    In 1942, convinced that Nazi Germany was in the process of developing a nuclear weapon, the United States initiated, in the greatest secrecy, the \"Manhattan Project\" aimed at developing the first atomic bomb in history. To oversee the project, the government hired J. Robert Oppenheimer, a brilliant physicist who would soon be dubbed \"the father of the atomic bomb\". It was in the ultra-secret Los Alamos laboratory, in the heart of the New Mexico desert, that the scientist and his team developed a revolutionary weapon whose dizzying consequences continue to have an impact on the world today...orence Pugh",
        starring = listOf("Cillian Murphy", "Emily Blunt", "Matt Damon", "Robert Downey Jr", "Florence Pugh"),
        runningTimeMins = 181,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )

    listMovie.add(oppenheimer)
    listMovie.add(madameweb)
    listMovie.add(jaguar)
    listMovie.add(dune2)
    listMovie.add(karaoke)
    listMovie.add(immaculee)
    listMovie.add(migration)
    listMovie.add(maisonderetraite)
    listMovie.add(wonka)
}