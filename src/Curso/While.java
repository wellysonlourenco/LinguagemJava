package Curso;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		double n = sc.nextDouble();
		
		while ( n >= 0 ) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f %n", sr);
			System.out.println("Digite o proximo numero: ");
			n = sc.nextDouble();
			
		}
		System.out.println("Numero Negativo!");

		sc.close();
	}

}
