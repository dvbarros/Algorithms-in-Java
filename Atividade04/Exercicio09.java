package Atividade04;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que você deseja alcançar: ");
        double limite;
        limite = sc.nextDouble();
        double base = 1e9;
        int contador = 0;
        while(base < limite){
            base *= 1.04;
            contador++;
        }
        System.out.printf("Daqui %d meses alcaçará %.2f", contador, limite);
        sc.close();
    }
}
