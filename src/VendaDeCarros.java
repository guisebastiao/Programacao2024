// import das bibliotecas para transformar o valor em 2 casas decimais
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class VendaDeCarros {
	public static void main(String[] args) {
		double salario = 2200, 
				totalVendas = 0, carroVendido = 180.5, comiCarrosVendidos, 
				totalValorVendas = 0, percVenda = 5, comiTotalVendidos;
		
		try {
			totalValorVendas = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de todos os carros vendidos."));
			totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros foram vendidos."));
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro ou de ponto flutuante.");
		}
		
		// comissao dos carros vendidos
		comiCarrosVendidos = totalVendas * carroVendido;
		
		// comissao do valor total dos carros vendidos
		comiTotalVendidos = totalValorVendas * (percVenda / 100);
		
		// valor final do salario
		salario = salario + comiCarrosVendidos + comiTotalVendidos;
		
		// transformar em 2 casas decimais
		BigDecimal conversao = new BigDecimal(salario).setScale(2, RoundingMode.HALF_EVEN);
		
		// saida
		JOptionPane.showMessageDialog(null, "Sua comissão é de R$" + conversao);
	}
}
