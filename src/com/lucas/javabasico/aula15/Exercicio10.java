package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio10 {

    /* Faça um Programa que pergunte em que turno você estuda. Perguntar a
digite M-Manhã ou V-Noite ou N-Noite. Imprimir a mensagem
"Bom Dia!", "Boa Tarde!" ou boa noite!" ou "Inválido
Valor!", conforme o caso.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("""
                \n
                Informe o turno em que você estuda:
                
                [M] Matutino
                [V] Vespertino
                [N] Noturno
                
                Sua opção:""");
        String opcao = in.next();

        switch (opcao){
            case "M" ->{
                System.out.println("Bom dia!");
            }
            case "m" ->{
                System.out.println("Bom dia!");
            }
            case "V" ->{
                System.out.println("Boa tarde!");
            }
            case "v" ->{
                System.out.println("Boa tarde!");
            }
            case "N" ->{
                System.out.println("Boa noite!");
            }
            case "n" ->{
                System.out.println("Boa noite!");
            }
            default -> System.out.println("Opção inválida!");
        }
    }
}
