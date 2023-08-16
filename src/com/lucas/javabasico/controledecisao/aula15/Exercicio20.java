package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        double n1 = input.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double n2 = input.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double n3 = input.nextDouble();

        double m = (n1 + n2 + n3) / 3;

        if (m == 10) {
            System.out.printf("\nAprovado com distinção. Você teve %.1f", m);
        } else if (m >= 7) {
            System.out.printf("\nAprovado. Você teve %.1f", m);
        } else {
            System.out.printf("\nReprovado. Você teve %.1f", m);
        }
    }
}
