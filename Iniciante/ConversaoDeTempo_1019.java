package Iniciante;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

|----- Entrada -----|
O arquivo de entrada contém um valor inteiro N.

|----- Saída -----|
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada  ---	 Exemplo de Saída
    556                          0:9:16
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoDeTempo_1019 {
    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("0");
        Scanner scanner = new Scanner(System.in);

        int entrada = scanner.nextInt();
        int horas = entrada / 3600;
        int minutos = (entrada % 3600) / 60;
        int segundos = (entrada % 60);

        System.out.println(decimal.format(horas) + ":" + decimal.format(minutos) + ":" + decimal.format(segundos));
    }
}
