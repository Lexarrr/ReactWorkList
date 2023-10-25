module com.example.reactworklist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reactworklist to javafx.fxml;
    exports com.example.reactworklist;
}