module com.example.bti {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
//    requires mysql.connector.java;

    opens com.example.bti to javafx.fxml;
    exports com.example.bti;
}