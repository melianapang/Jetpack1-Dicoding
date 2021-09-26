package com.example.filmjetpacksub1.utils

import android.annotation.SuppressLint
import com.example.filmjetpacksub1.R
import com.example.filmjetpacksub1.data.FilmEntity
import java.text.DateFormat
import java.text.SimpleDateFormat
import kotlin.collections.ArrayList

object DataFilm {
    @SuppressLint("SimpleDateFormat")
    private val dateFormat: DateFormat = SimpleDateFormat("MM/dd/yyyy")
    @SuppressLint("SimpleDateFormat")
    private val dateFormatYear: DateFormat = SimpleDateFormat("yyyy")

    fun generateDummyFilm(): ArrayList<FilmEntity> {

        val films = ArrayList<FilmEntity>()

        films.add(
            FilmEntity(
                "Alita: Battle Angel",
                dateFormat.parse("02/14/2019"),
                R.drawable.poster_alita,
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "Action, Science Fiction, Adventure",
                "2h 2m"
            )
        )
        films.add(
            FilmEntity(
                "Bohemian Rhapsody",
                dateFormat.parse("11/2/2018"),
                R.drawable.poster_bohemian,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "Music, Drama, History",
                "2h 15m"
            )
        )
        films.add(
            FilmEntity(
                "CREED II",
                dateFormat.parse("11/21/2018"),
                R.drawable.poster_creed,
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "Drama",
                "2h 10m"
            )
        )
        films.add(
            FilmEntity(
                "Fantastic Beasts: The Crimes of Grindelwald",
                dateFormat.parse("11/16/2018"),
                R.drawable.poster_crimes,
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "Adventure, Fantasy, Drama",
                "2h 14m"
            )
        )
        films.add(
            FilmEntity(
                "Glass",
                dateFormat.parse("01/18/2019"),
                R.drawable.poster_glass,
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "Thriller, Drama, Science Fiction",
                "2h 9m"
            )
        )
        films.add(
            FilmEntity(
                "Overload",
                dateFormat.parse("11/7/2018"),
                R.drawable.poster_overlord,
                "Towards the end of World War II, American paratroopers set out to destroy a German radio tower. Soon enough, things take a murky turn when they come across a vicious secret.",
                "War, Horror, Zombie, Action",
                "1h 48m"
            )
        )
        films.add(
            FilmEntity(
                "Ralph: Breaks the Internet",
                dateFormat.parse("11/21/2018"),
                R.drawable.poster_ralph,
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "Family, Animation, Comedy, Adventure",
                "1h 52m"

            )
        )
        films.add(
            FilmEntity(
                "Serenity",
                dateFormat.parse("02/1/2019"),
                R.drawable.poster_serenity,
                "Baker Dill is a fishing boat captain who leads tours off of the tranquil enclave of Plymouth Island. His peaceful life is soon shattered when his ex-wife Karen tracks him down. Desperate for help, Karen begs Baker to save her -- and their young son -- from her abusive husband. She wants him to take the brute out for a fishing excursion -- then throw him overboard to the sharks. Thrust back into a life that he wanted to forget, Baker now finds himself struggling to choose between right and wrong.",
                "Fantasy, Mystery, Thriller",
                "1h 46m"
            )
        )
        films.add(
            FilmEntity(
                "Spiderman: Into The Spider-Verse",
                dateFormat.parse("12/12/2018"),
                R.drawable.poster_spiderman,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                "1h 57m"
            )
        )
        films.add(
            FilmEntity(
                "T-34: Fast and Furious on Tank",
                dateFormat.parse("12/14/2018"),
                R.drawable.poster_t34,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "War, Action, Drama, History",
                "2h 19m"
            )
        )

        return films
    }

    fun generateDummyTvShow(): ArrayList<FilmEntity> {

        val shows = ArrayList<FilmEntity>()

        shows.add(
            FilmEntity(
                "Arrow",
                dateFormatYear.parse("2012"),
                R.drawable.poster_arrow,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m"
            )
        )
        shows.add(
            FilmEntity(
                "Fairy Tail the Movie: Phoenix Priestess",
                dateFormat.parse("8/18/2012"),
                R.drawable.poster_fairytail,
                "Mighty mages must fight to save the world when, in his quest for immortality, a mad prince foolishly unleashes an ancient and powerful force.",
                "Action, Comedy, Drama, Adventure, Animation, Fantasy",
                "1h 26m"
            )
        )
        shows.add(
            FilmEntity(
                "The Flash",
                dateFormatYear.parse("2014"),
                R.drawable.poster_flash,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "Drama, Sci-Fi & Fantasy",
                "44m"
            )
        )
        shows.add(
            FilmEntity(
                "Game of Thrones",
                dateFormat.parse("04/17/2011"),
                R.drawable.poster_god,
                "Nine noble families wage war against each other in order to gain control over the mythical land of Westeros. Meanwhile, a force is rising after millenniums and threatens the existence of living men.",
                "Serial, Action, Drama, Thriller, Epic, Fantasy",
                "73 Episodes"
            )
        )
        shows.add(
            FilmEntity(
                "Gotham",
                dateFormatYear.parse("2014"),
                R.drawable.poster_gotham,
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43m"
            )
        )
        shows.add(
            FilmEntity(
                "Hanna",
                dateFormatYear.parse("2019"),
                R.drawable.poster_hanna,
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "Action & Adventure, Drama",
                "50m"
            )
        )
        shows.add(
            FilmEntity(
                "NCIS",
                dateFormatYear.parse("2003"),
                R.drawable.poster_ncis,
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "Crime, Action & Adventure, Drama",
                "45m"
            )
        )
        shows.add(
            FilmEntity(
                "Riverdale",
                dateFormatYear.parse("2017"),
                R.drawable.poster_riverdale,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "Mystery, Drama, Crime",
                "45m"
            )
        )
        shows.add(
            FilmEntity(
                "Shameless",
                dateFormatYear.parse("2011"),
                R.drawable.poster_shameless,
                "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
                "Drama, Comedy",
                "57m"
            )
        )
        shows.add(
            FilmEntity(
                "Supergirl",
                dateFormatYear.parse("2015"),
                R.drawable.poster_supergirl,
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "42m"
            )
        )

        return shows
    }
}