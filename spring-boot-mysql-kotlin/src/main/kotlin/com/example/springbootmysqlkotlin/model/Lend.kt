package com.example.springbootmysqlkotlin.model

import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "lend")
class Lend(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val startOn: Instant,
    val dueOn: Instant,

    @Enumerated(EnumType.ORDINAL)
    val status: LendStatus,
)