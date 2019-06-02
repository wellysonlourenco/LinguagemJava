package Curso;

import java.util.Scanner;

public class AreaTrianguloXY {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite os lados do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC= sc.nextDouble();
		
		System.out.println("Digite os laudos do triangulo Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC= sc.nextDouble();
		
		double p = (xA + xB + xC)/2;
		double areaX = Math.sqrt(p * (p- xA)*(p-xB)*(p-xC));
		
		p = (yA + yB + yC)/2;
		double areaY = Math.sqrt(p * (p- yA)*(p-yB)*(p-yC));
		
		System.out.printf("Area do Triangulo X:  %.4f %n", areaX);
		System.out.printf("Area do Triangulo Y:  %.4f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior area: TRIANGULO X");
		}
		else {
			System.out.println("A maior area: TRIANGULO Y");
		}
		
		
		
		sc.close();

	}

}
	