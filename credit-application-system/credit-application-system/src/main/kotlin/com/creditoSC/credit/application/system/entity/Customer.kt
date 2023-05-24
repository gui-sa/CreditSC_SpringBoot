package com.creditoSC.credit.application.system.entity

import jakarta.persistence.*

@Entity
// @Table(name = "GUZZZOMM")
data class Customer(
                @Column(nullable = false) var fisrtName: String = "",
                @Column(nullable = false) var lastName: String = "",
                @Column(nullable = false, unique = true) val cpf: String = "",
                @Column(nullable = false, unique = true) var email: String = "",
                @Column(nullable = false) var password: String = "",
                @Column(nullable = false) @Embedded var adress: Address = Address(),
                @OneToMany(
                                fetch = FetchType.LAZY,
                                cascade = arrayOf(CascadeType.REMOVE, CascadeType.PERSIST),
                                mappedBy = "customer"
                )
                @Column(nullable = false)
                var credits: List<Credit> = mutableListOf(),
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Column(nullable = false)
                val id: Long? = null // after the JPG will complete that
)
