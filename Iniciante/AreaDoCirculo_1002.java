package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

------ Entrada ------
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

------ Saída -------
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).
Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

public class AreaDoCirculo_1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");
        double n = 3.14159;
        double raio = scanner.nextDouble();

        double area = (n * Math.pow(raio, 2));
        System.out.println("A=" + deci.format(area));
    }
}
