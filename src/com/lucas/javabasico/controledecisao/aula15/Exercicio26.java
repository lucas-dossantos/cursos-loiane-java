package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio26 {

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
