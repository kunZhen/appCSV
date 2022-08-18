package com.example.appcsv;

public class StudentA extends Student{

    private int promProyectos = 0;


    public double getPromExamQuicesTareas() {
        int exam = getPromExamenes();
        int quiz = getPromQuices();
        int tareas = getPromTareas();

        int suma = exam + quiz + tareas;
        double prom = suma / 3;
        return prom;
    }
}
