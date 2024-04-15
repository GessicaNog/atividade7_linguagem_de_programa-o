package com.mycompany.atividade7;

public class NumeroInteiro {

    private int numero;

    public NumeroInteiro() {
        this.numero = 0;
    }

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public void soma(int numero) {
        this.numero = this.numero + numero;
    }

    public void subtrai(int numero) {
        this.numero = this.numero - numero;
    }

    public boolean isPrimo() {
        if (this.numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= this.numero; i++) {
            if (this.numero % i == 0) {
                return false;
            }

        }
        return true;
    }

    public int getNextPrimo() {
        boolean achou = false;
        int proximoPrimo = 0;
        for (int i = this.numero + 1; !achou; i++) {
            NumeroInteiro numeroAtual = new NumeroInteiro(i);
            if (numeroAtual.isPrimo()) {
                achou = true;
                proximoPrimo = i;
            }
        }
        return proximoPrimo;
    }
    public int getNumero(){
      return this.numero ; 
    }
}
