module com.tucarro.interfaz {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.tucarro.interfaz to javafx.fxml;
    exports com.tucarro.interfaz;
}