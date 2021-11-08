package com.example.myresume.service.auth

import com.example.myresume.controllers.auth.CredentialsDto
import com.example.myresume.entities.People
import java.util.*

interface AuthService {

    fun login(login: CredentialsDto): Optional<People>
}