package com.example.springbootmysqlkotlin.repository

import com.example.springbootmysqlkotlin.model.Lend
import org.springframework.data.jpa.repository.JpaRepository

interface LendRepository: JpaRepository<Lend, Long> {
}