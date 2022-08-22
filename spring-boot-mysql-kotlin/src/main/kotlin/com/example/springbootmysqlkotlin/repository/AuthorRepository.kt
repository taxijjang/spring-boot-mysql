package com.example.springbootmysqlkotlin.repository

import com.example.springbootmysqlkotlin.model.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository : JpaRepository<Author, Long> {

}