package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class AppCambioScene extends Application {

    private Scene sceneFlow;
    private Scene sceneTile;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // 1. ESCENA FLOWPANE
        FlowPane rootFlow = new FlowPane();
        rootFlow.setHgap(10);
        rootFlow.setVgap(10);
        rootFlow.setAlignment(Pos.CENTER);

        Button[] btnFlow = new Button[10];
        for (int i = 0; i < btnFlow.length; i++) {
            btnFlow[i] = new Button("Botón nº" + (i + 1));
            rootFlow.getChildren().add(btnFlow[i]);
        }

        Button btnIrATile = new Button("Cambiar a TilePane");
        btnIrATile.setOnAction(e -> primaryStage.setScene(sceneTile)); // Cambio directo
        rootFlow.getChildren().add(btnIrATile);

        sceneFlow = new Scene(rootFlow, 500, 300);


        // 2. ESCENA TILEPANE
        TilePane rootTile = new TilePane();
        rootTile.setHgap(10);
        rootTile.setVgap(10);
        rootTile.setPrefColumns(3);
        rootTile.setPrefTileWidth(130);
        rootTile.setPrefTileHeight(50);
        rootTile.setAlignment(Pos.CENTER);
        rootTile.setTileAlignment(Pos.CENTER);

        Button[] btnTile = new Button[10];
        for (int i = 0; i < btnTile.length; i++) {
            btnTile[i] = new Button("Botón nº" + (i + 1));
            rootTile.getChildren().add(btnTile[i]);
        }

        Button btnIrAFlow = new Button("Volver a FlowPane");
        btnIrAFlow.setOnAction(e -> primaryStage.setScene(sceneFlow));
        rootTile.getChildren().add(btnIrAFlow);

        sceneTile = new Scene(rootTile, 500, 300);


        // 3. MOSTRAR VENTANA
        primaryStage.setScene(sceneFlow);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}