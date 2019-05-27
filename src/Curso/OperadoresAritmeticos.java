package Curso;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4)*2;
		int n3 = 17 % 3; //17 MOD 3 (Resto)
		double n4 = 10.0 / 8; // tem que colocar o .0 (para aparecer as casas decimais); se deixar sem.. vai aparecer o numero inteiro;
		
		double a = 1.0, b = -3.0, c = -4.0;
		// formula de baskara
		double x1 = (-b + Math.sqrt(b * b - 4.0*a*c)) / (2.0 * a);
		
		System.out.println(x1);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		

	}

}
