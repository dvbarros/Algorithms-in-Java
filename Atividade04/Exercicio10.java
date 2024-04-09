package Atividade04;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int soma = 0;
        int num;

        System.out.println("Digite um número : ");
        num = sc.nextInt();

        for(int i = 1, impar = 1; i <= num; i++, impar += 2){
            soma += impar;
        }
        System.out.println("O quadrado deste número é: " + soma);
        sc.close();
    }
}
