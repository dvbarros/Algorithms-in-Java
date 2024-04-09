package Atividade04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        double montante = 0;
        System.out.println("Digite o valor investido: ");
        valor = sc.nextDouble();
        for(int i = 0; i < 10; i++){
            montante = valor * (1 + 0.05);
            valor = montante;
            
        }
        System.out.printf("Montante Final - R$: %.2f", montante);
        sc.close();
    }
}
