package com.lucas.javabasico.poo.aula25a27.exercicios.ex01;

public class Lampada {

    String modelo;
    String tipo;
    int potencia;
    boolean ligada;


    boolean ligar() {
        return ligada = true;
    }

    boolean desligar() {
        return ligada = false;
    }

    void status() {
        System.out.println("Status da lâmpada.");
        if (ligada) {
            System.out.println("Acesa!");
        } else {
            System.out.println("Apagada!");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
