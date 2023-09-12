package com.lucas.javabasico.poo.aula28a33.exercicios.ex02;

public class ContaCorrente {

    private int numConta;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaCorrente() {

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double saque) {
        if (saque <= getSaldo()) {
            setSaldo(getSaldo() - saque);
            return true;
        } else if (isEspecial()) {
            if (saque <= getLimite() + getSaldo()){
                 setSaldo(getSaldo() - saque);
                 setLimite(getLimite() + getSaldo());
                 return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            setSaldo(getSaldo() + valorDeposito);
        } else {
            System.out.println("Valor inválido para depósito@!");
        }
    }

    public void consultar() {
        if (isEspecial()) {
            System.out.println("=-=-=-=-=-= STATUS =-=-=-=-=-=");
            System.out.println("Saldo atual: " + getSaldo());
            System.out.println("Limite: R$" + getLimite());
        } else {
            System.out.println("=-=-=-=-=-= STATUS =-=-=-=-=-=");
            System.out.println("Esta conta não possui cheque especial.");
            System.out.println("Saldo atual: R$" + getSaldo());
        }
    }

    public void mudarParaEspecial(double valorLimite) {
        setEspecial(true);
        setLimite(valorLimite);
    }

}
