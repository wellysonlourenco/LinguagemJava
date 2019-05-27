package Curso;

public class OperadoresBitwise {

	public static void main(String[] args) {
		
		int n1 = 89 ; //0101 1001
		int n2 = 60;  //0011 1100
		
		
		System.out.println(n1 & n2); // da verdadeiro qndo for 1 (n1) e 1 (n2)
		System.out.println(n1 | n2); // da verdadeiro quando tiver 1
		System.out.println(n1 ^ n2); // da verdadeiro qndo 1 bit é true (1), se os dois foi (1) = 0 (false)

	}

}
