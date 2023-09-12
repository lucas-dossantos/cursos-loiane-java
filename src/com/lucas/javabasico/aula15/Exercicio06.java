package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio06 {

    /* Escreva um programa que leia três números e exiba o maior deles.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = in.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = in.nextInt();

        System.out.print("Digite o 3º número: ");
        int n3 = in.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }
}
