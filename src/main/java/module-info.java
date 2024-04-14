module com.example.repo15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo15 to javafx.fxml;
    exports com.example.repo15;
}