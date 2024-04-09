public class Ex01 {
    public static void main(String[] args) {
        int num [] = {12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3,-52};
        int maior = 0, menor;
        int contador = 0;
        int soma = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] > maior){
                maior = num[i];
            }
        }
        menor = maior;
        for(int i = 0; i < num.length; i++){
            if(num[i] < menor){
                menor = num[i];
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Números Pares: ");
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                System.out.println(num[i]);
            }
            if(num[0] == num[i]){
                contador++;
            }
        }
        System.out.println("O número 12 apareceu: " + contador);
        contador = 0;
        for (int iterable_element : num) {
            contador++;
            soma += iterable_element;
        }
        System.out.println("Está é a média de todos os elementos: " + soma/contador);

        soma = 0;
       for(int x : num){
        if(x < 0){
            soma += x;
        }
       }
       System.out.println("Esta é a soma dos números negativos: " + soma);
    }
}
