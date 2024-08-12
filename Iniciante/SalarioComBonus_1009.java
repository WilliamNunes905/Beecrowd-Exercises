package Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioComBonus_1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        String nome = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double montante = vendas * 0.15;
        double salarioFinal = salario + montante;

        System.out.println("TOTAL = R$ " + deci.format(salarioFinal));
    }
}
