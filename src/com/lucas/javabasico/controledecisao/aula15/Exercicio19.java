package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número inteiro menor que 1000: ");
        int n = input.nextInt();

        float cen = n / 100;
        int centena = Math.round(cen);
        float dez = (n - (centena * 100)) / 10;
        int dezena = Math.round(dez);
        float uni = n - (dezena * 10 + centena * 100);
        int unidade = Math.round(uni);

        System.out.printf("\nO número %d tem %d centenas, %d dezenas e %d unidades.",n, centena, dezena, unidade);

    }
}
