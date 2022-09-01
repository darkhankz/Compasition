package com.example.compasition.data

import com.example.compasition.domain.entity.GameSittings
import com.example.compasition.domain.entity.Level
import com.example.compasition.domain.entity.Question
import com.example.compasition.domain.repository.GameRepository

object GameRepositoryImpl : GameRepository{
    override fun generateQuestion(maxSumValue: Int, CountOfOptions: Int): Question {
        TODO("Not yet implemented")
    }

    override fun getGameSittings(level: Level): GameSittings {
        TODO("Not yet implemented")
    }
}