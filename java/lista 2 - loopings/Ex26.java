package lista2;

import java.util.Scanner;

// Entrar via teclado com um valor (X) qualquer. Travar a digitação, 
// no sentido de aceitar somente valores positivos. 

// Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, 
// sendo que o segundo valor (B), deverá ser maior que o primeiro (A), caso contrário, 
// digitar novamente somente o segundo. 

// Após a validação dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, 
// ou seja, a tabuada de X no intervalo de B para A.

public class Ex26 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int x, a, b, c, i;
		
		do {
		System.out.printf("\n Digite um numero qualquer (x): ");
		x = ler.nextInt();
		
		} while (x < 0);
		
		do {
			System.out.printf("\n Digite um intervalo qualquer (a): ");
			a = ler.nextInt();
			
		} while(a < 0);
		
		do {
			System.out.printf("\n Digite um intervalo (b) maior que (a): ");
			b = ler.nextInt();
			
		} while(a > b);
		
		if (a > 0 && b > a) {
			
			for (i = b; i > a; i--) {
					
					c = b * i;
					System.out.printf("\n %d X %d = %d", x, i, c);
					ler.close();
			}
			
		}
		
		
	}

}
