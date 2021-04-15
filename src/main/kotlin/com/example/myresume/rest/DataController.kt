package com.example.myresume.rest

import com.example.myresume.model.People
import com.example.myresume.model.PeopleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("data/")
class DataController(
        @Autowired
        private val repository: PeopleRepository
) {

    //var list = listOf<People>( People(0,"Arthur","123"), People(2,"Gustavo","321"))

    @GetMapping("name")
    fun getName(): ResponseEntity<List<People>> {
        return ResponseEntity(repository.returnPeople(), HttpStatus.OK)
    }


    //fun getName() = ResponseEntity.ok(repository.returnPeople())


//    fun getCountry(): ResponseEntity<Country?>? {
//        val c = Country()
//        c.setName("France")
//        c.setPopulation(66984000)
//        val headers = HttpHeaders()
//        headers.add("Responded", "MyController")
//        return ResponseEntity.accepted().headers(headers).body<Country?>(c)
//    }

//    @GetMapping("name")
//    fun getName(@RequestParam cpf: String): ResponseEntity<List<People>> {
//        cpf
//        return ResponseEntity(repository.returnPeople(), HttpStatus.OK)
//    }
}