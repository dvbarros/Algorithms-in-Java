package Atividade04;

public class Exercicio08 {
    public static void main(String[] args) {
        double pi = 0.0;
        int termosNecessarios = 0;
        
        System.out.println("Termo | Valor Aproximado de Pi");
        System.out.println("------+------------------------");
        
        for (int i = 0; i < 200000; i++) {
            double termo = 1.0 / (2 * i + 1);
            
            if (i % 2 == 0) {
                pi += termo;
            } else {
                pi -= termo;
            }
            
            if (i >= 5 && Math.abs(4 * pi - 3.14159) < 0.00001) {
                termosNecessarios = i + 1;
            }
            
            if (i < 10 || i % 20000 == 0) {
                System.out.printf("%5d | %.15f%n", i + 1, 4 * pi);
            }
        }
        
        System.out.println("--------------------------------");
        System.out.println("Quantidade de termos necessários para começar com 3,14159: " + termosNecessarios);
    }
}
    
