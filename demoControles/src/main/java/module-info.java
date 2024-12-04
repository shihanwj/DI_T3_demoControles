module es.ieslosmontecillos.democontroles {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.democontroles to javafx.fxml;
    exports es.ieslosmontecillos.democontroles;
}