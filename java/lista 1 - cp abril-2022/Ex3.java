package lista1;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double area, base, altura;
		
		System.out.printf("Base em cm: ");
		base = ler.nextDouble();
		
		System.out.printf("Altura em cm: ");
		altura = ler.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é de " + area + "cm².");
		
		ler.close();

	}

}
