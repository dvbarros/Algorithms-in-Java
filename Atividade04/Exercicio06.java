package Atividade04;

public class Exercicio06 {
    public static void main(String[] args) {
        long fatorial;
        System.out.println("Fatorial de Número | Resultado");
        System.out.println("-------------------+----------");
        for(int i = 1; i <= 20; i++){
            fatorial = 1;
            for(int j = 1; j <= i; j++){
                fatorial *= j; 
            }
            System.out.printf(" %d! | %d\n", i, fatorial);
        }
    }
}
//Não haveria espaço de memória suficiente para calcular o fatorial de 100
