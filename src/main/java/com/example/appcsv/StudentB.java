package com.example.appcsv;

public class StudentB extends Student{
    public double getPromProyectos() {
        int proyecto1 = getProyecto1();
        int proyecto2 = getProyecto2();
        int proyecto3 = getProyecto3();

        int suma = proyecto1 + proyecto2 + proyecto3;
        double prom = suma / 3;
        return prom;
    }
}
