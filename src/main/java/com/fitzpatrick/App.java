package com.fitzpatrick;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        //var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        //var scene = new Scene(new StackPane(label), 640, 480);
        Line line = new Line();
        line.setStartX(150.0f);
        line.setStartY(140.0f);
        line.setEndX(450.0f);
        line.setEndY(140.0f);
        Group root = new Group();
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }

}