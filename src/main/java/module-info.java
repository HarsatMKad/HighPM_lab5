module org.example.highpm_lab5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.highpm_lab5 to javafx.fxml;
    exports org.example.highpm_lab5;
}