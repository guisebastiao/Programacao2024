// import das bibliotecas para transformar o valor em 2 casas decimais
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Cotação {
	public static void main(String[] args) {
		// declaração das variaveis
		Double dolar = 4.98, digitado = null, soma;
		
		// soma do valor digitado multiplicado pela variavel dolar
		try {
			digitado = Double.parseDouble(JOptionPane.showInputDialog("Informe quanto(s) dolar/dolares você deseja converter em real/reais."));
		} catch(Exception error) {
			// tratando o erro
			System.out.print(error);
			JOptionPane.showMessageDialog(null, "O valor digitado precisa ser um número inteiro ou de ponto flutuante.");
		}
		
		// calcula real para dolar
		soma = digitado * dolar;
		System.out.print("valor sem 2 casas decimais. " + soma);
		
		// pega o valor da soma e arruma para apenas 2 casas decimais para se comparar ao real e depois printa o valor final || https://www.devmedia.com.br/arredondando-numeros-em-java/28248
		BigDecimal conversao = new BigDecimal(soma).setScale(2, RoundingMode.HALF_EVEN);
		JOptionPane.showMessageDialog(null, "Convertido em real/reais você tem R$" + conversao);
	}
}
