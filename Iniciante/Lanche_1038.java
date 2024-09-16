package Iniciante;

import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

| Código    Especificação     Preço  |
|   1       CachorroQuente    R$4.00 |
|   2        X-salada         R$4.50 |
|   3        X-bacon          R$5.00 |
|   4        TorradaSimples   R$2.00 |
|   5        Refrigerante     R$1.50 |

|------ Entrada ------|
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

|------ Saída ------|
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

|---- Exemplo de Entrada ----	Exemplo de Saída ----|
          3 2                  Total: R$ 10.00
*/

public class Lanche_1038 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double[] preco = { 0, 4.00, 4.50, 5.00, 2.00, 1.50 };
    int entrada = teclado.nextInt();
    int quantidade = teclado.nextInt();

    double total = quantidade * preco[entrada];

    System.out.printf("Total: R$ %.2f%n", total);
  }
}
