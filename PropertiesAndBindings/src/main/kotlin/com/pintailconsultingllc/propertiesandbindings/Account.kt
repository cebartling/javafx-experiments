package com.pintailconsultingllc.propertiesandbindings

import javafx.beans.property.ReadOnlyDoubleWrapper
import javafx.beans.property.SimpleStringProperty

class Account {
    val balance = ReadOnlyDoubleWrapper(0.0)
    val name = SimpleStringProperty("")
}