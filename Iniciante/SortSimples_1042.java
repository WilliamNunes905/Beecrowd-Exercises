package Iniciante;

import java.util.Arrays;
import java.util.Scanner;

/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente,
uma linha em branco e em seguida, os valores na sequência como foram lidos.

|------ Entrada ------|
A entrada contem três números inteiros.

|------ Saída ------|
Imprima a saída conforme foi especificado.

|---- Exemplo de Entrada ----	Exemplo de Saída ----|
7 21 -14                           -14
                                    7
                                    21

                                    7
                                    21
                                   -14
*/

public class SortSimples_1042 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] valores = new int[3];

    for (int i=0;i < 3 ; i++) {
      valores[i] = scanner.nextInt();
    }

    int[] copiaValores = Arrays.copyOf(valores, valores.length);
    Arrays.sort(copiaValores);

    for (int copia : copiaValores) {
      System.out.println(copia);
    }
    System.out.println();
    for (int padrao : valores) {
      System.out.println(padrao);
    }

    scanner.close();
  }
}
