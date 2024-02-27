import javax.swing.JOptionPane;

public class Calculos {
	public static void main(String[] args) {
		Double num1, num2, soma;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número para soma."));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número para soma."));
		
		soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "soma = " + soma);
	}
}
