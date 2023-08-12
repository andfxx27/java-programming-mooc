package andfxx.p13.graphicaluserinterfaces.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Download");

        Label textComponent = new Label("This is a dummy label");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textComponent);

        Scene scene = new Scene(componentGroup);

        stage.setScene(scene);
        stage.setTitle("My first application");
        stage.show();
    }
}
