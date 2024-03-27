package Atividade02;

import javax.swing.JOptionPane;

public class ParOuImparInterface {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Digite um número");
		Integer num1 = Integer.parseInt(num);
		if(num1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, num1 + " é Par!");
		}else {
			JOptionPane.showMessageDialog(null, num1 + " é Ímpar!");
		}
	}
}
