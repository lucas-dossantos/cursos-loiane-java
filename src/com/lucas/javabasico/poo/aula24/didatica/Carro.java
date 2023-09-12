package com.lucas.javabasico.poo.aula24.didatica;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro() {

    }

    void wxibirAutonomia() {
        System.out.println("A autonaomia do carro ´é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return km/consumoCombustivel;
    }
}
