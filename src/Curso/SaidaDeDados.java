package Curso;
import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {

		char sexo = 'F';
		int idade = 28;
		double balance = 10.35784;
		String nome = "Wellyson";
		
		// print = n�o pula a linha para a pr�xima impressao.
		System.out.print("Bom dia!");
		//println = pula a linha para a pr�xima impressao
		System.out.println("Boa Tarde!");
		System.out.println("Boa Noite!");
		System.out.println("-----------------------");
		// limitar para 2 casas decimais (2f) -> ponto flutuante ; %n quebra de linha
		System.out.printf("%.2f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", balance);
		
		System.out.printf("%s tem %d anos de idade", nome, idade);
		

	}

}
