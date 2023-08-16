package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio27 {

    /* Uma fruteira está vendendo frutas com a seguinte tabela de preços:

		até 5kg			acima de 5kg

Morango		R$ 2,50 por quilo	R$ 2,20 por quilo
Maçã		R$ 1,80 por quilo	R$ 1,50 por quilo

Se o cliente comprar mais de 8 kg de fruta ou a compra total
preço ultrapassar R$ 25,00, ele também receberá um desconto de 10%
neste total. Escreva um algoritmo para ler a quantidade
(em Kg) de morangos e a quantidade (em Kg) de maçãs
comprado e escreva o valor a ser pago pelo cliente.*/

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
