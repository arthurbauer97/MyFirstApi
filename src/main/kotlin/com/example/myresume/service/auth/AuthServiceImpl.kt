package com.example.myresume.service.auth

import com.example.myresume.controllers.auth.CredentialsDto
import com.example.myresume.entities.People
import com.example.myresume.repositories.PeopleRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthServiceImpl(
        private val repository: PeopleRepository
) : AuthService{

    override fun login(login: CredentialsDto): Optional<People> {
        return repository.login(login.cpf,login.password)
    }
}