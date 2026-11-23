module com.adam.demo {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.adam.demo to javafx.fxml;
    exports com.adam.demo;

}