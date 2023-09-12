package com.lucas.javabasico.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    /*Escreva um programa que verifique se uma letra digitada é uma vogal ou uma
    consoante.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = in.next();

        char l = letra.toLowerCase().charAt(0);

        if (l >= 'a' && l <= 'z'){
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
                System.out.println("A letra informada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante.");
            }
        } else {
            System.out.println("A letra digita é inválida.");
        }
    }
}
