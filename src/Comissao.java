// import das bibliotecas para transformar o valor em 2 casas decimais || https://www.devmedia.com.br/arredondando-numeros-em-java/28248
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Comissao {
	public static void main(String[] args) {
		// declaração das variaveis.
		Double valor = null, resul;
		int vendidas = 0;
		
		// usando tratamento de erro, pois se digitar um número que não seja de ponto flutuante ou qualquer caracter que não seja número quebra a aplicação.
		try {
			// valor do produto e a quantidade vendida
			valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço unitário do produto."));
			vendidas = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos foram vendidos."));
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro ou de ponto flutuante.");
		}
		
		// 5% da comissão.
		resul = (valor * vendidas) * 0.05;
		
		//valor final comissão
		BigDecimal comissao = new BigDecimal(resul).setScale(2, RoundingMode.HALF_EVEN);
		JOptionPane.showMessageDialog(null, "Sua comissão foi de R$ " + comissao);
	}
}
