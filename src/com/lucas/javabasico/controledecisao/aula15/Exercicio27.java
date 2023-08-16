package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorMorango = 0;
        double valorMaca = 0;

        System.out.print("Quantidade em Kg de morango: ");
        double morango = input.nextDouble();
        System.out.print("Quantidade em Kg de maçãs: ");
        double maca = input.nextDouble();

        if (morango > 5) {
            valorMorango = morango * 2.5;
        } else {
            valorMorango = morango * 2.2;
        }

        if (maca > 5) {
            valorMaca = maca * 1.8;
        } else {
            valorMaca = maca * 1.5;
        }

        double totalCompra = valorMorango + valorMaca;

        if (totalCompra > 25) {
            double desc = totalCompra * 0.1;
            totalCompra -= desc;
        }

        System.out.printf("\nTotal da Compra: R$%.2f", totalCompra);

    }


}