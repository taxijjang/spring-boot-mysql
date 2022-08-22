package com.example.springbootmysqlkotlin.model.request

data class BookLendRequest(
    val bookIds: List<Long>,
    val memberId: Long,
)