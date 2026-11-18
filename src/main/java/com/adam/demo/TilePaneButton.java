package com.adam.demo;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneButton extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Cambiamos FlowPane por TilePane
        TilePane root = new TilePane();
        root.setHgap(10);
        root.setVgap(10);

        // Propiedades exclusivas del TilePane:
        root.setPrefColumns(3);             // Forzar 3 columnas preferidas
        root.setPrefTileWidth(130);         // Que cada celda mida exactamente 130px de ancho
        root.setPrefTileHeight(50);         // Que cada celda mida exactamente 50px de alto

        // Centra el bloque de la cuadrícula en el medio de la ventana
        root.setAlignment(Pos.CENTER);

        // Centra el contenido (texto) dentro de cada celda individual
        root.setTileAlignment(Pos.CENTER);

        Button[] btn = new Button[10];

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button("Botón nº" + (i + 1));
        }

        root.getChildren().addAll(btn);

        scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
