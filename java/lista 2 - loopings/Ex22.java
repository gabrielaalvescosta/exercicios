package lista3;

import java.util.Scanner;

// Entrar com dois valores via teclado, onde o segundo dever� ser maior que o primeiro. 
// Caso contr�rio solicitar novamente apenas o segundo valor.

public class Ex22 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2;
		
		do {
			System.out.printf("\n Digite o primeiro n�mero: ");
			valor1 = ler.nextInt();
			
			System.out.printf("\n Digite o segundo n�mero: ");
			valor2 = ler.nextInt();
		
		} while(valor1 > valor2);
		
		if (valor2 > valor1) {
			System.out.printf("O valor 2 � maior que o valor 1. A condi��o j� foi atendida.");
		}
		

		ler.close();
		
	}

}