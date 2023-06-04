package com.kotlinrest.kotlinrest.datasource.mock

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

fun main() {
    val actual = 42
    val expected = 42

    assertThat(actual).isEqualTo(expected)
}


internal class MockBankDataSourceTest{

    private val mockDataSource=MockBankDataSource()
    @Test
    fun `should provide a collection of banks`(){
        //given

        //when
        val banks=mockDataSource.retrieveBanks()
        //then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide a mock data `(){
        //when
        val banks=mockDataSource.retrieveBanks()

        //then
        assertThat(banks).allMatch{it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch{it.trust !=0.0}
        assertThat(banks).anyMatch{it.transactionFee!=0}
    }
}