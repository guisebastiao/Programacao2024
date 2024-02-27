// import das bibliotecas para transformar o valor em 2 casas decimais
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class ValorCarro {
	public static void main(String[] args) {
		// declarações das variaveis
		double valorFabrica = 0, impos, distr, total, percImposto = 45, percDistribuidor = 28;
		
		try {
			valorFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe qual o valor de fabrica do carro."));
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro ou de ponto flutuante.");
		}
		
		// calcula valor imposto mais o valor da distribuidora
		impos = valorFabrica * (percImposto / 100);
		distr = valorFabrica * (percDistribuidor / 100);
		
		// calcula o valor total do carro
		total = valorFabrica + impos + distr;
		
		// transformar em 2 casas decimais
		BigDecimal conversao = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);
		
		//saida
		JOptionPane.showMessageDialog(null, "O valor total do carro é de R$" + conversao);
	}
}
