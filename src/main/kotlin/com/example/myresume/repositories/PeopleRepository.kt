package com.example.myresume.repositories

import com.example.myresume.entities.People
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PeopleRepository : JpaRepository<People, Long> {

    @Query("select u from TabelaPeople u where u.name = :name")
    fun findPeopleByName(name: String?): Optional<People>

    @Query("select u from TabelaPeople u where u.cpf = :cpf")
    fun findPeopleByCpf(cpf: String?): Optional<People>

    @Query("select u from TabelaPeople u where u.cpf = :cpf and u.password = :password")
    fun login(cpf: String?, password: String?): Optional<People>
}