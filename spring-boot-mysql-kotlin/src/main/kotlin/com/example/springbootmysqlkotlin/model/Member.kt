package com.example.springbootmysqlkotlin.model

import javax.persistence.*

@Entity
@Table(name = "member")
class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val firstName: String,
    val lastName: String,

    @Enumerated(EnumType.STRING)
    val status: MemberStatus

)