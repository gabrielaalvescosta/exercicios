package lista2;

import java.util.Scanner;

// Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. 
// O valor “N” será digitado, deverá ser positivo, mas menor que cem. 
// Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
// A seqüência: 2, 5, 10, 17, 26, ....


public class Ex31 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero = -1;
		int n1 = 2;
		int n2 = 5;
		int n3 = 10;
		
			
			do {
				
				System.out.printf("Digite um número positivo menor que cem: ", numero);
				numero = ler.nextInt();
			
			} while (numero < 0 || numero > 100);
			
			if (numero > 0 && numero < 100) {
				
				for (int i = 0; i < numero; i++) {

					int n4 = n3 + n2 + n1;
					n3 = n4;
					n2 = n3;
					n1 = n2;
					System.out.printf("\n %d,", n4);
					
				}
				
				ler.close();
				
			}
			
				
		}

		
		

}

