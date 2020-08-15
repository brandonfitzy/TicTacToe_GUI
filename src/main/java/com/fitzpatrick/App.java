package com.fitzpatrick;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.*;
import javafx.scene.text.TextAlignment;
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
        playButton.addEventFilter(MouseButton.);

        playButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                Line col1 = new Line();
                col1.setStartX(200);
                col1.setStartY(0);
                col1.setEndX(200);
                col1.setEndY(600);
                Line col2 = new Line();
                col2.setStartX(400);
                col2.setStartY(0);
                col2.setEndX(400);
                col2.setEndY(600);
                Line row1 = new Line();
                row1.setStartX(0);
                row1.setStartY(200);
                row1.setEndX(600);
                row1.setEndY(200);
                Line row2 = new Line();
                row2.setStartX(400);
                row2.setStartY(0);
                row2.setEndX(400);
                row2.setEndY(600);

                Group root = new Group(col1, col2, row1, row2);
                Scene scene = new Scene(root, 600, 600);
                stage.setTitle("Tic Tac Toe");
                stage.setScene(scene);
                stage.show();
            }
        });

        Text title = new Text("Tic-Tac-Toe");
        title.setTextAlignment(TextAlignment.CENTER);
        title.setFont(Font.font("Ariel", FontWeight.BOLD, 30));
        GridPane gridPane1 = new GridPane();
        gridPane1.setVgap(50);
        gridPane1.setAlignment(Pos.CENTER);
        gridPane1.add(title, 1,0);
        gridPane1.add(playButton, 1,1);



        Scene scene = new Scene(gridPane1, 600, 600);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }

}