package lista3;

import java.util.Scanner;

// Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. 
// Caso contrário solicitar novamente apenas o segundo valor.

public class Ex22 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.printf("\n Digite o primeiro número: ");
		valor1 = ler.nextInt();
		
		do {
			
			System.out.printf("\n Digite o segundo número: ");
			valor2 = ler.nextInt();
		
		} while(valor1 > valor2);
		
		if (valor2 > valor1) {
			System.out.printf("O valor 2 é maior que o valor 1. A condição já foi atendida.");
		}
		

		ler.close();
		
	}

}
