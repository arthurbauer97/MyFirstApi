package com.example.myresume.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PeopleRepository : JpaRepository<People,Long>{

    @Query(nativeQuery = true, value = "SELECT * FROM tabela_people")
    fun returnPeople() : List<People>
}