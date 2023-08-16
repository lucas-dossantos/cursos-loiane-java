package com.lucas.javabasico.controledecisao.aula15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        float n1 = in.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        float n2 = in.nextFloat();

        float media = (n1 + n2) / 2;

        if (media >= 7 && media < 10){
            System.out.println("Aprovado.");
        } else if (media == 10){
            System.out.println("Aprovado com Distinção.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
