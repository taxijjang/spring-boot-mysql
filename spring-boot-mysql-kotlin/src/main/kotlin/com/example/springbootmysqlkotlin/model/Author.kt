package com.example.springbootmysqlkotlin.model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "author")
class Author(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val firstName: String,
    val lastName: String,

    @JsonBackReference @OneToMany(
        mappedBy = "author", fetch = FetchType.LAZY, cascade = [CascadeType.ALL]
    ) val books: List<Book>,
)