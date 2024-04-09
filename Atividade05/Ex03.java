import java.util.Scanner;
import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        String palavra_reservada = "BANANA";
        ArrayList<Character> array_palavra = new ArrayList<>();
        for (int i = 0; i < palavra_reservada.length(); i++) {
            if (palavra_reservada.charAt(i) == ' ') {
                array_palavra.add(' '); 
            } else {
                array_palavra.add('_');
            }
        }

        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        boolean enforcou = false;
        int erros = 0;

        while (!acertou && !enforcou) {
            System.out.println("Qual é a letra? ");
            char chute = entrada.next().toUpperCase().charAt(0);
            boolean letra_correta = false;

            for (int i = 0; i < palavra_reservada.length(); i++) {
                if (chute == palavra_reservada.charAt(i)) {
                    array_palavra.set(i, chute);
                    letra_correta = true;
                }
            }

            if (!letra_correta) {
                System.out.println("Letra errada! Tente novamente");
                erros++;
                if(erros == 1){
                    System.out.println(" O ");
                }else if(erros == 2){
                    System.out.println(" O ");
                    System.out.println(" | ");
                }else if(erros == 3){
                    System.out.println(" O ");
                    System.out.println(" | /");
                }else if(erros == 4){
                    System.out.println(" O ");
                    System.out.println("\\|/");
                }else if(erros == 5){
                    System.out.println(" O ");
                    System.out.println("\\|/");
                    System.out.println("/");
                }else if(erros == 6){
                    System.out.println(" O ");
                    System.out.println("\\|/");
                    System.out.println("/ \\");
                }
            } else {
                System.out.println(array_palavra);
            }
            
            acertou = !array_palavra.contains('_');
            enforcou = erros == 6;
        }

        if (enforcou) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Você acertou a palavra!");
        }
        entrada.close();
    }
}
