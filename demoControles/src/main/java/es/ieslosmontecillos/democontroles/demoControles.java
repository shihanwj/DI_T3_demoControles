package es.ieslosmontecillos.democontroles;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class demoControles extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        StackPane root = new StackPane();
        VBox vb = new VBox();
        Label etiqueta = new Label("probando");

        MiControl miControl = new MiControl();
        miControl.setOnAction(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("se ha clicado en la región");
                etiqueta.setText("Cambio provocado por el evento");
            }
        });
        vb.getChildren().addAll(miControl, etiqueta);
        root.getChildren().add(vb);


        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("APP demoControles");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}