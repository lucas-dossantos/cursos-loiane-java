package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de a: ");
        double a = input.nextInt();

        if (a == 0){
            System.out.println("A equação não será de segundo grau.");
            return;
        }

        System.out.print("Informe o valor de b: ");
        double b = input.nextInt();
        System.out.print("Informe o valor de c: ");
        double c = input.nextInt();

        double delta = b * b - 4 * a * c;

        if (delta < 0 ) {
            System.out.println("A equação não possui rízas reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A raiz dupla é x = " + x);
        } else {
            System.out.println(delta);
            double x1 = (- b + Math.sqrt(delta) / (2 * a));
            double x2 = (- b - Math.sqrt(delta) / (2 * a));
            System.out.println("As raízes são: \nx1 = " + x1 + "\nx2 = " + x2);
        }
    }
}
