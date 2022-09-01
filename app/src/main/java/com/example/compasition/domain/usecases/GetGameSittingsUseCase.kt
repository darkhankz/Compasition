package com.example.compasition.domain.usecases

import com.example.compasition.domain.entity.GameSittings
import com.example.compasition.domain.entity.Level
import com.example.compasition.domain.repository.GameRepository

class GetGameSittingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSittings{
        return repository.getGameSittings(level)
    }
}