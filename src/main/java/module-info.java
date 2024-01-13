module com.example.temp1 {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.temp1 to javafx.fxml;
    exports com.example.temp1;
}