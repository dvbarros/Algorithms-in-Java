package Atividade03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main (String arg []){
        Scanner sc = new Scanner (System.in);
        int tamanho;
        System.out.println("Digite o tamanho do lado do quadrado: ");
        tamanho = sc.nextInt();
        if(tamanho > 1 && tamanho <= 20){
            for (int i = 0; i < tamanho; i++){
                for (int j = 0; j < tamanho; j++) {
                    if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
                        System.out.print("* "); // Imprime asterisco nas bordas
                    } else {
                        System.out.print("  "); // Imprime espaços internos
                    }
                }
                System.out.println(); 
            }
        }else{
            System.out.println("Tamanho Inválido.");
        }
        sc.close();
    }
}
