package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = input.nextInt();;

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            System.out.printf("O ano %d é bissexto e tem 366 dias.", ano);
        } else {
            System.out.printf("O ano %d é comum e tem 365 dias.", ano);
        }
    }
}
