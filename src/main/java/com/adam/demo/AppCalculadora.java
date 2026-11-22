package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Clase principal: hereda de Application para poder crear una ventana en JavaFX
public class AppCalculadora extends Application {
    private static Scene scene;

    // Metodo principal donde se construye toda la interfaz gráfica
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Pantalla superior
        TextField display = new TextField("2");
        display.setAlignment(Pos.CENTER_RIGHT);

        // Botones
        // Fila 1
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnSum = new Button("+");
        // Fila 2
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btnRes = new Button("-");
        // Fila 3
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btnMul = new Button("x");
        // Fila 4
        Button btnC = new Button("C");
        Button btn0 = new Button("0");
        Button btnIgual = new Button("=");
        Button btnDiv = new Button("/");

        // Array: sustituye para hacer el setMaxWidth
        Button[] botones = {
                btn7, btn8, btn9, btnSum,
                btn4, btn5, btn6, btnRes,
                btn1, btn2, btn3, btnMul,
                btnC, btn0, btnIgual, btnDiv
        };

        for (Button b : botones) {
            b.setMaxWidth(Double.MAX_VALUE);
        }

        // Crea la cuadrícula con 10px de separación horizontal y vertical entre celdas
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(15));
        root.setAlignment(Pos.CENTER);

        // Reparte el ancho en 4 columnas iguales (25% cada una)
        ColumnConstraints col = new ColumnConstraints();
        col.setPercentWidth(25);
        root.getColumnConstraints().addAll(col, col, col, col);

        // Añade el display
        root.add(display, 0, 0, 4, 1);

        // Añade los botones indicando (botón, columna, fila)
        root.add(btn7, 0, 1);
        root.add(btn8, 1, 1);
        root.add(btn9, 2, 1);
        root.add(btnSum, 3, 1);
        root.add(btn4, 0, 2);
        root.add(btn5, 1, 2);
        root.add(btn6, 2, 2);
        root.add(btnRes, 3, 2);
        root.add(btn1, 0, 3);
        root.add(btn2, 1, 3);
        root.add(btn3, 2, 3);
        root.add(btnMul, 3, 3);
        root.add(btnC, 0, 4);
        root.add(btn0, 1, 4);
        root.add(btnIgual, 2, 4);
        root.add(btnDiv, 3, 4);

        // Crea la escena con el contenedor principal y define el tamaño de la ventana (ancho, alto)
        scene = new Scene(root, 300, 250);
        // Carga la escena dentro de la ventana
        primaryStage.setScene(scene);
        // Pone el título de la ventana
        primaryStage.setTitle("JavaFX Calculator");
        // Muestra la ventana en pantalla
        primaryStage.show();
    }

    // Punto de entrada del programa que arranca la aplicación JavaFX
    public static void main(String[] args) {
        launch();
    }
}
