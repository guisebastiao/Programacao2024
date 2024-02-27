import javax.swing.JOptionPane;

public class Antecessor {
	public static void main(String[] args) {
		// declaração de variavel
		int digitado = 0;
		
		// usando tratamento de erro, pois se digitar um número que não seja inteiro ou qualquer caracter que não seja número quebra a aplicação.
		
		try {
			digitado = Integer.parseInt(JOptionPane.showInputDialog("digite um numero para exibir seu antecessor."));
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro.");
		}
		
		// imprimindo o antecessor
		JOptionPane.showMessageDialog(null, "O antecessor do " + digitado + " é o número " + (digitado - 1));
	}
}
