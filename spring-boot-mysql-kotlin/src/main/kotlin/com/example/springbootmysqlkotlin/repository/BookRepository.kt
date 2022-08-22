package com.example.springbootmysqlkotlin.repository

import com.example.springbootmysqlkotlin.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book, Long> {
}