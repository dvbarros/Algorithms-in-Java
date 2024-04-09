package Atividade03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km, litro; 
        int kmTotal = 0;
        int litroTotal = 0;
        double consumo;   
        while(true){
            System.out.println("Digite a quilometragem dirigida ou -1 para encerrar o programa: ");
            km = sc.nextInt();
            if(km == -1){
                break;
            }else{
                kmTotal += km;
            }
            System.out.println("Digite os litros consumidos: ");
            litro = sc.nextInt();
            litroTotal += litro;
            consumo = (double) km/litro;
            System.out.printf("O consumo da viagem foi: %.2f\n", consumo);
        }
        
        System.out.println("A quilometragem total foi: " + kmTotal + "Km");
        System.out.println("O consumo em litros total foi: " + litroTotal + "L");
        sc.close();
    }
    
    
}
