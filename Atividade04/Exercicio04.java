package Atividade04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int limite;
        int menor = 0;
        System.out.println("Quantos números serão digitados ?");
        limite = sc.nextInt();

        int valores [] = new int [limite];

        for(int i = 0; i < limite; i++){
            valores[i] = sc.nextInt();
        }
        menor = valores[0];
        for(int i = 0; i < limite; i++){
            if(valores[i] < menor ){
                menor = valores[i];
            }
        }
        System.out.println("Menor valor: " + menor);
        sc.close();
        
    }
}
