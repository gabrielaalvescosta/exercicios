package lista2;

import java.util.Scanner;

// Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. 
// Entre as tabuadas, solicitar que o usuário pressione uma tecla.

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int vinte = 20;
		int dez = 10;
		int resultado;
		
	
		for (int i = 1; i <= dez; i++) {
			
			for (int j = 1; j <= vinte; j++) {
				
				resultado = j * i;
				System.out.printf("\n %d X %d = %d",j, i, resultado);
				
			}
				ler.nextLine();
				System.out.print("\n");
				
		}

		ler.close();
	}

}
