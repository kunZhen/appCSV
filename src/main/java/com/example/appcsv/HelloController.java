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
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<Student> table;

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
                    studentsList.add(new Student(row[0], row[1], row[2], Integer.parseInt(row[3]), row[4],
                            row[5], Integer.parseInt(row[6]), Integer.parseInt(row[7]), Integer.parseInt(row[8]),
                            Integer.parseInt(row[9]), Integer.parseInt(row[10]), Integer.parseInt(row[11])));

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

        table.getColumns().addAll(carneColumn, nomApellidosColumn, correoColumn, telefonoColumn, nickNameColumn,
                tipoEstudianteColumn, promExamenesColumn, promQuicesColumn, promTareasColumn, proyecto1Column,
                proyecto2Column, proyecto3Column, promExamQuicesTareas, promProyectos);

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




    }
}
