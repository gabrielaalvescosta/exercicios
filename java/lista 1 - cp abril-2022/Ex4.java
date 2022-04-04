package lista1;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3, valor4, media;
		
		System.out.printf("Digite o valor 1: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o valor 2: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Digite o valor 3: ");
		valor3 = ler.nextDouble();
		
		System.out.printf("Digite o valor 4: ");
		valor4 = ler.nextDouble();

		
		media = (valor1 + valor2 + valor3 + valor4) / 4;
		
		System.out.printf("A media dos 4 valores é de " + media, media);
		
		ler.close();

	}

}
