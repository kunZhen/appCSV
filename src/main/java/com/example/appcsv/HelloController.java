package com.example.appcsv;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * HelloController es una clase que permite controlar los eventos y acciones para el
 * archivo fxml
 */
public class HelloController implements Initializable {

    @FXML
    private TableView<Student> table;

    /**
     * Método que se ejecuta cuando se presiona el botón
     */
    @FXML
    void getStudentsData(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            String file = String.valueOf(selectedFile);

            BufferedReader reader = null;
            String line = "";

            final ObservableList<Student> studentsList = FXCollections.observableArrayList();

            try{
                reader = new BufferedReader(new FileReader(file));
                reader.readLine(); // Salta la primera linea, de manera que no lee los encabezados
                while ((line = reader.readLine()) != null) {

                    String[] row = line.split(";");

                    // Categorizando al estudiante A y B

                    Random random = new Random();
                    int var = random.nextInt(2) + 5;

                    if (row[5].equals("A")) {
                        studentsList.add(new StudentA(row[0], row[1], row[2], Integer.parseInt(row[3]), row[4],
                                row[5], Integer.parseInt(row[6]), Integer.parseInt(row[7]), Integer.parseInt(row[8]),
                                Integer.parseInt(row[9]), Integer.parseInt(row[10]), Integer.parseInt(row[11]), var));
                        System.out.println("A TRUE" + String.valueOf(var));

                    } else {
                        studentsList.add(new StudentB(row[0], row[1], row[2], Integer.parseInt(row[3]), row[4],
                                row[5], Integer.parseInt(row[6]), Integer.parseInt(row[7]), Integer.parseInt(row[8]),
                                Integer.parseInt(row[9]), Integer.parseInt(row[10]), Integer.parseInt(row[11]), var));
                        System.out.println("B TRUE" + String.valueOf(var));

                    }


                    for (String index : row) {
                        System.out.printf("%-20s", index);

                    }

                    System.out.println();


                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }
            table.setItems(studentsList);
        } else {
            System.out.println("FILE IS NOT VALID");
        }
    }

    /**
     *
     * @param url - hace referencia a la ubicación de la interfaz gráfica (el archivo fxml)
     * @param resourceBundle - para traducir textos o modificar otra información dependiente de la configuración regional
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn carneColumn = new TableColumn("Carne");
        TableColumn nomApellidosColumn = new TableColumn("Nombre y Apellidos");
        TableColumn correoColumn = new TableColumn("Correo");
        TableColumn telefonoColumn = new TableColumn("Telefono");
        TableColumn nickNameColumn = new TableColumn("Nickname");
        TableColumn tipoEstudianteColumn = new TableColumn("Tipo Estudiante");
        TableColumn promExamenesColumn = new TableColumn("Promedio (Examenes)");
        TableColumn promQuicesColumn = new TableColumn("Promedio (Quices)");
        TableColumn promTareasColumn = new TableColumn("Promedio (Tareas)");
        TableColumn proyecto1Column = new TableColumn("Proyecto 1");
        TableColumn proyecto2Column = new TableColumn("Proyecto 2");
        TableColumn proyecto3Column = new TableColumn("Proyecto 3");

        TableColumn promExamQuicesTareas = new TableColumn("Promedio (Examenes, quices, tareas)");
        TableColumn promProyectos = new TableColumn("Promedio (Proyectos)");
        TableColumn notaFinal = new TableColumn("Nota final");

        table.getColumns().addAll(carneColumn, nomApellidosColumn, correoColumn, telefonoColumn, nickNameColumn,
                tipoEstudianteColumn, promExamenesColumn, promQuicesColumn, promTareasColumn, proyecto1Column,
                proyecto2Column, proyecto3Column, promExamQuicesTareas, promProyectos, notaFinal);

        carneColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("carne"));
        nomApellidosColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("nomApellidos"));
        correoColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("correo"));
        telefonoColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("telefono"));
        nickNameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("nickName"));
        tipoEstudianteColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("tipoEstudiante"));
        promExamenesColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("promExamenes"));
        promQuicesColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("promQuices"));
        promTareasColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("promTareas"));
        proyecto1Column.setCellValueFactory(new PropertyValueFactory<Student, Integer>("proyecto1"));
        proyecto2Column.setCellValueFactory(new PropertyValueFactory<Student, Integer>("proyecto2"));
        proyecto3Column.setCellValueFactory(new PropertyValueFactory<Student, Integer>("proyecto3"));

        promExamQuicesTareas.setCellValueFactory(new PropertyValueFactory<StudentA, Integer>("promExamQuizTarea"));
        promProyectos.setCellValueFactory(new PropertyValueFactory<StudentB, Integer>("promProyectos"));
        notaFinal.setCellValueFactory(new PropertyValueFactory<Student, Integer>("notaFinal"));



    }
}
