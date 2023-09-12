package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio14 {

    /* Escreva um programa que leia as duas notas parciais obtidas por um aluno em
um curso ao longo de um semestre e calcula sua média.

O algoritmo deve mostrar na tela as notas, a média,
a nota correspondente e a mensagem "APROVADO" se
a nota é A, B ou C ou "REPROVADO" se a nota for D ou E.*/

    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Insira aprimeira nota: ");
        double n1 = input.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double n2 = input.nextDouble();

        double m = (n1 + n2) / 2;

        if (m >= 9){
            System.out.println("Nota 1: " + n1);
            System.out.println("Nota 2: " + n2);
            System.out.println("Média de aproveitamento: " + m);
            System.out.println("Nota: A");
            System.out.println("APROVADO!");
        } else if (m < 9 && m >= 7.5) {
            System.out.println("Nota 1: " + n1);
            System.out.println("Nota 2: " + n2);
            System.out.println("Média de aproveitamento: " + m);
            System.out.println("Nota: B");
            System.out.println("APROVADO!");
        } else if (m < 7.5 && m >= 6) {
            System.out.println("Nota 1: " + n1);
            System.out.println("Nota 2: " + n2);
            System.out.println("Média de aproveitamento: " + m);
            System.out.println("Nota: C");
            System.out.println("APROVADO!");
        } else if (m < 6 && m >= 4) {
            System.out.println("Nota 1: " + n1);
            System.out.println("Nota 2: " + n2);
            System.out.println("Média de aproveitamento: " + m);
            System.out.println("Nota: D");
            System.out.println("REPROVADO!");
        } else {
            System.out.println("Nota 1: " + n1);
            System.out.println("Nota 2: " + n2);
            System.out.println("Média de aproveitamento: " + m);
            System.out.println("Nota: E");
            System.out.println("REPROVADO!");
        }
    }
}
