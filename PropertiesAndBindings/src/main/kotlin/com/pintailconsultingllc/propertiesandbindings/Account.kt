package com.pintailconsultingllc.propertiesandbindings

import javafx.beans.property.ReadOnlyIntegerProperty
import javafx.beans.property.ReadOnlyIntegerWrapper
import javafx.beans.property.SimpleStringProperty

class Account(name: String, balanceInCents: Int) {

    private val balanceInCents = ReadOnlyIntegerWrapper(this, "balanceInCents", 0)
    private val name = SimpleStringProperty(this, "name", "")

    fun nameProperty() = name
    fun balanceInCentsProperty(): ReadOnlyIntegerProperty = balanceInCents.readOnlyProperty

    init {
        this.name.set(name)
        this.balanceInCents.set(balanceInCents)
    }
}
