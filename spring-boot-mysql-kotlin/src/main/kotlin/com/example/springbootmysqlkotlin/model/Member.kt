package com.example.springbootmysqlkotlin.model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "member")
class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val firstName: String,
    val lastName: String,

    @Enumerated(EnumType.STRING) val status: MemberStatus,

    @JsonBackReference @OneToMany(
        mappedBy = "member", fetch = FetchType.LAZY, cascade = [CascadeType.ALL]
    ) val lends: List<Lend>,

    )