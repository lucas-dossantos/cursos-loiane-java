package com.lucas.javabasico.poo.aula28a33.exercicios.ex01;

public class Lampada {

    private String modelo;
    private String tipo;
    private int potencia;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String modelo, String tipo, int potencia, boolean ligada) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void status() {
        System.out.println("Status da Lâmpada: ");
        if (isLigada()) {
            System.out.println("Acesa!");
        } else {
            System.out.println("Apagada!");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }

}
