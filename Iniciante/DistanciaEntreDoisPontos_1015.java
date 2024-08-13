package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:
√(x2 - x1)² + (y2 - y1)²

----- Entrada -----
O arquivo de entrada contém duas linhas de dados.
A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

----- Saída -----
Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.
 */

public class DistanciaEntreDoisPontos_1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(deci.format(distancia));

    }
}
