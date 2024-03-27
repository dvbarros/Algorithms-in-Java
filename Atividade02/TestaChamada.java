package Atividade02;

import java.util.Scanner;

public class TestaChamada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do curso ?");
        String nomeCurso = sc.nextLine();
        System.out.println("Qual o nome do professor ?");
        String nomeProfessor = sc.nextLine();

        Chamada novoCurso = new Chamada(nomeProfessor, nomeCurso);

        novoCurso.mensagem();
    }
}
