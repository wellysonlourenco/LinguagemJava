package Curso;

public class Conversao {
	public static void main(String[] args) {

		// Conversao casting
		double a, resultado;
		float b;
		int c, d, z;
		String s = "33";

		a = 5.0;
		b = (float) a;
		c = 5;
		d = 2;
		z = Integer.parseInt(s);

		// coversao de inteiro p/ double
		resultado = (double) c / d;

		System.out.println(b);
		System.out.println(resultado);
		System.out.println(z);

	}
}
