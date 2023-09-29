module com.pintailconsultingllc.helloworld {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.pintailconsultingllc.helloworld to javafx.fxml;
    exports com.pintailconsultingllc.helloworld;
}