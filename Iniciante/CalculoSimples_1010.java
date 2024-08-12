package Iniciante;

import java.util.Scanner;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

----- Entrada -----
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

----- Saída -----
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
O valor deverá ser apresentado com 2 casas após o ponto.
 */

public class CalculoSimples_1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt();
        int quantidade1 = scanner.nextInt();
        double valorUnitario1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int quantidade2 = scanner.nextInt();
        double valorUnitario2 = scanner.nextDouble();

        double total = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
