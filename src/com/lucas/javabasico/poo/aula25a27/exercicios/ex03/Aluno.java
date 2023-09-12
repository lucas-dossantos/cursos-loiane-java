package com.lucas.javabasico.poo.aula25a27.exercicios.ex03;

import java.util.Arrays;

public class Aluno {

    String nome;
    int matricula;
    String nomeCurso;
    String[] disciplina;
    double[] notas;
    double media;

    boolean aprovado(double media) {
        if (media >= 7) {
            return true;
        }
        return false;
    }

}
