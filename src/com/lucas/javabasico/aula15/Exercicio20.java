package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio20 {

    /* Faça um programa para ler três notas parciais de um aluno. O
programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", caso a média seja maior ou igual a
7, com a respetiva média alcançada;
O. A mensagem "Falhou", se a média for menor que 7, com o
respectiva média alcançada;
B. A mensagem "Aprovado com Distinções", se a média for igual a
10.*/

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
