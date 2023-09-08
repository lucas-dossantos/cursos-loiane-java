package com.lucas.javabasico.poo.aula25a27.exercicios.ex02;

public class ContaCorrente {

    int numConta;
    double saldo;
    boolean especial;
    double limite;

    void sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso.");
        } else if (especial) {
            if (saque <= limite + saldo) {
                saldo = saldo - saque;
                limite += saldo;
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Limite e saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    void depositar(double deposito) {
        if (deposito > 0 ) {
            saldo += deposito;
            System.out.println("Deposito feito com sucesso.");
        } else {
            System.out.println("Deposito inválido.");
        }
    }

    void consultar() {
        if (especial) {
            System.out.println("Saldo atual: R$" + saldo);
            System.out.println("Limite: R$" + limite);
        } else {
            System.out.println("Esta conta não possui cheque especial.");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }
}
