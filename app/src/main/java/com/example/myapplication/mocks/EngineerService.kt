package com.example.myapplication.mocks

class EngineerService(private val engineerRepository: EngineerRepository) {
    fun save(engineer: Engineer) {
        println("Classe Verdadeira Salvando")
//        engineerRepository.save(engineer) // 1x
    }
}