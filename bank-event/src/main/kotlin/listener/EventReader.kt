package com.lecture.bank.event.listener

import com.lecture.bank.domain.event.AccountCreatedEvent
import com.lecture.bank.domain.event.TransactionCreatedEvent
import com.lecture.bank.domain.repository.AccountReadViewRepository
import com.lecture.bank.domain.repository.AccountRepository
import com.lecture.bank.domain.repository.TransactionReadViewRepository
import com.lecture.bank.domain.repository.TransactionRepository
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.retry.annotation.Backoff
import org.springframework.retry.annotation.Retryable
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class EventReader(
    private val accountReadRepository: AccountReadViewRepository,
    private val transactionReadViewReader: TransactionReadViewRepository,
    private val accountRepository: AccountRepository,
    private val transactionRepository: TransactionRepository
    // TODO -> metrics, txAdvice
) {
    private val logger = LoggerFactory.getLogger(EventReader::class.java)

    @EventListener
    @Async("taskExecutor")
    @Retryable(value = [Exception::class], maxAttempts = 3, backoff = Backoff(delay = 1000))
    fun handleAccountCreated(event: AccountCreatedEvent) {
        // API main -> Publish (TaskExcutor) -> RetryProxy -> Method -> RetryProxy(1초 대기) -> Method

    }

    @Async("taskExecutor")
    fun handleTransactionCreated(event: TransactionCreatedEvent) {

    }
}