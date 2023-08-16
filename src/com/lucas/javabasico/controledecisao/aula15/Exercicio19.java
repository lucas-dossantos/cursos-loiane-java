package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número inteiro menor que 1000: ");
        int n = input.nextInt();


        int centena = Math.round(n / 100);
        int dezena = Math.round((n - (centena * 100)) / 10);
        int unidade = Math.round(n - (dezena * 10 + centena * 100));

        System.out.printf("\nO número %d tem %d centenas, %d dezenas e %d unidades.",n, centena, dezena, unidade);

    }
}
