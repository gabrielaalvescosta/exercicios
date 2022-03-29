package lista1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("Escolha o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.printf("Escolha o segundo número: ");
		num2 = ler.nextInt();
		
		if (num1 < num2) {
		
			System.out.printf("O número " + num1 + " é menor.", num1);
			
		} else {
			System.out.printf("O número " + num2 + " é menor.", num2);
		}
	}

}
