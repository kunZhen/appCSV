module com.example.appcsv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appcsv to javafx.fxml;
    exports com.example.appcsv;
}