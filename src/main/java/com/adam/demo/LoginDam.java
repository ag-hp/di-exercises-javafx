package com.adam.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class LoginDam extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label login = new Label("LOGIN DAM");
        login.setFont(new Font("Arial", 20));

        Label user = new Label("Usuario");
        TextField textField = new TextField();

        Label password = new Label("Contraseña");
        PasswordField passwordField = new PasswordField();

        Button enter = new Button("Entrar");
        Button exit = new Button("Salir");

        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(enter, exit);
        buttons.setAlignment(Pos.CENTER);

        List<Node> nodes = new ArrayList<>();
        nodes.add(login);
        nodes.add(user);
        nodes.add(textField);
        nodes.add(password);
        nodes.add(passwordField);
        nodes.add(buttons);

        VBox root = new VBox(10);
        root.getChildren().addAll(nodes);
        root.setAlignment(Pos.CENTER);

        VBox.setMargin(textField, new Insets(5, 30, 5, 30));
        VBox.setMargin(passwordField, new Insets(5, 30, 5, 30));
        VBox.setMargin(login, new Insets(0, 0, 30, 0));

        scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login JavaFX de Ari");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}