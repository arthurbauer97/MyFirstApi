package com.example.myresume.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "TabelaPeople")
data class People(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = 0,
        var name: String? = "",
        var imageUrl: String? = "",
        var cpf: String? = "",
        var password: String? = "",
)