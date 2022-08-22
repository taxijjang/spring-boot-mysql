package com.example.springbootmysqlkotlin.model

import javax.persistence.*

@Entity
@Table(name = "book")
class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val name: String,
    val isbn: String,
)