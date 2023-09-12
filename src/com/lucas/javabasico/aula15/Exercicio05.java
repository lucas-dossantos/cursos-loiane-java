package com.lucas.javabasico.aula15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio05 {

    /* Escreva um programa para ler duas notas parciais de um aluno. O
programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", caso a média obtida seja maior ou
igual a sete;
○
A mensagem "Reprovado", se a média for menor que sete;
A mensagem "Aprovado com distinção", se a média for igual a
dez.*/

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
