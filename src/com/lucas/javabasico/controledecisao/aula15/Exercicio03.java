package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio03 {

    /* Escreva um programa que verifique se uma letra digitada é "F" ou
    "M". Conforme a letra escreva: F - Feminino, M - Masculino, Sexo Inválido.*/
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Informe seu sexo (M/F): ");
        String s = in.next();

        if (s.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        } else if (s.equalsIgnoreCase("f")){
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}
