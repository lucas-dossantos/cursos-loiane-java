package com.lucas.javabasico.poo.aula25a27.exercicios.ex03;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteEx03 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Lucas Santos";
        aluno.matricula = 1;
        aluno.nomeCurso = "Java básico";
        aluno.disciplina = new String[3];
        aluno.disciplina[0] = "Estrutura de repetição";
        aluno.disciplina[1] = "POO";
        aluno.disciplina[2] = "Banco de dados";
        aluno.notas = new double[3];
        aluno.notas[0] = 7.5;
        aluno.notas[1] = 5.5;
        aluno.notas[2] = 8;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número da matrícula: ");
        int numMatricula = scan.nextInt();

        if (numMatricula == aluno.matricula) {

            boolean rodando = true;

            while (rodando) {

                System.out.println("""
                    -=-=-=-=-=-=-=-= MENU PRINCIPAL -=-=-=-=-=-=-=-=
                    
                    Selecione a sua opção:
                    
                    [1] Exibir disciplina e nota
                    [2] Exibir Status
                    [3] Sair""");
                System.out.print("==>");
                int opcao = scan.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("""
                                \n[0] Estrutura de repetiçaõ
                                [1] POO
                                [2] Banco de dados""");
                        int escolha = scan.nextInt();
                        System.out.println("\nDISCIPLINA: " + aluno.disciplina[escolha]);
                        System.out.println("NOTA:" + aluno.notas[escolha]);
                    }
                    case 2 -> {
                        double somaNotas = 0;
                        for (int i = 0; i < aluno.notas.length; i++) {
                            somaNotas += aluno.notas[i];
                        }
                        aluno.media = somaNotas / 3;
                        if (aluno.aprovado(aluno.media)) {
                            System.out.println("Aprovado.");
                        } else {
                            System.out.println("Rporvado.");
                        }
                    }
                    case 3 -> {
                        System.out.println("\nAté logo...");
                        rodando = false;
                    }
                    default -> System.out.println("\nOpção inválida.");
                }
            }
        } else {
            System.out.println("\nAluno não encontrado!");
        }
    }
}
