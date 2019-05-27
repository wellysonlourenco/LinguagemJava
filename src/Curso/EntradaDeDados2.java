package Curso;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		sc.nextLine(); // consumir a quebra de linha do n1 (limpeza de stream de entrada (flush))
		String nome = sc.nextLine();
		char sexo = sc.next().charAt(0); // faz leitura de uma String e o charAt pega a primeira letra (0)
		// digitar b5 (um caracter e 1 digito)
		String s = sc.next(); // variavel "s"
		char letter = s.charAt(0); // imprimir a Letra (posicao 0)
		int digitar = Integer.parseInt(s.substring(1)); // Converter para INT, depois recortar o String a partir da posicao 1 (numero);
		//digitar  4.32
		double n2 = sc.nextDouble();
		// digitar (Maria F 23 1.68) na mesma linha
		String nome2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double altura = sc.nextDouble();
		
		
		System.out.println(n1);
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(letter);
		System.out.println(digitar);
		System.out.println(n2);
		System.out.println(nome2);
		System.out.println(ch); 
		System.out.println(age);
		System.out.println(altura);// atalho (sysout)
		
		
		
		
		sc.close();
	}

}
