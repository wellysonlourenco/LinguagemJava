package Curso;

import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char resp;
		
		
		do {
		System.out.println("Digite um numero: ");
		double n = sc.nextDouble();
		double sq = Math.sqrt(n);
		System.out.printf("A Raiz quadrada é : %.2f %n", sq);
		
		System.out.println("Deseja repetir (y/n)? ");
		resp = sc.next().charAt(0);
		}while (resp != 'n');
	
		
		
		
		
		
		
		sc.close();

	}

}
