package andfxx.p13.graphicaluserinterfaces;

import andfxx.p13.graphicaluserinterfaces.javafx.JavaFxApplication;
import andfxx.p13.graphicaluserinterfaces.javafx.MyFirstApplication;

import static javafx.application.Application.launch;

public class GraphicalUserInterfaces {
    public static void graphicalUserInterfaces() {
        System.out.println("Hello world from andfxx.p13.graphicaluserinterfaces");

        myFirstApplication();
    }

    private static void myFirstApplication() {
        launch(MyFirstApplication.class);
    }

    private static void firstJavaFxApplication() {
        launch(JavaFxApplication.class);
    }
}
