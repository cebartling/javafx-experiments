package com.pintailconsultingllc.propertiesandbindings

import javafx.beans.property.ReadOnlyIntegerWrapper
import javafx.beans.property.SimpleStringProperty

class Account(name: String, balanceInCents: Int) {

    private val balanceInCents = ReadOnlyIntegerWrapper(this, "balanceInCents", 0)
    val name = SimpleStringProperty(this, "name", "")

    fun getBalanceInCentsProperty() = balanceInCents.readOnlyProperty

    init {
        this.name.set(name)
        this.balanceInCents.set(balanceInCents)
    }
}
