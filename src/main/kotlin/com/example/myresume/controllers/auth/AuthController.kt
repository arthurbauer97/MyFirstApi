package com.example.myresume.controllers.auth

import com.example.myresume.entities.People
import com.example.myresume.service.auth.AuthService
import com.example.myresume.service.people.PeopleService
import javassist.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("auth/")
class AuthController(
        val service: AuthService
) {

    @PostMapping("login")
    fun login(@RequestBody login: CredentialsDto): ResponseEntity<People> {
        val people = service.login(login)
        if (people.isPresent){
            return ResponseEntity(people.get(), HttpStatus.OK)
        }else {
            throw NotFoundException("Cpf ou Senha inválidos!")
        }
    }

}