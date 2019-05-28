package Curso;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um numero interiro: ");
		int n = sc.nextInt();
		
		//verificar se o numero é par ou impar
		if (n % 2 == 0) {
			System.out.println("O numero é par! ");
		}
		else {
			System.out.println("O numero é Impar!");
		}
		
		
		
		sc.close();
	}

}
