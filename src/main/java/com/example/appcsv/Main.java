package com.example.appcsv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Clase principal
 */
/*
La clase Application viene a ser una clase abstracta y para acceder a ella se hereda
por la clase Main.
 */
public class Main extends Application {

    /**
     * Método start llamado cuando se inicializa la app.
     * @param stage - Objeto de Stage que es donde se muestran todas las partes visuales de la app
     * @throws IOException - error en la interpretación de una operación de entrada o salida, como leer
     * un archivo que ya no existe; leer un archivo sin permiso,
     */
    @Override
    /*
    El método start viene a ser un método abstracto que proviene de la clase Application;
    como se le hereda y se le realiza una sobreescritura, se le está aplicando el polimorfismo.
     */
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image(getClass().getResourceAsStream("csv_icon.png"));
        stage.getIcons().add(icon);

        stage.setTitle("CSV Reader");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal que llama al launch, el cual inicia la ejecución de JavaFX y la app JavaFX
     * @param args - arreglo de tipo String
     */
    public static void main(String[] args) {
        launch();
    }
}