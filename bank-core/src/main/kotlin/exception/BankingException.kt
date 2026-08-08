package com.lecture.bank.core.exception

abstract class BankingException(
    message: String?, cause : Throwable? = null
) : RuntimeException(message, cause)

class AccountNotFoundException(
    accountName: String
) : BankingException("Account $accountName not found")