package com.mycompany.atividade7;

public class Voo {

    private Data dataDoVoo;
    private int numeroDoVoo;
    private Hora hora;
    private int[] assentos = new int[100];

    public Voo(Data data, int numeroDoVoo, Hora hora) {
        this.dataDoVoo = data;
        this.numeroDoVoo = numeroDoVoo;
        this.hora = hora;

    }

    public boolean verifica(int numeroCadeira) {
        if (assentos[numeroCadeira - 1] == 0) {
            return true;
        } else {
            return false;
        }

    }

    public int proximoLivre() {
        for (int i = 0; i < assentos.length; i++) {
            if (assentos[i] == 0) {
                return i + 1;
            }
        }
        return -1;
    }

    public int vagas() {
        int totalLivres = 0;
        for (int i = 0; i < assentos.length; i++) {
            if (assentos[i] == 0) {
                totalLivres++;
            }
        }
        return totalLivres;
    }

    public boolean ocupa(int numeroCadeira) {
        if (verifica(numeroCadeira)) {
            assentos[numeroCadeira - 1] = 1;
            return true;
        } else {
            return false;
        }
    }
    public int  getVoo(){
        return numeroDoVoo;
    }
    public Data  getData(){
        return dataDoVoo;
    }
}
