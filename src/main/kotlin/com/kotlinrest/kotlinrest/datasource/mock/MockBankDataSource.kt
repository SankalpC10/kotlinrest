package com.kotlinrest.kotlinrest.datasource.mock

import com.kotlinrest.kotlinrest.datasource.BankDataSource
import com.kotlinrest.kotlinrest.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {
    val banks=listOf(
        Bank("1234",3.14,17),
        Bank("5678",6.28,0),
        Bank("90",9.42,51)
    )
    override fun retrieveBanks(): Collection<Bank> =banks
}