package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppInterfazFuncional extends Application {

    private static Scene scene;
    private static int numeroSecreto = (int) (Math.random() * 100) + 1;
    private int intentos = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Variables del juego (fuera del start para poder modificarlas desde los botones)

        // 1. Layout principal: BorderPane
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));

        // 2. Parte superior (TOP): Título
        Label lblTitulo = new Label("Adivina el número (1 - 100)");
        BorderPane.setAlignment(lblTitulo, Pos.CENTER);
        root.setTop(lblTitulo);

        // 3. Parte central (CENTER): GridPane para formulario y mensajes
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        Label lblPedir = new Label("Introduce un número:");
        TextField txtNumero = new TextField();
        Label lblPista = new Label("Escribe un número y pulsa Enviar.");
        Label lblIntentos = new Label("Intentos: 0");

        // Añadimos los elementos al GridPane (columna, fila)
        grid.add(lblPedir, 0, 0);
        grid.add(txtNumero, 1, 0);
        grid.add(lblPista, 0, 1, 2, 1);     // Ocupa 2 columnas
        grid.add(lblIntentos, 0, 2, 2, 1);  // Ocupa 2 columnas

        root.setCenter(grid);

        // 4. Parte inferior (BOTTOM): HBox para los dos botones
        Button btnEnviar = new Button("Enviar");
        Button btnReiniciar = new Button("Reiniciar");

        HBox panelBotones = new HBox(15, btnEnviar, btnReiniciar);
        panelBotones.setAlignment(Pos.CENTER);
        root.setBottom(panelBotones);

        // 5. Eventos de los botones
        btnEnviar.setOnAction(e -> {
            try {
                // Cogemos el texto del TextField y lo pasamos a entero
                String texto = txtNumero.getText();
                int numeroUsuario = Integer.parseInt(texto);

                intentos++;
                lblIntentos.setText("Intentos: " + intentos);

                if (numeroUsuario < numeroSecreto) {
                    lblPista.setText("El número secreto es MAYOR que " + numeroUsuario);
                } else if (numeroUsuario > numeroSecreto) {
                    lblPista.setText("El número secreto es MENOR que " + numeroUsuario);
                } else {
                    lblPista.setText("¡Acertaste! El número era " + numeroSecreto);
                }
            } catch (NumberFormatException ex) {
                lblPista.setText("Por favor, introduce un número válido.");
            }
            txtNumero.clear();
        });

        btnReiniciar.setOnAction(e -> {
            numeroSecreto = (int) (Math.random() * 100) + 1;
            intentos = 0;
            lblIntentos.setText("Intentos: 0");
            lblPista.setText("Juego reiniciado. ¡Prueba de nuevo!");
            txtNumero.clear();
        });

        Scene scene = new Scene(root, 380, 220);
        primaryStage.setTitle("Tarea 10 - Adivina el número");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
