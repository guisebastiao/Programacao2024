package Calculadora;

import javax.swing.JOptionPane;

public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		int Option = Integer.parseInt(JOptionPane.showInputDialog("1 - Soma /n 2 - Subtração /n 3 - Divisão /n 4 Multiplicação"));
		int Number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro operador"));
		int Number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo operador"));
		int result;
		
		if(Option == 1) {
			result = calculadora.soma(Number1, Number2);
		} else if(Option == 2) {
			result = calculadora.subtracao(Number1, Number2);
		} else if(Option == 3) {
			result = calculadora.divisao(Number1, Number2);
		} else {
			result = calculadora.multiplicacao(Number1, Number2);
		}
		
		JOptionPane.showMessageDialog(null, result);
	}
}
