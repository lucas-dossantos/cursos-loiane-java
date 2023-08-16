package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho do primeiro lado: ");
        double l1 = input.nextDouble();
        System.out.print("Informe o tamanho do segundo lado: ");
        double l2 = input.nextDouble();
        System.out.print("Informe o tamanho do terciero lado: ");
        double l3 = input.nextDouble();



        if ((l1 + l2) > l3 || (l1 + l3) > l2 || (l2 + l3) > l1) {
            if (l1 == l2 && l1 == l3){
                System.out.println("\nTriângulo equilátero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("\nTrinângulo isósceles.");
            } else if (l1 <= 0 || l2 <= 0 || l3 <= 0){
                System.out.println("\nNão é um triangulo.");
            } else {
                System.out.println("\nTriângulo escaleno.");
            }
        }
    }
}
