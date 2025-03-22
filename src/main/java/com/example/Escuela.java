package com.example;

import java.util.List;
import java.util.ArrayList;
public class Escuela {
    private List<Estudiante> listaEstudiantes;

    public Escuela() {
        this.listaEstudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);

    }

    public void mostrarEstudiante() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("no hay estudiantes resgistrados");
        } else {
            System.out.println("Lista de estudiantes");
            for (Estudiante estudiante : listaEstudiantes) {
                System.out.println(estudiante);
            }
        }
    }

}
