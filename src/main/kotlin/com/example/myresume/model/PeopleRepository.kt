package com.example.myresume.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PeopleRepository : JpaRepository<People, Long> {

    override fun findAll(): MutableList<People>
}