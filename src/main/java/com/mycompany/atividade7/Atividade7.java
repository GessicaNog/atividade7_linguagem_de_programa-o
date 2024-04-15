package com.mycompany.atividade7;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("------------------------ ATIVIDADE 1----------------------------\n");
        System.out.println("Digite a matricula do aluno: ");
        int matricula = ler.nextInt();

        ler.nextLine();

        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();

        System.out.println("Digite a nota do trabalho: ");
        double notaTrabalho = Double.parseDouble(ler.nextLine());

        System.out.println("Digite a nota da Prova 1: ");
        double notaprova1 = Double.parseDouble(ler.nextLine());

        System.out.println("Digite a nota da Prova 2: ");
        double notaprova2 = Double.parseDouble(ler.nextLine());

        Aluno aluno = new Aluno(matricula, nome, notaTrabalho, notaprova1, notaprova2);
        System.out.println("Nota Total do  Aluno: " + aluno.notaTotal());
        if (aluno.isAprovado()) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("------------------------ ATIVIDADE 2----------------------------\n");
        System.out.println("Informe a data 1 no formto DD/MM/AAAA: ");
        String data1Digitada = ler.nextLine();
        
         System.out.println("Informe a data 2 no formto DD/MM/AAAA: ");
        String data2Digitada = ler.nextLine();
        
        Data data1 = new Data(data1Digitada);
        Data data2 = new Data(data2Digitada);

        System.out.println("Dia da data 1: " + data1.getDia());
        System.out.println("Mes da data 1 por extenso: " + data1.getMesExtenso());
        System.out.println("Ano da data 1: " + data1.getAno());
        System.out.println("Dia da data 2: " + data2.getDia());
        System.out.println("Mes da data 2 por extenso: " + data2.getMesExtenso());
        System.out.println("Ano da data 2: " + data1.getAno());

        if (data1.compara(data2) == 1) {

            System.out.println("A data 1 é posterior a data 2.");
        } else if (data2.compara(data1) == 1) {
            System.out.println("A data 2 é posterior a data 1. ");
        } else {
            System.out.println("As datas são iguais.");
        }

        System.out.println("------------------------ ATIVIDADE 3 ----------------------------\n");
        System.out.println("Informe a hora 1 no formto HH:MM:SS :  ");
        String hora1Digitada = ler.nextLine();
        
         System.out.println("Informe a hora 2 no formto HH:MM:SS :  ");
        String hora2Digitada = ler.nextLine();
        
        Hora primeraHora = new Hora(hora1Digitada);
        Hora segundaHora = new Hora(hora2Digitada);

        System.out.println("H da primeira hora informada : " + primeraHora.getHora());
        System.out.println("Min da primeira hora informada: " + primeraHora.getMinutos());
        System.out.println("seg da primeira hora informada: " + primeraHora.getsegundos());
        System.out.println("Display Hora da primeira hora:" + primeraHora.getDisplayHora());
        System.out.println("H da segunda hora informada : " + segundaHora.getHora());
        System.out.println("Min da segunda hora informada: " + segundaHora.getMinutos());
        System.out.println("Seg da segunda hora informada: " + segundaHora.getsegundos());
        System.out.println("Display Hora da segunda hora:" + segundaHora.getDisplayHora());

        System.out.println("------------------------ ATIVIDADE 4 ----------------------------\n");
        
         System.out.println("Informe a data do voo no formto DD/MM/AAAA:  ");
        String dataVoo = ler.nextLine();
         System.out.println("Informe a hora do voo no formto HH:MM:SS :   ");
        String horaVoo = ler.nextLine();
         System.out.println("Informe o numero  do voo :  ");
        int numeroVoo = ler.nextInt();
         System.out.println("Informe o numero da cadeira:  ");
        int numerocadeira = ler.nextInt();
        
        
        Data dataDoVoo = new Data(dataVoo);
        Hora horaDoVoo = new Hora(horaVoo);
        Voo voo1 = new Voo(dataDoVoo, numeroVoo, horaDoVoo);
        System.out.println("Verificando cadeira...");
        if (voo1.ocupa(numerocadeira)) {
            System.out.println("Cadeira ocupada com sucesso");
        } else {
            System.out.println("Cadeira ja ocupada");
        }
        System.out.println("Verificando cadeira...");
        if (voo1.ocupa(numerocadeira)) {
            System.out.println("Cadeira ocupada com sucesso");
        } else {
            System.out.println("Cadeira ja ocupada");
        }
        System.out.println("Numero de cadeiras livres: " + voo1.vagas());

        System.out.println("------------------------ ATIVIDADE 5 ----------------------------\n");
        
        System.out.println("Informe um numero inteiro: ");
        int numeroDigitado = ler.nextInt();
        NumeroInteiro numero = new NumeroInteiro(numeroDigitado);
        System.out.println("O proximo numero primo é:  " + numero.getNextPrimo());
        if (numero.isPrimo() == true) {
            System.out.println("O numero informado é primo.");
        } else {
            System.out.println("O numero informado não é primo.");
        }
        numero.soma(10);
        System.out.println("a soma do numero com 10 é: " +numero.getNumero() );
        
        numero.subtrai(5);
        System.out.println("a subtração de 5 do numero é: " +numero.getNumero() );
    }
}
