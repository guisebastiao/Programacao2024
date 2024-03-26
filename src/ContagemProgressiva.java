import javax.swing.JOptionPane;

public class ContagemProgressiva {
	public static void main(String[] args) {
		int IndexWhile = 0;
		int IndexDoWhile = 0;
		int IndexWhile2 = 5;
		int IndexDoWhile2 = 5;

		JOptionPane.showMessageDialog(null, "Contador Progressivo usando While");
		
		while(IndexWhile <= 5) {
			JOptionPane.showMessageDialog(null, IndexWhile);
			IndexWhile++;
		}
		
		JOptionPane.showMessageDialog(null, "Contador Progressivo usando Do While");
		
		do {
			JOptionPane.showMessageDialog(null, IndexDoWhile);
			IndexDoWhile++;
		} while(IndexDoWhile <= 5);
		
		JOptionPane.showMessageDialog(null, "Contador Progressivo usando For");
		
		for(int Index = 1; Index <= 5; Index++) {
			JOptionPane.showMessageDialog(null, Index);
		}
		
		JOptionPane.showMessageDialog(null, "Contador Retrogressivo usando While");
		
		while(IndexWhile2 >= 0) {
			JOptionPane.showMessageDialog(null, IndexWhile2);
			IndexWhile2--;
		}
	
		JOptionPane.showMessageDialog(null, "Contador Retrogressivo usando Do While");
		
		do {
			JOptionPane.showMessageDialog(null, IndexDoWhile2);
			IndexDoWhile2--;
		} while(IndexDoWhile2 >= 0);
		
		JOptionPane.showMessageDialog(null, "Contador Retrogressivo usando For");
		
		for(int Index = 5; Index >= 0; Index--) {
			JOptionPane.showMessageDialog(null, Index);
		}
	}
}
