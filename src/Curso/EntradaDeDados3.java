package Curso;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Seu Nome Completo: ");
		String nome = sc.nextLine();
		
		
		System.out.println("Quantos quartos tem na sua casa? ");
		int quarto = sc.nextInt();
		
		System.out.println("O codigo do produto: ");
		double code = sc.nextDouble();
		
		
		
		
		// sobrenome   idade    altura 
		System.out.println("Informe o seu ultimo nome, idade e sua altura: ");
		sc.nextLine();
		String[] vect = sc.nextLine().split(" ");
		
		
		String sobrenome = vect[0];
		int idade = Integer.parseInt(vect[1]);
		double altura = Double.parseDouble(vect[2]);
		
		
		System.out.println(nome);
		System.out.println(quarto);
		System.out.printf("%.2f %n" , code);
		System.out.println(sobrenome);
		System.out.println(idade);
		System.out.printf("%.2f %n " ,altura);
		
		
		
		
		
		
		sc.close();

	}

}
