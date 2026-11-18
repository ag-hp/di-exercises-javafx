package com.adam.demo;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneButton extends Application {
    private static Scene scene;;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Cambiamos FlowPane por TilePane
        TilePane root = new TilePane();
        root.setHgap(10);
        root.setVgap(10);

        // root.setPrefColumns(3); // Define cuántas columnas quieres en la cuadrícula

        Button[] btn = new Button[10];

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button("Botón nº" + (i + 1));
        }

        root.getChildren().addAll(btn);
        root.setAlignment(Pos.CENTER);

        scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
