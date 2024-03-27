package Atividade02;

import javax.swing.JOptionPane;

public class OperacoesInterface {

	public static void main(String[] args) {
		
		String numberOne = JOptionPane.showInputDialog("Digite um número: ");
		Integer num1 = Integer.parseInt(numberOne);
		
		String numberTwo = JOptionPane.showInputDialog("Digite outro número: ");
		Integer num2 = Integer.parseInt(numberTwo);
		
		int soma, multiplicacao, divisao, diferenca;
		soma = num1 + num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
		diferenca = num1 - num2;
		
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		JOptionPane.showMessageDialog(null, "A diferença é: " + diferenca);
		JOptionPane.showMessageDialog(null, "A multiplicacao é: " + multiplicacao);
		JOptionPane.showMessageDialog(null, "A divisão é: " + divisao);
		

	}

}
