package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio18 {

    /* Escreva um programa que solicite uma data no formato mm/dd/aaaa
e determina se é uma data válida.*/

    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int dia = input.nextInt();
        System.out.print("Informe o mês: ");
        int mes = input.nextInt();
        System.out.print("Informe o ano: ");
        int ano = input.nextInt();

        boolean bissexto = true;

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            bissexto = true;
        } else {
            bissexto = false;
        }

        if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (ano > 0)) {
            if (bissexto) {
                if (dia > 29 && mes == 2){
                    dataInvalida();
                } else {
                    dataValida();
                }
            } else if (dia > 28 && mes == 2){
                dataInvalida();
            } else if (dia > 30 && mes % 2 == 0) {
                dataInvalida();
            } else {
                dataValida();
            }
        } else {
            dataInvalida();
        }
    }

    private static void dataValida() {
        System.out.println("\nÉ uma data válida.");
    }

    private static void dataInvalida() {
        System.out.println("\nNão é uma data válida.");
    }
}
