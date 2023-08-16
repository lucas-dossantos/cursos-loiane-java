package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio13 {

    /* Escreva um programa que leia um número e exiba o dia correspondente
da semana. (1-domingo, 2-segunda-feira, etc.), se você digitar outro valor, um
valor inválido deve aparecer.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("""
                \n
                Escolha um número para exibir o npumero da semana:
                
                [1] Segunda-feira
                [2] Terça-feira
                [3] Quarta-feira
                [4] Quinta-feira
                [5] Sexta-feira
                [6] Sábado
                [7] Domingo
                
                Sua opção:""");
        int opcao = in.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Valor inválido.");
        }
    }
}
