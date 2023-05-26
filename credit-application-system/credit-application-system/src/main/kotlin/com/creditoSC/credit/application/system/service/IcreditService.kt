package com.creditoSC.credit.application.system.service

import com.creditoSC.credit.application.system.entity.Credit
import com.creditoSC.credit.application.system.entity.Customer
import java.util.UUID

interface IcreditService {
        fun save(credit: Credit): Credit
        fun findAllByCustomer(customerId: Long): List<Customer>
        fun findByCreditCode(creditCode: UUID): Credit
}
