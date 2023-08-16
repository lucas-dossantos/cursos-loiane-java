package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio26 {

    /*Um posto de gasolina está vendendo combustível com o seguinte desconto
mesa:
Álcool:
O. até 20 litros, 3% de desconto por litro
B. acima de 20 litros, 5% de desconto por litro
Gasolina:
c. até 20 litros, 4% de desconto por litro
d. acima de 20 litros, 6% de desconto por litro Escreva um algoritmo
que lê o número de litros vendidos, o tipo de combustível
(codificado da seguinte forma: A-álcool, G-gasolina), calcula
e imprime o valor a ser pago para o cliente saber
que o preço do litro da gasolina é R$ 2,50, o preço do
o litro de álcool custa R$ 1,90*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("""
                
                Qual o combústivel deseja abastecer:
                
                [1] Álcool
                [2] Gasolina
                
                Sua opção:""");
        int opcao = input.nextInt();

        System.out.print("Informe a quantidade em litros: ");
        double quantLitro = input.nextDouble();

        switch (opcao) {
            case 1 ->{
                valorAlcool(quantLitro);
            }
            case 2 -> {
                valorGasolina(quantLitro);
            }
            default -> {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static void valorGasolina(double quantLitro) {
        if (quantLitro < 20){
            double valorBruto = quantLitro * 2.5;
            double desc = valorBruto * 0.04;
            System.out.println("Total: R$" + (valorBruto - desc));
        } else {
            double valorBruto = quantLitro * 2.5;
            double desc = valorBruto * 0.06;
            System.out.println("Total: R$" + (valorBruto - desc));
        }
    }

    private static void valorAlcool(double quantLitro) {
        if (quantLitro < 20){
            double valorBruto = quantLitro * 1.9;
            double desc = valorBruto * 0.03;
            System.out.println("Total: R$" + (valorBruto - desc));
        } else {
            double valorBruto = quantLitro * 1.9;
            double desc = valorBruto * 0.05;
            System.out.println("Total: R$" + (valorBruto - desc));
        }
    }
}
