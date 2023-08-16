package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = in.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = in.nextInt();

        if (n1 > n2){
            System.out.printf("%d é maior que %d", n1, n2);
        } else if (n2 > n1){
            System.out.printf("%d é maior que %d", n2, n1);
        } else {
            System.out.println("Os dois numeros são iguais.");
        }
    }
}
