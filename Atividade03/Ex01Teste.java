package Atividade03;

public class Ex01Teste {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        while (x <= 10){
            int y = x*x;
            System.out.println(y);
            total += y;
            x++;
        }
        System.out.println("Total is " + total);
    }
}
