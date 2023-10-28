package com.pintailconsultingllc.propertiesandbindings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun `test account`() {
        val account = Account()
        account.name.set("Checking")
        account.balance.set(100.00)
        assertEquals("Checking", account.name.get())
        assertEquals(100.0, account.balance.get())
    }
}