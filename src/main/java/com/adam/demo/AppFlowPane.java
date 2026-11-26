package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AppFlowPane extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Creamos el contenedor FlowPane como nodo raíz (por defecto va en horizontal)
        FlowPane root = new FlowPane();
        root.setHgap(10); // Espacio horizontal entre botones
        root.setVgap(10); // Espacio vertical entre filas de botones

        // Centrar el bloque entero de botones en el medio de la ventana
        root.setAlignment(Pos.CENTER);

        Button[] btn = new Button[10];

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button("Botón nº" + (i + 1));
            root.getChildren().add(btn[i]);
        }

        scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}