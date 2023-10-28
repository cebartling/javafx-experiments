package com.pintailconsultingllc.propertiesandbindings

import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleStringProperty

class Account {
    val balance = SimpleDoubleProperty(0.0)
    val name = SimpleStringProperty("")
}