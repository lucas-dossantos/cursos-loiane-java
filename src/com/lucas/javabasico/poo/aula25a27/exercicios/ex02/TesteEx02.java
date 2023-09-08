package com.lucas.javabasico.poo.aula25a27.exercicios.ex02;

public class TesteEx02 {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numConta = 1;
        contaCorrente.saldo = 1000;
        contaCorrente.especial = true;
        contaCorrente.limite = 200;

        contaCorrente.sacar(1200);
        contaCorrente.consultar();
        contaCorrente.depositar(200);
        contaCorrente.sacar(1200);
        contaCorrente.consultar();
    }
}
