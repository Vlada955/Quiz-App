package com.vladimir.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    //Questions list
    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Kuwait",
            optionThree = "Belgium",
            optionFour = "Switzerland",
            correctAnswer = 1
        )
        questionList.add(question1)

        val question2 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_australia,
            optionOne = "Brazil",
            optionTwo = "Tunis",
            optionThree = "Serbia",
            optionFour = "Australia",
            correctAnswer = 4
        )
        questionList.add(question2)

        val question3 = Question(
            id = 3,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_belgium,
            optionOne = "Andorra",
            optionTwo = "Bahrain",
            optionThree = "Belgium",
            optionFour = "Zambia",
            correctAnswer = 3
        )
        questionList.add(question3)



        val question4 = Question(
            id = 4,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_brazil,
            optionOne = "Bhutan",
            optionTwo = "Madagascar",
            optionThree = "Brazil",
            optionFour = "Lebanon",
            correctAnswer = 3
        )
        questionList.add(question4)

        val question5 = Question(
            id = 5,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_denmark,
            optionOne = "Malaysia",
            optionTwo = "Dominica",
            optionThree = "Estonia",
            optionFour = "Denmark",
            correctAnswer = 4
        )
        questionList.add(question5)

        val question6 = Question(
            id = 6,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_fiji,
            optionOne = "Estonia",
            optionTwo = "Fiji",
            optionThree = "Djibouti",
            optionFour = "Guinea-Bissau",
            correctAnswer = 2)
        questionList.add(question6)

        val question7 = Question(
            id = 7,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_germany,
            optionOne = "Iceland",
            optionTwo = "Germany",
            optionThree = "Ecuador",
            optionFour = "Guatemala",
            correctAnswer = 2
        )
        questionList.add(question7)

        val question8 = Question(
            id = 8,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_india,
            optionOne = "Iran",
            optionTwo = "Iraq",
            optionThree = "India",
            optionFour = "Israel",
            correctAnswer = 3
        )
        questionList.add(question8)

        val question9 = Question(
            id = 9,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_kuwait,
            optionOne = "Kuwait",
            optionTwo = "Central African Republic",
            optionThree = "Côte d'Ivoire",
            optionFour = "Dominican Republic",
            correctAnswer = 1
        )
        questionList.add(question9)

        val question10 = Question(
            id = 10,
            question = "What country does this flag belong to?",
            image = R.drawable.flag_of_bangladesh,
            optionOne = "Greece",
            optionTwo = "Bangladesh",
            optionThree = "Jordan",
            optionFour = "Kiribati",
            correctAnswer = 2
        )

        questionList.add(question10)

        val question11 = Question(
            id = 11,
            question = "What country does this flag belong to?",
            image = R.drawable.flag_of_botswana,
            optionOne = "Kazakhstan",
            optionTwo = "Honduras",
            optionThree = "Botswana",
            optionFour = "Laos",
            correctAnswer = 3
        )

        questionList.add(question11)

        val question12 = Question(
            id = 12,
            question = "What is the capital of Greece?",
            image = R.drawable.athens_grecee,
            optionOne = "Tashkent",
            optionTwo = "Tunis",
            optionThree = "Bucharest",
            optionFour = "Athens",
            correctAnswer = 4
        )

        questionList.add(question12)

        val question13 = Question(
            id = 13,
            question = "What is the capital of Serbia?",
            image = R.drawable.belgrade_serbia,
            optionOne = "Apia",
            optionTwo = "Skopje",
            optionThree = "Belgrade",
            optionFour = "Rome",
            correctAnswer = 3
        )
        questionList.add(question13)

        val question14 = Question(
            id = 14,
            question = "What is the capital of Finland?",
            image = R.drawable.helsinki_finland,
            optionOne = "Nairobi",
            optionTwo = "Helsinki",
            optionThree = "Beirut",
            optionFour = "Tokyo",
            correctAnswer = 2
        )
        questionList.add(question14)

        val question15 = Question(
            id = 15,
            question = "What is the capital of Israel?",
            image = R.drawable.jerusalem_israel,
            optionOne = "Vientiane",
            optionTwo = "Kingston",
            optionThree = "Jerusalem",
            optionFour = "Jakarta",
            correctAnswer = 3
        )
        questionList.add(question15)

        val question16 = Question(
            id = 16,
            question = "What is the capital of Bahamas?",
            image = R.drawable.nassau_bahamas,
            optionOne = "Nassau",
            optionTwo = "Baghdad",
            optionThree = "Georgetown",
            optionFour = "Malabo",
            correctAnswer = 1
        )

        questionList.add(question16)

        val question17 = Question(
            id = 17,
            question = "What is the capital of Mauritania?",
            image = R.drawable.nouakchott_mauritania,
            optionOne = "Yaounde",
            optionTwo = "Sarajevo",
            optionThree = "Nouakchott",
            optionFour = "Manama",
            correctAnswer = 3
        )

        questionList.add(question17)

        val question18 = Question(
            id = 18,
            question = "What is the capital of Morocco?",
            image = R.drawable.rabat_morocco,
            optionOne = "Rabat",
            optionTwo = "Thimphu",
            optionThree = "Canberra",
            optionFour = "Luanda",
            correctAnswer = 1
        )

        questionList.add(question18)

        val question19 = Question(
            id = 19,
            question = "What is the capital of Italy?",
            image = R.drawable.rome_italy,
            optionOne = "Vienna",
            optionTwo = "Rome",
            optionThree = "Minsk",
            optionFour = "Sofia",
            correctAnswer = 2
        )

        questionList.add(question19)

        val question20 = Question(
            id = 20,
            question = "What is the capital of Vatican City?",
            image = R.drawable.vatican_city_vatican_city,
            optionOne = "Bogota",
            optionTwo = "Kabul",
            optionThree = "Vatican City",
            optionFour = "Prague",
            correctAnswer = 3
        )
        questionList.add(question20)

        val question21 = Question(
            id = 21,
            question = "What is the capital of New Zeland?",
            image = R.drawable.wellington_new_zealand,
            optionOne = "Cairo",
            optionTwo = "Roseau",
            optionThree = "Wellington",
            optionFour = "Bissau",
            correctAnswer = 3
        )
        questionList.add(question21)

        val question22 = Question(
            id = 22,
            question = "How high is Burj Khalifa?",
            image = R.drawable.burj_khalifa_818m,
            optionOne = "818m",
            optionTwo = "820m",
            optionThree = "816m",
            optionFour = "821m",
            correctAnswer = 1
        )
        questionList.add(question22)

        val question23 = Question(
            id = 23,
            question = "What year was the Eiffel Tower built?",
            image = R.drawable.eiffel_tower_1889,
            optionOne = "1888",
            optionTwo = "1889",
            optionThree = "1886",
            optionFour = "1887",
            correctAnswer = 2
        )
        questionList.add(question23)

        val question24 = Question(
            id = 24,
            question = "What year was the Eiffel Tower built?",
            image = R.drawable.eiffel_tower_1889,
            optionOne = "1888",
            optionTwo = "1889",
            optionThree = "1886",
            optionFour = "1887",
            correctAnswer = 2
        )
        questionList.add(question24)

        val question25 = Question(
            id = 25,
            question = "What is the name of the longest bone in human body?",
            image = R.drawable.femur,
            optionOne = "Tibia",
            optionTwo = "Femur",
            optionThree = "Fibula",
            optionFour = "Humerus",
            correctAnswer = 2
        )
        questionList.add(question25)

        val question26 = Question(
            id = 26,
            question = "What is the person on the picture?",
            image = R.drawable.nikola_tesla,
            optionOne = "Alexander Graham Bell",
            optionTwo = "Leonardo Da Vinci",
            optionThree = "Thomas Edison",
            optionFour = "Nikola Tesla",
            correctAnswer = 4
        )
        questionList.add(question26)

        val question27 = Question(
            id = 27,
            question = "When was Coca-Cola founded?",
            image = R.drawable.cocacola_1886,
            optionOne = "1885",
            optionTwo = "1894",
            optionThree = "1878",
            optionFour = "1886",
            correctAnswer = 4
        )
        questionList.add(question27)

        val question28 = Question(
            id = 28,
            question = "How many elements are in periodic table?",
            image = R.drawable.periodic_table_118,
            optionOne = "118",
            optionTwo = "120",
            optionThree = "117",
            optionFour = "115",
            correctAnswer = 1
        )
        questionList.add(question28)

        val question29 = Question(
            id = 29,
            question = "Where was World Cup 2022 held?",
            image = R.drawable.qatar,
            optionOne = "Angola",
            optionTwo = "Qatar",
            optionThree = "Tanzania",
            optionFour = "Russia",
            correctAnswer = 2
        )
        questionList.add(question29)

        val question30 = Question(
            id = 30,
            question = "What country has won the most World Cups?",
            image = R.drawable.world_cup_brazil,
            optionOne = "Argentina",
            optionTwo = "Germany",
            optionThree = "Brazil",
            optionFour = "France",
            correctAnswer = 3
        )
        questionList.add(question30)

        val question31 = Question(
            id = 31,
            question = "In what country would you find Mount Kilimanjaro?",
            image = R.drawable.mt_kilimanjaro,
            optionOne = "Tanzania",
            optionTwo = "Tajikistan",
            optionThree = "Trinidad and Tobago",
            optionFour = "Tonga",
            correctAnswer = 1
        )
        questionList.add(question31)

        val question32 = Question(
            id = 32,
            question = "Which version of Windows was released in 2009?",
            image = R.drawable.windows_7_2009,
            optionOne = "Windows Vista",
            optionTwo = "Windows 8.1",
            optionThree = "Windows 10",
            optionFour = "Windows 7",
            correctAnswer = 4
        )
        questionList.add(question32)

        val question33 = Question(
            id = 33,
            question = "What is the name of the main character from God of War?",
            image = R.drawable.kratos,
            optionOne = "Rayman",
            optionTwo = "Kratos",
            optionThree = "Cloud",
            optionFour = "Glados",
            correctAnswer = 2
        )
        questionList.add(question33)

        val question34 = Question(
            id = 34,
            question = "Where all roads lead to?",
            image = R.drawable.roads_rome,
            optionOne = "Berlin",
            optionTwo = "Moscow",
            optionThree = "Rome",
            optionFour = "Bern",
            correctAnswer = 3
        )
        questionList.add(question34)

        val question35 = Question(
            id = 35,
            question = "How many ghosts chase Pac-Man at the start of each game?",
            image = R.drawable.pacman_4,
            optionOne = "1",
            optionTwo = "4",
            optionThree = "2",
            optionFour = "3",
            correctAnswer = 2
        )
        questionList.add(question35)

        val question36 = Question(
            id = 36,
            question = "Who was first Disney character?",
            image = R.drawable.disney_oswald,
            optionOne = "Mickey Mouse",
            optionTwo = "Oswald the Lucky Rabbit",
            optionThree = "Pluto",
            optionFour = "Donald Duck",
            correctAnswer = 2
        )
        questionList.add(question36)

        val question37 = Question(
            id = 37,
            question = "Who was the Ancient Greek God of the Sun?",
            image = R.drawable.apollo_sun,
            optionOne = "Uranus",
            optionTwo = "Demeter",
            optionThree = "Pluto",
            optionFour = "Hermes",
            correctAnswer = 3
        )
        questionList.add(question37)

        val question38 = Question(
            id = 38,
            question = "When was the beginning of World War I?",
            image = R.drawable.wwi,
            optionOne = "28.July.1914.",
            optionTwo = "28.June.1914.",
            optionThree = "28.June.1915",
            optionFour = "28.July.1915",
            correctAnswer = 1
        )
        questionList.add(question38)

        val question39 = Question(
            id = 39,
            question = "How many languages are written from right to left?",
            image = R.drawable.language,
            optionOne = "9",
            optionTwo = "10",
            optionThree = "11",
            optionFour = "12",
            correctAnswer = 4
        )
        questionList.add(question39)

        val question40 = Question(
            id = 40,
            question = "Who was the first woman to win a Nobel Prize (in 1903)?",
            image = R.drawable.nobel_prize,
            optionOne = "Rosalind Franklin",
            optionTwo = "Grace Hopper",
            optionThree = "Maria-Curie",
            optionFour = "Maria Winkelmann",
            correctAnswer = 3
        )
        questionList.add(question40)

        val question41 = Question(
            id = 41,
            question = "What Is the Most Shoplifted Book",
            image = R.drawable.stolen_book,
            optionOne = "Bridges of Madison County",
            optionTwo = "The Catcher in the Rye",
            optionThree = "To Kill a Mockingbird",
            optionFour = "The Bible",
            correctAnswer = 4
        )
        questionList.add(question41)

        val question42 = Question(
            id = 42,
            question = "What is the rarest M&M color?",
            image = R.drawable.m_m,
            optionOne = "Green",
            optionTwo = "Yellow",
            optionThree = "Brown",
            optionFour = "Blue",
            correctAnswer = 3
        )
        questionList.add(question42)

        val question43 = Question(
            id = 43,
            question = "Which is the only edible food that never goes bad?",
            image = R.drawable.food,
            optionOne = "Tea",
            optionTwo = "Honey",
            optionThree = "Coffee",
            optionFour = "Bananas",
            correctAnswer = 2
        )
        questionList.add(question43)

        val question44 = Question(
            id = 44,
            question = "Which country invented ice cream?",
            image = R.drawable.icecream,
            optionOne = "China",
            optionTwo = "Italy",
            optionThree = "Greece",
            optionFour = "England",
            correctAnswer = 1
        )
        questionList.add(question44)

        val question45 = Question(
            id = 45,
            question = "What is Earth's largest continent?",
            image = R.drawable.earth,
            optionOne = "Africa",
            optionTwo = "Australia",
            optionThree = "Europe",
            optionFour = "Asia",
            correctAnswer = 4
        )
        questionList.add(question45)

        val question46 = Question(
            id = 46,
            question = "Area 51 is located in which US state?",
            image = R.drawable.area51_nevada,
            optionOne = "Alaska",
            optionTwo = "Nevada",
            optionThree = "Oregon",
            optionFour = "Washington",
            correctAnswer = 2
        )
        questionList.add(question46)

        val question47 = Question(
            id = 47,
            question = "Which country borders 14 nations and crosses 8 time zones?",
            image = R.drawable.country_russia,
            optionOne = "Russia",
            optionTwo = "China",
            optionThree = "India",
            optionFour = "Canada",
            correctAnswer = 1
        )
        questionList.add(question47)

        val question48 = Question(
            id = 48,
            question = "What country has the most natural lakes?",
            image = R.drawable.lakes_canada,
            optionOne = "Norway",
            optionTwo = "Serbia",
            optionThree = "India",
            optionFour = "Canada",
            correctAnswer = 4
        )
        questionList.add(question48)

        val question49 = Question(
            id = 49,
            question = "How many hearts does an octopus have?",
            image = R.drawable.octopus_3,
            optionOne = "1",
            optionTwo = "2",
            optionThree = "3",
            optionFour = "4",
            correctAnswer = 3
        )
        questionList.add(question49)

        val question50 = Question(
            id = 50,
            question = "The unicorn is the national animal of which country?",
            image = R.drawable.unicorn_scotland,
            optionOne = "Finland",
            optionTwo = "Norway",
            optionThree = "Scotland",
            optionFour = "Denmark",
            correctAnswer = 3
        )
        questionList.add(question50)

        val question51 = Question(
            id = 51,
            question = "How many legs does a spider have?",
            image = R.drawable.spider,
            optionOne = "4",
            optionTwo = "6",
            optionThree = "8",
            optionFour = "10",
            correctAnswer = 3
        )
        questionList.add(question51)

        val question52 = Question(
            id = 52,
            question = "What is the hottest planet in the solar system?",
            image = R.drawable.planets_venus,
            optionOne = "Mercury",
            optionTwo = "Venus",
            optionThree = "Mars",
            optionFour = "Saturn",
            correctAnswer = 2
        )
        questionList.add(question52)


        val question53 = Question(
            id = 53,
            question = "How many teeth does an adult human have?",
            image = R.drawable.teeths_32,
            optionOne = "32",
            optionTwo = "30",
            optionThree = "28",
            optionFour = "36",
            correctAnswer = 1
        )
        questionList.add(question53)

        val question54 = Question(
            id = 54,
            question = "How many lives is a cat said to have?",
            image = R.drawable.cat_9,
            optionOne = "6",
            optionTwo = "9",
            optionThree = "8",
            optionFour = "7",
            correctAnswer = 2
        )
        questionList.add(question54)

        val question55 = Question(
            id = 55,
            question = "How many lives is a cat said to have?",
            image = R.drawable.cat_9,
            optionOne = "6",
            optionTwo = "9",
            optionThree = "8",
            optionFour = "7",
            correctAnswer = 2
        )
        questionList.add(question55)

        val question56 = Question(
            id = 56,
            question = "Which US agency has the motto “For the benefit of all?",
            image = R.drawable.usagencies_nasa,
            optionOne = "CIA",
            optionTwo = "FBI",
            optionThree = "NASA",
            optionFour = "USAID",
            correctAnswer = 3
        )
        questionList.add(question56)

        val question57 = Question(
            id = 57,
            question = "Who was the first President of the United States?",
            image = R.drawable.us_presidents_george,
            optionOne = "John Adams",
            optionTwo = "George Washington",
            optionThree = "Thomas Jefferson",
            optionFour = "James Madison",
            correctAnswer = 2
        )
        questionList.add(question57)

        val question58 = Question(
            id = 58,
            question = "How many years did queen Elizabeth II reign?",
            image = R.drawable.queen_elizabeth_70,
            optionOne = "70",
            optionTwo = "72",
            optionThree = "69",
            optionFour = "73",
            correctAnswer = 1
        )
        questionList.add(question58)

        val question59 = Question(
            id = 59,
            question = "Which five colours make up the Olympic rings?",
            image = R.drawable.olympic_rings,
            optionOne = "Blue, Yellow, Black, Green, Red",
            optionTwo = "Blue, Purple, Black, Green, Red",
            optionThree = "Blue, Yellow, Magenta, Green, Red",
            optionFour = "Purple, Yellow, Black, Green, Red",
            correctAnswer = 1
        )
        questionList.add(question59)

        val question60 = Question(
            id = 60,
            question = "In what year did the Titanic sink?",
            image = R.drawable.titanic_1912,
            optionOne = "1913",
            optionTwo = "1912",
            optionThree = "1910",
            optionFour = "1915",
            correctAnswer = 2
        )
        questionList.add(question60)




        return questionList
    }
}