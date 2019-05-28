package Curso;

import java.util.Scanner;

public class EstruturasCondicionais2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Qual horas são? ");
		int horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		else if (horas < 18) {
			System.out.println("Boa Tarde!");
		}
		else {
			System.out.println("Boa Noite!");
		}

	}

}
