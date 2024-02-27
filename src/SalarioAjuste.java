import java.math.BigDecimal;
import java.math.RoundingMode;
		
import javax.swing.JOptionPane;

public class SalarioAjuste {
	public static void main(String[] args) {
		//declaração das variaveis
		Double salario, percentual;
		
		//inputs
		salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu salário."));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Qual porcentos é o ajuste do seu salário."));
		
		// conversao para 2 casas decimais
		BigDecimal conversao = new BigDecimal(salario + (salario * (percentual / 100))).setScale(2, RoundingMode.HALF_EVEN);
		
		// saida
		JOptionPane.showMessageDialog(null, "Com o reajuste, seu salário ficou de R$ " + conversao);
	}
}
