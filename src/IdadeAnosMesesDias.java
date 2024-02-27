import javax.swing.JOptionPane;

public class IdadeAnosMesesDias {
	public static void main(String[] args) {
		int anos, meses, dias;
		
		try {
			anos = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade."));
			meses = Integer.parseInt(JOptionPane.showInputDialog("informe quantos meses passaram depois de seu aniversário."));
			
			// condição para verificar os meses maior que 1 ou maior que 12
			if(meses < 1 || meses > 12) {
				JOptionPane.showMessageDialog(null, "Os meses precisam ser de 1 a 12.");
				return;
			}
			
			dias = Integer.parseInt(JOptionPane.showInputDialog("informe quantos dias passaram depois do ultimo mês."));
			
			// condição para verificar os dias maior que 1 ou menor que 365
			if(dias < 1 || dias > 365) {
				JOptionPane.showMessageDialog(null, "Os meses precisam ser de 1 a 12.");
				return;
			}
			
			// resultado final
			JOptionPane.showMessageDialog(null, "Sua idade transformada em dias é de " + ((anos * 365) + (meses * 30) + dias) + " dias.");
		} catch(Exception error) {
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "Os valores digitados precisam ser números inteiros.");
		}
	}
}
