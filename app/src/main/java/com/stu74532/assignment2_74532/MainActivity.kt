package com.stu74532.assignment2_74532

import android.media.Image
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
        name = "Dune 2",
        image = "https://imgs.search.brave.com/vFPJ1LGYnNM3L0NErFiuibSsJKnPO6UJ4dn60FGE0GM/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9wcmV2/aWV3LnJlZGQuaXQv/b2ZmaWNpYWwtcG9z/dGVyLWZvci1kdW5l/LXBhcnQtdHdvLXYw/LTBoemc4ZG80eGVl/YzEuanBlZz93aWR0/aD02NDAmY3JvcD1z/bWFydCZhdXRvPXdl/YnAmcz1mMTk3NjUx/OWVlYTgxYTJlY2Q1/MDU2MDMyYWI1ZTM4/NTUzZjdhNDIy",
        certification = "G",
        description = "    In \"DUNE 2,\" Paul Atreides joins forces with Chani and the Fremen to lead the revolt against those who destroyed his family. Haunted by dark premonitions, he is faced with the greatest of dilemmas: to choose between the love of his life and the fate of the universe.",
        starring = listOf("Timothée Chalamet","Zendaya", "Rebecca Ferguson"),
        runningTimeMins = 166,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var karaoke = Movie(
        name = "Karaoke",
        image = "https://imgs.search.brave.com/X4xjTMs6mpiA_ChUgiTyUAR0Gj4oxAtRw8wLgQH2ddo/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMuY2luZWZpbC5j/b20vbW92aWVzLzEx/NTY5NzAud2VicA",
        certification = "G",
        description = "    After a night filled with excess, Bénédicte, a famous opera singer, sees her career crumble. Fatou, a passionate karaoke enthusiast, is the only one to lend her a hand. She has an idea in mind: to convince Bénédicte to participate in the national karaoke competition. The perfect vocal mastery of one and the tenacity of the other could well spark and take them very far.",
        starring = listOf("Michèle Laroque", "Claudia Tagbo", "David Mora"),
        runningTimeMins = 89,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var immaculee = Movie(
        name = "Immacule",
        image = "https://imgs.search.brave.com/NBaB9xGWsFg_6J5vpZHv9tSt_r6oMrGHhjIU5cKn9oQ/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9mci53/ZWIuaW1nNi5hY3N0/YS5uZXQvY18zMDBf/MzAwL3BpY3R1cmVz/LzI0LzAyLzAxLzEy/LzIwLzQ0MTMwOTQu/anBn",
        certification = "12A",
        description = "    Cecilia, a young American nun, settles in an isolated convent in the Italian countryside. The welcome is warm, but Cecilia quickly realizes that her new home harbors a sinister secret and that terrible things are happening there...",
        starring = listOf("Sydney Sweeney", "Álvaro Morte", "Simona Tabasco"),
        runningTimeMins = 89,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var migration = Movie(
        name = "Migration",
        image = "https://imgs.search.brave.com/_3V7nn_z-G22EOc18So3LQEI5oCqumog2NCoZvXjT74/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9zdGF0/aWMyLnRyaWJ1dGUu/Y2EvcG9zdGVyLzY2/MHg5ODAvbWlncmF0/aW9uLTE3MzE4OS5q/cGc",
        certification = "G",
        description = "    The Colvert family is facing a domestic dilemma. While Mack is perfectly content to wade with his family, peacefully and definitively, in their small pond in New England, his wife Pam is more inclined to shake up this routine a bit and show the rest of the world to their children - Dax, who is no longer a duckling, and his little sister Gwen. When they welcome, during their stopover, a family of migrating ducks, it's the perfect opportunity for Pam to persuade Mack to imitate them and embark on a family journey: destination Jamaica, via New York. As they take flight towards the winter sun, the carefully laid out plan of the Colverts quickly goes awry. But the chaotic and unexpected turn events take will change them forever and teach them much more than they ever imagined.",
        starring = listOf("Pio Marmaï", "Kumail Nanjiani", "Laure Calamy"),
        runningTimeMins = 82,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var maisonderetraite = Movie(
        name = "Retirement home 2",
        image = "https://imgs.search.brave.com/c9uSQXfI3g-6hLQyKaMiGSfsG9mTU6xyuSiPx5VW-OQ/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/cHJlbWllcmUuZnIv/c2l0ZXMvZGVmYXVs/dC9maWxlcy9zdHls/ZXMvc2NhbGVfY3Jv/cF8zMzZ4NDg2L3B1/YmxpYy9wbHVyaW1l/ZGlhX2ltcG9ydC80/MjI2OTk5NzAuanBn",
        certification = "G",
        description = "    When the Lino Vartan home - which welcomes young orphans and seniors - has to close for health reasons, Milann has no choice but to accept an invitation to a retirement home in the South that welcomes them for the summer. Everyone boards Alban's bus. Children and seniors then discover the Bel Azur Club, an idyllic villa by the sea: a dream! A godsend for these orphaned kids who have never had a vacation... But paradise turns into hell because the old and new elderly residents hate each other! The war of the seniors is declared!",
        starring = listOf("Kev Adams", "Jean Reno", "Daniel Prévost"),
        runningTimeMins = 102,
        seatsRemaining = generateRandomSeatsRemaining(),
        seatsSelected = 0
    )
    var wonka = Movie(
        name = "Wonka",
        image = "https://imgs.search.brave.com/sYLeeVobyJ6um6ZNBtwCUmq8tmWd3s-tGMq_IGS2aFU/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9zdGF0/aWMxLnNyY2RuLmNv/bS93b3JkcHJlc3Mv/d3AtY29udGVudC91/cGxvYWRzLzIwMjMv/MTAvd29ua2EtbW92/aWUtcG9zdGVyLmpw/Zw",
        certification = "G",
        description = "    Discover the youth of Willy Wonka, the extraordinary inventor, magician, and chocolatier from Roald Dahl's enchanting universe in the film WONKA. Timothée Chalamet portrays this young man brimming with ideas and determined to change the world... with a sweet tooth! This colorful work, blending emotion and humor, proves that in life, dreams can come true - especially if you have the chance to meet Willy Wonka.",
        starring = listOf("Timothée Chalamet", "Calah Lane", "Keegan-Michael Key"),
        runningTimeMins = 117,
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