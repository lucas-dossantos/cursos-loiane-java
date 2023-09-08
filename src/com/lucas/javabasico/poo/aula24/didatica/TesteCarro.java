package com.lucas.javabasico.poo.aula24.didatica;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.numPassageiros = 100;
        van.consumoCombustivel = 0.2;

        Carro fusca = new Carro();
        van.marca = "volkswagem";
        van.modelo = "Fusca";
        van.numPassageiros = 4;
        van.numPassageiros = 30;
        van.consumoCombustivel = 0.15;
    }
}
