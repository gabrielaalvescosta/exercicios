package lista3;

import java.util.Scanner;

// Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores 
// positivos. 
// Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

public class Ex25 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int valor, i, resultado;
		
		do {
			System.out.printf("\n Digite um valor qualquer: ");
			valor = ler.nextInt();
			
		
		} while(valor < 0);
		
		if (valor > 0) {
			
			for (i = 0; i <= 10; i++) {
				
				resultado = i * valor;
				System.out.printf("\n %d X %d = %d", valor, i, resultado);
				
				ler.close();
			}
			
		}
		

		
		
	}

}