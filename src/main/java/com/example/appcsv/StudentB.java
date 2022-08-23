package com.example.appcsv;

/**
 * Clase StudentB
 *
 * Contienen información del tipo de estudiante B
 */
public class StudentB extends Student{

    private int promProyectos;
    private String promExamQuizTarea = "";

    /**
     * Creación del estudiante B
     * @param carne - carné
     * @param nomApellidos - nombre y apellidos
     * @param correo - correo
     * @param telefono - teléfono
     * @param nickName - apodo
     * @param tipoEstudiante - tipo de estudiante
     * @param promExamenes - promedio de exámenes
     * @param promQuices - promedio de quices
     * @param promTareas - promedio de tareas
     * @param proyecto1 - nota de proyecto 1
     * @param proyecto2 - nota de proyecto 2
     * @param proyecto3 - nota de proyecto 3
     * @param notaFinal - nota final
     */
    public StudentB(String carne, String nomApellidos, String correo, int telefono, String nickName, String tipoEstudiante,
                    int promExamenes, int promQuices, int promTareas, int proyecto1, int proyecto2, int proyecto3, int notaFinal) {
        super(carne, nomApellidos, correo, telefono, nickName, tipoEstudiante, promExamenes, promQuices, promTareas, proyecto1,
                proyecto2, proyecto3, notaFinal);

        this.promProyectos = calculatePromProyectos();
    }

    /**
     * Calcula el promedio de proyectos
     * @return promedio de proyectos
     */
    public int calculatePromProyectos() {
        int proyec1 = getProyecto1();
        int proyec2 = getProyecto2();
        int proyec3 = getProyecto3();

        int suma = proyec1 + proyec2 + proyec3;
        int prom = suma / 3;
        return prom;

    }

    /**
     * Consigue el promedio de proyectos
     * @return promedio de proyectos
     */
    public int getPromProyectos() {
        return promProyectos;
    }

    /**
     * Actualiza el promedio de proyectos
     * @param promProyectos - promedio de proyectos
     */
    public void setPromProyectos(int promProyectos) {
        this.promProyectos = promProyectos;
    }

    /**
     * Consigue el promedio de exámenes, quices, tareas
     * @return promedio de exámenes, quices, tareas
     */
    public String getPromExamQuizTarea() {
        return promExamQuizTarea;
    }

    /**
     * Actualiza el promedio de exámenes, quices, tareas
     * @param promExamQuizTarea - promedio de exámenes, quices y tareas
     */
    public void setPromExamQuizTarea(String promExamQuizTarea) {
        this.promExamQuizTarea = promExamQuizTarea;
    }
}
