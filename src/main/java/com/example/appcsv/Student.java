package com.example.appcsv;

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

    /*private int promProyectos;

    private int promExamQuizTarea;

    private int notaFinal;*/

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

    }

    public Student(String carne, String nomApellidos, String correo, int telefono, String nickName, String tipoEstudiante,
                   int promExamenes, int promQuices, int promTareas, int proyecto1, int proyecto2, int proyecto3) {
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
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNomApellidos() {
        return nomApellidos;
    }

    public void setNomApellidos(String nomApellidos) {
        this.nomApellidos = nomApellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(String tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }

    public int getPromExamenes() {
        return promExamenes;
    }

    public void setPromExamenes(int promExamenes) {
        this.promExamenes = promExamenes;
    }

    public int getPromQuices() {
        return promQuices;
    }

    public void setPromQuices(int promQuices) {
        this.promQuices = promQuices;
    }

    public int getPromTareas() {
        return promTareas;
    }

    public void setPromTareas(int promTareas) {
        this.promTareas = promTareas;
    }

    public int getProyecto1() {
        return proyecto1;
    }

    public void setProyecto1(int proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public int getProyecto2() {
        return proyecto2;
    }

    public void setProyecto2(int proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public int getProyecto3() {
        return proyecto3;
    }

    public void setProyecto3(int proyecto3) {
        this.proyecto3 = proyecto3;
    }

}
