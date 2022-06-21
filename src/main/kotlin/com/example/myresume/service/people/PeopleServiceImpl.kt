package com.example.myresume.service.people

import com.example.myresume.controllers.auth.CredentialsDto
import com.example.myresume.entities.People
import com.example.myresume.repositories.PeopleRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PeopleServiceImpl(
        private val repository: PeopleRepository
) : PeopleService {

    override fun save(people: People): People {
        return repository.save(people)
    }

    override fun getAll(): List<People> {
        return repository.findAll()
    }

    override fun getFindName(name: String): Optional<People> {
        return repository.findPeopleByName(name)
    }

    override fun validCpf(cpf: String): Boolean {
        val foundPeople = repository.findPeopleByCpf(cpf)
        if (foundPeople.isPresent) {
            return false
        } else {
            return true
        }
    }
}
// teste