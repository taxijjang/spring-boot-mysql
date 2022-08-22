package com.example.springbootmysqlkotlin.model

import javax.persistence.*

@Entity
@Table(name = "author")
class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val firstName: String,
    val lastName: String,

    )