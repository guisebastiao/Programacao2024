import javax.swing.JOptionPane;

public class NotaAluno {
	public static void main(String[] args) {
		double nota;
		nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual foi a sua nota?"));
		if(nota >= 70) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado!");
		}
	}
}
