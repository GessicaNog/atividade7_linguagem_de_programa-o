package com.mycompany.atividade7;

public class Hora {

    private int horas;
    private int minutos;
    private int segundos;

    public Hora(String hora) {
        try {
            String[] vetHora = hora.split(":");
            int horas = Integer.parseInt(vetHora[0]);
            int minutos = Integer.parseInt(vetHora[1]);
            int segundos = Integer.parseInt(vetHora[2]);

            if (horas > 23 || horas < 0 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
                this.horas = 0;
                this.minutos = 0;
                this.segundos = 0;

            } else {
                this.horas = horas;
                this.minutos = minutos;
                this.segundos = segundos;
            }
        } catch (Exception e) {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public int compara(Hora hora) {
        if (this.segundos == hora.segundos && this.minutos == hora.minutos && this.horas == hora.horas) {
            return 0;

        } else {
            return (this.horas * 60 * 60 + this.minutos * 60 + this.segundos) - (hora.horas * 60 * 60 + hora.minutos * 60 + hora.segundos);
        }
    }

    public int getHora() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getsegundos() {
        return segundos;
    }

    public String getDisplayHora() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }
}
