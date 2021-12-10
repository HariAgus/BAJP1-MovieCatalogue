package com.hariagus.submission1moviecataloge.utils

import com.hariagus.submission1moviecataloge.model.MovieEntity

object DataMovies {

    fun generateDummyMovies(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                0,
                "Alita 2019",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "Action, Adventure",
                "14 February 2019",
                "2h 42m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg"
            )
        )
        movies.add(
            MovieEntity(
                1,
                "Aquaman 2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Action, Adventure",
                "12 December 2018",
                "2h 24m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
            )
        )
        movies.add(
            MovieEntity(
                2,
                "Spider-Man: Homecoming",
                "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.",
                "Action",
                "07 July 2017",
                "2h 13m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg"
            )
        )
        movies.add(
            MovieEntity(
                3,
                "Kungfu Master",
                "The film features Kung Fu Panda and Chinese martial arts folk hero Wong Fei Hung. In the film, the panda is assigned by the Buddha to protect an ancient treasure that could give the bearer the power to conquer the world.",
                "Action, Animation",
                "15 March 2008",
                "1h 57m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mZEx58GIKIFXzYVy9txEgObKA8X.jpg"
            )
        )
        movies.add(
            MovieEntity(
                4,
                "Looking for Comedy in the Muslim World",
                "To improve its relations with Muslim countries, the United States government sends comedian Albert Brooks to south Asia to write a report on what makes followers of Islam laugh.",
                "Comedy",
                "20 January 2006",
                "1h 38m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bVcC7tIxJQULEHP8mfzzJ4PG1I1.jpg"
            )
        )
        movies.add(
            MovieEntity(
                5,
                "Hard Kill",
                "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                "Action",
                "23 October 2020",
                "1h 38m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg"
            )
        )
        movies.add(
            MovieEntity(
                6,
                "I Love My Muslim",
                "No-nonsense Carla is a 62-year-old woman from the Netherlands who converted to Islam. Against the expectations of many, she married Fouad, a 33-year-old Libyan freedom fighter. Although the couple live contentedly together in Amsterdam, the political turmoil in the Middle East continually bleeds into their lives. Yet, since Carla is past a child-bearing age, it is when the pair seek a second wife for Fouad that their relationship is really put to the test.",
                "Documentary",
                "18 September 2018",
                "52m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uTPz3y7vuavVYGhc2ciJtJI41Y7.jpg"
            )
        )
        movies.add(
            MovieEntity(
                7,
                "Gaza-strophe, Palestine",
                "We don't have an overview translated in English. Help us expand our database by adding one.",
                "Documentary",
                "16 March 2011",
                "58m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lEoyMEmbj61dObfjl18bmORrha6.jpg"
            )
        )
        movies.add(
            MovieEntity(
                8,
                "Sputnik",
                "At the height of the Cold War, a Soviet spacecraft crash lands after a mission gone awry, leaving the commander as its only survivor. After a renowned Russian psychologist is brought in to evaluate the commander’s mental state, it becomes clear that something dangerous may have come back to Earth with him…",
                "Drama, Horror",
                "27 November 2020",
                "1h 53m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eAUzmhP54bE1vPXaY7FbuZREJlR.jpg"
            )
        )
        movies.add(
            MovieEntity(
                9,
                "The Secret: Dare to Dream",
                "A widow with three children hires a handyman to fix her house during a major storm. When not doing home repairs, he shares his philosophy of believing in the power of the universe to deliver what we want.",
                "Drama, Romance",
                "16 April 2020",
                "1h 46m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5mCqEeBA0MW7H6akFrFQXJu68rU.jpg"
            )
        )
        return movies
    }

    fun getMovieDetail(id: Int): MovieEntity = generateDummyMovies()[id]

}