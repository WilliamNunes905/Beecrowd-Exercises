package Iniciante;

import java.util.Scanner;

/*
Leia quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

----- Entrada -----
O arquivo de entrada contém 4 valores inteiros.

----- Saída -----
Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

public class Diferenca_1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = " + diferenca);
    }
}
