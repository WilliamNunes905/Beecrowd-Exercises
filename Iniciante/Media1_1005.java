package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media1_1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00000");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double pesoA = 3.5;
        double pesoB = 7.5;
        double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);
        System.out.println("MEDIA = " + decimal.format(media));
    }
}
