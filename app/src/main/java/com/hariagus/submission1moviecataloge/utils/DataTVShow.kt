package com.hariagus.submission1moviecataloge.utils

import com.hariagus.submission1moviecataloge.model.MovieEntity

object DataTVShow {

    fun generateDummyTvMovies(): List<MovieEntity> {

        val tvMovies = ArrayList<MovieEntity>()

        tvMovies.add(
            MovieEntity(
                0,
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                "Drama",
                "2017",
                "42m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                1,
                "The Mandalorian",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "Action & Adventure",
                "2019",
                "35m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                2,
                "Fear the Walking Dead ",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "Action & Adventure",
                "2015",
                "43m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                3,
                "Station 19",
                "A group of heroic firefighters at Seattle Fire Station 19—from captain to newest recruit—risk their lives and hearts both in the line of duty and off the clock. These brave men and women are like family, literally and figuratively, and together they put their own lives in jeopardy as first responders to save the lives of others.",
                "Action & Adventure",
                "2018",
                "43m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lcuCED5Ky2uM5VE6wILOwt5FEb0.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                4,
                "FBI",
                "The New York office of the FBI brings to bear all their talents, intellect and technical expertise on major cases in order to keep their city and the country safe.",
                "Action & Adventure",
                "2018",
                "43m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7aWmC7BjwBFgIKA77VqrXyRPicJ.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                5,
                "The Simpsons",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "Comedy, Drama",
                "1989",
                "22m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                6,
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "Drama, Fantasy",
                "2014",
                "44m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                7,
                "S.W.A.T.",
                "A locally born and bred S.W.A.T. lieutenant is torn between loyalty to the streets and duty to his fellow officers when he's tasked to run a highly-trained unit that's the last stop for solving crimes in Los Angeles.",
                "Action & Adventure",
                "2017",
                "42m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ushSkKB8aeLsyyW2c7S7CCmEmRA.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                8,
                "Dragon Ball Z",
                "Five years have passed since the fight with Piccolo Jr., and Goku now has a son, Gohan. The peace is interrupted when an alien named Raditz arrives on Earth in a spacecraft and tracks down Goku, revealing to him that that they are members of a near-extinct warrior race called the Saiyans.",
                "Animation, Comedy",
                "1989",
                "26m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/f2zhRLqwRLrKhEMeIM7Z5buJFo3.jpg"
            )
        )
        tvMovies.add(
            MovieEntity(
                9,
                "Naruto",
                "In another world, ninja are the ultimate power, and in the Village Hidden in the Leaves live the stealthiest ninja in the land. Twelve years earlier, the fearsome Nine-Tailed Fox terrorized the village and claimed many lives before it was subdued and its spirit sealed within the body of a baby boy. That boy, Naruto Uzumaki, has grown up to become a ninja-in-training who's more interested in pranks than in studying ninjutsu.. but Naruto is determined to become the greatest ninja ever!",
                "Animation, Comedy",
                "2002",
                "24m",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/rgHWkZVyvxMBOSYgj585pIx6qAn.jpg"
            )
        )
        return tvMovies
    }

    fun getDetailTvShow(id: Int): MovieEntity = generateDummyTvMovies()[id]

}