package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera_1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double calcularVolume = (4.0/3) * pi * Math.pow(raio, 3);
        System.out.println("VOLUME = " + deci.format(calcularVolume));
    }
}
