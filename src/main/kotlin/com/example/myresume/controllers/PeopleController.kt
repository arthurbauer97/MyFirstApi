package com.example.myresume.controllers

import com.example.myresume.entities.People
import com.example.myresume.service.people.PeopleService
import javassist.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("data/")
class PeopleController(
        val service: PeopleService
) {

    @GetMapping("getAll")
    fun getAll(): ResponseEntity<List<People>> {
        return ResponseEntity(service.getAll(), HttpStatus.OK)
    }

    @GetMapping("findName")
    fun getFindName(@RequestParam name: String): ResponseEntity<People> {
        val people = service.getFindName(name)
        if (people.isPresent) {
            return ResponseEntity(people.get(), HttpStatus.OK)
        } else {
            throw NotFoundException("Pessoa não encontrada!")
        }
    }

    @PostMapping("save")
    fun save(@RequestBody people: People): ResponseEntity<People> {
        val validCpf = people.cpf?.let { service.validCpf(it) }
        return if (validCpf == true) {
            ResponseEntity(service.save(people), HttpStatus.OK)
        } else {
            ResponseEntity(People(null, null, null, null), HttpStatus.OK)
        }

    }
}