package com.lucas.javabasico.poo.aula28a33.exercicios.ex02;

public class TesteEx02 {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1, 800);

        contaCorrente.consultar();
        if (contaCorrente.sacar(1200)) {
            System.out.println("Saque realizado com sucesso.");
            contaCorrente.consultar();
        } else if (contaCorrente.isEspecial()) {
            System.out.println("Saldo e limite insuficiente.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        contaCorrente.mudarParaEspecial(200);

        contaCorrente.consultar();
        if (contaCorrente.sacar(1200)) {
            System.out.println("Saque realizado com sucesso.");
            contaCorrente.consultar();
        } else if (contaCorrente.isEspecial()) {
            System.out.println("Saldo e limite insuficiente.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        contaCorrente.depositar(200);

        contaCorrente.consultar();
        if (contaCorrente.sacar(1200)) {
            System.out.println("Saque realizado com sucesso.");
            contaCorrente.consultar();
        } else if (contaCorrente.isEspecial()) {
            System.out.println("Saldo e limite insuficiente.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
