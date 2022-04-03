package lista3;

import java.util.Scanner;

// Exibir a tabuada do número cinco no intervalo de um a dez.

public class Ex24 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int i, resultado;
		int cinco = 5;
		
		for (i = 1; i <= 10; i++) {
			
			resultado = i * cinco;
			System.out.printf("\n %d X %d = %d", cinco, i, resultado);
			ler.close();
		}
		
		
	}

	
}