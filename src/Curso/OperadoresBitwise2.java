package Curso;

import java.util.Scanner;

public class OperadoresBitwise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int mask = 0b0010000; //  o 6� bit � verdadeiro
		int n = sc.nextInt();
		
		//saber qndo o ultimo numero for verdadeiro
		if(( n & mask ) != 0 ) {
			System.out.println("O 6� bit � verdadeiro!");
			
		}
		else {
			System.out.println("o 6� bit � falso");
		}
		
		
		
		
		sc.close();
	}

}
