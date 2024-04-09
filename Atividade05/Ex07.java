import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        // Criando um objeto da classe Random
        Random random = new Random();

        // Inserindo 30 mil elementos em um ArrayList e em uma LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long tempoInicialArrayList = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            int numero = random.nextInt(1000000); // Inserindo números aleatórios entre 0 e 999999
            arrayList.add(0, numero); // Adicionando o elemento na primeira posição no ArrayList
        }
        long tempoFinalArrayList = System.currentTimeMillis();

        long tempoInicialLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            int numero = random.nextInt(1000000); // Inserindo números aleatórios entre 0 e 999999
            linkedList.add(0, numero); // Adicionando o elemento na primeira posição na LinkedList
        }
        long tempoFinalLinkedList = System.currentTimeMillis();

        // Exibindo os tempos de adição para cada lista
        System.out.println("Tempo de adição (ArrayList): " + (tempoFinalArrayList - tempoInicialArrayList) + " milissegundos.");
        System.out.println("Tempo de adição (LinkedList): " + (tempoFinalLinkedList - tempoInicialLinkedList) + " milissegundos.");

        // Percorrendo os elementos em cada lista usando o método get(indice)
        long tempoInicialPercorrerArrayList = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            int elemento = arrayList.get(i);
        }
        long tempoFinalPercorrerArrayList = System.currentTimeMillis();

        long tempoInicialPercorrerLinkedList = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            int elemento = linkedList.get(i);
        }
        long tempoFinalPercorrerLinkedList = System.currentTimeMillis();

        // Exibindo os tempos de percorrer para cada lista
        System.out.println("Tempo de percorrer (ArrayList): " + (tempoFinalPercorrerArrayList - tempoInicialPercorrerArrayList) + " milissegundos.");
        System.out.println("Tempo de percorrer (LinkedList): " + (tempoFinalPercorrerLinkedList - tempoInicialPercorrerLinkedList) + " milissegundos.");
    }
}



