package com.mycompany.atividade7;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(String data) {
        try {
            String[] vetData = data.split("/");
            int dia = Integer.parseInt(vetData[0]);
            int mes = Integer.parseInt(vetData[1]);
            int ano = Integer.parseInt(vetData[2]);

            if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;

            } else {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        } catch (Exception e) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;

        }
    }

    public int compara(Data data) {
        if (this.ano == data.ano && this.mes == data.mes && this.dia == data.dia) {
            return 0;
        } else if (this.ano > data.ano || this.mes > data.mes || this.dia > data.dia) {
            return 1;
        }
        return -1;

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getMesExtenso() {
        if (mes == 1) {
            return "janeiro";
        } else if (mes == 2) {
            return "fevereiro";
        } else if (mes == 3) {
            return "março";
        } else if (mes == 4) {
            return "abril";
        } else if (mes == 5) {
            return "maio";
        } else if (mes == 6) {
            return "junho";
        } else if (mes == 7) {
            return "julho";
        } else if (mes == 8) {
            return "agosto";
        } else if (mes == 9) {
            return "setembro";
        } else if (mes == 10) {
            return "outubro";
        } else if (mes == 11) {
            return "novembro";
        } else if (mes == 12) {
            return "dezembro";
        }
        return "";
    }
}
