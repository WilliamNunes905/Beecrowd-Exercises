package Iniciante;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class FormulaDeBhaskara_1036 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat decimal = new DecimalFormat("0.00000");
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();

    double delta = Math.pow(b, 2) - 4 * a * c;

    if (delta < 0 || a == 0) {
      System.out.println("Impossível calcular");
    } else {
      double r1 = (-b + Math.sqrt(delta)) / (2 * a);
      double r2 = (-b - Math.sqrt(delta)) / (2 * a);

      System.out.println("R1 = " + decimal.format(r1));
      System.out.println("R2 = " + decimal.format(r2));
    }
  }
}
