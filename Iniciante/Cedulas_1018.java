package Iniciante;

import java.util.Scanner;

/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

|-------- Entrada -------|
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

|------- Saída -------|
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

|-----Exemplo de Entrada - Exemplo de Saída-----|
            576                  576
                      5 nota(s) de R$ 100,00
                      1 nota(s) de R$ 50,00
                      1 nota(s) de R$ 20,00
                      0 nota(s) de R$ 10,00
                      1 nota(s) de R$ 5,00
                      0 nota(s) de R$ 2,00
                      1 nota(s) de R$ 1,00
 */

public class Cedulas_1018 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int entrada = teclado.nextInt();
    int[] notas = {100, 50, 20, 10, 5, 2, 1};
    int[] quantidadeNotas = new int[notas.length];

    System.out.println(entrada);

    for (int i=0; i < notas.length; i++) {
      quantidadeNotas[i] = entrada / notas[i];
      entrada = entrada % notas[i];
    }

    for (int i = 0; i < notas.length; i++) {
      System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
    }
  }
}
