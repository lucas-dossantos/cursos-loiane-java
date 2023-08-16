package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a valor que deseja sacar: ");
        int v = input.nextInt();

        int n100 = Math.round(v / 100);
        int n50 = 0;
        int n10 = Math.round((v - (n100 * 100)) / 10);
        int n5 = 0;
        int n1 = Math.round(v - (n10 * 10 + n100 * 100));

        if (n10 > 4) {
            n50 = 1;
            n10 = n10 - 5;
        }
        if (n1 > 4) {
            n5 = 1;
            n1 = n1 - 5;
        }

        System.out.printf("Para sacar %d o caixa irá fornecer %d nota(s) de 100, %d nota(s) de 50," +
                "%d nota(s) de 10, %d nota(s) de 5 e %d nota(s) de 1.",v, n100, n50, n10, n5, n1);
    }
}
