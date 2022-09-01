package com.example.compasition.domain.entity

data class GameResult (
    val winner: Boolean,
    val countRightAnswers: Int,
    val countOfQuestion: Int,
    val gameSittings: GameSittings

        )