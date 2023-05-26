package com.creditoSC.credit.application.system.service.impl

import com.creditoSC.credit.application.system.entity.Customer
import com.creditoSC.credit.application.system.repository.CustomerRepository
import com.creditoSC.credit.application.system.service.IcustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) : IcustomerService {

        override fun save(customer: Customer) = this.customerRepository.save(customer)

        override fun findById(customerId: Long): Customer {
                return this.customerRepository.findById(id).orElseThrow {
                        throw RuntimeException("Id $id not found")
                }
        }

        override fun delete(customerId: Long) = this.customerRepository.deleteById(id)
}
