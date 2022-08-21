package com.example.appcsv;

public class StudentB extends Student{

    private int promProyectos;
    private String promExamQuizTarea = "";

    public StudentB(String carne, String nomApellidos, String correo, int telefono, String nickName, String tipoEstudiante,
                    int promExamenes, int promQuices, int promTareas, int proyecto1, int proyecto2, int proyecto3) {
        super(carne, nomApellidos, correo, telefono, nickName, tipoEstudiante, promExamenes, promQuices, promTareas, proyecto1,
                proyecto2, proyecto3);

        this.promProyectos = calculatePromProyectos();
    }

    public int calculatePromProyectos() {
        int proyec1 = getProyecto1();
        int proyec2 = getProyecto2();
        int proyec3 = getProyecto3();

        int suma = proyec1 + proyec2 + proyec3;
        int prom = suma / 3;
        setPromProyectos(prom);
        return prom;

    }

    public int getPromProyectos() {
        return promProyectos;
    }

    public void setPromProyectos(int promProyectos) {
        this.promProyectos = promProyectos;
    }

    public String getPromExamQuizTarea() {
        return promExamQuizTarea;
    }

    public void setPromExamQuizTarea(String promExamQuizTarea) {
        this.promExamQuizTarea = promExamQuizTarea;
    }
}
