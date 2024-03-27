package Atividade02;

import java.util.Scanner;

public class contaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double deposito;
		double saldoAtual = 0;
		int resposta;
		System.out.println("Digite a operação que deseja realizar: \n1-Sair\n2-Deposito");
		resposta = sc.nextInt();
		while(resposta != 1) {
			System.out.println("Quanto deseja depositar ?");
			deposito = sc.nextDouble();
			saldoAtual = saldoAtual + deposito;
			System.out.println("Seu saldo atual é - R$: " + saldoAtual + "\n");
			System.out.println("O que deseja fazer agora? \n1-Sair\n2-Deposito");
			resposta = sc.nextInt();
		}
		if(resposta == 1) {
			System.out.println("Obrigado! Até mais");
		}
		
	}

}
