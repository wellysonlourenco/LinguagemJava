package Curso;
import java.util.Locale;

public class ExercicioSaidaDeDados {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Computador";
		
		byte idade = 28;
		int code = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produto:");
		System.out.printf("%s, com o preço de R$ %.2f. %n", produto1, preco1);
		System.out.printf("%s, com o preço de R$ %.2f. %n", produto2, preco2);
		System.out.println();
		System.out.printf("Registro: %d anos de idade, codigo %d e sexo: %c %n", idade, code, sexo);
		System.out.println();
		System.out.printf("Medica com 8 casas decimais: %.8f %n", medida);
		System.out.printf("Arredondando para 3 casas decimais %.3f %n", medida);
		Locale.setDefault(Locale.ENGLISH);
		System.out.printf("US decimal por ponto %.3f %n", medida);
		

	}

}
