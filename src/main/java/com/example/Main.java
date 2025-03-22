package com.example;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();

        escuela.agregarEstudiante(new Estudiante("Andrea", 20));
        escuela.agregarEstudiante(new Estudiante("Camilo", 21));
        escuela.agregarEstudiante(new Estudiante("Geronimo", 22));

        escuela.mostrarEstudiante();

    }
}

