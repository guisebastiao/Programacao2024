import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {
		// declaração das variaveis
		Double base = null, altura = null;
		
		try {
			// unidade de medida do programa
			JOptionPane.showMessageDialog(null, "Esse programa usa a unidade de medida em metros.");
			// inputs
			base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo para calcular a area."));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo para calcular a area."));
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro ou de ponto flutuante.");
		}
		
		// calcular a area e imprimir o valor
		JOptionPane.showMessageDialog(null, "A area do triangulo é de " + (base * altura) + " Metros Quadrados.");
	}
}
