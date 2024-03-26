import javax.swing.JOptionPane;

public class NumerosPrimos {
	public static void main(String[] args) {
		int Digitado;
		int Continue = 0;
		
		do {
			Digitado = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um número para verificar se ele é primo."));
			
			if(Digitado == 0 || Digitado == 1) {	
				JOptionPane.showMessageDialog(null, Digitado + " não é um número primo.");
			} else if(Digitado == 2) {
					JOptionPane.showMessageDialog(null, Digitado + " é um número primo.");
			} else {
				 boolean Primo = true;
				 
	             for (int i = 2; i <= Math.sqrt(Digitado); i++) {
	            	 if (Digitado % i == 0) {
	            	 	Primo = false;
	                    break;
	                 }
	             }
	             
	             if(Primo) {
	            	 JOptionPane.showMessageDialog(null, Digitado + " é um número primo.");
	             } else {
	            	 JOptionPane.showMessageDialog(null, Digitado + " não é um número primo.");
	             }
			}
			
			Continue = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
		} while(Continue == 0);
	}
}
