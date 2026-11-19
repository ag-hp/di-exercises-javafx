package com.adam.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppGridPane extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);

        Label lblEmail = new Label("Email:");
        TextField txtEmail = new TextField();

        Button btnGuardar = new Button("Guardar");

        // Coordenadas: (nodo, columna, fila)
        root.add(lblEmail, 0, 0);
        root.add(txtEmail, 1, 0);
        root.add(btnGuardar, 1, 1);

        scene = new Scene(root, 640,480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
