package Iniciante;

import java.util.Scanner;

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula:
maiorAB = (a+b +abs(a-b)) /2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

public class Omaior_1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = scanner.nextInt();
        int local;

        if (a > b) {
            local = a;
        } else {
            local = b;
        }
        if (local > s) {
            System.out.println(local + " eh o maior");
        } else {
            System.out.println(s + " eh o maior");
        }
    }
}
