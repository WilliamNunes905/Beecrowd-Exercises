package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

----- Entrada -----
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

----- Saída -----
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

Exemplos de Entrada   -  	Exemplos de Saída
3.0 4.0 5.2                   TRIANGULO: 7.800
                              CIRCULO: 84.949
                              TRAPEZIO: 18.200
                              QUADRADO: 16.000
                              RETANGULO: 12.000
 */

public class Area_1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        final double PI = 3.14159;

        float areaTrianguloRetangulo = (A * C) /2;
        double areaCirculoDeRaio =  PI * C * C;
        float areaTrapezio = ((A + B) * C) / 2;
        double areaDoQuadrado = Math.pow(B, 2);
        float areaDoRetangulo = (A * B);
        System.out.println("TRIANGULO: " + deci.format(areaTrianguloRetangulo));
        System.out.println("CIRCULO: " + deci.format(areaCirculoDeRaio));
        System.out.println("TRAPEZIO: " + deci.format(areaTrapezio));
        System.out.println("QUADRADO: " + deci.format(areaDoQuadrado));
        System.out.println("RETANGULO: " + deci.format(areaDoRetangulo));
    }
}
