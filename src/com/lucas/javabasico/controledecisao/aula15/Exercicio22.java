package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("\nO número informado é par.");
        } else {
            System.out.println("\nO número digitado é ímpar.");
        }
    }
}
