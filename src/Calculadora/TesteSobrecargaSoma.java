package Calculadora;

public class TesteSobrecargaSoma {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int x = 1, y = 2;
		float f1 = 56.7f, f2 = 0.3f;
		
		System.out.println(calculadora.soma(f1, f2));
		System.out.println(calculadora.soma(x, y));
	}
}
