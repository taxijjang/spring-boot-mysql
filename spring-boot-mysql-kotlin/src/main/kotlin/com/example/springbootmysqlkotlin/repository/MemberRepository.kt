package com.example.springbootmysqlkotlin.repository

import com.example.springbootmysqlkotlin.model.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {}