package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\nInforme o valor da hora trabalhada: ");
        double valorHora = in.nextDouble();
        System.out.print("\nInforme a quantidade de horas trabalhadas no mês: ");
        double horaTrabalhada = in.nextDouble();

        double salarioBruto = horaTrabalhada * valorHora;
        double percFgts = 0.11;
        double percInss = 0.10;

        if (salarioBruto <= 900) {
            double percIr = 0;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)   : R$%.2f", valorHora, horaTrabalhada, salarioBruto);
            System.out.printf("\n(-) IR (isento)               : R$%.2f", salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            double percIr = 0.05;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)   : R$%.2f", valorHora, horaTrabalhada, salarioBruto);
            System.out.printf("\n(-) IR (%.0f)                    : R$%.2f", percIr * 100, salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            double percIr = 0.10;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)  : R$%.2f", valorHora, horaTrabalhada, salarioBruto);
            System.out.printf("\n(-) IR (%.0f)                   : R$%.2f", percIr * 100, salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        } else if (salarioBruto > 2500) {
            double percIr = 0.20;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)  : R$%.2f", valorHora, horaTrabalhada, salarioBruto);
            System.out.printf("\n(-) IR (%.0f)                   : R$%.2f", percIr * 100,salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        }
    }
}
