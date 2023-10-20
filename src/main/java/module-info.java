module com.example.testsonarcloud {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.testsonarcloud to javafx.fxml;
    exports com.example.testsonarcloud;
}