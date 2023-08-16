package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio02 {

    /* Faça um programa que leia um número e imprima na tela se o valor
    é positivo ou negativo.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = in.nextInt();

        if (n >= 0){
            System.out.println("Este número é positivo.");
        } else {
            System.out.println("Este número é negativo.");
        }
    }

}
