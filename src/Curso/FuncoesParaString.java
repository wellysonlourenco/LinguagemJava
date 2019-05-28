package Curso;

public class FuncoesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		//CONVERTER PARA TODAS MINUSCULAS
				String s01 = original.toLowerCase();
		
		//converter para letras Maiusculas
				String s02 = original.toUpperCase();
				
		//Elimina todos os espaços da String
				String s03 = original.trim();
				
		// Elimina o 0 1 e começa a partir da letra 3
				String s04 = original.substring(2);
				
		// Começa do carater numero 2 até o 9		
				String s05 = original.substring (2,9);
				
		// troca a ('primeira letra' , 'por essa letra ')
				String s06 = original.replace('a', 'x');
				
		// troca o ('substring ' , 'por esse substring ')
				String s07 = original.replace("abc", "xy");
				
		// primeira ocorencia do bc é no caracter numero x
		int i = original.indexOf("bc");
		
		// a ultima ocorrencia do bc é no caracter numero y
		int j = original.lastIndexOf("bc");
		
					// 0     1     2    ....
		String s = "batata apple limao";
		// colocar o intervalo de casa " "  para acrescentar no vetor
		String[] vect = s.split(" ");
		
		
				
				
		System.out.println("Original : -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("replace ('a','x'): -" + s06 + "-");
		System.out.println("replace ('abc','xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): -" + i + "-");
		System.out.println("LastIndexOf('bc'): -" + j + "-");
		System.out.println("---------------------------");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		

	}

}
