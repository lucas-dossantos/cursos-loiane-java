package com.lucas.javabasico.poo.aula25a27.exercicios.ex02;

public class TesteEx02 {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numConta = 1;
        contaCorrente.saldo = 800;
        contaCorrente.especial = true;
        contaCorrente.limite = 200;

        contaCorrente.consultar();
        if (contaCorrente.sacar(1200)) {
            System.out.println("Saque realizado com sucesso.");
            contaCorrente.consultar();
        } else if (contaCorrente.especial) {
            System.out.println("Saldo e limite insuficiente.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        contaCorrente.depositar(200);

        contaCorrente.consultar();
        if (contaCorrente.sacar(1200)) {
            System.out.println("Saque realizado com sucesso.");
            contaCorrente.consultar();
        } else if (contaCorrente.especial) {
            System.out.println("Saldo e limite insuficiente.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }
}
