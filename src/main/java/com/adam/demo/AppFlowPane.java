package com.adam.demo;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class AppFlowPane extends Application {
    private static Scene scene;;

    @Override
    public void start(Stage primaryStage) throws Exception {

        FlowPane root = new FlowPane();
        root.setHgap(10); // Espacio horizontal entre botones
        root.setVgap(10); // Espacio vertical entre botones

        Button[] btn = new Button[10];

        // Recorremos el array para crear los 10 botones
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
