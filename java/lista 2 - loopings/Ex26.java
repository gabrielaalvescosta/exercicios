package lista3;

import java.util.Scanner;

// Entrar via teclado com um valor (X) qualquer. Travar a digita��o, 
// no sentido de aceitar somente valores positivos. 

// Solicitar o intervalo que o programa que dever� calcular a tabuada do valor digitado, 
// sendo que o segundo valor (B), dever� ser maior que o primeiro (A), caso contr�rio, 
// digitar novamente somente o segundo. 

// Ap�s a valida��o dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, 
// ou seja, a tabuada de X no intervalo de B para A.

public class Ex26 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		do {
			System.out.printf("\n Digite um valor qualquer: ");
			a = ler.nextInt();
			
		
		} while(a < 0);
		
		if (a > 0) {
			
			for (b = 10; b > 0; b--) {
				
				if (a <= b) {
					
					c = b * a;
					System.out.printf("\n %d X %d = %d", b, a, c);
					ler.close();
					
				} else if (b < a) {
					System.out.printf("\n %d", b);
				}
			
			}
			
		}
		

		
		
	}

}