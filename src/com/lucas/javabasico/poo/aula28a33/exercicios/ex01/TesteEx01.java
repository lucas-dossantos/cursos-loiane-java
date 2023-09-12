package com.lucas.javabasico.poo.aula28a33.exercicios.ex01;

public class TesteEx01 {

    public static void main(String[] args) {

        Lampada lampada = new Lampada("t90", "Florescente", 7, false);

        lampada.status();

        lampada.mudarEstado();

        lampada.status();

        lampada.mudarEstado();

        lampada.status();
    }
}
