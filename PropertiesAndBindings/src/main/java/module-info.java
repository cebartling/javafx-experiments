module com.pintailconsultingllc.propertiesandbindings {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.pintailconsultingllc.propertiesandbindings to javafx.fxml;
    exports com.pintailconsultingllc.propertiesandbindings;
}