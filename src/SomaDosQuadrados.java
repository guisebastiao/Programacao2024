import javax.swing.JOptionPane;

public class SomaDosQuadrados {
	public static void main(String[] args) {
		// declaração das variaveis.
		Double num1 = null, num2 = null, num3 = null, num4 = null;
	
		try {
			// input dos valores para cada variavel.
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número."));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número."));
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número."));
			num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número."));
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro.");
		}
		
		// soma os quadrados para cada número com a biblioteca Math.
		num1 = Math.sqrt(num1);
		num2 = Math.sqrt(num2);
		num3 = Math.sqrt(num3);
		num4 = Math.sqrt(num4);
		
		//imprime a soma dos quadrados da cada um dos números digitados.
		JOptionPane.showMessageDialog(null, "A soma dos quadrados são: " + num1 + num2 + num3 + num4);
	}
}
