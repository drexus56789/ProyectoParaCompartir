module com.example.proyectoparacompartir {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectoparacompartir to javafx.fxml;
    exports com.example.proyectoparacompartir;
}