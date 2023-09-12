package com.lucas.javabasico.poo.aula28a33.exercicios.ex03;

public class Aluno {

    private String nome;
    private int matricula;
    String nomeCUrso;
    String[] disciplaina;
    double[] nota;
    double media;

    public Aluno(String nome, int matricula, String nomeCUrso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCUrso = nomeCUrso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeCUrso() {
        return nomeCUrso;
    }

    public void setNomeCUrso(String nomeCUrso) {
        this.nomeCUrso = nomeCUrso;
    }

    public String[] getDisciplaina() {
        return disciplaina;
    }

    public void setDisciplaina(String[] disciplaina) {
        this.disciplaina = disciplaina;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }


    public boolean aprovado(double media) {
        if (media> 7) {
            return true;
        }
        return false;
    }
}
