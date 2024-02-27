import javax.swing.JOptionPane;

public class Votação {
	public static void main(String[] args) {
		Double eleitores, brancos, nulos, validos = null;
		
		try {
			eleitores = Double.parseDouble(JOptionPane.showInputDialog("informe quantos eleitores existem."));
			
			brancos = Double.parseDouble(JOptionPane.showInputDialog("informe quantas pessoas votaram em branco."));
			
			// verificar a quantidade de votos em brancos para que não seja mair que a quantidade de eleitores
			if(brancos > eleitores) {
				JOptionPane.showMessageDialog(null, "Os votos em brancos não pode ser maior que a quantidade de eleitores.");
				return;
			}
			
			nulos = Double.parseDouble(JOptionPane.showInputDialog("informe quantas pessoas votaram nulo."));
			
			// verificar a quantidade de votos em brancos para que não seja mair que a quantidade de eleitores menos os votos em branco
			if(nulos > (eleitores - brancos)) {
				JOptionPane.showMessageDialog(null, "Os votos nulos não pode ser maior que a quantidade de eleitores subtraido com os votos em brancos.");
				return;
			}
			
			// o valor dos votos validos será o total de eleitores menos o total de votos em brancos mais os votos nulos
			validos = eleitores - (brancos + nulos);
			
			// resultado final
			JOptionPane.showMessageDialog(null, "O percentual de todos os votos são " + ((brancos / eleitores) * 100) + "% dos votos em brancos \n" + ((nulos / eleitores) * 100) + "% dos votos em nulos \n" + ((validos / eleitores) * 100) + "% dos votos validos");
		} catch(Exception error) {
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "Os numeros precisão inteiros.");
		}
		
	}
}
