module com.poo05.proyectoed {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.poo05.proyectoed to javafx.fxml;
    exports com.poo05.proyectoed;
}
