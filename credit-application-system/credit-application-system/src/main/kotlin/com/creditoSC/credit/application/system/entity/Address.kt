package com.creditoSC.credit.application.system.entity

import jakarta.persistence.*

@Embeddable
data class Address(
                @Column(nullable = false, unique = true) val zipcode: String = "",
                @Column(nullable = false) var street: String = ""
)
