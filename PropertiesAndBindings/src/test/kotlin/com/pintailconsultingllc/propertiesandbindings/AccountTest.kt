package com.pintailconsultingllc.propertiesandbindings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class AccountTest {

    @Nested
    @DisplayName("Account balance tests")
    class AccountBalanceTests {
        var account: Account? = null

        @BeforeEach
        fun beforeEachTest() {
            account = Account()
        }

        @Test
        fun `account balance of 0`() {
            assertEquals(0.0, account?.balance?.get())
        }
    }

//    @Test
//    fun `test account`() {
//        val account = Account()
//        account.name.set("Checking")
//        account.balance.set(100.0)
//        assertEquals("Checking", account.name.get())
//        assertEquals(100.0, account.balance.get())
//    }
}