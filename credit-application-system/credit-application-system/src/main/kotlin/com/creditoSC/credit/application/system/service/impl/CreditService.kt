package com.creditoSC.credit.application.system.service.impl

import com.creditoSC.credit.application.system.entity.Credit
import com.creditoSC.credit.application.system.repository.CreditRepository
import com.creditoSC.credit.application.system.service.IcreditService
import java.util.UUID
import org.springframework.stereotype.Service

@Service
class CreditService(
                private val creditRepository: CreditRepository,
                private val customerService: CustomerService
) : IcreditService {

        override fun save(credit: Credit): Credit {

                return this.creditRepository.save(credit)
        }

        override fun findAllByCustomer(customerId: Long): List<Customer> {}

        override fun findByCreditCode(creditCode: UUID): Credit {}
}
