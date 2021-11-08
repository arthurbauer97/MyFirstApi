package com.example.myresume.service.people

import com.example.myresume.controllers.auth.CredentialsDto
import com.example.myresume.entities.People
import java.util.*

interface PeopleService {

    fun save(people: People): People

    fun getAll(): List<People>

    fun getFindName(name: String): Optional<People>

    fun validCpf(cpf: String): Boolean
}