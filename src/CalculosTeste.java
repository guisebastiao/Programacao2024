import javax.swing.JOptionPane;

public class CalculosTeste {
	public static void main(String[] args) {
		Double num1, num2, resul = null;
		String digitado;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número para calculo."));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número para calculo."));
		digitado = JOptionPane.showInputDialog("Escolha algum operador: 1 -> adição | 2 -> subtração | 3 -> divisão | 4 -> multiplicação.");
		
		if(Integer.parseInt(digitado)  == 1) {
			resul = num1 + num2;
		} else if(Integer.parseInt(digitado)  == 2) {
			resul = num1 - num2;
		} else if(Integer.parseInt(digitado)  == 3) {
			resul = num1 / num2;
		} else if(Integer.parseInt(digitado)  == 4) {
			resul = num1 * num2;
		} else {
			JOptionPane.showMessageDialog(null, "As opções são do número 1 ao 4 do seu teclado.");
		}
		
		JOptionPane.showMessageDialog(null, "resultado = " + resul);
	}
}
