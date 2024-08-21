package Iniciante;

import java.util.Scanner;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

|----- Entrada -----|
O arquivo de entrada contém um valor inteiro.

|----- Saída -----|
Imprima a saída conforme exemplo fornecido.

|-- Exemplo de Entrada	Exemplo de Saída --|
        400                1 ano(s)
                           1 mes(es)
                           5 dia(s)
 */

public class IdadeEmDias_1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorEntrada = scanner.nextInt();

        int diasEmAno = 365;
        int diasEmMes = 30;
        boolean isTrue = true;

        int calculoDosAnos = valorEntrada / diasEmAno;
        System.out.println(calculoDosAnos + " ano(s)");


        if (valorEntrada > diasEmAno) {
            valorEntrada -= diasEmAno;
            if (valorEntrada > diasEmAno) {
                valorEntrada -= diasEmAno;
            }
        }
        if (valorEntrada >= diasEmMes) {
            int calculoDosMeses = valorEntrada / diasEmMes;
            System.out.println(calculoDosMeses + " mes(es)");
            valorEntrada -= diasEmMes;

            while (isTrue) {
                if (valorEntrada > diasEmMes) {
                    valorEntrada -= diasEmMes;
                }
                if (valorEntrada < diasEmMes) {
                    System.out.println(valorEntrada + " dia(s)");
                    isTrue = false;
                }
            }
        }
    }
}
