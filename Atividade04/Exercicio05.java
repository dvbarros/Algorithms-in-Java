package Atividade04;

public class Exercicio05 {
    public static void main(String[] args) {
        int total = 1;
        for(int i = 1; i <= 15; i+=2){
            total*=i;
            System.out.println(total);
        }
        System.out.println("O valor total é: " + total);
    }
}
