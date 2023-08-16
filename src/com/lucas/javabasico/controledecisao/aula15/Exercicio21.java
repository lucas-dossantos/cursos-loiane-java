package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio21 {

    /* Faça um programa para um caixa eletrônico. O programa deve perguntar ao usuário
o valor do saque e depois informar quantas cédulas de
cada valor será fornecido. As notas disponíveis serão 1, 5, 10, 50
e 100 reais. O valor mínimo é de R$ 10 e o máximo
é de R$ 600. O programa não deve se preocupar com a quantidade de
notas na máquina.
Exemplo 1: Para sacar o valor de 256 reais,
o programa fornece duas notas de 100, uma nota de 50, uma nota de 5
e uma nota de 1;
O. Exemplo 2: Para sacar o valor de 399 reais,
o programa fornece três notas de 100, uma nota de 50, quatro notas de 10
notas, uma nota de 5 e quatro notas de 1.*/

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a valor que deseja sacar: ");
        int v = input.nextInt();

        int n100 = Math.round(v / 100);
        int n50 = 0;
        int n10 = Math.round((v - (n100 * 100)) / 10);
        int n5 = 0;
        int n1 = Math.round(v - (n10 * 10 + n100 * 100));

        if (n10 > 4) {
            n50 = 1;
            n10 = n10 - 5;
        }
        if (n1 > 4) {
            n5 = 1;
            n1 = n1 - 5;
        }

        System.out.printf("Para sacar %d o caixa irá fornecer %d nota(s) de 100, %d nota(s) de 50," +
                "%d nota(s) de 10, %d nota(s) de 5 e %d nota(s) de 1.",v, n100, n50, n10, n5, n1);
    }
}
