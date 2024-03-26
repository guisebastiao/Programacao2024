import javax.swing.JOptionPane;

public class PessoaMaior {
	public static void main(String[] args) {
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "Você é de maior!");
		} else {
			JOptionPane.showMessageDialog(null, "Você não é de maior!");
		}
	}
}
