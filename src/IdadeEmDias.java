import javax.swing.JOptionPane;

public class IdadeEmDias {
	public static void main(String[] args) {
		// declarações das variaveis
		int idade = 0, dias = 365;
		
		try {
			// input mais resultado
			idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade para transformar em dias."));
			JOptionPane.showMessageDialog(null, "Sua idade transformada em dias é de " + (idade * dias) + " dias.");
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro.");
		}
	}
}
