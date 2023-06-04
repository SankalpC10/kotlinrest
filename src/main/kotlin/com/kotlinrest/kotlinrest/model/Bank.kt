package com.kotlinrest.kotlinrest.model

data class Bank(
    val accountNumber: String, //val-final variable immutable
    val trust: Double,
    val transactionFee: Int
)