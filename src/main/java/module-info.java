module com.example.busticketbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.busticketbooking to javafx.fxml;
    exports com.example.busticketbooking;
}