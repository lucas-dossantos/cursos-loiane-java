package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio19 {

    /* Escreva um programa que leia um inteiro menor que 1000
e imprime o número de centenas, dezenas e unidades dele.
Observando os termos no plural, a colocação do "e", da vírgula,
entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dez e 2 unidades
Teste com: 326, 300, 100, 320, 310,
305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/

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
