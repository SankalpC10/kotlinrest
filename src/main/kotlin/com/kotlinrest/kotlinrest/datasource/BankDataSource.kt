package com.kotlinrest.kotlinrest.datasource

import com.kotlinrest.kotlinrest.model.Bank

interface BankDataSource {
    fun retrieveBanks():Collection<Bank>
}