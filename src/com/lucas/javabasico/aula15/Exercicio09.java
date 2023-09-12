package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio09 {

    /* Escreva um programa que leia três números e os exiba em
ordem decrescente.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = in.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = in.nextInt();
        System.out.print("Digite outro número: ");
        int n3 = in.nextInt();

        int maior = n1;
        int medio = n1;
        int menor = n1;

        if (n2 > n3 && n2 > n1){
            maior = n2;
        } else if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)){
            medio = n2;
        } else if (n2 < n1 && n2 < n3){
            menor = n2;
        } else if (n3 > n1 && n3 > n2){
            maior = n3;
        } else if ((n3 > n2 && n3 < n1) || (n3 < n2 && n3 > n1)){
            medio = n3;
        } else if (n3 < n2 && n3 < n1){
            menor = n3;
        }

        if (maior == n1 && medio == n2){
            System.out.printf("%d, %d, %d.", n1, n2, n3);
        } else if (maior == n1 && medio == n3){
            System.out.printf("%d, %d, %d.", n1, n3, n2);
        }else if (maior == n2 && medio == n1){
            System.out.printf("%d, %d, %d.", n2, n1, n3);
        } else if (maior == n2 && medio == n3){
            System.out.printf("%d, %d, %d.", n2, n3, n1);
        } else if (maior == n3 && medio == n2){
            System.out.printf("%d, %d, %d.", n3, n2, n1);
        } else if (maior == n3 && medio == n1){
            System.out.printf("%d, %d, %d.", n3, n1, n2);
        }

    }

}
