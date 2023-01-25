module com.example.interfazcolores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfazcolores to javafx.fxml;
    exports com.example.interfazcolores;
}