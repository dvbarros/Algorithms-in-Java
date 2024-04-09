import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        // Criando um objeto da classe Random
        Random random = new Random();

        // Criando um ArrayList e um HashSet para armazenar os números
        ArrayList<Integer> numerosArrayList = new ArrayList<>();
        HashSet<Integer> numerosHashSet = new HashSet<>();

        // Inserindo 30 mil números aleatórios no ArrayList e no HashSet
        long tempoInicialInsercaoArrayList = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            int numero = random.nextInt(1000000); // Inserindo números aleatórios entre 0 e 999999
            numerosArrayList.add(numero);
            numerosHashSet.add(numero);
        }
        long tempoFinalInsercaoArrayList = System.currentTimeMillis();

        // Realizando as 30 mil buscas em cada estrutura e registrando o tempo
        long tempoInicialPesquisaArrayList = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            int numeroPesquisar = random.nextInt(1000000); // Gerando um número aleatório para pesquisar
            boolean encontrado = numerosArrayList.contains(numeroPesquisar);
        }
        long tempoFinalPesquisaArrayList = System.currentTimeMillis();

        long tempoInicialPesquisaHashSet = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            int numeroPesquisar = random.nextInt(1000000); // Gerando um número aleatório para pesquisar
            boolean encontrado = numerosHashSet.contains(numeroPesquisar);
        }
        long tempoFinalPesquisaHashSet = System.currentTimeMillis();

        // Exibindo o tempo de inserção e pesquisa para o ArrayList
        System.out.println("Tempo de inserção no ArrayList: " + (tempoFinalInsercaoArrayList - tempoInicialInsercaoArrayList) + " milissegundos.");
        System.out.println("Tempo de pesquisa no ArrayList: " + (tempoFinalPesquisaArrayList - tempoInicialPesquisaArrayList) + " milissegundos.");

        // Exibindo o tempo de pesquisa para o HashSet
        System.out.println("Tempo de pesquisa no HashSet: " + (tempoFinalPesquisaHashSet - tempoInicialPesquisaHashSet) + " milissegundos.");
    }
}

