package Iniciante;

import java.util.Scanner;

/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

|------ Entrada ------|
A entrada contém três valores reais.

|------ Saída ------|
O resultado deve ser apresentado com uma casa decimal.

|------ Exemplo de Entrada ----	Exemplo de Saída ------|
6.0 4.0 2.0                         Area = 10.0
6.0 4.0 2.1                         Perimetro = 12.1
 */

public class Triangulo_1043 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double perimetro;
    double trapezio;

    if (a + b > c && b + c > a && a + c > b) {
      perimetro = a + b + c;
      System.out.printf("Perimetro = %.1f%n", perimetro);
    } else {
      trapezio = ((a + b) * c) / 2;
      System.out.printf("Area = %.1f%n", trapezio);
    }
  }
}
