package com.creditoSC.credit.application.system

import com.creditoSC.credit.application.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

// It is the logic that implements CRUD
@Repository interface creditRepository : JpaRepository<Credit, Long> {}
