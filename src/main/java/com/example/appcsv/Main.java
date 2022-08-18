package com.example.appcsv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
                                            /* La clase Main hereda de la clase Application, la cual es un clase abstracta y permite
                                            * el uso de todo lo que estamos heredando, todas sus funcionalidades*/

    @Override
    public void start(Stage stage) throws IOException {
                                                        /* Al llamar este método, se pasa el Stage stage y crea
                                                        la ventana - window
                                                        */
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); /* Método que proviene de la clase Application,
                    va a la clase Application para set everything up
                    y luego llama al método Start*/
    }
}