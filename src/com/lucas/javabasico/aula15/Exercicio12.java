package com.lucas.javabasico.aula15;

import java.util.Scanner;

public class Exercicio12 {

    /* Faça um programa para calcular uma folha de pagamento, sabendo que
os descontos são do Imposto de Renda, que depende da salário bruto (conforme tabela abaixo) e 3% para a União e
que o FGTS corresponde a 11% do salário bruto, mas não é
deduzido (é a empresa que deposita). Salário Líquido corresponde a
Salário bruto menos descontos. O programa deve solicitar ao usuário
a taxa horária e o número de horas trabalhadas no mês.
desconto IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - 5% de desconto
Salário Bruto até 2500 (inclusive) - 10% de desconto
Salário Bruto acima de 2500 - 20% de desconto Imprima a informação em
na tela, dispostos de acordo com o exemplo abaixo. Em
No exemplo, o valor da hora é 5 e o valor da hora é 220.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\nInforme o valor da hora trabalhada: ");
        double valorHora = in.nextDouble();
        System.out.print("\nInforme a quantidade de horas trabalhadas no mês: ");
        double qtdHoras = in.nextDouble();

        double salarioBruto = qtdHoras * valorHora;
        double percFgts = 0.11;
        double percInss = 0.10;

        if (salarioBruto <= 900) {
            double percIr = 0;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)   : R$%.2f", valorHora, qtdHoras, salarioBruto);
            System.out.printf("\n(-) IR (isento)               : R$%.2f", salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            double percIr = 0.05;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)   : R$%.2f", valorHora, qtdHoras, salarioBruto);
            System.out.printf("\n(-) IR (%.0f)                    : R$%.2f", percIr * 100, salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            double percIr = 0.10;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)  : R$%.2f", valorHora, qtdHoras, salarioBruto);
            System.out.printf("\n(-) IR (%.0f)                   : R$%.2f", percIr * 100, salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        } else if (salarioBruto > 2500) {
            double percIr = 0.20;
            System.out.printf("\nSalário bruto: (%.0f * %.2f)  : R$%.2f", valorHora, qtdHoras, salarioBruto);
            System.out.printf("\n(-) IR (%.0f)                   : R$%.2f", percIr * 100,salarioBruto * percIr);
            System.out.printf("\n(-) INSS (%.0f)                 : R$%.2f", percInss * 100, salarioBruto * percInss);
            System.out.printf("\nFGTS (%.0f)                     : R$%.2f", percFgts * 100, salarioBruto * percFgts);
            System.out.printf("\nTotal de descontos            : R$%.2f", (salarioBruto * percIr) + (salarioBruto * percInss));
            System.out.printf("\nSalário líquido               : R$%.2f", salarioBruto - ((salarioBruto * percIr) + (salarioBruto * percInss)));
        }
    }
}
