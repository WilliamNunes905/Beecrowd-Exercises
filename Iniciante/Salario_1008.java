package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

----- Entrada -----
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número,
quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

----- Saída -----
Imprima o número e o salário do funcionário, conforme exemplo fornecido,
com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

Exemplos de Entrada	Exemplos de Saída
Entrada: 25     Saída: NUMBER = 25
Entrada: 100    Saída: SALARY = U$ 550.00
Entrada: 5.50
 */

public class Salario_1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        int numeroFuncionario = scanner.nextInt();
        int salario = scanner.nextInt();
        double horasExtras = scanner.nextDouble();

        double salarioTotal = salario * horasExtras;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + deci.format(salarioTotal));
    }
}
