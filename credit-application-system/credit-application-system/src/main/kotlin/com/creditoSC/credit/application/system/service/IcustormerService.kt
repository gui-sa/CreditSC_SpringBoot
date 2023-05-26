package com.creditoSC.credit.application.system.service

import com.creditoSC.credit.application.system.entity.Customer

interface IcustomerService {
        fun save(customer: Customer): Customer
        fun findById(customerId: Long): Customer
        fun delete(customerId: Long)
}
