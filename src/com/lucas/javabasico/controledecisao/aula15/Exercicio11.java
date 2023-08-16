package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio11 {

    /* As Organizações Tabajara decidiram dar um aumento salarial aos seus
funcionários e contratou você para desenvolver o programa que calculará
os reajustes.
。 Faça um programa que receba o salário de um funcionário e ajuste
de acordo com os seguintes critérios, com base no salário atual:
salários até R$ 280,00 (incluso): 20% de acréscimo
salários entre R$ 280,00 e R$ 700,00 15% de acréscimo
salários entre R$ 700,00 e R$ 1.500,00 10% de acréscimo
salários a partir de R$ 1.500,00 em diante aumento de 5% Após a
aumento for efetuado, informar na tela:
salário antes do reajuste;
o aumento percentual aplicado;
o valor do aumento;
o novo salário, após o aumento.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite quantia que será reajustada: ");
        float salario = in.nextFloat();

        float aumento = 0;

        if (salario < 280) {
            float percentual = 0.2f;
            aumento = (float) (salario * percentual);
            extratoReajuste(aumento,percentual,salario);
        } else if (salario >= 280 && salario < 700) {
            float percentual = 0.15f;
            aumento = (float) (salario * percentual);
            extratoReajuste(aumento,percentual,salario);
        } else if (salario >= 700 && salario < 1500) {
            float percentual = 0.1f;
            aumento = (float) (salario * percentual);
            extratoReajuste(aumento,percentual,salario);
        } else {
            float percentual = 0.05f;
            aumento = (float) (salario * percentual);
            extratoReajuste(aumento,percentual,salario);
        }
    }

    private static void extratoReajuste(float aumento, float percentual, float salario) {
        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.printf("Percentual de aumento aplicado: %.0f%n", (percentual * 100));
        System.out.printf("Valor do aumento: R$%.2f", aumento);
        System.out.printf("\nNovo salário: R$%.2f", (salario + aumento));
    }
}
