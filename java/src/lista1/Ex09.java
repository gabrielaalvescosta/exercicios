package lista1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("Escolha o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.printf("Escolha o segundo n�mero: ");
		num2 = ler.nextInt();
		
		if (num1 < num2) {
		
			System.out.printf("O n�mero " + num1 + " � menor.", num1);
			
		} else {
			System.out.printf("O n�mero " + num2 + " � menor.", num2);
		}
	}

}
