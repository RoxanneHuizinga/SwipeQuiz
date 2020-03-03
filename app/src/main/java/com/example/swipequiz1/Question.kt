package com.example.swipequiz

data class Question(
    var question: String,
    var answer: String
){
    companion object{
        val QUESTIONS = arrayOf("Chardonnay",
            "Pinot Noir",
            "Riesling ")
        val ANSWERS = arrayOf("white",
            "red",
            "white")
    }
}