package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppCalculadora extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Pantalla superior
        TextField display = new TextField("2");
        display.setAlignment(Pos.CENTER_RIGHT);

        // Contenedor principal GridPane
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);

        // Display en la fila 0 ocupando 4 columnas
        root.add(display, 0, 0, 4, 1);

        // Array de botones y bucle for
        String[] numbers = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "x",
                "C", "0", "=", "/"
        };

        Button btn[] = new Button[16];

        // Colocación sencilla con contadores de columna y fila
        int columna = 0;
        int fila = 1;

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button(numbers[i]);
            btn[i].setPrefWidth(60);
            btn[i].setMaxWidth(Double.MAX_VALUE);

            root.add(btn[i], columna, fila);

            columna++;
            if (columna == 4) {
                columna = 0;
                fila++;
            }
        }

        // Creación de la escena y carga en el Stage
        scene = new Scene(root, 300, 250);
        stage.setTitle("JavaFX Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}