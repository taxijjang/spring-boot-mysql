package com.example.springbootmysqlkotlin.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "book")
class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val name: String,
    val isbn: String,

    @ManyToOne @JoinColumn(name = "author_id") @JsonManagedReference val author: Author,

    @JsonBackReference @OneToMany(
        mappedBy = "book", fetch = FetchType.LAZY, cascade = [CascadeType.ALL]
    ) val lends: List<Lend>,
){
}