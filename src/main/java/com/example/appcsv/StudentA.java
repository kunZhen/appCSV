package com.example.appcsv;

/**
 * Clase StudentA
 *
 * Contiene información del tipo de estudiante A
 */
public class StudentA extends Student{
    private int promExamQuizTarea;
    private String promProyectos = "";

    /**
     * Creación del estudiante A
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
    public StudentA(String carne, String nomApellidos, String correo, int telefono, String nickName, String tipoEstudiante,
                    int promExamenes, int promQuices, int promTareas, int proyecto1, int proyecto2, int proyecto3, int notaFinal) {
        super(carne, nomApellidos, correo, telefono, nickName, tipoEstudiante, promExamenes, promQuices, promTareas, proyecto1,
                proyecto2, proyecto3, notaFinal);
        this.promExamQuizTarea = calculatePromExamQuizTarea();

    }

    /**
     * Calcular el promedio de exámenes, quices y tareas
     * @return promedio de exámenes, quices y tareas
     */
    public int calculatePromExamQuizTarea() {
        int exam = getPromExamenes();
        int quiz = getPromQuices();
        int tarea = getPromTareas();

        int suma = exam + quiz + tarea;
        int prom = suma / 3;
        return prom;
    }

    /**
     * Consigue el promedio de exámenes, quices y tareas
     * @return promedio de exámenes, quices y tareas
     */
    public int getPromExamQuizTarea() {
        return promExamQuizTarea;
    }

    /**
     * Actualiza el promedio de exámenes, quices y tareas
     * @param promExamQuizTarea - promedio de exámenes, quices y tareas
     */
    public void setPromExamQuizTarea(int promExamQuizTarea) {
        this.promExamQuizTarea = promExamQuizTarea;
    }

    /**
     * Consigue el promedio de proyectos
     * @return promedio de proyectos
     */
    public String getPromProyectos() {
        return promProyectos;
    }

    /**
     * Actualiza el promedio de proyectos
     * @param promProyectos - promedio de proyectos
     */
    public void setPromProyectos(String promProyectos) {
        this.promProyectos = promProyectos;
    }
}
