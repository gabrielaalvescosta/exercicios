package lista3;

import java.util.Scanner;

// Criar uma rotina de entrada que aceite somente um valor positivo.

public class Ex21 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.printf("\n Digite um número positivo: ");
			numero = ler.nextInt();
		
		} while(numero < 0);
		
		if(numero > 0) {
			System.out.printf("\n O número %d é positivo.", numero);
			numero = ler.nextInt();
		}
		
		ler.close();
		
	}

}