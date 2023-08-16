package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio23 {

    /* Escreva um programa que peça um número e informe se o
número é inteiro ou decimal. Dica: Use uma função de arredondamento.*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        double numero1 = input.nextDouble();

        boolean temDecimal = temParteDecimal(numero1);

        if (temDecimal) {
            System.out.println("É um número com decimal.");
        } else {
            System.out.println("Não é um número com decimal.");
        }
    }

    public static boolean temParteDecimal(double numero) {
        return numero != (int) numero;
    }
}

