import javax.swing.JOptionPane;

public class Fotorial {
	public static void main(String[] args) {
		int FatorialNumber = 0;
		int Result = 1;
		
		FatorialNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um número para fatorar."));
		
		for(int i = 2; i <= FatorialNumber; i++) {
			Result = Result * i;
		}
		
		JOptionPane.showMessageDialog(null, Result);
	}
}
