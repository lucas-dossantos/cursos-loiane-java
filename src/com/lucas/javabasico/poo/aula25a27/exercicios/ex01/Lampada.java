package com.lucas.javabasico.poo.aula25a27.exercicios.ex01;

public class Lampada {

    String modelo;
    String tipo;
    int potencia;
    boolean ligada;


    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
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
