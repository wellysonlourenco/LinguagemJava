package Curso;

import java.util.Scanner;

public class EstruturasCondicionais3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior numero � = " + a);
		}
		else if ( b > c) {
			System.out.println("O maior numero � = " + b);
		}
		else {
			System.out.println("O maior numero � = " + c);
		}
		
		
		sc.close();
	}

}
