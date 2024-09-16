package Iniciante;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto,
ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

|------ Entrada ------|
A entrada contem as coordenadas de um ponto.

|------ Saída ------|
A saída deve apresentar o quadrante em que o ponto se encontra.

|---- Exemplo de Entrada ---- Exemplo de Saída ----|
4.5 -2.2                             Q4
0.1 0.1                              Q1
0.0 0.0                            Origem
 */

import java.util.Scanner;

public class CoordenadasDeUmPonto_1041 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double coordenada1 = teclado.nextDouble();
    double coordenada2 = teclado.nextDouble();

    if (coordenada1 > 0 && coordenada2 > 0) {
      System.out.println("Q1");
    } else if (coordenada1 < 0 && coordenada2 > 0) {
      System.out.println("Q2");
    } else if (coordenada1 < 0 && coordenada2 < 0) {
      System.out.println("Q3");
    } else if (coordenada1 > 0 && coordenada2 < 0) {
      System.out.println("Q4");
    } else if (coordenada1 == 0 && coordenada2 != 0) {
      System.out.println("Eixo Y");
    } else if (coordenada1 != 0 && coordenada2 == 0) {
      System.out.println("Eixo X");
    } else {
      System.out.println("Origem");
    }
  }
}
