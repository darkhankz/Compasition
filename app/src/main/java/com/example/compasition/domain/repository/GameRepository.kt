package com.example.compasition.domain.repository

import com.example.compasition.domain.entity.GameSittings
import com.example.compasition.domain.entity.Level
import com.example.compasition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, CountOfOptions: Int) : Question
    fun getGameSittings(level: Level) : GameSittings
}