package com.example.myresume.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "TabelaPeople")
data class People(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private var id : Long? = 0,
        private var name : String? = "",
        private var cpf : String? = ""
)