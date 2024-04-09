package Atividade03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int numConta, saldoInicial, despesa, credito, creditoAut, novoSaldo;

        Scanner sc = new Scanner (System.in);
        System.out.println("BEM-VINDO! PARA ENCERRAR O PROGRAMA DIGITE -1 A QUALQUER MOMENTO");
        while(true){
            System.out.println("Digite o número da conta: ");
            numConta = sc.nextInt();
            if(numConta == -1){
                break;
            }
            System.out.println("Digite o saldo inicial: ");
            saldoInicial = sc.nextInt();
            if(saldoInicial == -1){
                break;
            }
            System.out.println("Digite o total do valor dos itens cobrados: ");
            despesa = sc.nextInt();
            if(despesa == -1){
                break;
            }
            System.out.println("Digite o total de crédito aplicado no mês: ");
            credito = sc.nextInt();
            if(credito == -1){
                break;
            }
            System.out.println("Digite o limite de crédito autorizado: ");
            creditoAut = sc.nextInt();
            if(creditoAut == -1){
                break;
            }
            novoSaldo = saldoInicial + despesa - credito;
            System.out.println((novoSaldo > creditoAut ? "Limite de Crédito Excedido\n" : "Novo saldo: " + novoSaldo + "\n"));
        }
        sc.close();
    }
}
