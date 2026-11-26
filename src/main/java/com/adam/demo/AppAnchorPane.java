package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppAnchorPane extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane root = new AnchorPane();
        root.setStyle("-fx-background-color: tan;");

        // 1. Barra superior (de izquierda a derecha)
        Button bt1 = new Button();
        bt1.setStyle("-fx-background-color: darkolivegreen;");
        bt1.setPrefHeight(50);
        AnchorPane.setTopAnchor(bt1, 0.0);
        AnchorPane.setLeftAnchor(bt1, 0.0);
        AnchorPane.setRightAnchor(bt1, 0.0);

        // 2. Caja izquierda (debajo del encabezado, se estira dejando espacio a la derecha)
        Button bt2 = new Button();
        bt2.setStyle("-fx-background-color: mediumaquamarine;");
        bt2.setPrefHeight(110);
        AnchorPane.setTopAnchor(bt2, 50.0);
        AnchorPane.setLeftAnchor(bt2, 0.0);
        AnchorPane.setRightAnchor(bt2, 120.0);

        // 3. Botón inferior (centrado down)
        Button bt3 = new Button();
        bt3.setStyle("-fx-background-color: cornflowerblue;");
        bt3.setPrefWidth(100);
        bt3.setPrefHeight(35);

        HBox down = new HBox(bt3);
        down.setAlignment(Pos.CENTER);
        AnchorPane.setBottomAnchor(down, 0.0);
        AnchorPane.setLeftAnchor(down, 0.0);
        AnchorPane.setRightAnchor(down, 0.0);

        // Lo añadimos entero al panel
        root.getChildren().addAll(bt1, bt2, down);

        Scene scene = new Scene(root, 240, 420);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
