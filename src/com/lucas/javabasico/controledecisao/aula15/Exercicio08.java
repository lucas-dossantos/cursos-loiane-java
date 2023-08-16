package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor do 1º produto: ");
        float v1 = in. nextFloat();
        System.out.print("Digite o valor do 2º produto: ");
        float v2 = in. nextFloat();
        System.out.print("Digite o valor do 3º produto: ");
        float v3 = in. nextFloat();

        float menorValor = v1;

        if (v2 < menorValor || v3 < menorValor){
            menorValor = v2;
            if (v3 < menorValor){
                menorValor = v3;
            }
        }

        if (v1 == menorValor){
            System.out.println("Compre o 1º produto");
        } else if (v2 == menorValor){
            System.out.println("Compre o 2º produto");
        } else {
            System.out.println("Compre o 3º produto");
        }
    }
}
