package com.example.springbootmysqlkotlin.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonManagedReference
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "lend")
class Lend(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val startOn: Instant,
    val dueOn: Instant,

    @Enumerated(EnumType.ORDINAL) val status: LendStatus,

    @ManyToOne @JoinColumn(name = "book_id") @JsonManagedReference val book: Book,
    @ManyToOne @JoinColumn(name = "member_id") @JsonManagedReference val member: Member,
)