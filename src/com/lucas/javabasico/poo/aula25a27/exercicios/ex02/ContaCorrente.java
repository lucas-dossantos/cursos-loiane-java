package com.lucas.javabasico.poo.aula25a27.exercicios.ex02;

public class ContaCorrente {

    int numConta;
    double saldo;
    boolean especial;
    double limite;

    boolean sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;
            return true;
        } else if (especial) {
            if (saque <= limite + saldo) {
                saldo = saldo - saque;
                limite += saldo;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    void depositar(double valorDeposito) {
        if (valorDeposito > 0 ) {
            saldo += valorDeposito;
        } else {
            System.out.println("Valor para deposito inválido. ");
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
