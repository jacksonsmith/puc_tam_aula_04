package com.example.myapplication.mocks

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class DatabaseEngineerRepository: EngineerRepository {
    override fun save(engineer: Engineer) {
        runBlocking {
            saveData(engineer)
        }
    }

    private suspend fun saveData(engineer: Engineer) {
        println("saving....  ${engineer.name}")
        delay(1000) // Simulate delay for 1 second
        println("saved ${engineer.name}, with succesfull")
    }
}