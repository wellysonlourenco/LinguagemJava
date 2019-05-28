package Curso;

public class EscopoInicializacao {

	public static void main(String[] args) {
		
		double preco = 400.00;
		
		
		
		double desconto ;
		
		if (preco < 200) {
			desconto = preco * 0.1;
		}else {
			desconto = preco;
			
		}
		
		System.out.println(desconto);

	}

}
