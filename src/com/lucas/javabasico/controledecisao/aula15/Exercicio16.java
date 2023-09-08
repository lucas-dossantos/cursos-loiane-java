package com.lucas.javabasico.controledecisao.aula15;

import java.util.Scanner;

public class Exercicio16 {

    /* Escreva um programa que calcule as raízes de uma equação quadrática, em
a forma ax2 + bx + c. O programa deve pedir os valores de a, b
e c e fazer consistência, informando o usuário no seguinte
situações:
O. Se o usuário informar o valor de A igual a zero, a equação é
não de segundo grau e o programa não deve pedir o outro
valores, sendo assim fechados;
B. Se o delta calculado for negativo, a equação não tem real
raízes. Informar o usuário e encerrar o programa;
c. Se o delta calculado for igual a zero, a equação terá apenas
uma raiz real; reportar ao usuário;
d. Se o delta for positivo, a equação tem duas raízes reais;
comunicá-los ao usuário;*/



    public static void main(String[] main){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de a: ");
        double a = input.nextInt();

        if (a == 0){
            System.out.println("A equação não será de segundo grau.");
            return;
        }

        System.out.print("Informe o valor de b: ");
        double b = input.nextInt();
        System.out.print("Informe o valor de c: ");
        double c = input.nextInt();

        double delta = b * b - 4 * a * c;

        if (delta < 0 ) {
            System.out.println("A equação não possui rízas reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A raiz dupla é x = " + x);
        } else {
            System.out.println(delta);
            double x1 = ((- b) + Math.sqrt(delta) / (2 * a));
            double x2 = ((- b) - Math.sqrt(delta) / (2 * a));
            System.out.println("As raízes são: \nx1 = " + x1 + "\nx2 = " + x2);
        }
    }
}
