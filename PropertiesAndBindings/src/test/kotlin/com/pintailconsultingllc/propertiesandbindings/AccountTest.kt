package com.pintailconsultingllc.propertiesandbindings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class AccountTest {

    @Nested
    @DisplayName("Account balance")
    class AccountBalanceTests {
        private val name = "Foobar Checking"
        private var account: Account? = null

        @BeforeEach
        fun beforeEachTest() {
            account = Account(name = name, balanceInCents = 0)
        }

        @Test
        fun `account balance of 0`() {
            assertEquals(0, account?.getBalanceInCents()?.get())
        }
    }

    @Nested
    @DisplayName("Account name")
    class AccountNameTests {
        private val name = "Foobar Checking"
        private var account: Account? = null

        @BeforeEach
        fun beforeEachTest() {
            account = Account(name = name, balanceInCents = 0)
        }

        @Test
        fun `should have an account name`() {
            assertEquals(name, account?.name?.get())
        }
    }

}