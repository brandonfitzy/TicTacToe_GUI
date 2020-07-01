package com.fitzpatrick;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        Button playButton = new Button("Start Game");



        Text text = new Text();

        Group root = new Group(text,playButton);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Brandon's App");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }

}