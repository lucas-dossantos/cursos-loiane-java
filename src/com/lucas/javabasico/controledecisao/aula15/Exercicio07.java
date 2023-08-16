package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = in.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = in.nextInt();
        System.out.print("Digite o 3º número: ");
        int n3 = in.nextInt();

        int maior = n1;
        int menor = n1;

        if (n2 > n1 || n3 > n1) {
            maior = n2;
            if (n3 > n2){
                maior = n3;
            }
        }

        if (n2 < n1 || n3 < n1){
            menor =n2;
            if (n3 < n2){
                menor = n3;
            }
        }

        System.out.print("O maior número digitado foi: " + maior);
        System.out.print("\nO menor número digitado foi: " + menor);
    }
}
