package es.ieslosmontecillos.democontroles;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

public class MiControl extends Region {

    private ObjectProperty<EventHandler<MouseEvent>> onAction = new SimpleObjectProperty<EventHandler<MouseEvent>>();

    public MiControl(){
        super();
        // marca la zona donde hacer click
        setStyle("-fx-border-color:red;");
        setPrefSize(100, 100);
        this.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                onActionProperty().get().handle(event);
            }
        });
    }

    public final ObjectProperty<EventHandler<MouseEvent>> onActionProperty() {
        return onAction;
    }

    public final void setOnAction(EventHandler<MouseEvent> handler) {
        onAction.set(handler);
    }

    public final EventHandler<MouseEvent> getOnAction() {
        return onAction.get();
    }
}
