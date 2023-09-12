package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio15 {

    /* screva um programa que peça os 3 lados de um triângulo. O
o programa deve informar se os valores podem ser um triângulo. Indicar,
se os lados formam um triângulo, se é: equilátero, isósceles ou
escaleno.
Pontas:
Três lados formam um triângulo quando a soma de quaisquer dois
lados é maior que o terceiro;
Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;*/

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
