package com.stu74532.assignment2_74532

// Movie.kt

data class Movie(
    val name: String,
    val image: String,
    val certification: String,
    val description: String,
    val starring: List<String>,
    val runningTimeMins: Int,
    var seatsRemaining: Int,
    var seatsSelected: Int
)

fun generateRandomSeatsRemaining(): Int {
    return (0..15).random()
}

fun incrementSeatsSelected(movie: Movie) {
    if (movie.seatsRemaining > 0) {
        movie.seatsRemaining--
        movie.seatsSelected++
    }
}

fun decrementSeatsSelected(movie: Movie) {
    if (movie.seatsSelected > 0) {
        movie.seatsSelected--
        movie.seatsRemaining++
    }
}
