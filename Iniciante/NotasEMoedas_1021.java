package Iniciante;

import java.util.Scanner;

public class NotasEMoedas_1021 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double entrada = teclado.nextDouble();
    int resultado;

    System.out.println("NOTAS:");
    resultado = (int) entrada/100;
    System.out.println(resultado + " nota(s) de R$ 100.00");

    entrada = entrada % 100;
    resultado = (int) entrada/50;
    System.out.println(resultado + " nota(s) de R$ 50.00");

    entrada = entrada % 50;
    resultado = (int) entrada/20;
    System.out.println(resultado + " nota(s) de R$ 20.00");

    entrada = entrada % 20;
    resultado = (int) entrada/10;
    System.out.println(resultado + " nota(s) de R$ 10.00");

    entrada = entrada % 10;
    resultado = (int) entrada/5;
    System.out.println(resultado + " nota(s) de R$ 5.00");

    entrada = entrada % 5;
    resultado = (int) entrada/2;
    System.out.println(resultado + " nota(s) de R$ 2.00");

    entrada = entrada % 2;
    entrada = entrada*100;

    System.out.println("MOEDAS:");
    resultado = (int) entrada/100;
    System.out.println(resultado + " moeda(s) de R$ 1.00");

    entrada = entrada%100;
    resultado = (int) entrada/50;
    System.out.println(resultado + " moeda(s) de R$ 0.50");

    entrada = entrada%50;
    resultado = (int) entrada/25;
    System.out.println(resultado + " moeda(s) de R$ 0.25");

    entrada = entrada%25;
    resultado = (int) entrada/10;
    System.out.println(resultado + " moeda(s) de R$ 0.10");

    entrada = entrada%10;
    resultado = (int) entrada/5;
    System.out.println(resultado + " moeda(s) de R$ 0.05");

    entrada = entrada%5;
    resultado = (int) entrada;
    System.out.println(resultado + " moeda(s) de R$ 0.01");
  }
}
