package lista1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("Digite o valor da base: ");
		base = ler.nextInt();
		
		System.out.printf("Digite o valor da altura: ");
		altura = ler.nextInt();
		
		area = base * altura;
		
		if (area > 100) {
			System.out.printf("Terreno grande. A área é de " + area + " metros quadrados." , area);
		} else {
			System.out.printf("Terreno pequeno. A área é de " + area + " metros quadrados." , area);
		}
		
		ler.close();

	}

}
