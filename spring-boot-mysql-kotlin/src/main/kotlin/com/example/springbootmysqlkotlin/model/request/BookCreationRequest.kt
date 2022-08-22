package com.example.springbootmysqlkotlin.model.request

data class BookCreationRequest(
    val name: String,
    val isbn: String,
    val authorId: Long,
)