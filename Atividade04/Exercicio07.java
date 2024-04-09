package Atividade04;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num [] = new int [5];
        System.out.println("Digite 5 números entre 1 e 30: ");
        for(int i = 0; i < 5; i++){
            int numero = sc.nextInt();
            if(numero >= 1 && numero <=30){
                num[i] = numero;
            }else{
                System.out.println("Número Inválido. Tente novamente.");
                i--;
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Número " + num[i] + ":");
            for(int j = 0; j < num[i]; j++){
                    System.out.println("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
