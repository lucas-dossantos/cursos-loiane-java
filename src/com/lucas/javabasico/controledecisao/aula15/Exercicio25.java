package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        int cont = 0;

        System.out.println("Então vamos as peguntas.");

        System.out.print("""
                
                Telefonou para a vítima? 
                
                [1] SIM
                [2] NÃO
                
                Sua opção:""");
        opcao = input.nextInt();
        if (opcao == 1) {
            cont += 1;
        }

        System.out.print("""
                
                Esteve no local do crime? 
                
                [1] SIM
                [2] NÃO
                
                Sua opção:""");
        opcao = input.nextInt();
        if (opcao == 1) {
            cont += 1;
        }

        System.out.print("""
                
                Mora perto da vítima? 
                
                [1] SIM
                [2] NÃO
                
                Sua opção:""");
        opcao = input.nextInt();
        if (opcao == 1) {
            cont += 1;
        }

        System.out.print("""
                
                Devia para a vítima? 
                
                [1] SIM
                [2] NÃO
                
                Sua opção:""");
        opcao = input.nextInt();
        if (opcao == 1) {
            cont += 1;
        }

        System.out.print("""
                
                Já trabalhou com a vítima? 
                
                [1] SIM
                [2] NÃO
                
                Sua opção:""");
        opcao = input.nextInt();
        if (opcao == 1) {
            cont += 1;
        }

        if (cont == 2) {
            System.out.println("\nSuspeito.");
        } else if (cont == 3 || cont == 4) {
            System.out.println("\nCúmplice.");
        } else if (cont == 5) {
            System.out.println("\nAssassino.");
        } else {
            System.out.println("\nInocente.");
        }
    }
}
