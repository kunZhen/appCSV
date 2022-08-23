package com.example.appcsv;

/**
 * Clase Student
 *
 * Contiene información de cada estudiante
 */
public class Student {
    private String carne;
    private String nomApellidos;
    private String correo;
    private int telefono;
    private String nickName;
    private String tipoEstudiante;
    private int promExamenes;
    private int promQuices;
    private int promTareas;
    private int proyecto1;
    private int proyecto2;
    private int proyecto3;
    private int notaFinal;


    /**
     * Constructor de Student: inicializa sus atributos
     */
    public Student() { //Constructor: inicializa los atributos de la clase Student
        this.carne = "";
        this.nomApellidos = "";
        this.correo = "";
        this.telefono = 0;
        this.nickName = "";
        this.tipoEstudiante = "";
        this.promExamenes = 0;
        this.promQuices = 0;
        this.promTareas = 0;
        this.proyecto1 = 0;
        this.proyecto2 = 0;
        this.proyecto3 = 0;
        this.notaFinal = 0;


    }

    /**
     * Creación del estudiante
     * @param carne - carné, valor entero
     * @param nomApellidos - nombre y apellidos
     * @param correo - correo, valor entero
     * @param telefono - teléfono, valor entero
     * @param nickName - apodo
     * @param tipoEstudiante - tipo de estudiante - A o B
     * @param promExamenes - promedio de exámenes, valor entero
     * @param promQuices - promedio de quices, valor entero
     * @param promTareas - promedio de tareas, valor entero
     * @param proyecto1 - nota de proyecto 1, valor entero
     * @param proyecto2 - nota de proyecto 2, valor entero
     * @param proyecto3 - nota de proyecto 3, valor entero
     * @param notaFinal - nota final, valor entero
     */
    public Student(String carne, String nomApellidos, String correo, int telefono, String nickName, String tipoEstudiante,
                   int promExamenes, int promQuices, int promTareas, int proyecto1, int proyecto2, int proyecto3, int notaFinal) {
        this.carne = carne;
        this.nomApellidos = nomApellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.nickName = nickName;
        this.tipoEstudiante = tipoEstudiante;
        this.promExamenes = promExamenes;
        this.promQuices = promQuices;
        this.promTareas = promTareas;
        this.proyecto1 = proyecto1;
        this.proyecto2 = proyecto2;
        this.proyecto3 = proyecto3;

        if (notaFinal == 6) {
            calculateNotaFinal(promExamenes, promQuices, promTareas, proyecto1, proyecto2, proyecto3);
        } else {
            calculateNotaFinal(promExamenes, promQuices, promTareas, proyecto1, proyecto2);
        }
    }

    /**
     *
     * @param promExamenes - promedio de exámenes
     * @param promQuices - promedio de quices
     * @param promTareas - promedio de tareas
     * @param proyecto1 - nota proyecto 1
     * @param proyecto2 - nota proyecto 2
     * @param proyecto3 - nota proyecto 3
     */
    public void calculateNotaFinal(int promExamenes, int promQuices, int promTareas, int proyecto1,
                                   int proyecto2, int proyecto3) {
        int suma = promExamenes + promQuices + promTareas + proyecto1 + proyecto2 + proyecto3;
        int prom = suma / 6;
        setNotaFinal(prom);

    }

    /**
     *
     * @param promExamenes - promedio de exámenes
     * @param promQuices - promedio de quices
     * @param promTareas - promedio de tareas
     * @param proyecto1 - nota proyecto 1
     * @param proyecto2 - nota proyecto 2
     */
    public void calculateNotaFinal(int promExamenes, int promQuices, int promTareas, int proyecto1,
                                   int proyecto2) {
        int suma = promExamenes + promQuices + promTareas + proyecto1 + proyecto2;
        int prom = suma / 5;
        setNotaFinal(prom);

    }

    /**
     * Consigue el carné
     * @return el carné
     */
    public String getCarne() {
        return carne;
    }

    /**
     * Actualiza el carné
     * @param carne - carné
     */
    public void setCarne(String carne) {
        this.carne = carne;
    }

    /**
     * Consigue el nombre y los apellidos
     * @return nombre y apellidos
     */
    public String getNomApellidos() {
        return nomApellidos;
    }

    /**
     * Actualiza el nombre y los apellidos
     * @param nomApellidos - nombre y Apellidos
     */
    public void setNomApellidos(String nomApellidos) {
        this.nomApellidos = nomApellidos;
    }

    /**
     * Consigue el correo
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Actualiza el correo
     * @param correo - correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Consigue el número de teléfono
     * @return número de teléfono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Actualiza el número de teléfono
     * @param telefono - número de télefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Consigue el apodo
     * @return apodo
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Actualiza el apodo
     * @param nickName - apodo
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Consigue el tipo de estudiante
     * @return tipo de estudiante
     */
    public String getTipoEstudiante() {
        return tipoEstudiante;
    }

    /**
     * Actualiza el tipo de estudiante
     * @param tipoEstudiante - tipo de estudiante
     */
    public void setTipoEstudiante(String tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }

    /**
     * Consigue el promedio de exámenes
     * @return promedio de exámenes
     */
    public int getPromExamenes() {
        return promExamenes;
    }

    /**
     * Actualiza el promedio de exámenes
     * @param promExamenes - promedio de exámenes
     */
    public void setPromExamenes(int promExamenes) {
        this.promExamenes = promExamenes;
    }

    /**
     * Consigue el promedio de quices
     * @return promedio de quices
     */
    public int getPromQuices() {
        return promQuices;
    }

    /**
     * Actualiza el promedio de quices
     * @param promQuices - promedio de quices
     */
    public void setPromQuices(int promQuices) {
        this.promQuices = promQuices;
    }

    /**
     * Consigue el pronedio de tareas
     * @return promedio de tareas
     */
    public int getPromTareas() {
        return promTareas;
    }

    /**
     * Actualiza el promedio de tareas
     * @param promTareas - promedio de tareas
     */
    public void setPromTareas(int promTareas) {
        this.promTareas = promTareas;
    }

    /**
     * Consigue la nota del proyecto 1
     * @return nota de proyecto 1
     */
    public int getProyecto1() {
        return proyecto1;
    }

    /**
     * Actualiza la nota del proyecto 1
     * @param proyecto1 nota del proyecto 1
     */
    public void setProyecto1(int proyecto1) {
        this.proyecto1 = proyecto1;
    }

    /**
     * Consigue la nota del proyecto 2
     * @return nota del proyecto 2
     */
    public int getProyecto2() {
        return proyecto2;
    }

    /**
     * Actualiza la nota del proyecto 2
     * @param proyecto2 - nota del proyecto 2
     */
    public void setProyecto2(int proyecto2) {
        this.proyecto2 = proyecto2;
    }

    /**
     * Consigue la nota del proyecto 3
     * @return nota del proyecto 3
     */
    public int getProyecto3() {
        return proyecto3;
    }

    /**
     * Actualiza la nota del proyecto 3
     * @param proyecto3 - nota del proyecto 3
     */
    public void setProyecto3(int proyecto3) {
        this.proyecto3 = proyecto3;
    }

    /**
     * Consigue la nota final
     * @return nota final
     */
    public int getNotaFinal() {
        return notaFinal;
    }

    /**
     * Actualiza la nota final
     * @param notaFinal - nota final
     */
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
}
