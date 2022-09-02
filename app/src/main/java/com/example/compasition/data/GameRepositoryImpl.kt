package com.example.compasition.data

import com.example.compasition.domain.entity.GameSittings
import com.example.compasition.domain.entity.Level
import com.example.compasition.domain.entity.Question
import com.example.compasition.domain.repository.GameRepository
import kotlin.random.Random
import kotlin.math.max
import kotlin.math.min


object GameRepositoryImpl : GameRepository{
    private const val MIN_SUM_VALUE = 2
    private const val MIN_ANSWER_VALUE = 1

    override fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question {
        val sum = Random.nextInt(MIN_SUM_VALUE, maxSumValue + 1)
        val visibleNumber = Random.nextInt(MIN_ANSWER_VALUE, sum)
        val options = HashSet<Int>()
        val rightAnswer = sum - visibleNumber
        options.add(rightAnswer)
        val from = max(rightAnswer - countOfOptions, MIN_ANSWER_VALUE)
        val to = min(maxSumValue, rightAnswer + countOfOptions)
        while (options.size < countOfOptions) {
            options.add(Random.nextInt(from, to))
        }
        return Question(sum, visibleNumber, options.toList())
    }

    override fun getGameSittings(level: Level): GameSittings {
        return when (level) {
            Level.TEST -> {
                GameSittings(
                    10,
                    3,
                    50,
                    8
                )
            }
            Level.EASY -> {
                GameSittings(
                    10,
                    10,
                    70,
                    60
                )
            }
            Level.NORMAL -> {
                GameSittings(
                    20,
                    20,
                    80,
                    40
                )
            }
            Level.HARD -> {
                GameSittings(
                    30,
                    30,
                    90,
                    40
                )
            }
        }
    }
}
