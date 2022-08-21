package com.example.appcsv;

public class StudentA extends Student{
    private int promExamQuizTarea;
    private String promProyectos = "";

    public StudentA(String carne, String nomApellidos, String correo, int telefono, String nickName, String tipoEstudiante,
                    int promExamenes, int promQuices, int promTareas, int proyecto1, int proyecto2, int proyecto3) {
        super(carne, nomApellidos, correo, telefono, nickName, tipoEstudiante, promExamenes, promQuices, promTareas, proyecto1,
                proyecto2, proyecto3);
        this.promExamQuizTarea = calculatePromExamQuizTarea();

    }

    public int calculatePromExamQuizTarea() {
        int exam = getPromExamenes();
        int quiz = getPromQuices();
        int tarea = getPromTareas();

        int suma = exam + quiz + tarea;
        int prom = suma / 3;
        setPromExamQuizTarea(prom);
        return prom;
    }

    public int getPromExamQuizTarea() {
        return promExamQuizTarea;
    }

    public void setPromExamQuizTarea(int promExamQuizTarea) {
        this.promExamQuizTarea = promExamQuizTarea;
    }

    public String getPromProyectos() {
        return promProyectos;
    }

    public void setPromProyectos(String promProyectos) {
        this.promProyectos = promProyectos;
    }
}
