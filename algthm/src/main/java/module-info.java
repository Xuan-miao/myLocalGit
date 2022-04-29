module com.example.algthm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.algthm to javafx.fxml;
    exports com.example.algthm;
}