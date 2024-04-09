package Atividade03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, fatorial = 1;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if(num > 0){
            if(num == 0){
                System.out.println("Fatorial de 0: 1");
            }else{
                for(int i = num; i > 1; i--){
                    fatorial *= i;
                    System.out.println(fatorial);
                }
                System.out.println("Fatorial de " + num + ": " + fatorial);
            }    
        }else{
            System.out.println("Número negativo.");
        }
        sc.close();
    }
}
