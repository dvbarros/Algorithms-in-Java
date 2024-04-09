package Atividade03;

import java.util.Scanner;

public class Criptografa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        int newCodigo = 0;
        System.out.println("Digite um código de 4 dígitos: ");
        codigo = sc.nextInt();
        Dados codigo1 = new Dados(codigo, newCodigo);
        codigo1.criptografia();
        sc.close();
    }
}
