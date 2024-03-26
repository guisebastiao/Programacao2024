import javax.swing.JOptionPane;

public class SalarioDaPessoa {
	public static void main(String[] args) {
		double SalarioMinimo = 1412;
		double SalarioPessoa;
		SalarioPessoa = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o seu salário?"));
		if(SalarioPessoa >= SalarioMinimo) {
			JOptionPane.showMessageDialog(null, "Você ganha um salário minimo ou mais!");
		} else {
			JOptionPane.showMessageDialog(null, "Você ganha menos que um salário minimo!");
		}
	}
}
