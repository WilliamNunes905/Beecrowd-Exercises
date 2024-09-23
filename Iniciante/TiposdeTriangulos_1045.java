package Iniciante;

import java.util.Scanner;

/* =================================================================================================
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A*2 = B*2 + C*2, apresente a mensagem: TRIANGULO RETANGULO
se A*2 > B*2 + C*2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A*2 < B*2 + C*2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

|------ Entrada ------|
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A), B (0 < B) e C (0 < C).

|------ Saída -------|
Imprima todas as classificações do triângulo especificado na entrada.
==================================================================================================== */

public class TiposdeTriangulos_1045 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double[] valores = new double[3];
    double a, b, c;

    for (int i = 0; i < valores.length; i++) {
      valores[i] = teclado.nextDouble();
    }

    double aux;
    for (int i = 0; i < valores.length; i++) {
      for (int j = 0; j < valores.length; j++) {
        if (valores[i] > valores[j]) {
          aux = valores[i];
          valores[i] = valores[j];
          valores[j] = aux;
        }
      }
    }
    a = valores[0];
    b = valores[1];
    c = valores[2];

    double A2 = a * a;
    double B2 = b * b;
    double C2 = c * c;


    if (a >= b + c) {
      System.out.println("NAO FORMA TRIANGULO");
    } else {
      if (A2 == B2 + C2) {
        System.out.println("TRIANGULO RETANGULO");
      }
      if (A2 > B2 + C2) {
        System.out.println("TRIANGULO OBTUSANGULO");
      }
      if (A2 < B2 + C2) {
        System.out.println("TRIANGULO ACUTANGULO");
      }

      if (a == b && b == c) {
        System.out.println("TRIANGULO EQUILATERO");
      } else if (a == b || b == c || a == c) {
        System.out.println("TRIANGULO ISOSCELES");
      }
    }
    teclado.close();
  }
}
