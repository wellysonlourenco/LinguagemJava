package Curso;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("---------------------------------");
		
		n1 *= 2;// 10*2 = 20
		n2 += n1; // 30 + 20 = 50
		s += "DEF"; // ABC + DEF = ABCDEF
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("---------------------------------");
		// OPERADORES ARITMETICOS / ATRIBUIÇÃO ++ ou --
		
		int a = 10;
		//int b = a++;
		int c = ++a;
		
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		

	}

}
