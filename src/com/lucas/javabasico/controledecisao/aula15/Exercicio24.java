package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        System.out.print("""
                \n
                Escolha a operção: 
                
                [1] par ou ímpar
                [2] positivo ou negativo
                [3] inteiro ou decimal
                
                Sua opçaõ:""");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1 -> {
                parImpar(n1, n2);
            }
            case 2 -> {
                positivoNegativo(n1, n2);
            }
            case 3 -> {
                boolean temDecimal1 = verificaDecimal(n1);
                boolean temDecimal2 = verificaDecimal(n2);
                interiroDecimal(temDecimal1, temDecimal2);

            }
            default -> {
                System.out.println("\nOpção inválida.");
            }
        }
    }

    private static void interiroDecimal(boolean temDecimal1, boolean temDecimal2) {
        if (temDecimal1) {
            System.out.println("N1 é um número com decimal.");
        } else {
            System.out.println("N1 não é um número com decimal.");
        }
        if (temDecimal2) {
            System.out.println("N2 é um número com decimal.");
        } else {
            System.out.println("N2 não é um número com decimal.");
        }
    }

    private static boolean verificaDecimal(double n) {
        return n != (int) n;
    }

    private static void positivoNegativo(double n1, double n2) {
        if (n1 >= 0) {
            System.out.println( "N1 é um número positivo.");
        } else {
            System.out.println("N1 é um número negativo.");
        }
        if (n2 >= 0) {
            System.out.println("N2 é um número positivo.");
        } else {
            System.out.println("N2 é um número negativo.");
        }
    }

    private static void parImpar(double n1, double n2) {
        if (n1 % 2 == 0) {
            System.out.println("N1 é um número par.");
        } else {
            System.out.println("N1 é um número ímpar.");
        }
        if (n2 % 2 == 0) {
            System.out.println("N2 é um número par.");
        } else {
            System.out.println("N2 é um número ímpar.");
        }
    }
}
