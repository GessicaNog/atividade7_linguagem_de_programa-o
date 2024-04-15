package com.mycompany.atividade7;

public final class Aluno {

    private int matricula;
    private String nome;
    private double notaTrabalho;
    private double notaProva1;
    private double notaProva2;

    public Aluno(int matricula, String nome, double notaTrabalho, double notaProva1, double notaProva2) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setNotaProva1(notaProva1);
        this.setNotaProva2(notaProva2);
        this.setNotaTrabalho(notaTrabalho);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double notaTotal() {
        double total = getNotaProva1() + getNotaProva2() + getNotaTrabalho();
        return total;
    }

    public boolean isAprovado() {
        int totalDePontos = 10;
        int notaDeCortePorCento = 60;
        float minimoParaAprovacao = (notaDeCortePorCento * totalDePontos) / 100;
        double somatorioDasNotas = notaTotal();
        if (somatorioDasNotas >= minimoParaAprovacao) {
            return true;
        } else {
            return false;
        }

    }
}
