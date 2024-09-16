package Iniciante;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes,
mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

|----- Entrada -----|
Leia três valores de ponto flutuante (double) A, B e C.

|----- Saída -----|
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem.

|---- Exemplos de Entrada ----	Exemplos de Saída ----|
10.0 20.1 5.1                   R1 = -0.29788
                                R2 = -1.71212

0.0 20.0 5.0                    Impossivel calcular
 */

public class FormulaDeBhaskara_1036 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat decimal = new DecimalFormat("0.00000");
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();

    double delta = Math.pow(b, 2) - 4 * a * c;

    if (delta < 0 || a == 0) {
      System.out.println("Impossível calcular");
    } else {
      double r1 = (-b + Math.sqrt(delta)) / (2 * a);
      double r2 = (-b - Math.sqrt(delta)) / (2 * a);

      System.out.println("R1 = " + decimal.format(r1));
      System.out.println("R2 = " + decimal.format(r2));
    }
  }
}
