package Iniciante;

import java.util.Scanner;

/*================================================================
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si.

|------ Entrada ------|
A entrada contém valores inteiros.

|------ Saída ------|
A saída deve conter uma das mensagens conforme descrito acima.

|---- Exemplo de Entrada ----	Exemplo de Saída ----|
6 24                            Sao Multiplos
6 25                            Nao sao Multiplos
====================================================================*/

public class Multiplos_1044 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int a = teclado.nextInt();
    int b = teclado.nextInt();

    if (a % b == 0 || b % a == 0) {
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }
    teclado.close();
  }
}
