package com.example.quizapp

object Constant {

    fun getQuestion(): ArrayList<Question> {
    val questionList = ArrayList<Question>()
    val que1 = Question(
        1, "What country this flag belong too?",
        R.drawable.ic_saud, "Argentina", "Austria", "Korea", "Japan", 1)
        questionList.add(que1)

        val que2 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_canada, "Argentina", "Canada", "Korea", "Japan", 2)
        questionList.add(que2)

        val que3 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_japan, "Argentina", "Austria", "Japan", "Japan", 3)
        questionList.add(que3)

        val que4 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_bangla, "Bangladesh", "Austria", "Korea", "Japan", 1)
        questionList.add(que4)

        val que5 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_england, "Argentina", "Austria", "England", "Japan", 3)
        questionList.add(que5)

        val que6 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_pakistan, "Argentina", "Austria", "Korea", "Pakistan", 4)
        questionList.add(que6)

        val que7= Question(
            1, "What country this flag belong too?",
            R.drawable.ic_turkey, "Argentina", "Turkey", "Korea", "Japan", 2)
        questionList.add(que7)

        val que8 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_india, "Argentina", "Austria", "India", "Japan", 3)
        questionList.add(que8)

        val que9 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_srilanka, "Srilanka", "Austria", "Korea", "Japan", 1)
        questionList.add(que9)

        val que10 = Question(
            1, "What country this flag belong too?",
            R.drawable.ic_saud, "Argentina", "Austria", "Korea", "Japan", 1)
        questionList.add(que10)

        return questionList
}
}